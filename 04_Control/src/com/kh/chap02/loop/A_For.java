package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	
	/* <반복문>
	 * 프로그램 흐름을 제어하는 제어문 중 하나.
	 * 어떤 실행코드를 반복적으로 수행시켜줌.
	 * 
	 * 크게 두 종류로 나뉨(FOR문, While문(do-while문))
	 * 
	 * [표현법]
	 * for(초기식 ; 조건식 ; 증감식){ //세미콜론(;)으로 각 식 구분. 무조건 세미콜론 있어야함.
	 *  반복적으로 실행시킬 코드
	 * }
	 * 
	 * - 초기식 : 반복문이 시작될 때 "초기에 단 한번만 실행"되는 구문
	 * 			(반복문에서 사용할 변수를 선언 및 초기화 구문)
	 * 			예 ) int i = 0;
	 * - 조건식 : "반복문이 수행될 조건"을 작성하는 구문
	 * 			조건식이 true일 경우 반복문 실행
	 * 			조건식이 false가 되는 순간 반복문 멈추고 빠져나옴
	 * 			(보통 초기식에 제시된 변수를 가지고 조건식을 작성)
	 * - 증감식 : 반복문을 제어하는 변수값을 증감시키는 구문
	 * 			(보통 초기식에 제시된 변수를 가지고 증감식을 작성)
	 * 			예) i++, i+=1
	 * 
	 * for문 안에 초기식, 조건식, 증감식 각각 생략 가능하긴 함. 단 ! 세미콜론(;)은 반드시 작성해야한다.
	 * for( ; ; ){
	 * 
	 * }
	 * 
	 */
	
	//"안녕하세요"를 5번 반복해서 출력.
	public void method1() {
		//"안녕하세요"를 5번 반복해서 출력.
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
		
		for(int i=0 ; i < 5 ; i++) {//0부터 5보다 작을때까지 반복실행 5
			System.out.println("안녕하세요");
		}
		for(int i =1; i <= 5 ; i++ ) {//1부터 5보다 작거나 같을때까지 반복실행 5
			System.out.println("안녕하세요");
		}
		for(int i = 16; i<21 ; i++) {//16부터 21보다 작을때까지 반복실행 5
			System.out.println("안녕하세요"); 
		}
		for(int i = 1 ; i < 10; i+=2) {//1부터 2씩 증가하며 10보다 작을때까지 반복실행 5
			System.out.println("안녕하세요");
		}
		
//		for( ; ;) {
//			System.out.println("안녕하세요");
//		}
	}
	
	
	
	// 1~5까지 출력
	// i값이 1에서 6보다 작을때까지 1씩 증가할 동안 반복수행
	// 1 2 3 4 5
	public void method2() {
		
		for(int i=1; i<6; i++) {
			System.out.print(i+ " ");//1 2 3 4 5
		}
		
		/* 1
		 * 2
		 * 3
		 * 4
		 * 5
		 */
		
		System.out.println();
		
		// i의 값은 1이고 5보다 작거나 같을때까지 i의 값을 1씩 증가시키면서 반복수행하라.
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
	}
	
	
	
	// 5 4 3 2 1
	public void method3() {
		for(int i=5; i>0;i--) {
			System.out.print(" "+i);// 5 4 3 2 1
		}
	}
	
	
	
	//i값이 1에서부터 10까지 홀수만 출력
	//1 3 5 7 9
	public void method4() {
		for(int i=1; i<10; i+=2) { //5회 수행
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int i=1; i<10; i++) { //9번 수행 + 9번 조건문 검사
			if(i%2==1) {
				System.out.print(i+" ");
			}
		}
	}
	
	
	
	// 1 2 3 4 5 6 7 8 9 10
	public void method5() {
		for(int i=0; i<=9; i++) {
			System.out.print(i+1 + " ");
		}
	}
	
	
	
	
	//산술연산 + 반복문 응용.
	//1~10까지의 총 합계.
	
	/*
	 * int sum += 0;
	 * 
	 *  sum += 1;
	 *  sum += 2;
	 *  sum += 3;
	 *  .....
	 *  sum += 10;
	 */
	public void method6() {
		int sum=0;
		for(int i=0; i<=10; i++) {
			sum+=i;
			System.out.println("1에서부터 10까지의 총 합계 : "+ sum);
		}
		System.out.println("1에서부터 10까지의 최종 합계 : "+ sum);
	}
	
	
	//산술연산 + 스캐너 + 반복문
	//1에서부터 사용자가 입력한 수까지 모두 더해서 출력
	public void method7() {
		Scanner sc = new Scanner(System.in);
		/*
		 * int num = sc.nextInt();
		 * 
		 * int sum = 0;
		 * 
		 * sum += 1;
		 * ...
		 * sum += num;
		 */
		
		System.out.print("양수 입력 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum += i;
			System.out.printf("1에서부터 %d까지의 총 합계 :  %d\n",i,sum);
		}
		System.out.println();
		System.out.printf("1에서부터 %d까지의 총 합계 : %d\n",num,sum);
		sc.close();
	}
	
	
	
	//1에서부터 특정 ramdom값까지 총 합계
	public void method8() {
		//1에서부터 random(1~10)값까지 총 합계
		// Math 클래스안에 정의되어있는 랜덤값 
		// 0.0 <= random < 1.0 * 10 -> 10.0
		// 0.0 <= random < 10.0
		// 0.0 <= random < 9.999999999
		// int 강제 형변환시
		// 0 <= random <= 9
		// 1 <= random < 10
		Scanner sc = new Scanner(System.in);
		
		//Math ma = new Math(); 이렇게 사용하지 않음.
		
		int random = (int)(Math.random() * 10 + 1);
		//[표현법]
		// Math.random() * 출력하고자 하는 갯수 + 시작수
		// 시작수 <= random <= (출력하고자하는 갯수 + 시작수)
		System.out.println("1~10 사이의 랜덤값 : "+random);
		
		int sum = 0;
		
		for(int i=1; i<= random; i++) {
			sum += i;
		}
		
		System.out.printf("1부터 %d까지 총 합은 : %d",random,sum);
		sc.close();
	}
	
	
	
	//문자열 charAt(i)로 for문이용해서 출력
	public void method9() {
		String str = "apple";
		
		/*
		 * a -> str.charAt(0)
		 * p -> str.charAt(1) 
		 * p -> str.charAt(2)
		 * l -> str.charAt(3)
		 * e -> str.charAt(4)
		 */
		
		//int i,j,k 로 초기식 변수로 많이 사용
		for(int i=0; i<5; i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	
	
	//사용자가 입력받아 for문이용해서 문자열 출력
	public void method10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		//김채영 채영 alsrudals rudals
		System.out.println("문자열의 길이는 ? "+str.length());
		//김채영 은 문자열의 길이 : 3
		//따라서 조건문에는 0부터 2까지 출력해야함. ( int i=0; i<3; i++ )
		//마지막 문자열의 문자를 출력하려면 문자열 길이의 -1하면 나온다는 것을 알게됨.
		
		int strLength = str.length();
		
		//길이값을 변수에 담아서 사용하는 게 효율이 더 좋다.
		for(int i=0; i<strLength; i++) {
			System.out.println(str.charAt(i));
		}
		
		//동일한 반복문
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		sc.close();
	}
	
	
	
	//구구단 2단 출력
	public void method11() {
		/*
		 * 2 X 1 = 2
		 * 2 X 2 = 4
		 * 2 X 3 = 6
		 * 2 X 4 = 8
		 * 2 X 5 = 10
		 * 2 X 6 = 12
		 * 2 X 7 = 14
		 * 2 X 8 = 16
		 * 2 X 9 = 18
		 */
		
		for(int i=1;i<=9;i++) {
			System.out.printf("%d X %d = %d \n", 2, i, (2 * i));
		}
	}
	
	
	
	//사용자가 입력한 단 출력
	//구구단 + Scanner
	public void method12() {
		//사용자에게 단수(2~9)를 입력받아 아래와 같이 구구단 표현.
		//단 2~9에서 벗어나는 수를 입력한 경우, 잘못입력했습니다 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단의 단을 입력(2~9) : ");
		int num = sc.nextInt();
		
		if(num >= 2 && num <= 9) {
			System.out.printf("<  %d단  >\n",num);
			
			for(int i=1;i<=9;i++) {
				System.out.printf("%d X %d = %d \n", num, i, (num*i));
			}
		}else {
			System.out.println("잘못입력했습니다.(2~9 사이의 정수를 입력해주세요.)\n");
			method12();
			}
		sc.close();
		}
	
	
	
	//구구단 출력
	//단수를 random 값으로 받아서 출력.
	public void method13() {
		
		int random = (int)(Math.random()* 8 + 2); // * 랜덤값받고자하는 개수(8) + 시작수(2) 
		//Math.random() -> 0.0 <= random <= 0.999999
		
		System.out.println("2~9 사이의 랜덤값 : "+random);
		
		System.out.println();
		
		for(int i=1;i<=9;i++) {
			System.out.printf("%d X %d = %d \n", random, i, (random*i));
		}
	}
	
	
	
	
	//중첩반복문
	//1 2 3 4 5
	//연이어서 5번 출력.
	/*
	* 1 2 3 4 5
	* 1 2 3 4 5
	* 1 2 3 4 5
	* 1 2 3 4 5
	* 1 2 3 4 5
	*/
	public void method14() {
		
		for(int j=0; j<5 ; j++) {
			for(int i=1; i<=5; i++) {
				System.out.print(i+ " ");
			}
		System.out.println();
		}
	}
	
	
	
	
	
	//별찍기.
	//*****
	//*****
	//*****
	//*****
	//*****
	public void method15() {
		for(int i=0; i<=4; i++) {//외부반복문
			for(int j=0; j<=4; j++) {//내부반복문
				System.out.printf("*");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	//별찍기.
	//1****	-> 1행 1열에는 숫자가 있고, 나머지는 별
	//*2*** -> 2행 2열에는 숫자가 있고, 나머지는 별
	//**3**	-> 3행 3열에는 숫자가 있고, 나머지는 별
	//***4*	-> 4행 4열에는 숫자가 있고, 나머지는 별
	//****5	-> 5행 5열에는 숫자가 있고, 나머지느 별
	public void method16() {
		for(int i=1;i<=5;i++) {
			for(int j=1; j<=5; j++) {
				if(i == j) {
					System.out.print(i);
				}else {
				System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	//중첩반복문
	//12345
	//23456
	//34567
	//45678
	//56789
	public void method17() {
		//행 : 가로(외부 for문)
		//열 : 세로(내부 for문)
		
		int num=1;
		for(int i=0; i<5; i++) {
			for(int j=num; j<=num+4; j++) {
				// for(int j=1+i; j<=5+i; j++) 로 하거나
				System.out.print(j);
				//System.out.print(j+i);아예 이걸로 하거나
			}
			System.out.println();
			num+=1;
		}
	}
	
	
}
