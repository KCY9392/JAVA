package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;

public class Run {
	
	public static void main(String[] args) {
		Person p = new Person();
		
		p.setId("kcy");
		p.setPwd("pwd");
		p.setName("김채영");
		p.setGender('F');
		
		System.out.println(p.info());

	}

}
