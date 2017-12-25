package com.cms.shiro;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.ShiroException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.service.loginService;

@Service
public class realmManage extends AuthorizingRealm{
	@Autowired
	loginService loginService;
	/** 
	* 权限授权函数,查詢用戶的所擁有的權限 
	*/ 
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
		String userName = (String) principal.getPrimaryPrincipal(); 
		// 取得用户的所有权限 
		Set permissions = new HashSet(); 
		Set roles = new HashSet(); 
		//查詢用戶權限集合 
		List<String> permissionList = loginService.selectHasPermissionsByName(userName); 
		for(String permissionUnion : permissionList){ 
			permissions.add(permissionUnion); 
		} 
		List<String> roleList = loginService.selectRolesByName(userName);
		for(String role : roleList){
			roles.add(role);
		}
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		info.setRoles(roles);
		info.setStringPermissions(permissions); 
		//System.out.println(roles);
		return info; 
	}
	/** 
	* 身份认证函数 
	*/ 
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authctoken) throws AuthenticationException {
		UsernamePasswordToken token = (UsernamePasswordToken) authctoken; 
		String userName = (String) token.getPrincipal(); // 得到用户名 
		String pwd = new String((char[]) token.getCredentials()); // 得到密码 
		String password =""; 
		try { 
		password = loginService.selectPwdByName(userName); 
		
		} catch (Exception e) { 
		throw new ShiroException();//账号异常 
		} 
		if (password == null || "".equals(password)) { 
		throw new UnknownAccountException(); //如果用户名错误 
		} 
		if(!pwd.equals(password)) { 
		throw new IncorrectCredentialsException(); //如果密码错误 
		} 
		//如果身份认证验证成功，返回一个AuthenticationInfo实现； 
		return new SimpleAuthenticationInfo(userName, pwd, getName()); 
	}
	//清除缓存
    public void clearCached() {
        PrincipalCollection principals = SecurityUtils.getSubject().getPrincipals();
        super.clearCache(principals);
    }

}
