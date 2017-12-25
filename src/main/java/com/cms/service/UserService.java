package com.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.bean.User;
import com.cms.dao.UserMapper;
@Service
public class UserService {
	@Autowired
	UserMapper usermapper;
	public List<User> getAll() {
		// TODO Auto-generated method stub
		List<User> list = usermapper.selectByExampleWithRole(null);
		return list;
	}
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		usermapper.deleteByPrimaryKey(id);
	}
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		usermapper.updateByPrimaryKeySelective(user);
	}
	public void addUser(User user) {
		// TODO Auto-generated method stub
		usermapper.insertSelective(user);
	}

}
