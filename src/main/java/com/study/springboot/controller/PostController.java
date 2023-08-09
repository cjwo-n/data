package com.study.springboot.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.springboot.dto.MemberDTO;

@RestController
@RequestMapping("/api/v1/post-api")
//공통적으로 보유하는 url
public class PostController {

	//http://localhost:8090/api/v1/post-api/default
	@PostMapping(value = "/default")
	public String postMethod() {
		return "hello";
	}
	@PostMapping(value = "/member")
	public String postMember(@RequestBody Map<String, Object> postData) {
		//키 = string, 값 = object 
		StringBuilder sb = new StringBuilder();
		
		postData.entrySet().forEach(map ->{
			sb.append(map.getKey() + " : " + map.getValue() + "\n");
		});
		
		return sb.toString();
	}
	//http://localhost:8090/api/v1/post-api/member2
	@PostMapping(value = "/member2")
	public String postMemberDto(@RequestBody MemberDTO memberDTO) {
		return memberDTO.toString();
	}
}
