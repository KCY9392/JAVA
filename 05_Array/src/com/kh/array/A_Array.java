package com.kh.array;

import java.util.Scanner;

public class A_Array {
	/*
	 * 변수 : 하나의 공간에 하나의 값만 담을 수 있음.
	 * ex) int i = 0;
	 * 
	 * 배열 : 하나의 공간에 여러개의 값을 담을 수 있음.("같은 자료형의 값"으로만 담을 수 있다.)
	 * 		 정확히 얘기하자면 배열의 각 인덱스 자리에 실제 값이 담김(인덱스는 0부터 시작)
	 * 
	 * ex) int [] a = new int[3]; 
	 * int형의 자료가 들어갈 수 있는 방3개를 만든다.
	 * 방 [0], [1], [2]를 만드는 것.
	 * 인덱스는 항상 0부터 시작한다.(중요)
	 * 배열의 크기 = 3. 마지막 인덱스 = 2
	 * 크기 = n, 마지막인덱스 = n-1
	 * 
	 * a[0] = 10;
	 * a[1] = 15; 
	 * a[2] = 40;
	 *  
	 */
	
	//배열을 써야하는 이유
	public void method1() {
		//0 1 2 3 4
//		int num1 = 0;
//		int num2 = 1;
//		int num3 = 2;
//		int num4 = 3;
//		int num5 = 4;
//		
//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(num3);
//		System.out.println(num4);
//		System.out.println(num5);
//		
//		int sum = num1+num2+num3+num4+num5;
		//효율이 없고, 너무 난잡함.
		
		/*
		 * 1.배열 선언
		 * [표현법] -> 두가지 다 가능!
		 * 자료형 배열명 [];
		 * 
		 * 자료형 [] 배열명; //보통 이렇게 많이 씀.
		 */
//		int a;
//		int arr [];
//		int [] arr2;
		
		/*
		 * 2.배열 할당.
		 * 이 배열에 몇개의 값들을 보관할 건지 크기를 지정해주는 과정.
		 * 지정한 갯수만큼 값이 들어가는 "방"이 만들어짐
		 * [표현법]
		 * 배열명 = new 자료형[배열크기];
		 * 
		 */
		//arr = new int[5];
		
		
		// 배열 선언과 동시에 할당
		int [] arr3 = new int [5];
		
		
		// 값을 할당하는 방법.
//		arr3[0] = 0;
//		arr3[1] = 1;
//		arr3[2] = 2;
//		arr3[3] = 3;
//		arr3[4] = 4;
		
		
		//반복문으로 배열에 값을 할당.
		for(int i=0; i<5; i++) {
			arr3[i]=i;
		}
		
		//반복문으로 배열에 담긴값 출력.
		for(int i=0; i<5; i++) {
			//System.out.println(arr3[i]);
			System.out.printf("%d인덱스의 값 : %d\n",i, arr3[i]);
		}
		System.out.println(arr3); // arr3의 주소값 (16진수)
		//[I@1888ff2c
		//[I int형 배열이다.
		//@뒤에가 주소값
	}
	
	public void method2() {
		//int a = 10;
		
		int [] iArr = new int [5];
		//stack에는 iArr 공간이 생성,
		//heap에는 5칸의 방 생성된다.
		//heap의 주소값은 iArr에 할당된다.
		
		//System.out.println(iArr[5]);
		//인덱스의 범위를 벗어나서 실행에러
		
		System.out.println(iArr);
		//10진수 => 우리가 자주쓰는 숫자.
		System.out.println("iArr의 주소값(10진수로) : "+iArr.hashCode());
		//iArr의 주소값 16진수를 10진수로 바꿔주는 함수 .hashCode()
		
		double [] dArr = new double[3];
		System.out.println(dArr);
		System.out.println("dArr의 주소값(10진수로) : "+dArr.hashCode());
		
		//주소값은 항상 고유하다.
		
		/*
		 * 기본자료형 : ( char, float, byte, long, short, int, boolean, double)
		 * => 실제 값(리터럴)을 바로 담을 수 있는 변수 => 일반변수
		 * 
		 * 그 외 자료형 : (char[], float[], byte[], long[], short[], int[], ..., String, Scanner)
		 * => 주소값을 가지고 있는 변수. => 참조 변수(레퍼런스 변수)
		 * String은 클래스를 만들어서 특별취급하고 있는 변수이다.
		 * 
		 */
	}
	
	public void method3() {
		
		int [] iArr = new int [3];
		double[] dArr = new double[3];
		
		for(int i=0;i<3;i++) {
			System.out.println(iArr[i]);
			//0 0 0 
			//0이라는 값이 담겨있는 상태로 방이 생성된다는 의미
			
			//heap에는 절대 빈 값이 들어갈 수 없고,
			//기본값으로 int형은 0이 들어가있고,
			//double형은 0.0이라는 값이 들어가있다.
			//자료형에 따라 기본값이 들어가있다.
		}
		for(int i=0; i<3; i++) {
			System.out.println(dArr[i]);
		}
		//배열의 크기
		//배열명.length
		
		System.out.println("iArr의 크기는 ? "+iArr.length);
		System.out.println("dArr의 크기는 ? "+dArr.length);
		
		
		for(int i=0; i<iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		for(int i=0; i<dArr.length;i++) {
			System.out.println(dArr[i]);
		}
	}
	
	public void method4() {
		//int result = 0; //int형 자료 기본값은 0
		
		int [] iArr = null; 
		//초기화를 하지않고(주소값을 참조하지않고), 빈값이라고 어떻게 표현할까? 
		//null을 넣기.
		
		System.out.println(iArr); // null
		
		
		
		//NullPointerException 발생
//		System.out.println(iArr.length);
//		System.out.println(iArr.hashCode());
		/*
		 * 기본값이 null인 변수를 가지고 메소드를 호출하거나 
		 * 특정 어딘가에 접근하고자 하면 발생.
		 * 
		 * ex)iArr.length
		 * 	  iArr.hashCode(); //null이 가지고있는 메소드는 아무것도 없음.
		 * 
		 */
		//제일 많이 보는 에러 1순위
		//NullPointerException
		//제일 많이 보는 에러 2순위
		//ArrayIndexOutOfException
		
		//null체크하는 방법.
//		if(iArr != null) { //iArr 이 null이 아니면 출력하겟다.
//			System.out.println(iArr.hashCode());
//		}
		
	}
	
	public void method5() {
		
		int [] arr = new int [5];
		
		/*
		 * arr[0] = 2;
		 * arr[1] = 4;
		 * arr[2] = 6;
		 * arr[3] = 8;
		 * arr[4] = 10;
		 */
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = 2*(i+1);
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		//arr[6] = 12; 
		//JVM은 이 코드를 실행하기 전까지 에러발견 못함.
		//ArrayIndexOutOfBoundException 발생! (범위에서 벗어난 인덱스)
		
		/*
		 * 배열의 단점.
		 * 한번 지정한 크기는 변경이 불가능.
		 * => 배열의 크기를 변경하고자 한다면 어쩔 수 없이 배열을 새로 선언해야한다.
		 */
		
		//int a = 0;
		//a = 1;
		
		System.out.println("변경 전 arr의 해시코드값 : "+arr.hashCode());
		
		//배열도 변수처럼 변경하고싶을 때, 다시 지정한 크기 선언해주면 된다.
		arr = new int [7]; 
		
		//크기를 새로 선언할 경우, heap에 새로운 주소값이 갱신됨.
		
		//이전 주소값은 아무것도 연결하지 않고, 메모리에 둥둥 떠다니게됨.
		//이 주소값은 쓸모없어진 데이터라고 하며, 가비지 라고 한다.
		//가비지 컬렉터가 일정시간이 지나면 이런 가비지들을 없앤다.
		
		//이전에 저장되어있던 값들은 0으로 초기화된다.
		
		System.out.println("변경 후 arr의 해시코드값 : "+arr.hashCode());
		
		/*
		 * new 연산자 선언시, 항상 고유한 주소값이 부여, 기존에 생성된 주소와 절대 안겹침.
		 * 기존에 참고하였던 연결이 끊기고 새로운 곳을 참조하게되는 경우
		 * 연결이 끊어진 기존의 배열은 Heap영역에 두둥실 떠다니게된다.
		 * 일정 시간이 지나면 "가비지컬렉터(GC)"가 자동으로 삭제시켜준다. : 자동메모리관리
		 * 
		 * 현재 연결되어있는 고리를 끊고자 한다면 ?
		 * 
		 */
		
		arr = null; // 아무것도 존재하지 않음.
		
		System.out.println(arr);
		
		
	}
	
	public void method6() {
		// 선언과 동시에 할당
		//int [] arr = new int [4];
		//반복문으로 대입
		
		//선언과 동시에 할당하고 초기화까지 하는 방법.
		//방법 1. 
		int [] arr1 = new int [] {0, 1, 2, 3, 4};
		
		
		//방법 2.
		int[] arr2 = { 0, 1, 2, 3, 4 };
		
		//두 방법은 "동일하게" stack에 arr1 2 공간생성되고,
		//heap영역에 5칸 방 생기고, 0 1 2 3 4로 초기화된다.
		
		//arr1과 arr2 동등비교해보기
		System.out.println(arr1 == arr2); //주소값 간의 동등비교연산 수행됨.
		//.equals()을 사용했던 String은 참조자료형으로,
		//값을 비교하려고 .equals를 사용했고,
		// == 으로 동등비교하면 주소값을 비교하므로, 
		//자기자신이 아니면, 매번 false가 나올 수 밖에 없다.
		
	}
	
	
	
	/*
	 * 1. 크기 10짜리 점수배열 선언.
	 * 2. 반복문 활용해서 0번 인덱스부터~ 마지막 인덱스까지 순차적 접근해서 값대입
	 * 값 -> 랜덤값 (1~100)
	 * 3. 반복문 활용해서 0번 인덱스 ~ 마지막 인덱스까지 배열에 담긴값 출력
	 * 출력예시 ) arr[x] : xx
	 */
	public void method7() {
		
		int [] score = new int [10];
		
		//객체안의 length라는 변수를 사용
		
		for(int i=0; i<score.length; i++) {
			score[i] = (int)(Math.random()*100+1);
			System.out.printf("arr[%d] : %d\n",i,score[i]);
		}
	}
	
	
	/*
	 * 1.사용자에게 매번 배열의 사이즈 값을 입력받은 후, 해당 크기만큼 배열 생성.
	 * 2.반복문을 활용해서 사용자에게 과일명을 입력받아 그 값을 인덱스 자리에 대입
	 * 3.과일명을 한줄로 스페이스바로 공간을 나누어 출력.
	 */
	public void method8() {
		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 사이즈 : ");
		int num = sc.nextInt();

		String[] arr = new String[num];

		sc.nextLine();

		for (int i = 0; i < arr.length; i++) {
			System.out.print("과일명 : ");
			arr[i] = sc.nextLine();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
	
	
	/*
	 * 1.사용자에게 문자열 입력받고,
	 * 2.char배열 생성해두기 (배열크기 == 문자열의 길이만큼)
	 * 3.문자열에서 각 인덱스별로 문자를 뽑아서 char배열의 각 인덱스에 담기
	 * 4.char배열의 각 인덱스에 잘 담겨있는 지 반복문 활용해서 출력해보기
	 */
	public void method9() {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char [] arr = new char [str.length()];
		//궁금한 함수에 ctrl + 좌클릭 하면 정보뜸.
		
		for(int i=0; i<arr.length; i++) {
			 arr[i] = str.charAt(i);
			 System.out.printf("char배열[%d] : %c\n",i,arr[i]);
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		sc.close();
	}
	
	
	
	/*
	 * 1. 크기 10짜리 점수배열 선언.
	 * 2. 반복문 활용해서 0번 인덱스부터~ 마지막 인덱스까지 순차적 접근해서 값대입
	 * 값 -> 랜덤값 (1~100)
	 * 3. 반복문 활용해서 0번 인덱스 ~ 마지막 인덱스까지 배열에 담긴값 출력과 동시에
	 * +) 짝수인 값들의 총합더하고, 마지막에 출력.
	 * 
	 * 출력예시 ) arr[x] : xx
	 * 4. 짝수들의 총합 : xx
	 */
	public void method10() {
		int[] score = new int[10];
		
		int sum = 0;
		
		// 객체안의 length라는 변수를 사용

		for (int i = 0; i < score.length; i++) {
			score[i] = (int) (Math.random() * 100 + 1);
			System.out.printf("arr[%d] : %d\n", i, score[i]);
			
			if(score[i]%2==0) {
				sum += score[i];
			}
		}
		System.out.printf("짝수들의 총합 : %d",sum);
	}
	
	
	
	
	
	
	
	
}
