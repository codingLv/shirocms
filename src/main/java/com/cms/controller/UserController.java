package com.cms.controller;

import java.util.List;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cms.bean.Authority;
import com.cms.bean.Grade;
import com.cms.bean.Role;
import com.cms.bean.Subject;
import com.cms.bean.User;
import com.cms.dao.UserMapper;
import com.cms.service.AuthorityService;
import com.cms.service.UserService;
import com.cms.service.roleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
/**
 * 
 * 用户控制器
 * @author 微软中国
 *
 */
@Controller
public class UserController {
	@Autowired
	UserService userService;
	@Autowired
	roleService roleservice;
	@Autowired
	AuthorityService authorityservice;
	
	@RequestMapping("/getUsers")
	@RequiresPermissions(value = {"root"}, logical = Logical.OR)
	@ResponseBody
	public String getUsers(@RequestParam(value="page_num",defaultValue="1") Integer page_num){
		PageHelper.startPage(page_num, 5);
		List<User> users = userService.getAll();
		PageInfo page = new PageInfo(users,1);
		JSONArray jsonArry = new JSONArray();
		for(User u : users){
			JSONObject jsonObj = new JSONObject();
			jsonObj.put("ID", u.getId());
			jsonObj.put("Name", u.getUser());
			jsonObj.put("Role", u.getRole().getRoleName());
			jsonObj.put("Authority", u.getAuthority());
			jsonObj.put("total", page.getTotal());
			jsonObj.put("pages", page.getPages());
			jsonObj.put("PageNum", page.getPageNum());
			jsonArry.add(jsonObj);
		}
		return jsonArry.toString();	
	}
	
	@RequestMapping(value="/updateUser")
	@ResponseBody
	public String updateUser(@RequestParam(value="Name") String name,@RequestParam(value="ID") Integer id,@RequestParam(value="RoleId") Integer roleId,@RequestParam(value="AuthorityId") String Authority){
		User user = new User();
		user.setId(id);
		user.setUser(name);
		user.setRoleId(roleId);
		user.setAuthority(Authority);
		userService.updateUser(user);
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("MSG", "success");
		return jsonObj.toString();
	}
	
	
	@RequestMapping(value="/deleteuser")
	@ResponseBody
	public String deleteuser(@RequestParam(value="ID") Integer id){
		
		userService.deleteUser(id);
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("MSG", "success");
		return jsonObj.toString();
	}
	
	@RequestMapping("/addUser")
	@ResponseBody
	public String addUser(@RequestParam(value="Name") String name,@RequestParam(value="Pwd") Integer Pwd,@RequestParam(value="RoleId") Integer RoleId,@RequestParam(value="AuthorityId") String Authority){
		User user = new User();
		user.setUser(name);
		user.setPassword(Pwd);
		user.setRoleId(RoleId);
		user.setAuthority(Authority);
		userService.addUser(user);
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("MSG", "success");
		return jsonObj.toString();
	}
	
	@RequestMapping("/getAllRoles")
	@ResponseBody
	public String getAllRoles(){
		
		List<Role> roles = roleservice.getAll();
		
		JSONArray jsonArry = new JSONArray();
		for(Role r : roles){
			JSONObject jsonObj = new JSONObject();
			jsonObj.put("ID", r.getRoleId());
			jsonObj.put("Name", r.getRoleName());
			jsonArry.add(jsonObj);
		}
		return jsonArry.toString();	
	}
	
//----------------------------------------角色管理-------------------------------------------------
	@RequestMapping("/getRoles")
	@ResponseBody
	public String getRoles(@RequestParam(value="page_num",defaultValue="1") Integer page_num){
		PageHelper.startPage(page_num, 5);
		List<Role> roles = roleservice.getAll();
		PageInfo page = new PageInfo(roles,1);
		JSONArray jsonArry = new JSONArray();
		for(Role r : roles){
			JSONObject jsonObj = new JSONObject();
			jsonObj.put("ID", r.getRoleId());
			jsonObj.put("Name", r.getRoleName());
			jsonObj.put("Authority", r.getAuthority());
			jsonObj.put("total", page.getTotal());
			jsonObj.put("pages", page.getPages());
			jsonObj.put("PageNum", page.getPageNum());
			jsonArry.add(jsonObj);
		}
		return jsonArry.toString();	
	}
	
//	@RequestMapping("/getAuthorityByRoleId")
//	@RequiresPermissions(value = {"root"}, logical = Logical.OR)
//	@ResponseBody
//	public String getAuthorityByRoleId(@RequestParam(value="page_num",defaultValue="1") Integer page_num ,@RequestParam(value="role_id",defaultValue="1") Integer role_id){
//		List<Authority> authoritys = authorityservice.getAllByRoleId(role_id);
//		JSONArray jsonArry = new JSONArray();
//		for(Authority a : authoritys){
//			JSONObject jsonObj = new JSONObject();
//			jsonObj.put("ID", a.getAuthorityId());
//			jsonObj.put("Name", a.getAuthorityName());
//			jsonArry.add(jsonObj);
//		}
//		return jsonArry.toString();	
//	}
	
	@RequestMapping("/getAllAuthority")
	@RequiresPermissions(value = {"root"}, logical = Logical.OR)
	@ResponseBody
	public String getAllAuthority(){
		List<Authority> authoritys = authorityservice.getAll();
		JSONArray jsonArry = new JSONArray();
		for(Authority a : authoritys){
			JSONObject jsonObj = new JSONObject();
			jsonObj.put("ID", a.getAuthorityId());
			jsonObj.put("Name", a.getAuthorityName());
			jsonArry.add(jsonObj);
		}
		return jsonArry.toString();	
	}
	
	
	@RequestMapping(value="/addRole")
	@ResponseBody
	public String addRole(@RequestParam(value="Name") String name,@RequestParam(value="AuthorityId") String AuthorityName){
		//String[] AuthorityNames = AuthorityName.split(",");
		Role role  = new Role();
		role.setRoleName(name);
		role.setAuthority(AuthorityName);
		roleservice.addRole(role);
		//authorityservice.updateRoleId()
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("MSG", "success");
		return jsonObj.toString();
	}
	
	@RequestMapping(value="/updateRole")
	@ResponseBody
	public String updateRole(@RequestParam(value="Name") String name,@RequestParam(value="AuthorityId") String AuthorityName,@RequestParam(value="ID") Integer id){
		//String[] AuthorityNames = AuthorityName.split(",");
		Role role  = new Role();
		role.setRoleId(id);
		role.setRoleName(name);
		role.setAuthority(AuthorityName);
		roleservice.updateRole(role);
		//authorityservice.updateRoleId()
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("MSG", "success");
		return jsonObj.toString();
	}
	
	
	@RequestMapping(value="/deleterole")
	@ResponseBody
	public String deleterole(@RequestParam(value="ID") Integer id){
		
		roleservice.deleteRole(id);
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("MSG", "success");
		return jsonObj.toString();
	}
}
