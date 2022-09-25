package com.kh.operator;

public class B_InDecrease {
	/*
	 * 증감연산자(단항연산자)  ++  --
	 * ++ : 변수에 담긴 값을 1증가 시키는 연산자.
	 * ++변수값 , 변수값++
	 * 위치에 따라 
	 * 앞에 쓰일때 ++변수값(전위연산자)
	 * 뒤에 쓰일때 변수값++(후위연산자)
	 * 
	 * -- : 변수에 담긴 값을 1감소 시키는 연산자.
	 * --변수값(전위연산자) , 변수값--(후위연산자)
	 * 
	 * 전위연산자 -> (선증가 or 선감소) 후처리
	 * 후위연산자 -> 선처리 (후감소 or 후증가)
	 * 
	 */
	
	public void method1() {
		//전위연산테스트
		int num = 10;
		System.out.println("전위연산전 num의 값은 ? "+num);//10
		System.out.println("연산 1회후 num의 값은 ? "+ ++num);//11
		System.out.println("연산 2회후 num의 값은 ? "+ ++num);//12
		System.out.println("연산 3회후 num의 값은 ? "+ ++num);//13
		
		System.out.println("최종 num의 값은 ? "+ num);//13
		
		System.out.println("============================");
		
		//후위연산테스트
		int num2 = 10;
		System.out.println("후위연산전 num2의 값은 ? "+num2);//10
		System.out.println("연산 1회 후 num2의 값은 ? "+ num2++);//10(11)
		System.out.println("연산 2회 후 num2의 값은 ? "+ num2++);//11(12)
		System.out.println("연산 3회 후 num2의 값은 ? "+ num2++);//12(13)
		
		System.out.println("최종 num2의 값은 ? "+ num2);//13
		
	}
	
	public void method2() {
		//전위연산
		int a = 10;
		int b = ++a; //a값을 먼저 증가 시키고나서, b라는 변수에 대입한다.
		//++a => int a = a+1;
		System.out.printf("a : %d, b : %d \n",a,b);//a:11, b:11
		
		//후위연산
		int c = 10;
		int d = c++;
		System.out.printf("c : %d , d : %d \n",c,d);//a:11, b:10
		
		System.out.println("==============================");
		
		int num = 20;
		System.out.println("현재 num ? "+ num);//20
		System.out.println("++num " + ++num);//21
		System.out.println("num++ ? " + num++);//21(22)
		System.out.println("--num ? "+ --num);//21
		System.out.println("num-- ?" + num--);//21(20)
		
		System.out.println("최종 num ? " + num);//20
	}
	
	public void method3() {
		int num1 = 20;
		int result1 = num1++ * 3;
		//20 X 3의 결과값이 result1에 대입되고, 그 후에 num1 = num1+1;이 된다.
		System.out.printf("num1 = %d , result1 = %d \n",num1,result1);
		
		int num2 = 20;
		int result2 = ++num2 * 3;
		System.out.printf("num2 = %d , result2 = %d \n",num2,result2);
	}
	
	public void method4() {
		int a = 10;
		int b = 20;
		int c = 30;
		
		//선출력 금지!!
		System.out.println(a++); // a = 10(11)
		System.out.println((++a) + (b++)); // 12+20(21) = 32, a=12, b=20(21)
		System.out.println((a++) + (--b) + (--c)); // 12(13) + 20 + 29 = 61
		System.out.printf("a : %d , b : %d , c : %d", a, b, c);
		//a : 13 b : 20 c : 29 
	}
}


















