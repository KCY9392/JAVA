package com.kh.chap01_math;

// import java.lang.*;
// 눈에 보이지않지만 자동으로 항상 import되어있다.

public class MathRun {

	public static void main(String[] args) {
		
//		Math mat = new Math();
		
	// Math클래스에 있는 다양한 기능.
		
		//파이 => Math클래스안에 상수필드로 정의되어있음.
		System.out.println("파이 : "+Math.PI);
		
		//올림메소드
		double num1 = 4.349;
		System.out.println("올림 : "+Math.ceil(num1)); //반환값 double.
		
		//반올림메소드
		System.out.println("반올림 : "+Math.round(num1)); //반환값 long.
		
		//버림 메소드
		System.out.println("버림 : "+Math.floor(num1)); //반환값 double.
		
		//가장 가까운 정수값을 알아낸 후 실수형 반환
		System.out.println("가장 가까운 정수값 : "+Math.rint(num1)); //반환값 double.
		
		//절대값 
		int num2 = -10;
		System.out.println("절대값 : "+Math.abs(num2)); //반환값 long.
		
		//최소값
		System.out.println("최소값 : "+Math.max(5, 10)); //더 작은 값으로 반환
		
		//최대값
		System.out.println("최대값 : "+Math.max(5, 10)); //더 큰 값으로 반환
		
		//제곱근
		System.out.println("4의 제곱근 : "+Math.sqrt(4)); //반환값 double.
		
		//제곱
		System.out.println("2의 10 제곱 : "+Math.pow(2, 10)); //반환값 double.
		
		
		/*
		 * java.lang.Math클래스의 특징
		 *  - 모든필드 => 상수필드.
		 *  - 모든 메소드 => static 메소드
		 *  
		 *  모든게 다 static 메소드들이기 때문에, Math.으로 접근이 가능한 것 (객체생성 안해도 됨)
		 *  Math클래스의 생성자가 private이기 때문에, 애초에 생성조차 불가능함.
		 */

	}

}
