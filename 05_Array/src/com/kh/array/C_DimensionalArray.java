package com.kh.array;

import java.util.Scanner;

public class C_DimensionalArray {
	
	// 이 차원 배열 : 일차원 배열을 여러개로 묶은 것.
	
	public void method1() {
		//일차원 배열 선언
		//int [] arr1;
		//int arr2 [];
		
		/*
		 * 1. 이차원 배열 선언
		 * [표현법]
		 * 1) 자료형 배열명 [][]
		 * 2) 자료형 [][] 배열명
		 * 3) 자료형 [] 배열명 []; -> 가독성 안좋음.
		 */
		
//		int arr1[][];
//		int [][] arr2;
		int [] arr3 [];
		
		/*
		 * 2. 이차원 배열 할당방법(크기 지정)
		 * 배열명 = new 자료형 [1차원배열크기][2차원배열크기]
		 * 						=행			=열
		 */
		
		arr3 = new int[2][3];
		// [2] 행 [3] 열 이라고 한다.
		
		//선언과 동시에 할당
//		int [][] arr4 = new int [1][2];
		
		System.out.println(arr3.length); // 2 왜냐하면 arr3는 일단 2개의 큰방이 생겨서
		System.out.println(arr3[0][1]);	// 0
		System.out.println(arr3[0].length); // 3 
		
		/* 출력(arr3[0][0])
		 * 출력(arr3[0][1])
		 * 출력(arr3[0][2])
		 * 
		 * 출력(arr3[1][0])
		 * 출력(arr3[1][1])
		 * 출력(arr3[1][2])
		 */
		
		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3[0].length; j++) {
				System.out.println("i = " +i+ ", j = "+j+ " " +arr3[i][j]);
			}
		}
	}
	
	
	
	//순서대로 1, 2, 3, 4, 5 ... 15까지 값을 넣는다.
	public void method2() {
		
		//틀
		int [][] arr = new int[3][5];
		
		for(int i=0; i<arr.length; i++) { // 0 1 2
			for(int j=0; j<arr[i].length; j++) { // 0 1 2 3 4
				arr[i][j] = (j+1) + (arr[i].length)*i;
						//1 2 3 4 5
						//6 7 8 9 10
						//11 12 13 14 15
				System.out.printf("arr[%d][%d] = %d\n",i,j,arr[i][j]);
			}
			System.out.println();
		}
		
		//2번째 방법
		
//		int value = 1;
//		for(int i=0; i<arr.length; i++) { // 0 1 2
//			for(int j=0; j<arr[i].length; j++) { // 0 1 2 3 4
//				arr[i][j] = value++;
//						
//				System.out.printf("arr[%d][%d] = %d\n",i,j,arr[i][j]);
//			}
//			System.out.println();
//		}
	}
	
	
	
	//2차원 배열 선언과 동시에 초기화
	public void method3() {
		// 일차원 배열 선언과 동시에 초기화 { }
		// int[] iArr = { 1, 2, 3, 4, 5 };

		// 이차원 배열 선언과 동시에 초기화 { { }, { }, ... { } }
		// [3][5]
		// 이차원 배열의 이차원 공간에는 우리가 마음대로 크기를 정할 수 있다.(가변배열)
		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("arr[%d][%d] = %d\n", i, j, arr[i][j]);
			}
			System.out.println();
		}
	}
	
	
	
	public void method4() {

		/*
		 * 가변 배열 : 행의 크기는 정해져있으나, 각각의 행별 열의 갯수가 정해지지않은 형태
		 * 
		 * 이차원배열 == 일차원 배열을 여러개 묶은 형태. 즉, 묶여있는 일차원 배열의 길이가 꼭 같을 필요는 없다!
		 * 
		 * 행 크기는 생략불가, 반드시 지정해야하지만, 열 크기는 생략가능, 각행의 열의 길이가 변경이 가능하다.
		 * 
		 */

		// 열 크기 생략가능
		int[][] arr = new int[3][];
		System.out.println(arr);
		// [[I@53bd815b -> 이차원 배열은 앞에 [[

		System.out.println(arr[0]);
		// null

		// System.out.println(arr[0].length);
		// 에러남

		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[4];

		/*
		 * 1 2 
		 * 3 4 5
		 * 6 7 8 9
		 * 
		 */

		int value = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.printf("arr[%d][%d] = %d\n", i, j, arr[i][j]);
			}
			System.out.println();
		}
	}
	
	
	
	public void method5() {
		//char [][] 가변배열 생성.
		char [][] arr = new char[3][];
		
		/*
		 * a b c
		 * d e
		 * f g h i
		 */
		
		//각 2차원 배열 크기 선언
		arr[0] = new char[3];
		arr[1] = new char[2];
		arr[2] = new char[4];
		
		char value = 'a';
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value++; 
				// char 값이 아스키코드 정수값으로 ++ 되고 다시 char값으로 저장된다.
				System.out.printf("arr[%d][%d] = %c\n", i, j, arr[i][j]);
			}
			System.out.println();
		}
	}
	
	
	
	public void method6() {
		// int 형 2차원 배열을 만들어서
		// 0번 행에는 국어점수 3개 입력받고,
		// 1번 행에는 영어점수 3개 입력받은 후,
		// 각각 반복문을 활용해서 출력
		// 입력예시 : xx점수를 입력하세요 :
		// 출력예시 : xx점수 : xx xx xx

		int[][] arr = new int[2][3];

		Scanner sc = new Scanner(System.in);

//		System.out.printf("국어점수를 입력하세요 : ");
//		for(int i=0; i<arr[0].length; i++) {
//		arr[0][i] = sc.nextInt();
//		}
//		System.out.printf("국어점수 : %d %d %d\n",arr[0][0],arr[0][1],arr[0][2]);
//		
//		System.out.printf("영어점수를 입력하세요 : ");
//		for(int i=0; i<arr[1].length; i++) {
//			arr[1][i] = sc.nextInt();
//		}
//		System.out.printf("영어점수 : %d %d %d\n",arr[1][0],arr[1][1],arr[1][2]);
//		

		// 2번째 방법
		String name = "국어";
		for (int i = 0; i < arr.length; i++) {
			if (i == 1) { 
				name = "영어";
			}
			System.out.printf("%s점수를 입력하세요 : ", name);
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
			System.out.printf("%s점수 : ",name);
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d ",arr[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
