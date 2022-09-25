package com.kh.chap04_Field.model.vo;

//클래스 변수(static)와 상수필드(final)에 대해.
public class FieldTest3 {
	//변수 [표현법]
	//접근제한자 [예약어] 자료형 변수명;
	
	
	//클래스변수
	public static String str = "스태틱 변수";
	/*
	 * static "공유"의 개념이 강함
	 *  => 프로그램 실행과 동시에 메모리영역에 박스를 만들어두고, 공유해서 쓰기위함.
	 * 자주 사용하는 변수, 메소드를 static으로 선언함.
	 * 
	 * 생성시점 : 프로그램 실행과 동시에 메모리의 static영역에 할당됨.(객체를 만들지 않아도!)
	 * 소멸시점 : 프로그램 종료시 소멸됨.
	 * 
	 */
	
	
	
	
	//상수
	/*
	 * 상수필드
	 * public static final 자료형 변수명 = 값;
	 * -> 두개의 예약어가 동시에 사용.
	 * 한번 지정된 값을 고정해서 쓰기 때문에, 무조건 초기화를 해줘야한다.
	 * 
	 * 예약어의 순서는 상관없음. final static 도 가능.
	 * 
	 * static : 공유의 개념.
	 * final : 상수.
	 * 
	 * 값이 변경되어서는 안되는 고정적인 값을 메모리상에 올려두고, (프로그램 실행과 동시에 메모리영역에 할당, 값이 변하지도 않음.)
	 * 공유하면서 사용할 목적임.
	 * ex) Math.PI
	 * 
	 */
	
	public static final int NUM= 10;
	
	public static void method1() {
		System.out.println("안녕하세요");
	}	
}	
