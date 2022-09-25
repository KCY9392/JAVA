package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Student std = new Student(); //객체생성 == 인스턴스화
		//std.name;// Student클래스에서 private로 선언해서 감춰졌기때문에 접근못함.
	
		
		std.setName("김채영");
		std.setAge(23);
		std.setHeight(158.3);
	
		System.out.println("이름은 ? "+std.getName());
		System.out.println("나이는 ? "+std.getAge());
		System.out.println("키는 ? " + std.getHeight());
	
		System.out.println();
		
		
		//xxx님의 나이는 xx살이고, 키는 xxx.xcm 입니다.
		Student kcy = new Student();
		
		kcy.setName("김채영");
		kcy.setAge(23);
		kcy.setHeight(158.3);
		
		System.out.printf("%s님의 나이는 %d살이고, 키는 %.1fcm 입니다.",kcy.getName(),kcy.getAge(),kcy.getHeight());
	
		Student hong = new Student();
		hong.setName("이순신");
		hong.setAge(40);
		hong.setHeight(200);
		
		System.out.println("\n"+ hong.info());
	
		
	}

}
