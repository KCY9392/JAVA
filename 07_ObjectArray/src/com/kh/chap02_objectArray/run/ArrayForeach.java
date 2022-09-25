package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ArrayForeach {

	public static void main(String[] args) {
		int [] arr = new int [3];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		/*
		 * for each문 (향상된 for문 / 개선된 for문)
		 * 배열 또는 컬렉션과 사용됨(컬렉션은 추후 학습예정)
		 * 배열 또는 컬렉션의 0번 인덱스부터 마지막 인덱스까지 순차적으로 접근할 목적일때.
		 * 
		 * 초기식, 조건식, 증감식 없음.
		 * 반복하는 횟수는 배열 또는 컬렉션의 크기만큼 반복함.
		 * 
		 * [표현법]
		 * for(순차적으로 접근한 값을 담을 변수 선언 : 순차적으로 접근할 배열/컬렉션) {
		 *	//반복적으로 실행할 내용.
		 * }
		 * 
		 */

		int [] arr2 = {10,20,30,40};
		
		for( int num : arr2 ) {	
			//arr2라는 배열은 0부터 순차적으로 접근하면서 int num이라는 변수에 arr2의 각 인덱스의 값을 저장함.
			
			//실행할 코드
			System.out.println("num ? " + num);
			// 첫번째실행 -> num = arr2[0]
			// 두번째실행 -> num = arr2[1]
			//세번째 실행 -> num = arr2[2]
			// 네번째실행 -> num = arr2[3]
			
		}
		
		Phone [] phones = new Phone[3];
		phones[0] = new Phone("아이폰","13Pro","애플",1_900_000);
		phones[1] = new Phone("갤럭시s", "10", "삼성", 900_000);
		phones[2] = new Phone("아이폰", "11Pro", "애플", 1_400_000);
		
		int sum = 0;
		// Phone : phone[]
		for( Phone phone : phones ) {
			System.out.println(phone.info());
			sum += phone.getPrice();
		}
		System.out.printf("\n총 가격 : %d원",sum);
		System.out.printf("\n평균 가격 : %d원", (sum / phones.length));
		
		//구매하고자 하는 폰 :
		//구매하고자 하는 폰이 있으면, 가격 : XXX원
		
		System.out.println("\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매하고자 하는 폰 : ");
		String searchPhone = sc.nextLine();
		
		boolean isFind = false;
		for( Phone phone : phones ) {
			if(phone.getName().equals(searchPhone)) {
				isFind = true;
				System.out.println("가격 : "+phone.getPrice()+"원");
				break;
			}
		}
		if(!isFind) {
			System.out.println("구매하고자 하는 폰이 없습니다.");
		}
		sc.close();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
