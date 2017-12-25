package com.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.bean.Role;
import com.cms.bean.User;
import com.cms.dao.AuthorityMapper;
import com.cms.dao.RoleMapper;
@Service
public class roleService {
	@Autowired
	RoleMapper rolemapper;
	public List<Role> getAll() {
		// TODO Auto-generated method stub
		
		return rolemapper.selectByExample(null);
	}
	public void deleteRole(Integer id) {
		// TODO Auto-generated method stub
		rolemapper.deleteByPrimaryKey(id);
	}
	public void addRole(Role role) {
		// TODO Auto-generated method stub
		rolemapper.insertSelective(role);
	}
	public void updateRole(Role role) {
		// TODO Auto-generated method stub
		rolemapper.updateByPrimaryKeySelective(role);
	}
}
