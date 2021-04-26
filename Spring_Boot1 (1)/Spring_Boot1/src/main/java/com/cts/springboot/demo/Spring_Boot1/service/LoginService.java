package com.cts.springboot.demo.Spring_Boot1.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	public boolean validateUser(String userid, String password) {
		return userid.equalsIgnoreCase("Babunavuluri") && password.equalsIgnoreCase("nani");
				
	}

}
