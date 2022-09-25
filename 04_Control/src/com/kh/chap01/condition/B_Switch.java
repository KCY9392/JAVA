package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Switch {
	
	/*
	 * switch문은 if문과 동일한 조건문 중 하나임.
	 * switch문과 if문의 차이점.
	 * 
	 * if(조건식) => 조건식 복잡하게 기술가능함.범위도 제시 가능(비교연산자 등)
	 * switch 조건식X => "확실한"값의 조건만 기술 (동등비교(==)만 수행!)
	 * 
	 * [표현법]
	 * switch(앞으로 동등비교를 할 대상자) {
	 * case 값1 : 실행될 코드1; 
	 *              //비교할 대상자와 값1을 동등비교(==)한 결과가 true라면 우측코드가 실행됨.
	 * 			  break;  
	 *              //break문을 작성해야지만, 실행될 코드1 실행후 switch문 종료함.
	 * case 값2 : 실행될 코드2;
	 * 			  break;
	 * case 값n : 실행될 코드n;
	 * 			  break;
	 * default : 실행할 코드;
	 * }
	 * 
	 * switch문의 장점. -> case를 통해 내가 실행하길 원하는 코드를 한번에 찾아가기 때문에,
	 * 					 연산속도가 빠름.
	 * 
	 */
	
	public void method1() {
		// 1~3 사이의 정수값을 입력받아서,
		// 1인 경우, "빨간불입니다." 출력
		// 2인 경우, "파란불입니다." 출력
		// 3인 경우, "초록불입니다." 출력
		// 1~3이 아닌 경우, 잘못입력한 경우 -> "잘못입력했습니다." 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~3 사이의 정수를 입력해주세요 : ");
		int number = sc.nextInt();
		
//		if(number == 1) { //1번검사
//			System.out.println("빨간불입니다.");
//		}else if(number == 2) { //2번검사
//			System.out.println("파란불입니다.");
//		}else if(number == 3) { //3번검사
//			System.out.println("초록불입니다.");
//		}else {
//			System.out.println("잘못입력했습니다.");
//		}
		switch(number) {
		case 1 :
			System.out.println("빨간불입니다.");
			break;
		case 2 : 
			System.out.println("파란불입니다.");
			break;
		case 3 : 
			System.out.println("초록불입니다.");
			break;
		default : 
			System.out.println("잘못입력했습니다.");
			//break; 생략가능
		}
		//break 추가시, 입력받은 number에 해당하는 case문 한번 검사함.
		
		sc.close();
	}
	
	public void method2() {
		//사용자에게 구매할 과일이름을 입력받고(사과, 바나나, 복숭아)을 입력받아
		//각 과일마다 가격을 출력하는 프로그램(사과 1000원, 바나나 2000원, 복숭아 5000원)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매할 과일을 입력하세요(사과, 바나나, 복숭아) : ");
		String fruit = sc.nextLine();
		
		int price = 0;
		
		switch(fruit) {
		case "사과" : 
			price = 1000;
			break;
		case "바나나" :
			price = 2000;
			break;
		case "복숭아" :
			price = 3000;
			break;
			
		default :
			System.out.println("잘못입력했습니다. 다시 입력해주세요.");
			sc.close();
			return; // method2() 자체를 종료시킨다.
		}
		System.out.printf("%s 과일의 가격은 %d 원 입니다.",fruit,price);
		
		sc.close();
	}
	
	//break문 없는 게 더 유용한 경우
	public void method3() {
		//사용자에게 등급별로 권한을 부여하는 프로그램
		//1 : 권리권한, 글쓰기권한, 읽기권한
		//2 : 글쓰기권한, 읽기권한
		//3 : 읽기권한
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등급(정수)을 입력하세요 : ");
		int level = sc.nextInt();
		
		
		switch(level) {
		case 1 : System.out.println("관리권한 부여");
		case 2 : System.out.println("글쓰기권한 부여");
		case 3 : System.out.println("읽기권한 부여");
		
		//break문이 없다면, 순차적으로 다 실행된다.
		}
		sc.close();
	}
	
	public void method4() {
		// 사용자에게 1월 ~ 12월 사이의 월을 입력받아서
		// 해당 달의 마지막 날짜를 출력하는 프로그램.
		// 출력문 : 해당 달은 xx일까지 입니다.
		// "1월에서 12월까지의 숫자를 입력하셔야 됩니다!"
		// 1,3,5,7,8,10,12 -> 31일
		// 4,6,9,11 -> 30일
		// 2 -> 28,29일
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1월~12월 사이의 월을 입력해주세요 : ");
		int month = sc.nextInt();
		
		String day = "";
		switch(month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			day = "31일";
			break;
		case 4 : case 6 : case 9 : case 11 :
			day = "30일";
			break;
		case 2 :
			System.out.println("2월은 -> 해당달은 28일까지 입니다!");
			sc.close();
			return;
			
		default : System.out.println("잘못입력했습니다.(1~12월까지의 월을 입력)");
			method4();
		}
		System.out.printf("%d월은 -> 해당달은 %s 까지 입니다!",month,day);
		
		sc.close();
	}
	
}
