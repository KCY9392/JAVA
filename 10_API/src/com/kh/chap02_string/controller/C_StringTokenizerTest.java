package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {

	
	public void method1() {
		
		String str= "Java,Oracle,JDBC,HTML,CSS,JavaScript";
		
		// 문자열을 분리해서 문자열 배열에 저장하는 방법.
		
		// 방법 1. 분리된 문자열들을 String[]배열에 차곡차곡 담고자할때,
		// 문자열.split(String 구분자) : String []
		
		String [] arr = str.split(",");
		// 구분자는 배열 값에 포함되지 않는 다.
		
		for(String s : arr) {
			System.out.println(s);
		}
		
		
		System.out.println("============================");
		
		
		
		//잘 사용안함.
		// 방벙 2. 분리된 각각의 문자열들을 토큰으로 취급하고 싶을 때,
		//  java.util.StringTokenizer 클래스를 이용하는 방법.
		
		//	  StringTokenizer stn = new StringTokenizer(분리하고자 하는 문자열, 구분자);
		
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		System.out.println("분리된 문자열의 갯수 : "+stn.countTokens());
		
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		// 딱히 인덱스를 제시하지 않아도, 현재위치를 정의하는 필드가 내부적으로 있기때문에,
		// 위치가 옮겨져서 차례차례 출력할 수 있다.
		
		//만약 여기서 한번 더 출력하면,
		// java.util.NoSuchElementException 에러가 난다. -> 값 없다고 에러난다는 의미
		
		int num = stn.countTokens();
		for(int i=0; i<num; i++) {	// stn에 구분자로 분리된 문자열의 개수만큼 반복
			System.out.println(stn.nextToken()); // 구분자로 분리된 문자열 출력
		}
		
		while(stn.hasMoreTokens()) { //stn공간에 남아있는 토큰이 존재할 경우에만 반복하는 반복문.
			System.out.println(stn.nextToken()); // 구분자로 분리된 문자열 출력
		}
	}
}
