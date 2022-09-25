package com.kh.practice1.func;
import java.util.Scanner;

//실습 문제 2.
//키보드로 정수 두개를 입력받아 두수의 합,차,곱,나누기한 몫을 출력하세요.
public class VariablePractice2 {
	//Scanner sc = new Scanner(System.in);
	//전역변수가 되지만, 메소드 안에서 Scanner선언을 권장
	public void input() {
		Scanner sc = new Scanner(System.in);
		//지역변수 sc
		//scanner는 메소드 안에서 선언하는 것을 권장한다.
		System.out.print("첫 번째 정수 : ");
		int a = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int b = sc.nextInt();
		
		//정수형변수 정수형변수 사이의 +은 더하기 역할
		//문자열 문자열 사이의 +은 연결하는 역할
		System.out.println("더하기 결과 : " + (a+b));
		System.out.println("빼기 결과 : " + (a-b));
		System.out.println("곱하기 결과 : " + (a*b));
		//*, /는 괄호()를 사용하지않아도 되지만, 가독성을 위해 추가하는 것을 권장한다.
		System.out.println("나누기 몫 결과 : " + (a/b));
		
		sc.close();
	}
}
