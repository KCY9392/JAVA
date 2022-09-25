package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		
		// 모든 클래스는 Object클래스의 후손으로, Object안의 메소드들은 다 가져다 쓸수있음.
		
		Book bk = new Book("수학의 정석","수학쌤",15000);
		
		/*
		 * 출력문 안에 레퍼런스 변수(참조형변수 == 직접만든 자료형들이 포함됨.)를 제시해서 호출하는 경우
		 * 내부적으로 JVM이 자동으로 !! toString메소드를 호출함.
		 * 
		 * 부모클래스인 Object클래스에 있는 toString()의 원래 기능
		 * 클래스 이름 @ 주소값을 문자열 형태로 반환.
		 */
		
		System.out.println(bk/*.toString()*/);
		System.out.println(bk.toString());
		//getClass().getName() + '@' + Integer.toHexString(hashCode())
		
		// Object.toString 메소드 오버라이드 전 :
		// 클래스 이름 @ 주소값.
		// Object.toString 메소드 오버라이드 후 :
		// title : 수학의 정석, author : 수학쌤, price : 15000
	}

}
