package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	/*
	 * 삼항연산자 : 3개의 값을 가지고 연산하는 연산자
	 * 
	 * [표현법]
	 *  조건식 ? 조건식의 결과가 true이면 실행할 값 : false면 실행할 값
	 *  조건식이란, true나 false가 나오게하는 연산자 ( 주로 비교,논리연산자를 통해 작성 )
	 *  
	 */
	
	public void method1() {
		//사용자가 정수값을 입력하면 그 값이 양수인지, 양수가 아닌 지 판별 후 출력.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값을 입력해주세요 : ");
		int num = sc.nextInt();
		
		//양수인지 음수,0인지 판별
		// num > 0 참이면 양수, 거짓이면 음수
		
		String result = num > 0 ? "양수" : "양수가 아님";
		System.out.println(result);
		System.out.println(num > 0 ? "양수" : "양수가 아님");
		sc.close();
	}
	
	public void method2() {
		//사용자가 입력한 정수값이 짝수인지 홀수인지 판별 후 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 한 개 입력해주세요 : ");
		int num = sc.nextInt();
		
		//num % 2 == 0 로 짝수(참) 홀수(거짓) 판별
		String str = (num%2 == 0) ? "짝수" : "홀수";
		//System.out.println(str);
		//System.out.println((num%2 == 0) ? "짝수" : "홀수");
		
		//xxx은 xx입니다.
		System.out.printf("%d 는 %s 입니다.",num,str);
		
		sc.close();
		}
	
	public void method3() {
		// 사용자에게 종료의사를 입력받은 후 판별해서 출력.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("종료하시려면 y를 눌러주세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = (ch == 'y' || ch == 'Y') ? "종료하겠습니다." : "계속 진행하겠습니다.";
		
		System.out.println(result);
		
		sc.close();
	}
	
	public void method4() {
		// 사용자로부터 영어를 한 글자 입력받고, 대문자인지 ,대문자가 아닌지 판별 후 출력.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영어를 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = (ch >= 'A' && ch <= 'Z') ? "대문자입니다." : "대문자가 아닙니다.";
		System.out.println(result);
		
		sc.close();
	}
	
	public void method5() {
		// 사용자가 입력한 정수값이 양수인지, 음수인지, 0인지 정확하게 판별하고 출력해보는 프로그램.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		
		//중복삼항연산자.
		
		//String result = (num > 0) ? "양수입니다." : (num < 0 ? "음수입니다." : "0입니다.");
		
		String result = (num > 0) ? "양수입니다." : (num == 0 ? "0입니다." : "음수입니다.");
		
		System.out.println(result);
		
		sc.close();
		
	}
	
	public void method6() {
		// 3개의 값을 입력받음.
		// 그 중 2개의 값은 정수, 나머지 하나는 +, - 같은 '문자'를 입력받아서.
		// + 일 경우 2개의 정수를 +연산 후 출력,
		// - 일 경우 2개의 정수를 -연산 후 출력.
		// + - 아니라면, "잘못입력하셨습니다."를 출력
		// 삼항연산자 중복해서 사용!
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("+나 -를 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = ch == '+' ? num1 + num2 + "" : (ch == '-' ? (num1 - num2) + "" : "잘못입력했습니다.");
		
		//String값에 int값을 대입하려면, 강제형변환해줘야하는 데, 
		//(String)형변환 연산자를 사용할 수 없고,
		// Strint + 정수값 은 무조건 String값이 나오기때문에
		// + "" 를 붙여줘서 String자료형으로 반환된다.
		
		String result2 = (ch == '+' || ch == '-') ? ((ch == '+') ? num1 + num2 +"" : num1 - num2 + "") : "잘못입력했습니다.";
		
		System.out.println(result);
		
		System.out.println(result2);
		
		sc.close();
	}
	
	
	
	
	
	
	
	
}
