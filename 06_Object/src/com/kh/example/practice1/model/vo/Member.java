package com.kh.example.practice1.model.vo;

public class Member {
	
	private String memberId, memberPwd, memberName;
	private int age;
	private char gender;
	private String phone, email;
	

	public Member() {}
	
	public void changeName(String memberName) {
		this.memberName = memberName;
	}
	
	public void printName() {
		System.out.println(memberName);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
