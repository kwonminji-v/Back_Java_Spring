package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	//��ť��Ƽ ���� ���Ͽ� authentication-failure-url = /loginfailed�� ��û�� �� �����մϴ�. 
	@GetMapping("/loginfailed")
	//�� ��û url�� /loginfailed�� ���� ��û ó�� �޼����Դϴ�. 
	public String loginerror(Model model) {
		model.addAttribute("error", "true");
		return "login";
	}
	@GetMapping("/logout")
	public String logout(Model model) {
		return "login";
	}
}
