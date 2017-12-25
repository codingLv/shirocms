package com.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.bean.Video;
import com.cms.bean.VideoExample;
import com.cms.dao.VideoMapper;
@Service
public class VideoService {
	@Autowired
	VideoMapper videoMapper;
	public List<Video> getAll() {
		// TODO Auto-generated method stub
//		VideoExample example = new VideoExample();
//		example.setOrderByClause("v.sort ASC");
		
		return videoMapper.selectByExample_WithKonwledgeAndSubjectAndGrade(null);
	}
	public void addVideo(Video video) {
		// TODO Auto-generated method stub
		videoMapper.insertSelective(video);
	}
	public void updateVideo(Video video) {
		// TODO Auto-generated method stub
		videoMapper.updateByPrimaryKeySelective(video);
	}
	public void deletevideo(Integer id) {
		// TODO Auto-generated method stub
		videoMapper.deleteByPrimaryKey(id);
	}
	public List<Video> getVideos_ByKnowledge_id(Integer knowledge_id) {
		// TODO Auto-generated method stub
		VideoExample example = new VideoExample();
		example.setOrderByClause("v.sort ASC");
		example.or().andKnowledgeIdEqualTo(knowledge_id);
		return videoMapper.selectByExample_WithKonwledgeAndSubjectAndGrade(example);
	}

}
