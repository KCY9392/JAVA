package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	//실습 1.
	/*길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
	 * 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
	 * 
		ex.
		1 2 3 4 5 6 7 8 9 10
	 */
	public void practice1() {
		int [] arr = new int [10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+ " ");
		}
	} 
	
	 
	
	//실습 2.
	/*길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
	 * 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
	 * 
		ex.
		10 9 8 7 6 5 4 3 2 1
	 */
	public void practice2() {
		int [] arr = new int [10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = arr.length - i;
			System.out.print(arr[i]+ " ");
		}
	}
	
	
	
	
	//실습 3.
	/*사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
	 * 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.

		ex.
		양의 정수 : 5
		1 2 3 4 5
	 */
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int size = sc.nextInt();
		
		int [] arr = new int [size];
		
		for(int i=0; i< arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
	
	
	
	
	
	//실습 4.
	/*길이가 5인 String배열을 선언하고 
	 * “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후, 
	 * 배열인덱스를 활용해서 귤을 출력하세요.
	 * 
		ex.
		귤
	 */
	public void practice4() {
		
		String [] arr = {"사과","귤","포도","복숭아","참외"};
		System.out.print(arr[1]);
		
	}
	
	
	
	

	//실습 5.
	/*문자열을 입력 받아 문자 하나하나를 배열에 넣고 
	 * 검색할 문자가 문자열에 몇 개 들어가 있는지
	 * 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요

		ex.
		문자열 : application
		문자 : i
		application에 i가 존재하는 위치(인덱스) : 4 8 
		i 개수 : 2
	 */
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		int count=0; //문자열에 있는 특정문자의 개수 변수
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		char arr [] = new char [str.length()]; //문자열 길이크기로 배열 생성
		
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ",str,ch);
		
		for(int i=0; i<arr.length; i++) { //문자열의 문자 하나씩 각 인덱스에 초기화
			arr[i] = str.charAt(i);
			if(str.charAt(i)==ch) { // 문자열의 몇번째 문자가 특정문자와 동일하다면,
				count++;
				System.out.print(i+ " "); //특정문자의 인덱스위치 출력
			}
		}
		System.out.printf("\n%c의 개수 : %d",ch,count);
		sc.close();
	}
	
	
	
	
	
	//실습 6.
	/*“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
	 * 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
	 * 범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
	 
	 	ex.
		0 ~ 6 사이 숫자 입력 : 4 		0 ~ 6 사이 숫자 입력 : 7
		금요일 						잘못 입력하셨습니다.
	 */
	public void practice6() {
		String [] arr = {"월", "화", "수", "목", "금"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num<0 || num>6) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
		System.out.printf("%s요일",arr[num]);
		}
		sc.close();
	}
	
	
	
	
	
	//실습 7.
	/*사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
	 * 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
	 * 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.

		ex.
		정수 : 5
		배열 0번째 인덱스에 넣을 값 : 4
		배열 1번째 인덱스에 넣을 값 : -4
		배열 2번째 인덱스에 넣을 값 : 3
		배열 3번째 인덱스에 넣을 값 : -3
		배열 4번째 인덱스에 넣을 값 : 2
		4 -4 3 -3 2 
		총 합 : 2
	 */
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int size = sc.nextInt();
		
		int sum = 0;
		
		int arr [] = new int [size];//배열 선언
		
		for(int i=0; i<arr.length; i++) {//값 초기화
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ",i);
			arr[i] = sc.nextInt();
			sum += arr[i];//입력받은 값 더하기
		}
		for(int i=0; i<arr.length; i++) {//배열 전체 나열
			System.out.print(arr[i]+" ");
		}
		System.out.printf("\n총 합 : %d",sum);
		sc.close();
	}
	
	
	
	
	
	//실습 8.
	/*3이상인 홀수 자연수를 입력 받아 
	 * 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
	 * 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
	 * 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우,
	 *  “다시 입력하세요”를 출력하고, 다시 정수를 받도록 하세요.
	
	ex.
	정수 : 4
	다시 입력하세요.
	정수 : -6
	다시 입력하세요.
	정수 : 5
	1, 2, 3, 2, 1
	*/
	public void practice8() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();

			if (num % 2 == 0 || num < 3) {
				System.out.println("다시 입력하세요.");
				continue;
			}

			int[] arr = new int[num];// 입력받은 정수로 배열 생성

			//내가 한 방법
			for (int i = 0; i < arr.length / 2 + 1; i++) {//arr[0]부터 중앙까지 초기화
				arr[i] = i+1;
			}
			for (int i = 0; i < arr.length / 2; i++) {//중앙의 뒷부분 초기화
				arr[arr.length / 2 + i + 1] = arr.length / 2 - i;
			}
			for (int i = 0; i < arr.length; i++) {//배열 전체 나열
				System.out.print(arr[i]);
				
				if (i != arr.length - 1) {//마지막 인덱스 출력시엔 콤마 안찍게 하는 조건문
					System.out.print(", ");
				}
			}
			
//			//강사님 버전
//			int mid = num / 2 + 1;
//			int value = 0;
//			for(int i=0; i<num; i++) {
//				if(i < mid) {
//					arr[i] = ++value;
//				}
//				else {
//					arr[i] = --value;
//				}
//			}
//			for(int i=0; i<num; i++) {
//				System.out.print(arr[i]+( i!=(num-1) ? ", " : ""));
//			}
			
//			//for문 하나로 하는 방법
//			for(int i = 0; i<num/2+1; i++) {
//				arr[i] = i+1;//0 1 2 -> 1 2 3
//				arr[num-1-i] = i+1; // 4 3 -> 1 2 
//			}
//			for(int i=0; i<num; i++) {
//				System.out.print(arr[i]+( i!=(num-1) ? ", " : ""));
//			}
			break;
		}
		sc.close();
	}
	
	
	
	
	
	//실습 9.
	/*사용자가 입력한 값이 배열에 있는지 검색하여
	 * 검색 결과가 있으면 “OOO 치킨 배달 가능“, 
	 * 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
	 * 단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요
	 
	 	ex.
		치킨 이름을 입력하세요 : 양념 치킨		 	이름을 입력하세요 : 불닭
		양념치킨 배달 가능 						불닭치킨은 없는 메뉴입니다.
	 */
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[메뉴] -> 양념, 불닭, 후라이드, 뿌링클, 고추바사삭, 황금올리브, 맛초킹");
		System.out.print("치킨 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		String [] chicken = {"양념", "불닭", "후라이드", "뿌링클", "고추바사삭","황금올리브","맛초킹"};
		
		for(int i=0; i<chicken.length; i++) {
			if(chicken[i].equals(name)) {
				System.out.printf("%s치킨 배달 가능",name);
				sc.close();
				return;
			}
		}
		System.out.printf("%s치킨은 없는 메뉴입니다.",name);
		sc.close();
	}
	
	
	
	
	
	//실습 10.
	/*주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
	 * 단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
		
		ex.
		주민등록번호(-포함) : 123456-1234567
		123456-1******

	 */
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String jumin = sc.nextLine();
		char [] origin = new char [jumin.length()];
		
		for(int i=0; i<origin.length; i++) {
			origin[i] = jumin.charAt(i);
		}
		
		char [] copy = new char [origin.length];
		
//		System.arraycopy(origin, 0, copy, 0, 8);
//		
//		for(int i=8; i<copy.length; i++) {
//			copy[i]='*';
//		}
//		for(int i=0; i<copy.length; i++) {
//			System.out.print(copy[i]);
//		}
		
		//강사님 버전
		for(int i=0; i<origin.length; i++) {
			if(i>=8) {
				copy[i]='*';
			}
			else {
				copy[i] = origin[i];
			}
			System.out.print(copy[i]);
		}
		sc.close();
	}
	
	
	
	
	
	//실습 11.
	/*10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
	 * 1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
	 * 
		ex.
		9 7 6 2 5 10 7 2 9 6
	 * 
	 */
	public void practice11() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
	}
	
	
	
	
	
	
	//실습 12.
	/*10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
	 * 1~10 사이의 난수를 발생시켜 배열에 초기화 후
	 * 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
	 
		ex.
		5 3 2 7 4 8 6 10 9 10 
		최대값 : 10
		최소값 : 2
	 */
	public void practice12() {
		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
		int max = arr[0];
		int min = arr[0];
		
			for(int i=1; i<arr.length; i++) {
					if (max < arr[i]) {
						max = arr[i];
					}
					if (min > arr[i]) {
						min = arr[i];
					}
				}
		System.out.printf("\n최대값 : %d\n", max);
		System.out.printf("최소값 : %d", min);
	}
	
	public void practice12_2() {
		//정렬 후, 최대최소 구하는 방법
		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
		
		Arrays.sort(arr); //오름차순 정렬
		
		System.out.printf("\n최대값 : %d\n", arr[arr.length-1]);
		System.out.printf("최소값 : %d", arr[0]);
		
	}
	
	
	
	
	
	
	//실습 13.
	/*10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
	 * 1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
		ex.
		4 1 3 6 9 5 8 10 7 2 
	 */
	public void practice13() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1); //비교하려는 원본값.
			for (int j = 0; j < i; j++) {//비교하려는 원본값의 앞에 값들.
				if (arr[i] == arr[j]) { 
					i--;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	
	
	
	
	
	
	//실습 14.
	/*로또 번호 자동 생성기 프로그램을 작성하는데,
	 *  중복 값 없이 오름차순으로 정렬하여 출력하세요.
		ex.
		3 4 15 17 28 40
	 * 
	 */
	public void practice14() {
		int [] arr = new int [6];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*45+1);
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					i--;
				}
			}
		}
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	
	
	
	
	
	
	//실습 15.
	/*문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
	 * 문자의 개수와 함께 출력하세요.
		ex.
		문자열 : application
		문자열에 있는 문자 : a, p, l, i, c, t, o, n
		문자 개수 : 8
	 */
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char [] arr = new char [str.length()];
		
		int sum = 0; //문자열 개수 변수
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		loop:
		for (int i = 0; i < arr.length; i++) {//비교할 대상
			char ch = arr[i];
			if(i>0) {	//첫번째 문자 빼고, i가 1부터 
				for (int j = 0; j < i; j++) { //0부터 자기자신 전까지 비교
						if (ch == arr[j]) { 
							//i++;
							//break;//가까운 for문 나오기.
							continue loop;
						}
					}
					System.out.print(arr[i]+", ");
					sum++;
				}else { //첫번쨰 문자 i=0
					System.out.print(arr[i]+", ");
					sum++;
				}
		}
			 
		System.out.printf("\n문자 개수 : %d",sum);
		sc.close();
	}
	
	
	
	
	
	
	
	//실습 16.
	/*사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고 
	 * 배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
	 * 단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
	 * 늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
	 * 사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
	 
	 	ex.
		배열의 크기를 입력하세요 : 3
		1번째 문자열 : 자바의 정석
		2번째 문자열 : 알고리즘
		3번째 문자열 : C프로그래밍
		더 값을 입력하시겠습니까?(Y/N) : y
		더 입력하고 싶은 개수 : 2
		4번째 문자열 : 인간관계
		5번째 문자열 : 자기계발
		더 값을 입력하시겠습니까?(Y/N) : y
		더 입력하고 싶은 개수 : 1
		6번째 문자열 : 영단어600
		더 값을 입력하시겠습니까?(Y/N) : n
		[자바의 정석, 알고리즘, C프로그래밍, 인간관계, 자기계발, 영단어600]
	 */
	public void practice16() {
		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();

		String[] arr = new String[size];

		sc.nextLine();

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d번째 문자열 : ", i + 1);
			arr[i] = sc.nextLine();
		}
			while (true) {
				System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
				char yesno = sc.nextLine().charAt(0);
				
				if (yesno == 'y' || yesno == 'Y') {
					System.out.print("더 입력하고 싶은 개수 : ");
						int size2 =  sc.nextInt();

					sc.nextLine();
					
					String [] copy = Arrays.copyOf(arr, arr.length+size2);
					for(int i= arr.length; i<copy.length; i++) {
						System.out.printf("%d번째 문자열 입력 : ",(i+1));
						copy[i] = sc.nextLine();
					}
					
					arr = copy.clone(); // arr에 copy배열을 넣어줌.(공간도 copy크기만큼)
					//arr = copy; //가능!
				}else {
					System.out.println(Arrays.toString(arr));
					break;
					}
				}
			sc.close();
			}
}
