package com.study.springboot.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberDTO {

	//data 어노테이션 및 mapper어노테이션 없으니 get, set 정의
	private String name;
	private String email;
	private String organization;
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public String getOrganization() {
//		return organization;
//	}
//	public void setOrganization(String organization) {
//		this.organization = organization;
//	}
//	@Override
//	public String toString() {
//		return "MemberDTO {name=" + name 
//				+ ", email=" + email 
//				+ ", organization=" + organization + "}";
//	}
}
