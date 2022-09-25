package com.kh.chap02_string.controller;

public class A_StringPoolTest {
	
	// String은 불변클래스 ( 변하지 않는 클래스 )
	// 수정하는 순간, 기존의 값이 담겨있던 공간이 수정되지 않는다.
	
	
	//1. 생성자를 통해 문자열 담기.
	public void method1() {
		String str = "hello";
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1 == str2);
		System.out.println(str1);
		System.out.println(str2.toString());
		// String 클래스의 toString() 메소드의 경우, 실제 담겨있는 문자열을 반환하도록 오버라이딩 되어있다.
		
		System.out.println(str1.equals(str2));
		// String클래스의 equals() 메소드의 경우, 주소값 비교가 아닌 문자열 비교를 하도록 오버라이딩 되어있다.
		// 타고들어가서 확인가능 => ctrl + 좌클릭
		// 원래 equals의 기능은 주솟값 비교이다.
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// hashCode()메소드는 원래는 주소값을 10진수로 변경하지만, 
		// String클래스의 hashCode()메소드는 문자열기반으로 해시코드값을 만들어 반환하도록 오버라이딩 되어있다.
		
		// String클래스에서 문자열의 "진짜 주소값"을 볼 수 있는 방법
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
	
	
	public void method2() {
		String str = new String("hello"); //String 생성자를 통해 객체 생성
		
		//리터럴값(값 그자체)이 대입되는 경우, 상수풀에 올라감.
		String str1 = "hello";
		String str2 = "hello";
		//리터럴 제시 시, StringPool(상수풀) 영역에 올라감. 
		//StringPool : 동일한 문자열 존재 불가. => 같은 문자열을 넣은 경우, 두 변수는 같은 주소값을 가짐.
		
		System.out.println(str1 == str2);
		System.out.println(str == str1);
		
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
	}
	
	public void method3() {
		String str = "hello";
		System.out.println(System.identityHashCode(str)); //1404928347
		
		str = "goodbye";
		System.out.println(System.identityHashCode(str)); //1562557367
		
		str += "abc";
		System.out.println(System.identityHashCode(str)); //1101288798
		
	}
}
