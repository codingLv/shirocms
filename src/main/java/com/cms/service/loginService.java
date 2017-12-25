package com.cms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.bean.Authority;
import com.cms.bean.AuthorityExample;
import com.cms.bean.Role;
import com.cms.bean.User;
import com.cms.bean.UserExample;
import com.cms.dao.AuthorityMapper;
import com.cms.dao.RoleMapper;
import com.cms.dao.UserMapper;
@Service
public class loginService {
	@Autowired
	UserMapper usermapper;
	@Autowired
	AuthorityMapper authoritymapper;
	@Autowired
	RoleMapper rolemapper;
	public List<String> selectRolesByName(String userName) {
		UserExample example = new UserExample();
		example.or().andUserEqualTo(userName);
		User user = usermapper.selectByExampleWithRole(example).get(0);
		List<String> list = new ArrayList<String>();
		list.add(user.getRole().getRoleName());
		return list;
	}

	public String selectPwdByName(String userName) {
		// TODO Auto-generated method stub
		UserExample example = new UserExample();
		example.or().andUserEqualTo(userName);
		User user = usermapper.selectByExampleWithRole(example).get(0);
		return user.getPassword().toString();
	}

	public List<String> selectHasPermissionsByName(String userName) {
		UserExample example = new UserExample();
		example.or().andUserEqualTo(userName);
		User user = usermapper.selectByExampleWithRole(example).get(0);
		int role_id = user.getRoleId();
		Role role = rolemapper.selectByPrimaryKey(role_id);
		String Authoritys = role.getAuthority();
		String[] au = Authoritys.split(",");
		String Authoritys_1 = user.getAuthority();
		String[] au_1 = Authoritys_1.split(",");
//		AuthorityExample authority_example = new AuthorityExample();
//		authority_example.or().andRoleIdEqualTo(role_id);
//		List<Authority> authority_list = authoritymapper.selectByExample(authority_example);
		List<String> list = new ArrayList<String>();
//		for(Authority authority : authority_list){
//			String authority_name = authority.getAuthorityName();
//			list.add(authority_name);
//		}
		for(String authority : au){
			list.add(authority);
		}
		
		for(String authority : au_1){
			list.add(authority);
		}
		//System.out.println(list);
		return list;
	}
	
	public User selectUserInfoByName(String username) { 
		return null; 
	}

}
