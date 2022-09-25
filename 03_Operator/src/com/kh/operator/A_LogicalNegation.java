package com.kh.operator;

public class A_LogicalNegation {
	/*
	 * 논리 부정 연산자  !  ( 단항연산자 )
	 * 
	 * !논리값 = 논리값
	 * 
	 * 논리값(true / false)를 반대로 바꿔주는 연산자.
	 * !true = false,
	 * !false = true 이다.
	 * 
	 */
	
	public void method() {
		System.out.println("true의 부정은 ? "+ !true);//false
		System.out.println("false의 부정은 ? "+ !false);//true
		
		boolean b1 = true;
		boolean b2 = !b1;
		
		//sysout 쓰고 ctrl + space하면 자동으로 나옴.
		System.out.println("b1 : "+b1);//true
		System.out.println("b2 : "+b2);//false
		
		boolean b3 = !(5>3);//(5>3)은 true지만, !붙었으므로 false
		System.out.println("b3 : "+b3);
	}
}
