package com.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.bean.Knowledge_point;
import com.cms.bean.Knowledge_pointExample;
import com.cms.dao.Knowledge_pointMapper;
@Service
public class KnowledgeService {
	@Autowired
	Knowledge_pointMapper konwledge_point;

	public List<Knowledge_point> getAll() {
		// TODO Auto-generated method stub
		//Knowledge_pointExample kExample = new Knowledge_pointExample();
		//kExample.setOrderByClause("k.sort ASC");
		return konwledge_point.selectByExample_WithSubjectAndGrade(null);
	}

	public void addKnowledge(Knowledge_point kno) {
		// TODO Auto-generated method stub
		konwledge_point.insertSelective(kno);
	}

	public void updateKnowledge(Knowledge_point kno) {
		// TODO Auto-generated method stub
		konwledge_point.updateByPrimaryKeySelective(kno);
	}

	public void deleteKnowledge(Integer id) {
		// TODO Auto-generated method stub
		konwledge_point.deleteByPrimaryKey(id);
	}
	
	public List<Knowledge_point> getAll_BySubject_id(Integer Subject_id) {
		// TODO Auto-generated method stub
		Knowledge_pointExample kExample = new Knowledge_pointExample();
		kExample.or().andSubjectIdEqualTo(Subject_id);
		kExample.setOrderByClause("k.sort ASC");
		return konwledge_point.selectByExample_WithSubjectAndGrade(kExample);
	}
}
