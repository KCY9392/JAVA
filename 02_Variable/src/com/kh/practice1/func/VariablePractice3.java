package com.kh.practice1.func;

import java.util.Scanner;

//실습 문제 3.
//키보드로 가로,세로 값을 실수형으로 입력받아 사각형의 면적과 둘레를 계산하여 출력하세요.
public class VariablePractice3 {
	public void input2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 : ");
		double a = sc.nextDouble();
		
		System.out.print("세로 : ");
		double b = sc.nextDouble();
		
		System.out.println("면적 : "+(a*b));
		System.out.println("둘레 : "+((a+b)*2));
		
		sc.close();
	}
}
