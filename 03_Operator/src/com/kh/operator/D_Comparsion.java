package com.kh.operator;

import java.util.Scanner;

public class D_Comparsion {
	/*
	 * 비교연산자 / 관계연산자 (이항연산자)
	 * 
	 * 두 개의 값을 가지고 비교
	 * 비교 연산한 결과가 참일 경우 true / 거짓일 경우 false값을 변환
	 * 즉, 비교연산결과의 자료형은 논리값(boolean)임.
	 *=> 후에 특정 조건을 제시할 수 있는 조건문에서 많이 쓰일 예정.
	 *
	 * 코그 작음을 비교하는 경우
	 * a < b 해석 : a가 b보다 작습니까?
	 * a > b 해석 : a가 b보다 큽니까?
	 * a <=b 해석 : a가 b보다 "작거나" 같습니까?
	 * a >=b 해석 : a가 b보다 "크거나" 같습니까?
	 * 
	 *  일치함을 비교할 때.
	 *  a == b 해석 : a와 b가 같습니까?
	 *  a != b 해석 : a와 b가 다릅니까?
	 *
	 */
	
	public void method1() {
		//int a = 10, b = 25; 권장하진않음.
		
		int a = 10;
		int b = 25;
		
		System.out.println("a > b ? " + (a>b) ); 
		//산술연산자는 (+) 비교연산자보다 우선순위가 높아서 먼저 실행됨.
		//따라서 괄호로 묶어줘야함.
		
		System.out.println("a <= b ? " + (a<=b));
		
		boolean result = (a == b);
		//result에 false가 담기긴하지만, 가독성을 위해 ()괄호로 묶는 것을 권장.
		boolean result2 = (a != b);
		
		System.out.println("result = " + result + " , result2 = " +result2);
		
		//산술연산 + 비교연산
		System.out.println("a - b < 0 ? " + (a - b < 0) );//true
		
		System.out.println("a * 2 > b / 5 ? " + (a * 2 > b / 5));//true
		
		//짝수란 정수를 2로 나눴을 때 나머지가 0이면 짝수이다.
		System.out.println("a가 짝수 입니까? " + (a%2 == 0));//true
		System.out.println("a가 홀수 입니까? " + (a%2 != 0));//false
		System.out.println("a가 홀수 입니까? " + !(a%2 == 0));//false
		System.out.println("a가 홀수 입니까? " + (a%2 == 1));//false
		
		// 어떤 값을 2로 나눴을 때 나머지값이 0이냐 1이냐를 가지고 짝수, 홀수를 판별.
		// 2로 나누었을 때 결과가 0이면 짝수, 1이면 홀수.
		
	}
	
	public void method2() {
		//사용자에게 값을 입력받아 동등비교연산자 사용해보기.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력해 주세요 : ");
		int num = sc.nextInt();
		
		System.out.print("두번째 정수를 입력해 주세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println("num의 값이 num2의 값보다 큽니까 ? : " + (num > num2));
		System.out.println("num의 값이 num2의 값과 같습니까 ? : " + (num == num2));
		System.out.println("num의 값은 짝수 입니까 ? : " + (num%2 == 0));
		
		
		//특이케이스 (숫자와 문자(char)간의 비교)
		System.out.println("num2 < 'A' : " + (num2 < 'A'));
		//자동형변환 'A' 아스키코드표 상에서 숫자 65를 의미한다.
		//'A' ~ 'Z' 65~90까지의 숫자로 연달아 나열되어있음. (아스키코드표 참고)
		sc.close();
	}
}
