package com.cms.controller;

import java.util.List;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cms.bean.Knowledge_point;
import com.cms.bean.Subject;
import com.cms.bean.Video;
import com.cms.service.KnowledgeService;
import com.cms.service.SubjectService;
import com.cms.service.VideoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
/**
 * 
 * 科目控制器
 * @author 微软中国
 *
 */
@Controller
//@RequestMapping("Subject")
public class VideoController {
	@Autowired
	VideoService videoService;
	/**
	 * 查询知识点(分页查询)
	 * @return
	 */
	@RequestMapping(value="/getVideos",method=RequestMethod.GET)
	@RequiresPermissions(value = { "Read","root" }, logical = Logical.OR)
	@ResponseBody
	public String getVideos(@RequestParam(value="page_num",defaultValue="1") Integer page_num, Model model){
		/*
		 * 引入PageHelper分页插件:https://github.com/pagehelper/Mybatis-PageHelper/blob/master/wikis/zh/HowToUse.md
		 * 在查询之前只需要调用 PageHelper.startPage(page_num, 5);
		 * 传入页码，和每页显示多少条数据
		 */
		PageHelper.startPage(page_num, 5);
		//startPage后紧跟的查询就是分页查询
		List<Video> videos = videoService.getAll();
		
		//使用PageInfo封装查询信息，只需要将PageInfo交给页面就可以了，封装了详细的分页信息，查询到的数据
		PageInfo page = new PageInfo(videos,1);
		JSONArray jsonArry = new JSONArray();
		for(Video v : videos){
			JSONObject jsonObj = new JSONObject();
			jsonObj.put("ID", v.getVideoId());
			jsonObj.put("Name", v.getVideoName());
			jsonObj.put("sort", v.getSort());
			jsonObj.put("clarity", v.getClarity());
			jsonObj.put("code_check", v.getCodeCheck());
			jsonObj.put("introduction", v.getIntroduction());
			jsonObj.put("duration", v.getDuration());
			jsonObj.put("picture", v.getPicture());
			jsonObj.put("KnowledgeID", v.getKnowledgeId());
			jsonObj.put("KnowledgeName", v.getKonwledge_point().getKnowledgeName());
			jsonObj.put("SubjectID", v.getSubject().getSubjectId());
			jsonObj.put("SubjectName", v.getSubject().getSubjectName());
			jsonObj.put("GradeID", v.getGrade().getGradeId());
			jsonObj.put("GradeName", v.getGrade().getGradeName());
			jsonObj.put("VideoSrc", v.getVideoSrc());
			jsonObj.put("total", page.getTotal());
			jsonObj.put("pages", page.getPages());
			jsonObj.put("PageNum", page.getPageNum());
			jsonArry.add(jsonObj);
		}
		return jsonArry.toString();	
	}
	
	@RequestMapping(value="/addvideo",method=RequestMethod.POST)
	@RequiresPermissions(value = { "Creat","root" }, logical = Logical.OR)
	@ResponseBody
	public String addvideo(@RequestParam(value="Name") String name,@RequestParam(value="KnowledgeId") Integer knowledgeId,
			@RequestParam(value="Video_src") String video_src,@RequestParam(value="Sort") Integer Sort,
			@RequestParam(value="Clarity") String Clarity,@RequestParam(value="Check_code") String Check_code,
			@RequestParam(value="Introduction") String Introduction,@RequestParam(value="Duration") String Duration,
			@RequestParam(value="Picture") String Picture){
		Video video = new Video();
		video.setVideoName(name);
		video.setKnowledgeId(knowledgeId);
		video.setVideoSrc(video_src);
		video.setSort(Sort);
		video.setClarity(Clarity);
		video.setCodeCheck(Check_code);
		video.setIntroduction(Introduction);
		video.setDuration(Duration);
		video.setPicture(Picture);
		videoService.addVideo(video);
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("MSG", "success");
		return jsonObj.toString();
	}
	
	@RequestMapping("/getVideos_ByKnowledge_id")
	@ResponseBody
	public String getAllVideos(@RequestParam(value="page_num",defaultValue="1") Integer page_num,@RequestParam(value="Knowledge_id") Integer Knowledge_id){
		
		/*
		 * 引入PageHelper分页插件:https://github.com/pagehelper/Mybatis-PageHelper/blob/master/wikis/zh/HowToUse.md
		 * 在查询之前只需要调用 PageHelper.startPage(page_num, 5);
		 * 传入页码，和每页显示多少条数据
		 */
		PageHelper.startPage(page_num, 5);
		//startPage后紧跟的查询就是分页查询
		List<Video> videos = videoService.getVideos_ByKnowledge_id(Knowledge_id);
		
		//使用PageInfo封装查询信息，只需要将PageInfo交给页面就可以了，封装了详细的分页信息，查询到的数据
		PageInfo page = new PageInfo(videos,1);
		JSONArray jsonArry = new JSONArray();
		for(Video v : videos){
			JSONObject jsonObj = new JSONObject();
			jsonObj.put("ID", v.getVideoId());
			jsonObj.put("Name", v.getVideoName());
			jsonObj.put("sort", v.getSort());
			jsonObj.put("clarity", v.getClarity());
			jsonObj.put("code_check", v.getCodeCheck());
			jsonObj.put("introduction", v.getIntroduction());
			jsonObj.put("duration", v.getDuration());
			jsonObj.put("picture", v.getPicture());
			jsonObj.put("KnowledgeID", v.getKnowledgeId());
			jsonObj.put("KnowledgeName", v.getKonwledge_point().getKnowledgeName());
			jsonObj.put("SubjectID", v.getSubject().getSubjectId());
			jsonObj.put("SubjectName", v.getSubject().getSubjectName());
			jsonObj.put("GradeID", v.getGrade().getGradeId());
			jsonObj.put("GradeName", v.getGrade().getGradeName());
			jsonObj.put("VideoSrc", v.getVideoSrc());
			jsonObj.put("total", page.getTotal());
			jsonObj.put("pages", page.getPages());
			jsonObj.put("PageNum", page.getPageNum());
			jsonArry.add(jsonObj);
		}
		
		return jsonArry.toString();	
		
	}
	
	
	@RequestMapping(value="/updatevideo",method=RequestMethod.PUT)
	@RequiresPermissions(value = { "Update","root"}, logical = Logical.OR)
	@ResponseBody
	public String updatevideo(@RequestParam(value="Name") String name,@RequestParam(value="KnowledgeId") Integer knowledgeId
			,@RequestParam(value="Video_src") String video_src,@RequestParam(value="ID") Integer id,@RequestParam(value="Sort") Integer Sort,
			@RequestParam(value="Clarity") String Clarity,@RequestParam(value="Check_code") String Check_code,
			@RequestParam(value="Introduction") String Introduction,@RequestParam(value="Duration") String Duration,
			@RequestParam(value="Picture") String Picture){
		Video video = new Video();
		video.setVideoId(id);
		video.setKnowledgeId(knowledgeId);
		video.setVideoName(name);
		video.setVideoSrc(video_src);
		video.setSort(Sort);
		video.setClarity(Clarity);
		video.setCodeCheck(Check_code);
		video.setIntroduction(Introduction);
		video.setDuration(Duration);
		video.setPicture(Picture);
		videoService.updateVideo(video);
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("MSG", "success");
		return jsonObj.toString();
	}
	
	@RequestMapping(value="/video",method=RequestMethod.DELETE)
	@RequiresPermissions(value = { "Delete","root" }, logical = Logical.OR)
	@ResponseBody
	public String deletevideo(@RequestParam(value="ID") Integer id){
		
		videoService.deletevideo(id);
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("MSG", "success");
		return jsonObj.toString();
	}
}
