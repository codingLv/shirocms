package com.cms.service;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.bean.Grade;
import com.cms.bean.GradeExample;
import com.cms.dao.GradeMapper;

@Service
public class GradeService {
	@Autowired
	GradeMapper gradeMapper;

	public List<Grade> getAll() {
		GradeExample example = new GradeExample();
		example.setOrderByClause("sort ASC");
		return gradeMapper.selectByExample(example);
	}
	public void addGrade(Grade garde) {
		// TODO Auto-generated method stub
		gradeMapper.insertSelective(garde);
	}

	public void updateGrade(Grade garde) {
		// TODO Auto-generated method stub
		gradeMapper.updateByPrimaryKeySelective(garde);
	}

	public void deleteGrade(Integer id) {
		// TODO Auto-generated method stub
		gradeMapper.deleteByPrimaryKey(id);
	}

}
