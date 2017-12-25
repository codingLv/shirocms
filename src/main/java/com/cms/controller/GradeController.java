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
import com.cms.service.GradeService;
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
public class GradeController {
	@Autowired
	GradeService gradeService;
	/**
	 * 查询年级(分页查询)
	 * @return
	 */
	@RequestMapping("/getGrades")
	//@RequiresPermissions(value = { "Read" ,"Grade_read","root"}, logical = Logical.OR)
	@ResponseBody
	public String getGrades(@RequestParam(value="page_num",defaultValue="1") Integer page_num, Model model){
		/*
		 * 引入PageHelper分页插件:https://github.com/pagehelper/Mybatis-PageHelper/blob/master/wikis/zh/HowToUse.md
		 * 在查询之前只需要调用 PageHelper.startPage(page_num, 5);
		 * 传入页码，和每页显示多少条数据
		 */
		PageHelper.startPage(page_num, 5);
		//startPage后紧跟的查询就是分页查询
		List<Grade> Grades = gradeService.getAll();
		//使用PageInfo封装查询信息，只需要将PageInfo交给页面就可以了，封装了详细的分页信息，查询到的数据
		PageInfo page = new PageInfo(Grades,1);
		JSONArray jsonArry = new JSONArray();
		for(Grade g : Grades){
			JSONObject jsonObj = new JSONObject();
			jsonObj.put("ID", g.getGradeId());
			jsonObj.put("Name", g.getGradeName());
			jsonObj.put("Sort", g.getSort());
			jsonObj.put("total", page.getTotal());
			jsonObj.put("pages", page.getPages());
			jsonObj.put("PageNum", page.getPageNum());
			jsonArry.add(jsonObj);
		}
		
		return jsonArry.toString();	
	}
	
	@RequestMapping(value="/addGrade",method=RequestMethod.POST)
	@RequiresPermissions(value = { "Creat","Grade_create" ,"root"}, logical = Logical.OR)
	@ResponseBody
	public String addGrade(@RequestParam(value="Name") String name,@RequestParam(value="Sort") Integer sort){
		Grade garde = new Grade();
		garde.setGradeName(name);
		garde.setSort(sort);
		gradeService.addGrade(garde);
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("MSG", "success");
		return jsonObj.toString();
	}
	
	@RequestMapping("/getAllGrades")
	@ResponseBody
	public String getAllGrades(){
		
		List<Grade> Grades = gradeService.getAll();
	
		JSONArray jsonArry = new JSONArray();
		for(Grade g : Grades){
			JSONObject jsonObj = new JSONObject();
			jsonObj.put("ID", g.getGradeId());
			jsonObj.put("Name", g.getGradeName());
			jsonArry.add(jsonObj);
		}
		//System.out.println(jsonArry);
		return jsonArry.toString();	
	}
	
	@RequestMapping(value="/updateGrade",method=RequestMethod.PUT)
	@RequiresPermissions(value = { "Update","Grade_update","root" }, logical = Logical.OR)
	@ResponseBody
	public String updateGrade(@RequestParam(value="Name") String name,@RequestParam(value="ID") Integer id,@RequestParam(value="Sort") Integer sort){
		Grade grade = new Grade();
		grade.setGradeId(id);
		grade.setGradeName(name);
		grade.setSort(sort);
		gradeService.updateGrade(grade);
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("MSG", "success");
		return jsonObj.toString();
	}
	
	@RequestMapping(value="/deleteGrade",method=RequestMethod.DELETE)
	@RequiresPermissions(value = { "Delete","root" }, logical = Logical.OR)
	@ResponseBody
	public String deleteGrade(@RequestParam(value="ID") Integer id){
		
		gradeService.deleteGrade(id);
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("MSG", "success");
		return jsonObj.toString();
	}
}
