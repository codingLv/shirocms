package com.cms.controller;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cms.service.loginService;

import net.sf.json.JSONObject;

@Controller
public class LoginController {
	String userName;
	@Autowired
	loginService login_service;
	@RequestMapping("/login")
	//@ResponseBody
	public ModelAndView login(@RequestParam("userName") String username, @RequestParam("pwd") String password,@RequestParam(value="remember",defaultValue="undefined") String remember,RedirectAttributes redirects){
		ModelAndView mv = new ModelAndView();
		UsernamePasswordToken token = new UsernamePasswordToken(username,
				password);
		// 记录该令牌
		token.setRememberMe(false);
		// subject权限对象
		Subject subject = SecurityUtils.getSubject();
		//判断是否已登录
		if (subject.isAuthenticated()){
			subject.logout();
		}
		try {
			// 提交申请，验证能不能通过，也回调reaml里的doGetAuthenticationInfo验证是否通过
			subject.login(token);
			userName = username;
			//mv.addObject("username",username);
			//System.out.println(exceptionClassName);
		} catch (UnknownAccountException ex) {// 用户名没有找到
			mv.addObject("msg", "用户未找到");
//			ex.printStackTrace();
		} catch (IncorrectCredentialsException ex) {// 用户名密码不匹配
		//	redirects.addFlashAttribute("msg", "密码不正确");
			mv.addObject("msg", "密码不正确");
//			map.put("msg", "密码不正确");
//			ex.printStackTrace();
		} catch (AuthenticationException e) {// 其他的登录错误
			mv.addObject("msg", "其他错误");
//			e.printStackTrace();
		} catch (Exception e) {
			mv.addObject("msg", "登录异常");
//			e.printStackTrace();
		}
		
		// 验证是否成功登录的方法
		if (subject.isAuthenticated()) {
			mv.setViewName("redirect:/index.html");
			//mv.setViewName("index.html");
		}else{
			mv.setViewName("redirect:/Login.html");
		//	mv.setViewName("login"); //此处偷懒，一般是ajax请求，或重定向时将失败传回
		}
		return mv;
		//return "redirect:/Login.html";
	}
	
	@RequestMapping("/getRole")
	@ResponseBody
	public String getRole(){
		List<String> roles = login_service.selectRolesByName(userName);
		String role = roles.get(0);
		JSONObject obj = new JSONObject();
		obj.put("role", role);
		obj.put("Username", userName);
		//System.out.println(obj);
		return obj.toString();
	}
}
