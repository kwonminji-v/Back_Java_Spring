package com.study.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Autowired
	TestService testService;
	
	@GetMapping("/test")
	public List<Member> getAllMembers() {
		List<Member> members = testService.getAllMembers();
		return members;
	}
	//testService.getAllMembers()를 호출하여 모든 회원 정보를 가져온뒤 해당 정보를 return

}
