package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	@RequestMapping("/")
 public String home() {
	 
 
 return "home";
	}
	
	@RequestMapping("/success")
	public ModelAndView getEmployee(@RequestParam("ename") String ename,
	@RequestParam("eid") String eid,
	@RequestParam("pwd") String pwd ){
		ModelAndView mv = new ModelAndView();
		mv.addObject("ename", mv);
		mv.addObject("eid", mv);
		mv.addObject("pwd", mv);
		mv.setViewName("success");
		return mv;
		
	}
	@RequestMapping("/verify")
	public ModelAndView getEmployee(@RequestParam("ename") String ename,
			@RequestParam("pwd") String pwd ){
				ModelAndView mv = new ModelAndView();
				mv.addObject("ename", mv);
				mv.addObject("pwd", mv);
				mv.setViewName("verify");
				return mv;
	
	
}
	@RequestMapping("/Sign-up")
	public String signUP(){
		return "signup";
		
	}
	
	@RequestMapping("/Sign-in")
	public String signIn() {
		return "signin";
		
	}




}