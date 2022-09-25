package com.kh.controller;

public class C_CustomException extends RuntimeException {

	/*
	 * 나만의 커스텀 에러 만드는 방법.
	 * 
	 * 1. 클래스 생성 후 RuntimeException 클래스 상속.
	 * 
	 * 2. super 키워드를 통해 부모생성자에 생성자의 매개변수로 받은 String msg 값을 전달.
	 */
	
	public C_CustomException() {
		
	}
	
	public C_CustomException(String msg) {
		super(msg);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
