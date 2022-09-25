package com.kh.practice1.func;

import java.util.Scanner;

//실습 문제 4.
//영어문자열 값을 키보드로 입력받아 문자의 앞에서 세 개를 출력하세요.
public class VariablePractice4 {
	public void input3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String a = sc.nextLine();
		
		System.out.println("첫 번째 문자 : "+a.charAt(0));
		System.out.println("두 번째 문자 : "+a.charAt(1));
		System.out.println("세 번째 문자 : "+a.charAt(2));
		
		sc.close();
	}
}
