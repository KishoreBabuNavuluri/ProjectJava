package com.cts.springboot.demo.Spring_Boot1.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cts.springboot.demo.Spring_Boot1.service.LoginService;

@Controller
public class LoginContoller {
	
	@Autowired
	LoginService service;
	
	@RequestMapping(value="/Login",method= RequestMethod.GET)
	public String loginMessage() {

		//model.put("password", password);
		
		return "login";
	}

	

	@RequestMapping(value="/Login",method= RequestMethod.POST)
	public String loginMessage2(@RequestParam String name, @RequestParam String password, ModelMap map){
       boolean isvalidUser=service.validateUser(name, password);
		if(!isvalidUser)
			return "login";
		
		map.put("name", name);
		map.put("password", password);
		
		return "welcome";
	}
}
