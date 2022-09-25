package com.kh.chap03_wrapper.run;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * Wrapper 클래스
		 * => 기본자료형을 객체로 포장해주는 클래스들을 래퍼 클래스라고한다.
		 * 
		 * 기본 자료형      < --- >        Wrapper 클래스
		 * boolean					    Boolean
		 * char						    Character
		 * byte							Byte
		 * short						Short
		 * int 							Integer   //많이 사용
		 * long							Long
		 * float						Float
		 * double						Double	 //많이 사용
		 * 
		 */
		
		int num1 = 10;
		int num2 = 15;
		
		//System.out.println(num1.equals(num2));
		//기본자료형에는 메소드 같은 기능이 없어서, 메소드가 담길 수 없어서 에러가 난다.
		
		// 일반 자료형에서 객체 자료형의 메소드를 활용하고 싶을 때, Wrapper클래스로 변환하여 사용한다.
		// 자동형변환이 일어난다.
		// 기본자료형 -> Wrapper자료형으로 Boxing된다.
		
		Integer i1 = num1; // Wrapper자료형으로 Boxing된다(자동형변환) -> 많이 사용!!!
		Integer i2 = num2;
		
		System.out.println(i1.equals(i2)); //false -> 10이랑 15는 다르기때문
		
		
		System.out.println(i1.hashCode()); //10
		//Integer클래스에서 hashCode를 오버라이딩해놔서, i1의 리터럴이 나오게했다.
		
		
		System.out.println(i1.compareTo(i2));
		// a.compareTo(b) : 두 값을 비교해서 a가 b보다 크면 1, 작으면 -1, 같으면 0을 return
		
		
		// Wrapper자료형에서 -> 기본자료형으로 변환되었다.(unBoxing되었다.->자동형변환)
		int num3 = i1;
		int num4 = i2;
		
		
		
		// 기본자료형 <---> String
		String str1 = "10";
		String str2 = "15.3";
		
		// 1. String자료형  --->  기본자료형  :  "파싱"한다.
		//  Integer.parseInt(변환할 문자열) : int로 변환된다.
		//  Double.parseDouble(변환할 문자열) : double로 변환된다. -> static키워드들이다!!!
		
		int i = Integer.parseInt(str1); // 문자열을 정수형기본자료형으로 바꾸는 방법
		// "10" ---> 10
		// 많이 사용!!!
		
		double d = Double.parseDouble(str2); // 문자열을 실수형기본자료형으로 바꾸는 방법
		// "15.3" ---> 15.3
		
		System.out.println(i+d); // 25.3 이라는 연산결과가 출력된다.
		
		
		// 2. 기본자료형 ---> String자료형  
		//		10    --->     "10"
		//	   15.3   --->    "15.3"
		// String.valueOf(변환할 기본 자료형값) : String으로 변환된다.
		
		String strI = String.valueOf(i); // 정수형기본자료형을 문자열로 바꾸는 방법
		String strD = String.valueOf(d); // 실수형기본자료형을 문자열로 바꾸는 방법
		
		System.out.println(strI +", "+ strD); //문자열로 잘 합쳐졌다. 10, 15.3
		
	}

}
