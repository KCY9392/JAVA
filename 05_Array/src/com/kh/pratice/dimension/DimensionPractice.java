package com.kh.pratice.dimension;

import java.util.Scanner;

public class DimensionPractice {
	
	
	//실습1.
	/*3행 3열짜리 문자열 배열을 선언 및 할당하고
	인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 
	“(0, 0)”과 같은 형식으로 저장 후 출력하세요.

	ex.
	(0, 0)(0, 1)(0, 2)
	(1, 0)(1, 1)(1, 2)
	(2, 0)(2, 1)(2, 2)
	 */
	public void practice1() {
		String [][] arr = new String [3][3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = "("+String.valueOf(i)+", "+String.valueOf(j)+")";
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}



	//실습2.
	/*4행 4열짜리 정수형 배열을 선언 및 할당하고
	1) 1 ~ 16까지 값을 차례대로 저장하세요.
	2) 저장된 값들을 차례대로 출력하세요.
	
		ex.
		 1  2  3  4 
		 5  6  7  8 
		 9 10 11 12 
		13 14 15 16 
	 */
	public void practice2() {
		int arr [][] = new int [4][4];
		
		//int value = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = j+1 +(arr.length*i);
				//arr[i][j] = value;
				//value++;
					System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}




	//실습3.
	/*4행 4열짜리 정수형 배열을 선언 및 할당하고
	1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
	2) 저장된 값들을 차례대로 출력하세요.

	ex.
	16 15 14 13 
	12 11 10  9 
	 8  7  6  5 
	 4  3  2  1 
	 */
	public void practice3() {
		int arr [][] = new int [4][4];
		
		//int value = 16;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (arr.length*(arr.length-i))-j;
				//arr[i][j] = value;
				//value--;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}




	//실습4.
	/*4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 
	 * 1~10까지의 임의의 정수 값 저장 후 아래의 내용처럼 처리하세요.

	ex.
	 6  6  1 13 
	 4 10  8 22 
	 8  6  5 19 
	18 22 14 108
	 */
	public void practice4() {
		int arr[][] = new int[4][4];

		int sum1 = 0; // 행값들의 합
		int sum2 = 0; // 열값들의 합
		int sum = 0; // 가로 세로 합

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				// i가 0 1 2 행 인경우,
				if (i < arr.length - 1) {

					// j가 0 1 2 열 인경우,
					if (j < arr[i].length - 1) {
						arr[i][j] = (int) (Math.random() * 10 + 1);
						System.out.print(arr[i][j] + "  ");
						sum1 += arr[i][j];
						
					} else { // i가 0 1 2행이고, j가 3열일때, 행값들의 합 넣기
						arr[i][j] = sum1;
						System.out.print(arr[i][j]);
						sum += sum1; // 가로세로의 합 변수에 세로들의 합 넣어두기.
						sum1 = 0;
					}
					
				// i가 3행 인경우,
				} else {

					// j가 0 1 2열 인경우,
					if (j < arr[i].length - 1) {
						for (int k = 0; k < arr.length - 1; k++) {
							sum2 += arr[k][j];
						}
						arr[i][j] = sum2;
						System.out.print(arr[i][j] + " ");
						sum += arr[i][j]; //가로세로의 합 변수에 가로들의 합 넣어두기.
						sum2 = 0;
					} 
					else { // j가 3열인경우, 가로 세로 합 넣기.
						arr[i][j] = sum;
						System.out.print(arr[i][j]);
					}
				}
			}
			System.out.println();
		}
	}





	//실습5.
	/*2차원 배열의 행과 열의 크기를 사용자에게 직접 입력받되, 
	 * 1~10사이 숫자가 아니면
	  “반드시 1~10 사이의 정수를 입력해야 합니다.” 출력 후 다시 정수를 받게 하세요.
	 * 크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요.
	 * (char형은 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타냄) 
	
		ex.
		행 크기 : 5
		열 크기 : 4
		T P M B 
		U I H S 
		Q M B H 
		H B I X 
		G F X I 
	 */
	public void practice5() {
		Scanner sc = new Scanner(System.in);

		int row, colum = 0;

		while (true) {
			System.out.print("행 크기 : ");
			row = sc.nextInt();

			if (row < 1 || row > 10) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue;
			}
			break;
		}

		while (true) {
			System.out.print("열 크기 : ");
			colum = sc.nextInt();

			if (colum < 1 || colum > 10) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue;
			}
			break;
		}

		char arr[][] = new char[row][colum];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (char) (Math.random() * 26 + 65);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}
	
	
	
	
	
	
	//실습6.
	/*String[][] strArr = new String[][] {
	 * {"이", "까", "왔", "앞", "힘"}, 
	 * {"차", "지", "습", "으", "냅"}, 
	 * {"원", "열", "니", "로", "시"}, 
	 * {"배", "심", "다", "좀", "다"}, 
	 * {"열", "히", "! ", "더", "!! "}};

	위의 초기화되어 있는 배열을 가지고 아래의 ‘[그림] 실습문제4 흐름’과 같은 방식으로 출력하세요.
	단, print()를 사용하고 값 사이에 띄어쓰기(“ “)가 존재하도록 출력하세요.
	 * 
	 */
	public void practice6() {
		String[][] strArr = new String[][] {
				{ "이", "까", "왔", "앞" }, 			// 00 01 02 03 		4
				{ "차", "지", "습", "으", "힘" }, 		// 10 11 12 13 14	5
				{ "원", "열", "니", "로", "냅" }, 		// 20 21 22 23 24	5
				{ "배", "심", "다", "좀", "시" }, 		// 30 31 32 33 34	5
				{ "열", "히", "! ", "더", "다" } };	// 40 41 42 43 44	5

		// 바꿀 흐름
		// 00 10 20 30 40   이 차 원 배 열		5
		// 01 11 21 31 41   까 지 열 심 히		5
		// 02 12 22 32 42   왔 습 니 다 !		5
		// 03 13 23 33 43   앞 으 로 좀 더		5
		//    14 24 34 44     힘 냅 시 다		4
				
		String arr [][] = new String [strArr.length][strArr.length];
		strArr = new String [strArr.length][strArr.length];
		
		for (int i = 0; i < arr.length; i++) { 
			for (int j = 0; j < arr[i].length; j++) { 
				if(strArr[i][j]==null) {
					System.out.print(" ");
				}else {
					arr[i][j] = strArr[j][i]; 
					System.out.print(arr[i][j] + " ");
				}
				
				
				
//				if()
//				arr[i] = new String [strArr[]]
//				arr[i][j] = strArr[j][i]; 
			}
			System.out.println();
		}
//		
//		for (int i = 0; i < arr.length; i++) { 
//			for (int j = 0; j < arr[i].length; j++) { 
//				System.out.println(arr[i][j]);
//			}
//			System.out.println();
//		}
	}
	
	
	
	
	
	
	//실습7.
	/*사용자에게 행의 크기를 입력 받고 
	 * 그 수만큼의 반복을 통해 열의 크기도 받아, 문자형 가변 배열을 선언 및 할당하세요.
	 * 그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
	
		ex.
		행의 크기 : 4
		0행의 열 크기 : 2
		1행의 열 크기 : 6
		2행의 열 크기 : 3
		3행의 열 크기 : 5
		a b 
		c d e f g h 
		i j k 
		l m n o p 
	 */
	public void practice7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("행의 크기 : ");
		int size = sc.nextInt();

		char arr[][] = new char[size][];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d행의 열 크기 : ", i);
			arr[i] = new char[sc.nextInt()];
		}

		int value = 97;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (char) value;
				System.out.print(arr[i][j] + " ");
				value++;
			}
			System.out.println();
		}
		sc.close();
	}
	
	
	
	
	
	
	//실습8.
	/*1차원 배열에 12명의 학생들을 출석부 순으로 초기화 하고 
	2열 3행으로 2차원 배열 2개를 이용하여 분단을 나눠
	1분단 왼쪽부터 오른쪽, 1행에서 아래 행 순으로 자리를 배치하세요.
	
	<출석부>
	1. 강건강 2. 남나나 3. 도대담 4. 류라라 5. 문미미 6. 박보배 
	7. 송성실 8. 윤예의 9. 진재주 10. 차천축 11. 피풍표 12. 홍하하

	 ex.
		== 1분단 ==
		강건강  남나나  
		도대담  류라라  
		문미미  박보배  
		== 2분단 ==
		송성실  윤예의  
		진재주  차천축  
		피풍표  홍하하
	 */
	public void practice8() {
		String arr [] = {"강건강","남나나","도대담","류라라","문미미","박보배","송성실","윤예의","진재주","차천축","피풍표","홍하하"};
	
		String arr1 [][] = new String [3][2];
		String arr2 [][] = new String [3][2];
		
		System.out.println("== 1분단 ==");
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0; j<arr1[i].length;j++) {
				arr1[i][j] = arr[(i*2)+j];
				System.out.print(arr1[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		
		for(int i=0;i<arr2.length;i++) {
			for(int j=0; j<arr2[i].length;j++) {
				arr2[i][j] = arr[6+(i*2)+j];
				System.out.print(arr2[i][j]+"  ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	//실습9.
	/*위 문제에서 자리 배리 배치한 것을 가지고 학생 이름을 검색하여
	 * 해당 학생이 어느 자리에 앉았는지 출력하세요.

	ex.
		== 1분단 ==
		강건강  남나나  
		도대담  류라라  
		문미미  박보배  
		== 2분단 ==
		송성실  윤예의  
		진재주  차천축  
		피풍표  홍하하  
		============================
		검색할 학생 이름을 입력하세요 : 차천축
		검색하신 차천축 학생은 2분단 두 번째 줄 오른쪽에 있습니다.
	 */
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		String arr [] = {"강건강","남나나","도대담","류라라","문미미","박보배","송성실","윤예의","진재주","차천축","피풍표","홍하하"};
		
		String arr1 [][] = new String [3][2];
		String arr2 [][] = new String [3][2];
		
		System.out.println("== 1분단 ==");
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0; j<arr1[i].length;j++) {
				arr1[i][j] = arr[(i*2)+j];
				System.out.print(arr1[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		
		for(int i=0;i<arr2.length;i++) {
			for(int j=0; j<arr2[i].length;j++) {
				arr2[i][j] = arr[6+(i*2)+j];
				System.out.print(arr2[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("============================");
		System.out.print("검색할 학생을 입력하세요 : ");
		String name = sc.nextLine();
		String where = "";
		
		for(int i=0;i<3;i++) {
			for(int j=0; j<2;j++) {
				if(name.equals(arr1[i][j])) {
					if(j==0) {
						where = "1분단 "+String.valueOf(i+1)+"번째 줄 왼쪽";					
					}else {
						where = "1분단 "+String.valueOf(i+1)+"번째 줄 오른쪽";
					}
				}else if(name.equals(arr2[i][j])) {
					if(j==0) {
						where = "2분단 "+String.valueOf(i+1)+"번째 줄 왼쪽";
					}else {
						where = "2분단 "+String.valueOf(i+1)+"번째 줄 오른쪽";
					}
				}
			}
		}
			System.out.printf("검색하신 %s 학생은 %s에 있습니다.",name,where);
			sc.close();
	}
	
}
