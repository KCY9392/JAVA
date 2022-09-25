package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {}
	
	public String afterToken(String str) {
		StringTokenizer st = new StringTokenizer(str, " ");
		StringBuffer sb = new StringBuffer();
		
		//String result = "";
		while(st.hasMoreTokens()) {
			sb.append(st.nextToken());
			// result += st.nextToken(); -> 메모리 낭비가 심함.
		}
		return sb.toString();
	}
	
	public String firstCap(String input) {
		String firstStr = input.substring(0, 1);
		String anotherStr = input.substring(1,input.length());
		// substring()으로 0-1 인 첫번째 문자만 있는 문자열 firstStr과
		// 1,input의 길이 범위인 나머지 문자열들이 있는 문자열 anotherStr로 나눔.
		
		firstStr = firstStr.toUpperCase(); 
		// toUpperCase()로 첫번째 문자만 대문자로 바꿔줌.
		
		String str = firstStr + anotherStr; // 두 문자열을 합쳐줌.
		return str;
	}
	
	public int findChar(String input, char one) {
		/*
		 * int count = 0;
		 * 
		 * char [] arr = input.toCharArray();
		 * 
		 * for( char ch : arr) { if(ch == one) { count++; } } return count;
		 */
		return (input.length() - input.replace(String.valueOf(one), "").length());
		// 찾을 문자인 one을 String으로 Boxing해주고, 찾을 문자 one이 있는 곳만 ""로 바꿔줌,
		// 바꿔주고 난 후의 문자열의 길이는 찾는 문자의 개수가 뺄셈된 길이 이므로,
		// 원래 문자열의 길이 - 찾는 문자의 개수를 뺀 문자열의 길이 = 찾는 문자의 개수 이다.
	}
}
