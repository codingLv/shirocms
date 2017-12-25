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

import com.cms.bean.Grade;
import com.cms.bean.Knowledge_point;
import com.cms.bean.Subject;
import com.cms.service.KnowledgeService;
import com.cms.service.SubjectService;
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
public class KnowledgeController {
	@Autowired
	KnowledgeService knowledgeService;
	/**
	 * 查询知识点(分页查询)
	 * @return
	 */
	@RequestMapping("/getKnowledges")
	@RequiresPermissions(value = { "Read","root" }, logical = Logical.OR)
	@ResponseBody
	public String getKnowledges(@RequestParam(value="page_num",defaultValue="1") Integer page_num, Model model){
		/*
		 * 引入PageHelper分页插件:https://github.com/pagehelper/Mybatis-PageHelper/blob/master/wikis/zh/HowToUse.md
		 * 在查询之前只需要调用 PageHelper.startPage(page_num, 5);
		 * 传入页码，和每页显示多少条数据
		 */
		PageHelper.startPage(page_num, 5);
		//startPage后紧跟的查询就是分页查询
		List<Knowledge_point> konwledges = knowledgeService.getAll();
		//使用PageInfo封装查询信息，只需要将PageInfo交给页面就可以了，封装了详细的分页信息，查询到的数据
		PageInfo page = new PageInfo(konwledges,1);
		JSONArray jsonArry = new JSONArray();
		for(Knowledge_point k : konwledges){
			JSONObject jsonObj = new JSONObject();
			jsonObj.put("ID", k.getKnowledgeId());
			jsonObj.put("Name", k.getKnowledgeName());
			jsonObj.put("Sort", k.getSort());
			jsonObj.put("SubjectID", k.getSubjectId());
			jsonObj.put("SubjectName", k.getSubject().getSubjectName());
			jsonObj.put("GradeID", k.getGrade().getGradeId());
			jsonObj.put("GradeName", k.getGrade().getGradeName());
			jsonObj.put("Picture", k.getPicture());
			jsonObj.put("total", page.getTotal());
			jsonObj.put("pages", page.getPages());
			jsonObj.put("PageNum", page.getPageNum());
			jsonArry.add(jsonObj);
		}
		
		return jsonArry.toString();	
	}
	
	@RequestMapping(value="/addKnowledge",method=RequestMethod.POST)
	@RequiresPermissions(value = { "Creat","root" }, logical = Logical.OR)
	@ResponseBody
	public String addKnowledge(@RequestParam(value="Name") String name,@RequestParam(value="SubjectId") Integer subjectId,@RequestParam(value="Sort") Integer sort){
		Knowledge_point kno = new Knowledge_point();
		kno.setKnowledgeName(name);
		kno.setSubjectId(subjectId);
		kno.setSort(sort);
		knowledgeService.addKnowledge(kno);
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("MSG", "success");
		return jsonObj.toString();
	}
	
	@RequestMapping("/getAllKnowledges")
	@ResponseBody
	public String getAllKnowledges(@RequestParam(value="Subject_id") Integer Subject_id){
		
		List<Knowledge_point> konwledges = knowledgeService.getAll_BySubject_id(Subject_id);
	
		JSONArray jsonArry = new JSONArray();
		for(Knowledge_point k : konwledges){
			JSONObject jsonObj = new JSONObject();
			jsonObj.put("ID", k.getKnowledgeId());
			jsonObj.put("Name", k.getKnowledgeName());
			jsonObj.put("SubjectID", k.getSubjectId());
			jsonObj.put("SubjectName", k.getSubject().getSubjectName());
			jsonObj.put("GradeID", k.getGrade().getGradeId());
			jsonObj.put("GradeName", k.getGrade().getGradeName());
			jsonArry.add(jsonObj);
		}
		//System.out.println(jsonArry);
		return jsonArry.toString();	
	}
	
	
	@RequestMapping(value="/updateKnowledge",method=RequestMethod.PUT)
	@RequiresPermissions(value = { "Update","root"}, logical = Logical.OR)
	@ResponseBody
	public String updateKnowledge(@RequestParam(value="Name") String name,@RequestParam(value="SubjectId") Integer subjectId,@RequestParam(value="ID") Integer id,@RequestParam(value="Sort") Integer sort){
		Knowledge_point kno = new Knowledge_point();
		kno.setKnowledgeId(id);
		kno.setKnowledgeName(name);
		kno.setSubjectId(subjectId);
		kno.setSort(sort);
		knowledgeService.updateKnowledge(kno);
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("MSG", "success");
		return jsonObj.toString();
	}
	
	@RequestMapping(value="/deleteKnowledge",method=RequestMethod.DELETE)
	@RequiresPermissions(value = { "Delete","root" }, logical = Logical.OR)
	@ResponseBody
	public String deleteKnowledge(@RequestParam(value="ID") Integer id){
		
		knowledgeService.deleteKnowledge(id);
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("MSG", "success");
		return jsonObj.toString();
	}
	
	
	@RequestMapping("/getAllKnowledges_BySubject_id")
	@RequiresPermissions(value = { "Read","root" }, logical = Logical.OR)
	@ResponseBody
	public String getAllKnowledges_ByGrade_idAndSubject_id(@RequestParam(value="page_num",defaultValue="1") Integer page_num,
			@RequestParam(value="Subject_id") Integer Subject_id){
		/*
		 * 引入PageHelper分页插件:https://github.com/pagehelper/Mybatis-PageHelper/blob/master/wikis/zh/HowToUse.md
		 * 在查询之前只需要调用 PageHelper.startPage(page_num, 5);
		 * 传入页码，和每页显示多少条数据
		 */
		PageHelper.startPage(page_num, 5);
		//startPage后紧跟的查询就是分页查询
		List<Knowledge_point> konwledges = knowledgeService.getAll_BySubject_id(Subject_id);
		//使用PageInfo封装查询信息，只需要将PageInfo交给页面就可以了，封装了详细的分页信息，查询到的数据
		PageInfo page = new PageInfo(konwledges,1);
		JSONArray jsonArry = new JSONArray();
		for(Knowledge_point k : konwledges){
			JSONObject jsonObj = new JSONObject();
			jsonObj.put("ID", k.getKnowledgeId());
			jsonObj.put("Name", k.getKnowledgeName());
			jsonObj.put("Sort", k.getSort());
			jsonObj.put("SubjectID", k.getSubjectId());
			jsonObj.put("SubjectName", k.getSubject().getSubjectName());
			jsonObj.put("GradeID", k.getGrade().getGradeId());
			jsonObj.put("GradeName", k.getGrade().getGradeName());
			jsonObj.put("total", page.getTotal());
			jsonObj.put("pages", page.getPages());
			jsonObj.put("PageNum", page.getPageNum());
			jsonArry.add(jsonObj);
		}
		
		return jsonArry.toString();	
	}
	
}
