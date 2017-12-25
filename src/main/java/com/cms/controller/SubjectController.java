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
import com.cms.bean.Subject;
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
public class SubjectController {
	@Autowired
	SubjectService subjectService;
	/**
	 * 查询科目(分页查询)
	 * @return
	 */
	@RequestMapping("/getSubjects")
	@RequiresPermissions(value = { "Read","root" }, logical = Logical.OR)
	@ResponseBody
	public String getSubjects(@RequestParam(value="page_num",defaultValue="1") Integer page_num, Model model){
		/*
		 * 引入PageHelper分页插件:https://github.com/pagehelper/Mybatis-PageHelper/blob/master/wikis/zh/HowToUse.md
		 * 在查询之前只需要调用 PageHelper.startPage(page_num, 5);
		 * 传入页码，和每页显示多少条数据
		 */
		PageHelper.startPage(page_num, 5);
		//startPage后紧跟的查询就是分页查询
		List<Subject> subjects = subjectService.getAll();
		//使用PageInfo封装查询信息，只需要将PageInfo交给页面就可以了，封装了详细的分页信息，查询到的数据
		PageInfo page = new PageInfo(subjects,5);
		//model.addAttribute("pageInfo", page);
		JSONArray jsonArry = new JSONArray();
		for(Subject s : subjects){
			JSONObject jsonObj = new JSONObject();
			jsonObj.put("ID", s.getSubjectId());
			jsonObj.put("Name", s.getSubjectName());
			jsonObj.put("Sort", s.getSort());
			jsonObj.put("GradeID", s.getGradeId());
			jsonObj.put("GradeName", s.getGrade().getGradeName());
			jsonObj.put("total", page.getTotal());
			jsonObj.put("pages", page.getPages());
			jsonObj.put("PageNum", page.getPageNum());
			jsonArry.add(jsonObj);
		}
		//System.out.println(jsonArry);
	//	System.out.println(page);
		return jsonArry.toString();	
	}
	@RequestMapping(value="/addSubject",method=RequestMethod.POST)
	@RequiresPermissions(value = { "Creat","root" }, logical = Logical.OR)
	@ResponseBody
	public String addSubject(@RequestParam(value="Name") String name,@RequestParam(value="GradeId") Integer gradeId,@RequestParam(value="Sort") Integer sort){
		Subject sub = new Subject();
		sub.setSubjectName(name);
		sub.setGradeId(gradeId);
		sub.setSort(sort);
		subjectService.addSubject(sub);
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("MSG", "success");
		return jsonObj.toString();
	}
	
	@RequestMapping("/getAllSubjects")
	@ResponseBody
	public String getAll_ByGrade_id(@RequestParam(value="Grade_id") Integer id){
		
		List<Subject> subjects = subjectService.getAll_ByGrade_id(id);
		JSONArray jsonArry = new JSONArray();
		for(Subject s : subjects){
			JSONObject jsonObj = new JSONObject();
			jsonObj.put("ID", s.getSubjectId());
			jsonObj.put("Name", s.getSubjectName());
			jsonObj.put("GradeID", s.getGradeId());
			jsonObj.put("GradeName", s.getGrade().getGradeName());
			jsonArry.add(jsonObj);
		}
		//System.out.println(jsonArry);
		return jsonArry.toString();	
	}
	
	@RequestMapping(value="/updateSubject",method=RequestMethod.PUT)
	@RequiresPermissions(value = { "Update","root"}, logical = Logical.OR)
	@ResponseBody
	public String updateSubject(@RequestParam(value="ID") Integer id,@RequestParam(value="Name") String name,@RequestParam(value="GradeId") Integer gradeId,@RequestParam(value="Sort") Integer sort){
		Subject sub = new Subject();
		sub.setSubjectId(id);
		sub.setSubjectName(name);
		sub.setGradeId(gradeId);
		sub.setSort(sort);
		subjectService.updateSubject(sub);
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("MSG", "success");
		return jsonObj.toString();
	}
	
	@RequestMapping(value="/deleteSubject",method=RequestMethod.DELETE)
	@RequiresPermissions(value = { "Delete","root" }, logical = Logical.OR)
	@ResponseBody
	public String deleteSubject(@RequestParam(value="ID") Integer id){
		
		subjectService.deleteSubject(id);
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("MSG", "success");
		return jsonObj.toString();
	}
	
	@RequestMapping("/getAllSubjects_ByGrade_id")
	@ResponseBody
	public String SearchAll_ByGrade_id(@RequestParam(value="Grade_id") Integer id,@RequestParam(value="page_num",defaultValue="1") Integer page_num){
		
		PageHelper.startPage(page_num, 5);
		List<Subject> subjects = subjectService.getAll_ByGrade_id(id);
		PageInfo page = new PageInfo(subjects,5);
		JSONArray jsonArry = new JSONArray();
		for(Subject s : subjects){
			JSONObject jsonObj = new JSONObject();
			jsonObj.put("ID", s.getSubjectId());
			jsonObj.put("Name", s.getSubjectName());
			jsonObj.put("Sort", s.getSort());
			jsonObj.put("GradeID", s.getGradeId());
			jsonObj.put("GradeName", s.getGrade().getGradeName());
			jsonObj.put("total", page.getTotal());
			jsonObj.put("pages", page.getPages());
			jsonObj.put("PageNum", page.getPageNum());
			jsonArry.add(jsonObj);
		}
		//System.out.println(jsonArry);
		return jsonArry.toString();	
	}
	
	
}
