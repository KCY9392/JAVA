package com.kh.chap03.branch;

public class B_Continue {
	/*
	 * continue; : 반복문안에서 사용하는 구문.
	 * 
	 * 	continue 만나게 되면, 그 반복문 뒤에 어떤 구문이 있든지 실행하지않고,
	 * 	가장 가까운 반복문으로 올라가라는 걸(재실행) 의미한다.
	 * 
	 */
	
	
	
	//1부터 10까지 홀수만 출력
	//1 3 5 7 9
	public void method1() {
		for(int i=1; i<10; i+=2) {
			
		}
		for(int i=1; i<10; i++) {
			if(i%2==0) {
				continue;
				//뒤쪽의 내용은 무시하고, 다음 증감식으로 넘어가라.
			}
			System.out.print(i+ " ");
		}
	}
	
	
	
	
	//1부터 100까지의 총 합계
	//단, 6의 배수는 빼고 더하기.
	public void method2() {

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 6 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("1부터 100까지 6의 배수를 뺀 총 합계 : " + sum);
	}
	
	
	
	
	// 2~9단 까지 출력.
	/*=== 2단 ===
	 2 X 1 = 2
	 2 X 2 = 4
	 ....
	 === 9단 ===
	 9 X 9 = 81
	*/
	//단, 4의 배수단은 빼고 출력하세요.
	public void method3() {
		for(int i=2; i<=9; i++) {
			if(i==4) {
				continue;
			}
			System.out.printf("=== %d단 ===\n",i);
			for(int j=1; j<= 9; j++) {
				System.out.printf("%d X %d = %d \n",i,j,(i*j));
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
