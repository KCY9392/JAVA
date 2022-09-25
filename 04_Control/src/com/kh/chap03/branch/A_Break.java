package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	/*
	 * break; 
	 * 반복문에서 break문을 만나는 순간, 
	 * 현재 속해있는 반복문(가장 가까운 반복문)을 빠져나가는 구문.
	 * 
	 * 즉, 해당 break문이 속해있는 반복문만을 빠져나감.
	 * 
	 * 주의할 점 : switch문에서 break와는 다른 개념이다.
	 * 			switch문안의 break는 해당 switch문만을 빠져나가기 위한 용도이다.
	 * - 반복문이나 switch문에서만 사용 가능
	 * 
	 * 
	 */
	
	
	
	//매번 반복적으로 발생되는 랜덤값(1~100)을 출력할건데,
	//만약 그 랜덤값이 3의 배수라면, 반복문을 빠져나가게끔 만들기.
	public void method1() {
		
		while(true) {
			int random = (int)(Math.random()*100+1);
			
			if( random%3 ==0 ) { // 3의 배수가 출력되기전에 break;
				break;
			}
			System.out.println("random : "+random);
			
//			if( random%3 ==0 ) { // 3의 배수가 출력되고, break;
//				break;
//			}
		}
	}
	
	
	
	
	//매번 사용자에게 문자열을 입력받은 후, 해당 문자열의 길이를 출력
	// 단, 사용자가 입력한 문자열이 "exit"와 일치할 경우, 반복을 종료.
	public void method2() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();

			if (str.equals("exit") || str.equals("EXIT")) {
				break;
			}
			System.out.printf("%s의 길이 : %d \n\n", str, str.length());

		}
		sc.close();
	}
	//코드 전체를 깔끔히 정리하고 싶다면,
	//단축키 : 정리하고싶은 코드 드래그 + ctrl + shift + f 
	// 우클릭 + source 클릭 + format 클릭 해도 동일한 결과 나온다.
	
	
	
	//매번 사용자에게 정수값을 입력받아 양수라면, 1~사용자가 입력한 수까지 출력
	// ex) 1 2 3 4 5 ...
	//단, 정상적으로 양수 입력한 경우, 한번 출력하고 종료.
	//정상적인 수가 아니라면(양수가 아니라면), 다시 입력하도록 함.
	public void method3() {
		Scanner sc = new Scanner(System.in);


		while (true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num > 0) {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break;
			}else {
		
				System.out.println("양수를 입력해주세요!!");
			}
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
