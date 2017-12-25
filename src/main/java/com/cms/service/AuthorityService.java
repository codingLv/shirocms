package com.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.bean.Authority;
import com.cms.bean.AuthorityExample;
import com.cms.dao.AuthorityMapper;

@Service
public class AuthorityService {
	@Autowired
	AuthorityMapper authoritymapper;

	public List<Authority> getAllByRoleId(Integer role_id) {
		// TODO Auto-generated method stub
		AuthorityExample example = new AuthorityExample();
		example.or().andRoleIdEqualTo(role_id);
		return authoritymapper.selectByExample(example);
	}

	public List<Authority> getAll() {
		// TODO Auto-generated method stub
		return authoritymapper.selectByExample(null);
	}
	
	
}
