package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	/*
	 * 논리연산자(이항연산자)
	 * 두개의 논리값을 연산하는 연산자
	 * 논리값(논리연산자) 논리값 => 결과도 논리값(boolean)
	 * 
	 * AND 연산자 : 논리값 && 논리값
	 * 			=> 왼쪽 오른쪽 둘다 true 여야 최종적으로 true 반환.
	 * 			   둘 중 하나라도 false라면 false 반환
	 * 
	 * OR 연산자 : 논리값 || 논리값 
	 * 			=> 왼쪽 오른쪽 어느 값이라도 true 있으면, true 반환.
	 * 			   둘 다 false 라면, false 반환
	 * 
	 */
	
	//AND (&&)
	public void method1() {
		//사용자가 입력한 정수값이 양수 "이면서(이고)" 짝수인지 확인.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 한개 입력해주세요 : ");
		int num = sc.nextInt();
		
		// num > 0 , num % 2 == 0 두 조건이 true면 짝수
		boolean result = (num > 0) && (num % 2 == 0);
		System.out.println("사용자가 입력한 값이 양수이면서 짝수 입니까 ? "+result);
		//&& 의미 : 그리고, ~이면서, ~이고
		sc.close();
	}
	
	//AND (&&)
	public void method2() {
		//사용자가 입력한 값이 1이상 100이하의 수인지 확인.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 한 개를 입력해주세요 : ");
		int num = sc.nextInt();
		
		//boolean result = 1 <= num <= 100; -> 연달아 사용 불가능.
		boolean result = (1 <= num) && (num <= 100);
		System.out.println("사용자가 입력한 값이 1이상 100이하의 수 인가요 ?"+result);
		
		/*
		 * && (AND) : 그리고, ~이면서, ~이고, ~뿐만아니라.
		 * 			  두 개의 조건 모두 true여야 결과값도 true
		 * 			  둘 중 하나라도 false라면 결과값은 false
		 */
		sc.close();
	}
	
	//AND (&&)
	public void method3() {
		// 사용자가 입력한 값이 영문 대문자인지 확인!
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영어를 한 단어 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		
		//'A' 65, 'Z' 90
		//ch >= 65 && ch <= 90
		//boolean result = ch >= 65 && ch <= 90;
		boolean result = (ch >= 'A') && (ch <= 'Z');
		System.out.println("result 는 영어 대문자인가요 ? " +result);
		sc.close();
	}
	
	//OR (||)
	public void method4() {
		//사용자가 입력한 값이 'y' 'Y'인지 확인하기.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("계속 하시려면 y를 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		// ch == 'y' || ch == 'Y' 
		boolean result = (ch == 'y' || ch == 'Y');
		
		System.out.println("사용자가 입력한 값이 y나 Y입니까 ? : " + result);
		
		/*
		 * || (OR) : 또는, ~이거나
		 * 두 개의 값 중 하나라도 true이면 결과도 true
		 * 두 개의 값(조건의 결과값)이 모두 false라면 결과도 false
		 */
		sc.close();
	}
	
	/*
	 * 정리 :
	 * && : 두 개의 조건이 모두 true 여야 결과값이 true임 ( AND == ~이고, ~이면서, 그리고 )
	 * 
	 *  &&연산자는 연산자 기준으로 왼쪽(앞)의 결과가 false라면 뒤의 조건식은 실행하지 않음.
	 *  
	 * || : 두 개의 조건 중 하나가 true면 결과값이 true임 (|| == 또는, ~이거나)
	 * 
	 *  ||연산자는 연산자 기준으로 왼쪽(앞)의 결과가 true라면 뒤의 조건식은 실행하지 않음.
	 *  -> 뒤의 조건식을 실행안하는 이유는 
	 *     앞의 결과값이 어차피 true인데 굳이 뒤에 식을 실행시키면 효율적으로 좋지않아서
	 *     프로그램 자체적으로 뒤의 식을 실행안함.
	 */
	
	public void method5() {
		int num1 = 10;
		
		boolean result1 = (num1 < 5) && (++num1 > 0); 
		// 앞의 조건식이 false이므로, 뒤의 조건식이 실행되지 않으므로, num1은 여전히 10이다.
		
		//boolean result1 = (num1 > 5) && (++num1 > 0); //true이므로 실행해서 num1은 11이 된다.
		System.out.printf("result1 : %b , num1 : %d\n", result1, num1);
	
		int num2 = 10;
		boolean result2 = (num2 < 20) || (++num2 > 0);
		System.out.printf("result2 : %b , num2 : %d\n", result2, num2);
		
		//boolean result3 = false && (++num2 > 0);
		//노란경고 : 실행되지않는 데 왜 넣어둔거냐고 경고뜸.
		
		//boolean result3 = true || (++num2 > 0);
		//System.out.println("result3 : " + result3);
		// 뒤의 비교연산구문이 deadcode라고 한다.
		// 실행 시 오류는 안나는 데 굳이 쓸필요 없는 데 왜써? 라는 뜻.
		
		
	}
}
