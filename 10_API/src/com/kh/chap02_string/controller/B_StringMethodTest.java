package com.kh.chap02_string.controller;

public class B_StringMethodTest {

	
	//문자열 관련 유용한 메소드
	public void method1() {
		
		String str1 = "Hello world";
		//			   012345678910
		
		// 1. 문자열.charAt(int index) : char
		// 	  => 문자열에서 전달받은 index위치의 문자 하나만 뽑아서 return
		char ch = str1.charAt(3);
		System.out.println("ch : "+ch);		// l
		
		
		
		// 2. 문자열.concat(String str) : String
		//	  => 문자열과 전달된 또 다른 문자열을 "하나로 합쳐서" return
		String str2 = str1.concat("!!");
		System.out.println("str2 : "+str2);	// Hello world!!
		
		
		
		// 3. 문자열.length();
		System.out.println("str1의 길이는 ? "+str1.length()); // 11
		
		
		
		//많이 사용!!!
		// 4. 문자열.substring(int beginIndex) : String
		//	  => 문자열의 beginIndex위치부터 끝까지 문자열을 추출해서 return
		//	  문자열.substring(int beginIndex, int endIndex) : String
		//	  => 문자열의 beginIndex위치부터 ( endIndex - 1 )위치까지 추출해서 return
		System.out.println(str1.substring(6));		//world
		System.out.println(str1.substring(0, 6));	//hello빈칸한칸 
		// 6이면 w인데, endIndex-1까지니까 빈칸까지만 출력
		
		
		
		//많이 사용!!!
		// 5. 문자열.replace(char old, char new) : String
		//	  => 문자열의 old문자를 new문자로 변환한 문자열을 return
		String str3 = str1.replace('l', 'c');
		System.out.println(str3);
		
		
		
		//많이 사용!!!
		// 6. 문자열.trim() : String
		//	  => 문자열의 앞 뒤 공백을 제거한 문자열 return
		String str4 = "     JA   VA        ";
		System.out.println("trim() ? "+str4.trim());
		//System.out.println("     JA   VA        ".trim()); 도 가능하다.
		// 빈칸을 포함한 상태로 문자열 입력할때, 내부적으로 공백 제외한 문자열만 추출할때 유용!
		
		
		//간간히 쓰임! - 어떤 역할, 기능 시험 나올 수 있음.
		// 7. 문자열.toUpperCase() : String
		//	  => 문자열을 모두 다 대문자로 변경 후 return
		//	  문자열.toLowerCase() : String
		//	  => 문자열을 모두 다 소문자로 변경 후 return
		System.out.println("toUpperCase() ? "+str1.toUpperCase());
		System.out.println("toLowerCase() ? "+str1.toLowerCase());
		
		
		
		
		//많이 안쓰임.
		// 8. 문자열.toChararray() : char []
		char [] arr = str1.toCharArray();
		//문자열을 한 문자씩 배열의 인덱스에 넣어줘서 배열을 초기화하는 메소드
		System.out.println(arr[0]);
		
		
		
		//많이 사용!!!
		//char [] => String
		char [] arr2 = {'a','p','p','l','e'};
		// 9. valueOf(char [] data) : String
		//	  => 전달된 char []에 담긴 문자들을 엮어서 "하나의 문자열로 합쳐서" return
		System.out.println(String.valueOf(arr2));
		
	}
	
}
