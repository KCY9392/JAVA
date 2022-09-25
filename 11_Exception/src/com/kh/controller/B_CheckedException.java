package com.kh.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class B_CheckedException {

	/*
	 * CheckedException 은 반드시 예외처리를 해줘야 하는 예외들.
	 * (즉, 예측 불가한 곳에서 발생하기 때문에 미리 예외처리 구문을 작성해줘야함.)
	 * => 주로 외부 객체와 어떤 입출력하는 상황에서 발생.
	 */

	public void method1() throws IOException{
//		try {
		method2();
//		}catch(IOException e) {
//			System.out.println("예외가 발생했다.");
	}

	public void method2() throws IOException {
		//Scanner sc = new Scanner(System.in);
		
		//Scanner 와 같이, 키보드로 입력받을 수 있는 객체 ( 단, 문자열만 가능 )
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner보다 문자열 처리 성능이 더 좋음.
		
		System.out.print("아무 문자열 입력해주세요 : ");
		
		// 방법 1. try ~ catch 문 이용.
//		try {
//			int num = Integer.parseInt(br.readLine());
			
			//String str = br.readLine();
			// 이 메소드 호출 시, IOException 가 발생할 수 있음을 컴파일 단계에서 에러로 알려줌.
			// 빨간줄뜨는 것이 컴파일 단계에서 나는 에러이다.
			
//			System.out.println("문자열의 길이 : "+str.length());
//			System.out.println("숫자 : "+num);
			
//		}catch (IOException e) {
//			System.out.println("예외발생!!");
			//예외가 언제 발생될 지 모름.
			//그래서 반드시 IOException 예외처리 해줘야한다.
			//IOException : 사용자의 입력,출력 하는 모든 상황에서 발생할 수 있는 모든 예외
		
		
		// 방법 2. throws : 지금 해당메소드(method2)에서 예외처리를 하지 않고,
		//		이 메소드를 호출한 곳(method1)으로 IOException예외처리를 떠넘기겠다는 뜻.
		// 가끔 사용함.(내가 예외처리하기 귀찮을때)
		String str = br.readLine();
		}
		
	/*				    < 예외 발생 시점 > 									  < 예외 처리 >
	 * RuntimeException  프로그램 실행 시 => 런타임 에러 찾을 수 있음( 컴파일 에러x ) => 필수가 아님. => uncheckedException
	 *  그 외 			 언제 발생할지모름 => 컴파일 에러						 => 필수		 => checkedException
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


