package com.study.springboot.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.study.springboot.dto.MemberDTO;

@RestController
public class MyController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody String hiyo() { 
		return "hi";
	}
	
	@GetMapping(value = "/getmapping") //method가 mapping 내부에 포함된 상태이다
	public String get() {
		return "jnjnjn";
	}
	
	//PathVariable
	@GetMapping(value ="/pathvariable/{variable}")
	public String path(@PathVariable String variable) {
		return variable;
	}
	@GetMapping(value ="/pathvariable2/{variable}")
	public String path2(@PathVariable("variable") String var) {
		return var;
	}
	
	//RequestParam 사용예제1 
	//브라우저 url 주소에 http://localhost8080/request1?name(키) = 정원(value) & email = 이메일주소 &orga = orga
	//?를 기준으로 키 = 값으로 나오게 된다 하위 return 참조
	@GetMapping(value = "/request1")
	public String requestParam1(
			@RequestParam String name,
			@RequestParam String email,
			@RequestParam String organization) {
		return name + " " + email + " " + organization;
	}
	
	//http://localhost:8090/api/v1/get-api/request1?name=
	//RequestParam 사용예제2 - 어떤값이 들어올지 모르는경우
	//name, email , organization을 map으로 묶고
	//map의 <키 = String , 값 = String>을 param변수를 파라미터로 지정
	@GetMapping(value = "/request2")
	public String requestParam2(
			@RequestParam Map<String, String>param) {
			StringBuilder sb = new StringBuilder();
			
			param.entrySet().forEach(map ->{
				sb.append(map.getKey() + ":" + map.getValue() + "\n");
			});
			return sb.toString();
	}
	
	//RequestParam 사용예제3
	//현재 MemberDto에 대한 클래스 정의가 없어서 안된다
	@GetMapping(value = "/request3")
	public String requestParam3(MemberDTO memberDTO) {
		return memberDTO.toString();
		
		//같은 return 값
		//return memberDto.getName() + "" 
		//+ memberDto.getEmail() + ""
		//+ memberDto.getOraganization();
		
	}
	
}
