package com.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.bean.Subject;
import com.cms.bean.SubjectExample;
import com.cms.dao.SubjectMapper;
@Service
public class SubjectService {
	@Autowired
	SubjectMapper subjectMapper;
	/**
	 * 查询所有科目
	 * @return
	 */
	public List<Subject> getAll() {
		// TODO Auto-generated method stub
		SubjectExample example = new SubjectExample();
		example.setOrderByClause("s.sort ASC");
		return subjectMapper.selectByExample_WithGrade(example);
	}
	public void addSubject(Subject sub) {
		// TODO Auto-generated method stub
		subjectMapper.insertSelective(sub);
	}
	public void updateSubject(Subject sub) {
		// TODO Auto-generated method stub
		subjectMapper.updateByPrimaryKeySelective(sub);
	}
	public void deleteSubject(Integer id) {
		// TODO Auto-generated method stub
		subjectMapper.deleteByPrimaryKey(id);
	}
	
	public List<Subject> getAll_ByGrade_id(Integer grade_id) {
		// TODO Auto-generated method stub
		SubjectExample subExample = new SubjectExample();
		subExample.or().andGradeIdEqualTo(grade_id);
		subExample.setOrderByClause("s.sort ASC");
		//System.out.println(subjectMapper.selectByExample_WithGrade(subExample));
		return subjectMapper.selectByExample_WithGrade(subExample);
	}

}
