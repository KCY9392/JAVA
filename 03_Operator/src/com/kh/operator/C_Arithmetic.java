package com.kh.operator;

public class C_Arithmetic {
	//산술연산자 (이항연산자 -> 값을 2개 가지고 연산
	//  + , - , * , / , %
	
	public void method1() {
		int num1 = 10;
		int num2 = 3;
		
		//System.out.println("num1 + num2 ? " +  num1+num2);
		//num1 + num2 ? 103
		
		// 덧셈
		System.out.println("num1 + num2 ? " +  (num1+num2));//13
		//괄호는 최우선연산자로 제일 먼저 연산됨.
		//num1 + num2 ? 13
		
		// 뺄셈
		System.out.println("num1 - num2 ? " + (num1-num2));//7
		
		// 곱셈
		System.out.println("num1 X num2 ? " + (num1*num2));//30
		//곱하기가 더하기보다 우선순위가 높아서 ()안해도되지만, 가독성을 위해 추가 권장.
		//()추가안해도 에러X.
		
		// 나눗셈
		System.out.println("num1 / num2 ? " + (num1/num2));//3
		
		// 나머지셈
		System.out.println("num1 % num2 ? " + (num1%num2));//1
	
		
		
		//실수로 산술연산연습
		double a = 35;//자동형변환으로 35.0값을 저장한다.
		double b = 10;//10.0
		
		System.out.println(a/b);//3.5
		System.out.println(a%b);//0
		
	}
	
	public void quiz() {
		int a = 5;
		int b = 10;
		
		int c = (++a) + b; // a = 6, b = 10, c = 16
		int d = c / a; // d = 2
		int e = c % a; // e = 4
		int f = e++; // f = 4 e = 5
		int g = (--b) + (d--); // b=9, d=2(1), g=11
		int h = 2; // h = 2
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
		//a=6(7), b=9, c=15, d=1, e=6, f=4, g=10, h=2, i=13 
		//i= 6 + 9 / (15/4) * (11-1) % (6+2) = 
		// 6 + 9 / 3 * 10 % 8
		// 6 + 3 * 10 % 8
		// 6 + 30 % 8
		// 6 + 6
		// 12
		//a=6(7), b=9, c=15, d=1, e=6, f=4, g=10, h=2, i=12
		//자격증 시험에 꼭 나옴.
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		System.out.println("e : " + e);
		System.out.println("f : " + f);
		System.out.println("g : " + g);
		System.out.println("h : " + h);
		System.out.println("i : " + i);
	}
}















