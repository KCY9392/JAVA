package com.kh.chap02_abstractAndInterface.run;

import com.kh.chap02_abstractAndInterface.model.vo.BasketBall;
import com.kh.chap02_abstractAndInterface.model.vo.FootBall;
import com.kh.chap02_abstractAndInterface.model.vo.Sports;

public class Run {

	public static void main(String[] args) {
		Sports[] s = new Sports[2];
		
		s[0] = new BasketBall();
		s[1] = new FootBall();
		
		for( Sports sport : s ) {
			//sport.rule();
		}
		
		//	Sports s2 = new Sports();
		// 추상클래스로 절대 객체 생성 불가.
		// 왜냐하면 미완성된 클래스이기 때문이다.
		
		Sports s3; // 단, 객체생성만 불가능하고, 레퍼런스 변수(주소값 저장)로는 사용이 가능하다.
		
		/*
		 * 추상 클래스
		 *  - 미완성된 클래스 abstract class
		 *  - 객체 생성 불가 ( 단, 레퍼런스 변수로는 선언가능. )
		 *  - 추상메소드가 존재하는 순간, 반드시 추상클래스로 정의
		 *    (일반필드 + 일반메소드 + [추상메소드(생략가능)])
		 *    하지만 추상 메소드가 없어도 추상클래스로 만들수도 있긴 함.
		 * 	  언제? => 클래스가 아직 구체적이지 않은 덜 구현된 상태인 것 같을 때(개념적)
		 *  	 => 현재 이 클래스를 객체 생성이 불가능하게끔 하고자 할 때(기술적) - 잘 사용하지 않음.
		 *  
		 *   - 다형성 적용 가능
		 *   
		 *   추상 메소드
		 *   - 미완성된 메소드로 몸통부가 {}가 구형되어있지 않은 메소드를 뜻한다.
		 *   - 자식클래스에서 오버라이딩을 통해 완성된다.(강제로 무조건 오버라이딩해야한다.)
		 *   	
		 *   추상 메소드 사용하는 이유
		 *   	! => 오버라이딩 하지 않을 경우, 에러발생
		 *   	! => 메소드 사용의 통일성 확보 목적.
		 *   	! => 표준화된 틀을 제공할 목적.
		 *   
		 */
	}

}
