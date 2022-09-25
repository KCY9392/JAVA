package com.kh.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UncheckedException {
	
	/*
	 * 
	 * RuntimeException
	 *  - 프로그램 실행 시 발생되는 예외들
	 *  
	 * RuntimeException 의 자식클래스들.
	 *  - ArrayIndexOutOfBoundsException : 배열의 부정확한 인덱스로 접근할 떄 발생하는 예외
	 *  - NegativeArraySizeException : 배열의 크기를 음수로 지정할 경우, 발생하는 예외.
	 *  - ClassCastException : 허용할 수 없는 형변환이 진행될 경우, 발생하는 예외.
	 *  - NullPointerException : 레퍼런스가 아직 null임에도 불구하고 접근하려고 할 때 발생하는 예외.
	 *  - ArithmeticException : 나누기 연산시, 0으로 나눌때 발생하는 예외.
	 *  - ......
	 *  
	 *  => 이러한 RuntimeException 과 관련한 예외는 충분히 예측가능한 상황이기 때문에
	 *     예외 자체가 발생이 안되게끔 조건문으로 해결가능하긴 함.
	 *     굳이 예외처리를 할 필요가 없음.
	 */
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		//ArimeticExcpeption
		//사용자에게 두개의 정수값을 입력받아, 나눗셈 연산 결과 출력.
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수(0은 제외) : ");
		int num2 = sc.nextInt();
		
		//해결방법 1. 조건문으로 처리
//		if(num2 != 0) {
//			System.out.println("나눗셈 연산 결과 : "+ (num1 / num2));
//		}else {
//			System.out.println("0으로 나눌 수 없습니다.");
//		}
		
		
		//해결방법 2. 예외처리 구문으로 해결.(예외가 발생했을 경우, 실행한 내용을 정의해두는 것.)
		/*
		 * [표현법]
		 * try ~ catch문.
		 * 
		 * try {
		 * 
		 * 	// 예외가 발생될 수 있을 법한 구문.
		 * 
		 *  } catch ( 발생될예외클래스  변수명 ) {
		 * 
		 * 	// 해당 예외가 발생할 경우, 실행할 구문.
		 * 
		 *  }
		 */
		
		try { 
			System.out.println("나눗셈 연산 결과 : "+ (num1 / num2));
		} catch ( ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			
			e.printStackTrace();
			// 에러가 어디에서 발생했는 지 파악할 수 있게 도와주는 메소드.
			// 오츄를 추적할 수 있는 메소드.
			// 현재 예외가 발생한 정보를 볼 수 있다.
		}
		System.out.println("프로그램 종료.");
	}
	
	
	public void method2() {
		
		System.out.print("정수 입력(0제외) : ");
		
		
		try {
			int num = sc.nextInt();
			// 정수이외의 값을 입력한 경우, InputmismatchException 발생!!
			
			System.out.println("나눗셈 연산결과 : "+(10/num));
		} catch ( ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch ( InputMismatchException e) {
			System.out.println("정수로 입력해주세요.");
		}
		// catch를 연달아 사용할 수 있다.
		
		System.out.println("프로그램 종료.");
	}
	
	
	public void method3() {
		
		System.out.print("배열의 크기 : ");
		//100번째 인덱스에 담긴 값을 출력.
//		try {
//
//			int size = sc.nextInt();
//
//			int[] arr = new int[size];
//
//			for (int i = 0; i < arr.length; i++) {
//				arr[i] = i;
//			}
//			System.out.println(arr[99]);
//
//		}catch ( InputMismatchException e) {
//			System.out.println("정수로 입력해주세요.");
//		}catch ( NegativeArraySizeException e ) {
//			System.out.println("배열의 크기를 음수로 지정할 수 없습니다.");
//		}catch ( ArrayIndexOutOfBoundsException e ) {
//			System.out.println("배열의 부정확한 인덱스로 접근하였습니다.");
//		}
		
		try {

			int size = sc.nextInt();

			int[] arr = new int[size];

			System.out.println(arr[99]);
		}catch ( NegativeArraySizeException e ) {
			System.out.println("배열의 크기를 음수로 지정할 수 없습니다.");
			//범위가 더 작은 exception을 먼저 기술해야한다.
			
			
			//권장하지 않음.
			//에러가 다양하게 발생하는 것을 하나로 퉁치기 때문에.(다형성)
			// 부적절한 인덱스 에러와 타입 에러는 Runtime에러를 상속받고있기 때문에
			// 다합쳐서 Runtime에러로 예외처리 해도된다. (다형성)
		}catch ( RuntimeException e) {
			e.printStackTrace();
			
			System.out.println("예외가 발생했네요."
					+ "입력값이 정수가 아니거나,"
					+ "부적절한 인덱스에 접근하였습니다. ");
			//셋 중에 어떤 에러인지 명확히 알 수 없다.
		}
		
			//catch ( NegativeArraySizeException e ) {
			//			System.out.println("배열의 크기를 음수로 지정할 수 없습니다.");
			//		} 
		//-> 이미 NegativeArraySizeException e를 먼저 위에서 체크했기때문에 실행조차 안된다.
		
		System.out.println("프로그램 종료.");
	}
	/*
	 * RuntimeException 관련된 예외는
	 *  - 조건문으로 해결이 가능 => 예외 자체가 발생 안되게끔 개발자가 소스코드로 핸들링할 수 있다.
	 *  - 예외 처리 구문으로 해결 가능 => 예외가 발생했을 때를 대비해서 그 때 실행할 내용을 정의해 두는 것.
	 *  
	 *  예측이 가능한 상황 => 조건문으로 해결 ( 권장하는 방법 )
	 *  예측이 불가능한 상황 => 예외처리 구문으로 해결.
	 *  
	 *  RuntimeException 계열은 충분히 예측 가능한 상황이기 때문에, 조건문으로 해결하는 것을 권장.
	 *  
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
