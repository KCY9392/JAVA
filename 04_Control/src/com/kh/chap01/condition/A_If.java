package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	/*
	 * 기본적으로 프로그램의 진행은 순차적으로 진행됨.
	 * 단, 이 순차적인 흐름을 바꾸고자 한다면 제어문을 통해서 직접 제어가 가능함.
	 * 
	 * 선택적으로 실행시키고자할때 -> 제어문
	 * 반복적으로 실행시키고자할때 -> 반복문
	 * 그 외의 흐름제어시 -> 분기문
	 * 
	 * 조건문
	 * 조건식을 통해 참이냐 거짓이냐를 판단해서 그에 해당하는 코드 실행.
	 * 
	 * 조건식의 결과는 항상 trur/false 여야함!!
	 * 보통 조건식에서는 비교연산자(대소, 동등), 논리연산자(AND, OR)을 주로 사용.
	 * 
	 * 조건문은 크게 if문(단독 if, if~else, if~elseif, 중복 if문), 
	 * 			 switch문 으로 나뉨
	 * 
	 */
	
	public void method1() {
		//삼항연산자를 조건문으로 바꿔보자.
		
		/*
		 *  [표현법]
		 *  if문.
		 *  
		 *  if(조건식) {
		 *  	//조건식이 true인 경우 실행될 코드.
		 *  }
		 *  => 조건식의 결과가 참인 경우, 중괄호블럭 안의 코드가 실행됨.
		 *  => 조건식의 결과가 거짓인 경우, 중괄호블럭 안의 코드가 무시하고 넘어감.
		 *  
		 */
		
		//사용자에게 정수를 입력받고, 양수인지 양수가 아닌지 출력.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		//num > 0 ? "양수다" : "양수가 아니다.";
		
		if(num>0) {//1번검사
			System.out.println("양수다.");
		}
		if(num<=0) {//2번검사
			System.out.println("양수가 아니다.");
		}
		sc.close();
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		/*
		 * if ~ else문.
		 * [표현법]
		 * 
		 * if(조건식) {
		 *  //조건식 참이면 실행될 코드
		 *  } else {
		 *  //조건식 거짓이면 실행될 코드
		 *  }
		 */
		
		if(num>0) { //1번검사
			System.out.println("양수다.");
		}
		else {
			System.out.println("양수가 아니다.");
		}
		sc.close();
	}
	
	public void method3() {
		
		/*
		 * if ~ else if
		 * [표현법]
		 * 
		 * if(조건식1) {
		 *  // 조건식1의 값이 참인 경우 실행될 코드
		 * } 
		 * else if(조건식2) {
		 *  // 조건식2의 값이 참인 경우 실행될 코드
		 * } 
		 * else if(조건식3) {
		 *  // 조건식3의 값이 참인 경우 실행될 코드
		 * } 
		 * [ else { //생략가능
		 *  // 위의 조건들이 모두 거짓인 경우 실행될 코드
		 * } ]
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다!");
		}else if(num == 0) {
			System.out.println("0이다.");
		}else /* if(num < 0) */{
			System.out.println("음수다!");
		}
		sc.close();
		}
	
	public void method4() {
		//사용자에게 정수값을 입력받고 청소년/어린이/성인 출력
		// if else if문 사용해서 만들어보기.
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		//어린이(13세이하), 청소년(13세초과-19세이하), 성인(19세초과)
		
//		if(age <= 13) {
//			System.out.println("어린이");
//		} else if (/* age > 13 && */ age <= 19) {
//			System.out.println("청소년");
//		} else /* if(age > 19) */{
//			System.out.println("성인");
//		} //crtl + shift + ? 하면 드래그한 코드 주석처리
		
		
		
		String result = "";
		//최소한 어떤 값으로 변수를 초기화 해주는 습관들이기!
		//리터럴 초기화 : 변수를 선언과 동시에 초기화해준다.
		
		if(age <= 13) {
			result = "어린이";
		} else if (/* age > 13 && */ age <= 19) {
			result = "청소년"; 
			//{ }영역이 달라서 같은 변수명인 result 사용 가능하다.
		} else /* if(age > 19) */{
			result = "성인";
		} 
		//crtl + shift + ? 하면 드래그한 코드 주석처리
		//ctrl + d 한 줄 지워짐.
		
		System.out.println(result);
		//{}영역 밖에서 변수 선언하고, {}영역 안에서 선언한 변수를 사용하면 
		//{}영역 밖에서 변수 접근이 불가능하다.
		sc.close();
	}
	
	public void method5() {
		
		Scanner sc = new Scanner(System.in);
		// 이름 , 성별 한 글자를 입력받아 남자인지 여자인지 출력하는 프로그램.
		// 출력문 : xxx은 xx입니다.
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별(M/F만 입력) : ");
		char gender = sc.nextLine().charAt(0);
		
		String result = "";
		
		if(gender == 'm' || gender == 'M') {
			result = "남자";
		}
		else if(gender == 'f' || gender == 'F') {
			result = "여자";
		}else {
			//result = "잘못입력하셨습니다.";
			System.out.print("잘못입력하셨습니다.");
			sc.close();
			return; //현재 메소드(method5())를 빠져나가는 역할.
		}
		
		System.out.printf("%s님은 %s입니다", name, result);
		sc.close();
	}
	
	public void method6() {
		//특이케이스, 문자열간의 동등비교에 관하여 (문자열 == 문자열)
		//사용자에게 이름을 입력받아 김채영과 일치하는 지 비교하는 프로그램.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.nextLine();
		
		String name2 = "김채영";
		
		
		/*
		 * 기본자료형 : boolean, char, byte, short, int, long, float, double
		 * 참조자료형 : String 
		 * 
		 * ★문자열.equals(비교할 문자열)
		 * 문자열과 문자열을 비교할 때, .equals 를 사용한다.
		 * 
		 */ 
		
		if(name.equals(name2)) {
			System.out.println("김채영이시군요.");
		} else {
			System.out.println("김채영이 아니군요. 누구세요?");
		}
		sc.close();
	}
	
	public void method7() {
		// 양수를 입력받고, 짝수 홀수 판별해서 출력하는 프로그램.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양수를 입력해 주세요 : ");
		int num = sc.nextInt();
		
		//전제조건 먼저 if문으로 조건식 만듦.
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다.");
			}
		}else {
			System.out.println("양수가 아닙니다. 다시 입력하세요.");
			method7();//양수를 입력할때까지 호출.
		}
		sc.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
