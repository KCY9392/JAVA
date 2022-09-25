package com.kh.chap04_Field.model.vo;

public class FieldTest1 {
	/*
	 * 변수 구분
	 * - 전역 변수 : 클래스 영역에 바로 선언하는 변수 -> 클래스 내에서면 어디서든 사용 가능.
	 * - 지역 변수 : 클래스 영역 내의 어떤 특정한 구역({})에 선언한 변수(선언한 지역에서만 사용 가능)
	 * 			   ex) for문, if문 등.
	 * 
	 * 1. 전역변수 (2가지로 크게 구분됨)
	 * 		1) 멤버변수 == 인스턴스 변수 == 필드
	 * 			생성시점 : new 연산자를 통해서 해당 객체 생성하는 순간 메모리 영역에 할당.
	 * 			소멸시점 : 객체 소멸시 같이 소멸.
	 *  	
	 *  	2) 클래스 변수 == statice 변수 -> static이라는 예약어가 붙어 있냐 아니냐에 따라 멤버변수냐, 클래스변수냐 구분.
	 * 			생성시점 : 프로그램 실행과 동시에 메모리 영역(static)에 할당.
	 * 			소멸시점 : 프로그램 종료될때 소멸. -> 멤버변수와 달리, 객체가 소멸되도 프로그램 종료시까지 값이 남아있다.
	 * 
	 * 2. 지역변수
	 * 	생성시점 : 특정한 구역({}) 실행시, 메모리영역에 할당(예 ) 메소드실행시)
	 * 	소멸시점 : 특정한 구역({})이 종료시 소멸(예 ) 메소드 종료시)
	 * 
	 * 
	 */
	
	private int global; //(전역변수)
	{	//초기화 블럭으로 전역변수 초기화.
		global = 2; // 이런식으로 전역변수 초기화하는 방식이 "초기화블럭방식"이다.
	}
	
	private static int classVariable; //(클래스 변수)
	
	static {
		classVariable = 3; //클래스 변수를 static예약어를 써서 "초기화블럭"으로 초기화한다.
	}
	
	public void method1(int num) {
		
		int local = 0;	// 지역변수 -> 접근제한자 붙이지 않음.
		
		if(true) {
//			int a = 0;	// 지역변수 ( 중괄호 안에서만 사용 가능 )
		}
		
		System.out.println(global);
		//멤버변수는 프로그램 실행 시 자동으로 초기화됨(jvm이 초기화)
		
		System.out.println(classVariable);
		//클래스변수는 프로그램 실행 시 자동으로 초기화됨(jvm이 초기화)
		
		System.out.println(local); 
		// 지역변수는 초기화안하면 에러뜸
		
		System.out.println(num);
		//에러 안뜨는 이유? 해당 메소드 호출 시 반드시 값 넘겨줘야 실행이 되기 때문.
		
//		System.out.println(a); -> 에러 . if 중괄호 안에서만 사용 가능함.
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
