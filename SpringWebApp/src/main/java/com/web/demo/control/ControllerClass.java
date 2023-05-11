package com.web.demo.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerClass {
	 
	@RequestMapping("home")
	@ResponseBody
	public String home() {
		
		return "home.jsp" ;
	}

}
