package com.kh.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	
	//실습 1.
	//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
	//단, 입력한 수는 1보다 크거나 같아야 합니다. 
	//만일, 1 미만의 숫자가 입력됐다면
	//“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요
	
	/* ex.
		1이상의 숫자를 입력하세요 : 4 		1이상의 숫자를 입력하세요 : 0
		1 2 3 4 					1 이상의 숫자를 입력해주세요.
									1이상의 숫자를 입력하세요 : 8
									1 2 3 4 5 6 7 8
	 */
	public void practice1() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num >= 1) {

				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
		/*
		 while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
		 if(num < 1){
		 	System.out.println("1 이상의 숫자를 입력해주세요.");
		 	continue;
		 	}
		 	
		 	for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
			}
			break;
		}
		 */
		sc.close();
	}
	
	
	
	
	//실습 2.
	//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
	//단, 입력한 수는 1보다 크거나 같아야 합니다. 
	//만일 , 1 미만의 숫자가 입력됐다면
	//“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
	
	/*ex.
		1이상의 숫자를 입력하세요 : 4 		1이상의 숫자를 입력하세요 : 0
		4 3 2 1 					1 이상의 숫자를 입력해주세요.
									1이상의 숫자를 입력하세요 : 8
									8 7 6 5 4 3 2 1
	 */
	public void practice2() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num >= 1) {

				for (int i = num; i > 0 ; i--) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
		
		/*
		 while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num < 1){
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
			}
			for (int i = num; i > 0 ; i--) {
				System.out.print(i + " ");
			}
			break;
		}
			
		 */
		sc.close();
	}
	
	
	
	
	//실습 3.
	//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
	
	/* ex.
		정수를 하나 입력하세요 : 8
		1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
	 */
	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 하나 입력하세요 : ");

		int num = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			System.out.print(i);
			sum += i;

			if (i < num) {
				System.out.print(" + ");
			}
		}
		System.out.print(" = " + sum);
		
		/*	// +를 i와 같이 출력
		 	int sum = 0;
			for (int i = 1; i <= num; i++) {
				if(i != num ){
					System.out.print(i);
				}else{
					System.out.print(i+ " + ");
				}
				sum += i;
				}
					
				System.out.print(" = " + sum);
			
		 */
		
		/*	// op에 + 와 =를 문자열로 저장후 사용하는 방법
		 String op = "";
		 for (int i = 1; i <= num; i++) {
				if(i != num ){
					op = " + ";
				}else{
					op = " = ";
					}
					System.out.print(i+op);
					sum += i;
			}
			System.out.print(sum);
		 */
		sc.close();
	}

	
	
	
	//실습 4.
	//사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요. 
	//만일, 1 미만의 숫자가 입력됐다면 
	//“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요
	
	/*ex.
		첫 번째 숫자 : 8 		첫 번째 숫자 : 4 		첫 번째 숫자 : 9
		두 번째 숫자 : 4 		두 번째 숫자 : 8 		두 번째 숫자 : 0
		4 5 6 7 8 			4 5 6 7 8 			1 이상의 숫자를 입력해주세요.
												첫 번째 숫자 : 6
												두 번째 숫자 : 2
												2 3 4 5 6
	 */
	public void practice4() {
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();

			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();

			if (num1 < 1 || num2 < 1) {

				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;

			} 
			if (num1 < num2) {

				for (int i = num1; i <= num2; i++) {

					System.out.print(i + " ");

				}
				break;
				
			} else { // num1 > num2
				
				for (int i = num2; i <= num1; i++) {
					
					System.out.print(i + " ");
					
				}
				break;
			}
		}
		sc.close();
	}
	
	
	
	
	
	//실습 5.
	//사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
	//단 , 9를 초과하는 숫자가 입력됐다면
	//“9 이하의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요
	/*	숫자 : 4 					숫자 : 10
		===== 4단 ===== 			9 이하의 숫자만 입력해주세요.
		===== 5단 ===== 			숫자 : 8
		===== 6단 ===== 			===== 8단 =====
		===== 7단 ===== 			===== 9단 =====
		===== 8단 =====
		===== 9단 =====
		(해당 단의 내용들은 길이 상 생략)
	 * 
	 */
	public void practice5() {
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("숫자 : ");
			int num = sc.nextInt();

			if (num > 9) {
				System.out.println("9 이하의 숫자를 입력해주세요");
			} else {
				for (int i = num; i <= 9; i++) {
					System.out.println();
					System.out.printf("=== %d단 ===\n", i);

					for (int j = 1; j <= 9; j++) {
						System.out.printf("%d X %d = %d \n", i, j, (i * j));
					}
				}
				break;
			}
		}
		sc.close();
	}

	
	
	
	//실습 6.
	//사용자로부터 시작 숫자와 공차를 입력 받아
	//일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
	//단, 출력되는 숫자는 총 10개입니다.
	
	/* ‘공차’는 숫자들 사이에서 일정한 숫자의 차가 존재하는 것을 말한다.
		ex) 2, 7, 12, 17, 22 …
			5 5 5 5 => 여기서 공차는 5
		ex.
		시작 숫자 : 4
		공차 : 3
		4 7 10 13 16 19 22 25 28 31
	*/
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("공차 : ");
		int bin = sc.nextInt();
		
		if(bin > 0) {
		for(int i=num1; i<= num1 + (bin*9); i+=bin ) {
			System.out.print(i + " ");
			}
		}
		else { //bin < 0
			for(int i=num1; i>= num1 + (bin*9); i+=bin ) {
				System.out.print(i + " ");
				}
		}
		/*
		 for(int i=0; i<=10; i++){
		     System.out.print(num + " ");
		     num += bin;
		     }
		 */
		sc.close();
	}
		
	
	
	
	
	//실습 7.
	/*정수 두 개와 연산자를 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요.
		단, 해당 프로그램은 연산자 입력에 “exit”라는 값이 들어올 때까지 무한 반복하며
		exit가 들어오면 “프로그램을 종료합니다.”를 출력하고 종료합니다.
		또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
		“0으로 나눌 수 없습니다. 다시 입력해주세요.”를 출력하며,
		없는 연산자가 들어올 시 “없는 연산자입니다. 다시 입력해주세요.”라고 출력하고
		두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요
	 */
	/*	메소드 명 : public void practice7(){}
		연산자(+, -, *, /, %) : +
		정수1 : 10
		정수2 : 4
		10 + 4 = 14
		
		연산자(+, -, *, /, %) : / 		연산자(+, -, *, /, %) : /
		정수1 : 10 						정수1 : 10
		정수2 : 4 						정수2 : 0
		10 / 4 = 2 						0으로 나눌 수 없습니다. 다시 입력해주세요.
		
		연산자(+, -, *, /, %) : ^ 		연산자(+, -, *, /, %) : exit
		정수1 : 10 						프로그램을 종료합니다.
		정수2 : 4
		없는 연산자입니다. 다시 입력해주세요
	 */
	public void practice7() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			String str = sc.nextLine();
			
			if(str.equals("exit") || str.equals("EXIT")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			System.out.print("정수1 : ");
			int num1 = sc.nextInt();

			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			
			if(str.equals("/") && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.\n\n");
				sc.nextLine();
				continue;
			}
			
			switch (str) {
			case "+" :
				System.out.printf("%d %s %d = %d\n\n",num1,str,num2, (num1+num2));
				break;
				
			case "-" :
				System.out.printf("%d %s %d = %d\n\n",num1,str,num2, (num1-num2));
				break;
				
			case "*" :
				System.out.printf("%d %s %d = %d\n\n",num1,str,num2, (num1*num2));
				break;
				
			case "/" :
//				if(num2 == 0) {
//					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.\n\n");
//					sc.nextLine();
//					continue;
//				}
				System.out.printf("%d %s %d = %d\n\n",num1,str,num2, (num1/num2));
				break;
				
			case "%" :
				System.out.printf("%d %s %d = %d\n\n",num1,str,num2, (num1%num2));
				break;
				
			default :
				System.out.println("없는 연산자입니다. 다시 입력해주세요.\n\n");
				sc.nextLine();
				continue;
			}
			
			sc.nextLine();
		}
		sc.close();
	}
	
	
	
	
	
	//실습 8.
	/* ex.
		정수 입력 : 4
		*
		**
		***
		****
	 */
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num ; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
	
	
	
	
	
	
	//실습 9.
	/*ex.
		정수 입력 : 4
		****
		***
		**
		* 
	 */
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=num;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
	
	
	
	
	
	//실습 10.
	/*ex.
		정수 입력 : 4
		   *
		  **
		 ***
		****
	 */
	public void practice10() {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		
		for(int i=1; i<=num; i++) { //i가 1부터 4까지 ++
			for(int j=num; j>i; j--) { //int j=num-i; j>=0 ; j++
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
	
	
	
	
	
	//실습 11.
	/*ex.
		정수 입력 : 4
		****
		 ***
		  **
		   *
	 */
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<i; j++) {//0 1 2 3
				System.out.print(" ");
			}
			for(int k=num; k>=i; k--) {//4 3 2 1
				System.out.print("*");
			}
//			for(int j=0; j<num-i; j++) {//3 2 1 0
//				System.out.print("*");
//			}
			System.out.println();
		}
		sc.close();
	}
	
	
	
	
	
	
	//실습 12.
	/*ex.
		정수 입력 : 4
		   *
		  ***
		 *****
		*******
	 */
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<= num; i++) {
			for(int j=num-i; j >= 1;j--) {//3 2 1 
				System.out.print(" ");
			}
			/*
			 * for(int j=0; j< num-i; j++) {
			 * 		System.out.print(" ");
			 * }
			 */
			for(int k=1; k <=2*(i-1)+1 ; k++) {//1 3 5 7
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
	
	
	
	
	
	//실습 13.
	/*사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
		단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
	 	
	 	* ‘소수’는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다.
		ex) 2, 3, 5, 7, 11 …
		
		ex. 
		숫자 : 5 		숫자 : 9 			숫자 : 0
		소수입니다. 	소수가 아닙니다. 	잘못 입력하셨습니다
	 */
	public void practice13() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			//1과 자기자신만 나눠지는 경우(소수) count  = 1
			//1과 자기자신말고도 나눠지는 경우   count != 1
			int count = 0;
			
			if (num < 2) {
				System.out.println("잘못 입력했습니다.");
				continue;
			}
			
				for (int i = 2; i <= num; i++) { //2부터 자기자신까지 다 나눠보기	
					
					if ((num % i) == 0) { //나눠질경우 count++
						
						count ++;
						
						} 
					}
				
				//소수일 경우, 자기자신나눌때만 count++ 1번되어서 	->	count == 1
				//소수가 아닐경우, count++ 이 여러번되어서,		->	count > 1
				if(count == 1) { //자기자신만 1번 나눠졌을 경우(소수가 아닐경우),
					
				System.out.println("소수입니다.");
				
				}else { 
					
					System.out.println("소수가 아닙니다.");
				}
				break;
		}
		sc.close();
	}
	
	public void practice13_2() {//강사님 버전
		Scanner sc = new Scanner(System.in);

			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			if(num < 2) {
				System.out.println("잘못 입력하셨습니다.");
				sc.close();
				return;
			}
			// 37
			// 1O 2X 3X 4X ... X 37O
			// 따라서 1과 자기자신인 37로만 나눠지므로, 37은 소수이다.
			
			for(int i=2; i<=num; i++) {
				if(num%i == 0) {
					System.out.println("소수가 아닙니다.");
					sc.close();
					return;
				}
			}
			System.out.println("소수입니다.");
			sc.close();
			
			// 위의 코드는 효율이 좋지않다.
			
			// 효율 좋은 방법 1.
			// num까지 반복문 돌리지않아도되고,
			// num의 제곱근까지만 반복문 돌려도된다.
			// num에 루트를 씌우는 방법은
			System.out.println(Math.sqrt(num));
			
			// 효율 좋은 방법 2.
			// 소수를 구하는 함수 사용할 수 있다.
			
	}
	// 소수 알고리즘 찾아보기
	
	
	
	//실습 14.
	/*2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
		단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
	 
	  	ex.
		숫자 : 11
		2 3 5 7 11 
		2부터 11까지 소수의 개수는 5개입니다.
	 */
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num < 2) { //2미만 입력시,
			System.out.println("잘못 입력했습니다.");
			continue;
		}
		
		int count = 0;		//나눠진 경우의 수
		int primeNum = 0;	//소수 개수
		
		for(int i = 2; i <= num; i++) {
			for(int j = 2; j <= num; j++) {
				if(i % j == 0) {
					count ++; 
					}
				}
			if(count == 1) {	//소수 일 경우,
				System.out.print(i + " ");
				primeNum++;	//소수 개수 ++
				}
			count = 0;	//나눠진 경우의 수 초기화!
		}
		System.out.println();
		System.out.printf("2부터 %d까지 소수의 개수는 %d개 입니다.",num,primeNum);
		break;
		}
		sc.close();
	}
	
	public void practice14_2() {//강사님 버전 2가지 방법
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int num = sc.nextInt();
		int primeNum = 0;
		
		if(num < 2) {
			System.out.println("잘못 입력하셨습니다.");
			practice13_2();
		}
		
//		for(int i=2; i<=num; i++) {
//			//2~num
//			
//			boolean isPrime = true;
//			
//			for(int j=2; j<i; j++) {
//				if(i%j == 0) {
//					isPrime = false;
//					break;	//break로 현재 반복문(for문) 빠져나옴!
//				}
//		  }
//			if(isPrime) {
//				System.out.print(i+" ");
//				primeNum++;
//			}
//		}
//		System.out.printf("\n2부터 %d까지 소수의 개수는 %d개 입니다.",num,primeNum);
//		sc.close();
		
		
		//2번째 방법
		loop1:	//권장하진않음.
		for(int i=2; i<= num; i++) {
			//loop2:
			for(int j=2; j<i; j++) {
				if(i%j == 0) {
					continue /*break*/ loop1; //명명한 라벨로 돌아간다.
				}
			}
		System.out.print(i+ " ");
		primeNum++;
		}
		System.out.printf("\n2부터 %d까지 소수의 개수는 %d개 입니다.",num,primeNum);
		sc.close();
	}
	
	
	
	
	//실습 15.
	/*1부터 사용자에게 입력 받은 수까지 중에서
		1) 2와 3의 배수를 모두 출력하고
		2) 2와 3의 공배수의 개수를 출력하세요.
		* ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로, 
		* 어떤 수를 해당 수들로 나눴을 때, 모두 나머지가 0이 나오는 수
		
		ex.
		자연수 하나를 입력하세요 : 15
		2 3 4 6 8 9 10 12 14 15 
		count : 2
	 */
	public void practice15() {
		Scanner sc = new Scanner(System.in);

		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();

		int count = 0; // 2와 3의 공배수 개수

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
				if (i % 2 == 0 && i % 3 == 0) {
					count++;
				}
			}
		}
		System.out.printf("\ncount : %d", count);
		sc.close();
	}
	
	
	
	
	//실습 16.
	/*ex.
		정수 입력 : 3
		*
		**
		***
		**
		*
	 */
	public void practice16() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<= num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=num-1;i++) {
			for(int j=num-i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
	
	

	
	
	//실습 17.
	/*ex.
		정수 입력 : 5
		*****
		*   *
		*   *
		*   *
		*****
	 */
	public void practice17() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			
			//제일 윗줄과 아랫줄이 아니면, 가장자리에 *찍고, 안에 (num-2)만큼 공백찍기
			if (i != 1 && i != num) {

				System.out.print("*");

				for (int j = 1; j <= num - 2; j++) {
					System.out.print(" ");
				}

				System.out.print("*");

			} else {	// 제일 윗줄과 아랫줄일 경우, (i=1 이거나 i=num 일 경우)
				for(int j=1; j<= num; j++) {
				System.out.print("*");	// * 을 num 만큼 찍기
				}
			}
			System.out.println();
		}
		sc.close();
	}
	
	

	
	
	//실습 18.
	/*ex.
		정수 입력 : 4
		*
	   ***
	  *****
	 *******
	  *****
	   ***
		*
	 */
	public void practice18() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=0;i<=num-1;i++) { // 1 2 3 4
			for(int k=num-1; k>=i+1; k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i+1; j++) { // 1 3 5 7
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=num-1; i++) {// 2 1 0
			for(int k=1; k<=i; k++) {//1 2 3
				System.out.print(" ");
			}
			for(int j=1; j <=(3-i)*2-1 ; j++) {//5 3 1
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
	
	
	
	
	
	//실습 19.
	/*ex.
		정수 입력 : 4
		   *     num
		  * *   35  공백num-2,   num-1 공간(num-3) num+1
		 *   *  26  공백num-3,   num-2 공간(num-1) num+2 
		*     * 17  공백num-num, num-3 공간(num+1) num+3
		 *   *  26  
		  * *   35
           *     num
	 */
	public void practice19() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) { //1,2,3,.. num 줄
			
			if (i == 1) {	// 맨 윗줄
				
				for (int j = 1; j <= num-1; j++) {
					System.out.print(" ");
				}
				System.out.print("*");  // 공백 num개 + * 출력
			}
			
			else {
				
				for (int j = num - i ; j > 0; j--) {	//2,3,.. num줄
					System.out.print(" ");				//앞에 공백 num-i개 출력
				}

				System.out.print("*");	// * 첫번째

				for (int k = 1; k <= (2 * (i-2)) + 1; k++) {// 홀수 1 3 5 순 공백 출력
					System.out.print(" ");
				}

				System.out.print("*");	// * 두번째
			}
			System.out.println();
		}
		
		for(int i = num-1; i >= 1; i--) { //num+1, num+2, .. num*2-1줄
			
			if(i == 1) {	//맨마지막 줄 -> (num*2-1)줄
				
				for(int j = 1; j <= num-1; j++) {	
					System.out.print(" ");
				}
				System.out.print("*");	// num-1개 공백 출력 + * 하나
				
			}else {
				
				for(int j = num-i; j >= 1; j--) {	//num+1, num+2,.. (num*2-2)줄
					System.out.print(" ");			//앞에 공백 num-i개 출력
				}
				System.out.print("*");	// * 첫번째
				
				for(int k = 2*(i-2)+1; k >= 1; k--) {	// 홀수 7 5 3 1 순 공백 출력
					System.out.print(" ");
				}
				System.out.print("*");	// * 두번째
				
			}
			System.out.println();
		}
		sc.close();
	}
		

	
}
