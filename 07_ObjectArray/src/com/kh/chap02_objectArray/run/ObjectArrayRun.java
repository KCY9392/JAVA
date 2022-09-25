package com.kh.chap02_objectArray.run;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {
		Phone [] arr = new Phone [3];
		
//		System.out.println(arr);
//		System.out.println(arr.length);
//		System.out.println(arr[0]);

		arr[0] = new Phone();
		//System.out.println(arr[0]);
		arr[0].setName("아이폰");
//		System.out.println(arr[0].getName());
		//System.out.println(arr[1].getName());
		//nullException에러
		
		arr[0].setSeries("12Pro");
		arr[0].setBrand("애플");
		arr[0].setPrice(1_500_000);
		arr[1] = new Phone("갤럭시s", "10", "삼성", 900_000);
		arr[2] = new Phone("아이폰", "11Pro", "애플", 1_400_000);
		
		//반복문 돌면서 info()호출해서 console창에 출력.
		//총 가격 : XX원
		//평균 가격 : XX원
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].info());
			sum += arr[i].getPrice();
		}
		System.out.printf("\n총 가격 : %d원",sum);
		System.out.printf("\n평균 가격 : %d원", (sum / arr.length));
		
//		System.out.println(ph1.info());
	}

}

