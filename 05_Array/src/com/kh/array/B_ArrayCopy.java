package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {

	/* 
	 * 배열 복사
	 * 1. 얕은 복사 : 배열의 "주소값"을 공유(복사).
	 * 2. 깊은 복사 : 동일한 새로운 배열을 만들어서 실제 내부값들도 복사.
	 */
	
	//얕은 복사 실습
	public void method1() {
		
		//원본 배열 셋팅
		int [] origin = {1,2,3,4,5};
		
		System.out.println("== 원본배열 출력 ==");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i]+" ");
		}
		
		//얕은 복사
		int [] copy = origin;
		System.out.println("\n== 복사본배열 출력 ==");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
		copy[2] = 99;
		//copy배열만 수정했지만, 원본도 바뀜.
		//copy와 origin배열은 둘 다 주소값을 공유하기때문에,
		//copy가 수정되면, 자동으로 orgin배열도 그 정보를 공유한다.
		//그래서 얕은 복사라고함.
		
		System.out.println("\n== 복사본 배열 수정 후 출력 ==");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i]+" ");
		}
		
		System.out.println("\n== 복사본 배열 수정 후 출력 ==");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
		System.out.println("\n\n원본의 주소값 : "+origin.hashCode());
		System.out.println("복사본 배열의 주소값 : "+copy.hashCode());
		
		//두 배열의 주소값이 동일한 것을 볼 수 있다.
		//즉, 같은 주소값의 위치를 참조하고 있다. = 얕은 복사
		
	}
	
	
	//깊은 복사 4가지 방법
	
	// 1. for문을 활용한 방법.
	public void method2() {
		
		int [] origin = {1,2,3,4,5};
		
		int [] copy = new int [origin.length];//원본배열의 길이만큼 크기로 배열 생성
		//초기화가 안되서 안의 값은 다 0 값이 들어가있다.
		
		/*
		 * copy[0] = origin[0]
		 * copy[1] = origin[1]
		 * ....
		 * copy[n] = origin[n]
 		 */
		
		for(int i=0; i<origin.length; i++) {
			copy[i] = origin[i];
		}
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		copy[2] = 99;
		System.out.println("\n\n== 변경 후 복사본 ==");
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		} //1 2 99 4 5
		
		System.out.println("\n== 변경 후 원본 ==");
		
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		} //1 2 3 4 5
		
		System.out.println("\n\n원본의 주소값 : "+origin.hashCode());
		System.out.println("복사본의 주소값 : "+copy.hashCode());
		//원본 배열과 복사본 배열의 주소값이 다르다.
	}
	
	
	//2. 새로운 배열을 생성한 후, System.arraycopy 메소드 활용.
	public void method3() {
		
		int [] origin = {1,2,3,4,5};
		
		int [] copy = new int [10];
		// 방 크기가 원본과 다르다. 
		
		//System.arraycopy
		//( 원본 배열명(src), 원본배열의 복사를 시작할 인덱스(srcPos), 
		//  복사본 배열명(dest), 복사본 배열의 복사될 시작 인덱스(destPos),
		//  복사할 갯수(length) )
		
		System.arraycopy(origin, 0, copy, 0, 5); // 1 2 3 4 5 0 0 0 0 0
		//0 0 1 2 3 4 5 0 0 0
		
		//System.arraycopy(origin, 0, copy, 10, 5);
		//ArrayIndexOutOfBoundsException
		//범위벗어나서 에러발생!!!
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+ " ");
		}
		
		System.out.println("\n\n원본 주소값 : "+origin.hashCode());
		System.out.println("복사본 주소값 : "+copy.hashCode());
		
		//두 배열의 주소값이 다르다.
		//따라서 복사본배열의 값을 바꿔도 원본배열의 값은 바뀌지 않는다.
	}
	
	/*강사님이 주신 퀴즈
	1번. 0 0 1 2 3 4 5 0 0 0
	System.arraycopy(origin, 0, copy, 2, 5);
	
	2번. 0 1 2 3 0 0 0 0 0 0
	System.arraycopy(origin, 0, copy, 1, 3);
	
	3번. 0 3 4 5 0 0 0 0 0 0
	System.arraycopy(origin, 2, copy, 1, 3);
	*/
	
	
	//3. Arrays 클래스에서 제공하는 copyof라는 메소드를 이용해서 복사를 함.
	public void method4() {
		
		int [] origin = {1,2,3,4,5};
		
		//복사본 배열 =  Arrays.copyOf(원본배열명, 복사할 갯수);
		int [] copy = Arrays.copyOf(origin, 5);
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		
		//int [] copy = Arrays.copyOf(origin, 7);
		//원본배열의 크기보다 "큰 수"로 복사할 갯수를 정하면, 
		//원본배열을 다 복사하고 나머지는 0으로 초기화한다.
		
		//int [] copy = Arrays.copyOf(origin, 3);
		// 1 2 3만 복사, 출력하면 1 2 3
		
		
		/*
		 * 번외
		 * [참고]
		 * 임포트안해도 쓸수있음.java.lang패키지안에 있는 클래스들은 임포트하지않아도 사용 가능!
		 * java.lang.Math
		 * java.lang.System
		 * java.lang.String
		 * -> 자주 사용하기 때문에 java.lang에 넣어둠.
		 * => 눈에 안보이지만, 안에서 자체적으로 import해주고 있기 때문에, 임포트 안해도됨.
		 * 
		 * 
		 * 임포트함.
		 * java.util.Arrays
		 * java.util.Scanner
		 */
		
		/*
		 * 2. System.arraycopy 
		 * : 몇번 인덱스부터 몇개를 어느 위치의 인덱스에 복사할건지 다 지정가능함.
		 * 
		 * 3. Arrays.copyof
		 * : 무조건 원본배열의 0번인덱스부터 내가 제시한 갯수만큼 복사진행됨.
		 *   내가 제시한 길이가 원본배열보다 크다면, 나머지는 0으로 채워서 복사해줌.
		 */
	}
	
	
	//4. clone 메소드를 사용하여 복사.
	public void method5() {
		
		int [] origin = {4,1,3,2,5};
		
		//복사본 배열 = 원본배열.clone();
		int [] copy = origin.clone(); 
		//인덱스 지정할 수 없음.
		//복사할 갯수도 지정할 수 없음.
		
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		
		System.out.println("\n\n원본 주소값 : "+origin.hashCode());
		System.out.println("복사본 주소값 : "+copy.hashCode());
		
		
		
		//번외 1. 정렬하는 방법.
		
		System.out.println("\n== 정렬후 배열 나열 ==");
		
		Arrays.sort(copy);
		//Arrays.sort()
		//배열 정렬하는 법.
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		//번외 2. 배열내용 출력하는 방법.
		
		System.out.println("\n\n== 배열에 담긴 값을 문자열로 보여주기 ==");
		
		//배열에 담긴 값을 "문자열"로 보여주는 메소드
		System.out.println(Arrays.toString(copy));
		//[1, 2, 3, 4, 5] 로 출력됨을 볼 수 있다.
		
		
		
	}
}
