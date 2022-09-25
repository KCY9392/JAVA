package com.kh.operator;

public class F_Compound {
	/*
	 * 복합대입연산자 (=) : 산술연산자와 대입연산자를 함께 사용하는 연산자
	 * a = a + 1;   a += 1;   a++;
	 * 
	 * a += 1; 을 더 권장.
	 * -> 연산처리속도가 빨라지므로 복합대입연산자를 사용하는 것을 권장함.
	 * 
	 * 산술연산자 + - / * %
	 * 
	 *  a = a + 3 => a += 3
	 *  a = a - 3 => a -= 3
	 *  a = a * 3 => a *= 3
	 *  a = a / 3 => a /= 3
	 *  a = a % 3 => a %= 3
	 * 
	 */
	
	public void method1() {
		int num = 12;
		
		System.out.println("현재 num의 값은 ? "+ num);//12
		
		num += 3;
		System.out.println("1. (+=) -> 3 증가시킨 num의 값은 ? " + num);//15
		
		num -= 3;
		System.out.println("2. (-=) -> 3 감소시킨 num의 값은 ? " + num);//12
		
		num *= 6;
		System.out.println("3. (*=) -> 6 배 증가시킨 num의 값은 ? "+num);//72
		
		num /= 2;
		System.out.println("4. (/=) -> 2로 나눈 num의 값은 ? "+num);//36
		
		num %= 4;
		System.out.println("5. (%=) -> 4로 나눈 num의 나머지 값은 ? "+num);//0
		
		
		//+= 는 문자열에서도 사용이 가능하다. (문자열은 +=만 가능하다.)
		String str = "Hello";
		str += " World !";
		
		System.out.println(str);
		
	}
	
	
}
