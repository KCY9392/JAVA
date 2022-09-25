package com.kh.chap02_abstractAndInterface.part01_interface.run;

import com.kh.chap02_abstractAndInterface.part01_interface.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.part01_interface.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.part01_interface.model.vo.Mother;
import com.kh.chap02_abstractAndInterface.part01_interface.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		//인터페이스 적용 전
		Person p;
		
		Person mom = new Mother("정엄마","50",70,"출산");
		Person baby = new Baby("김애기","8",60);
		
//		System.out.println(mom);
//		System.out.println(baby.toString());
		
//		mom.eat();
//		mom.sleep();
//		baby.eat();
//		baby.sleep();
		
//		System.out.println("===== 자고난 다음날 =====");
		
//		System.out.println(mom);
//		System.out.println(baby.toString());
		
		/*
		 * 추상클래스와 인터페이스는 변수만 사용할 수 있고, 객체 생성이 되진않는다.
		 * Person p = new Person(); 
		 * Basic b = new Basic();
		 */
		
		//인터페이스 적용 후
		Basic b = new Mother("정엄마","50",70,"출산완료");
		Basic b2 = new Baby("김애기","10",80);
		
		System.out.println(b);
		System.out.println(b2);
		
		b.eat();
		b.sleep();
		b2.eat();
		b2.sleep();
		
		System.out.println("===== 자고난 다음날 =====");
		
		System.out.println(b);
		System.out.println(b2);
		
		/*
		 * 클래스에서 클래스 상속받을 때 : extends 클래스(단일상속만 가능) : 화살표 실선
		 * 클래스에서 인터페이스 구현할 때 : implements 인터페이스, 인터페이스(다중상속가능) : 화살표 점선
		 * 인터페이스간 상속받을 때 : extends 인터페이스, 인터페이스(다중상속가능) : 화살표 실선
		 * 
		 * 			  | 추상클래스 				| 인터페이스
		 * ==============================================================
		 * 상속개수 	  | 단일상속					| 다중상속
		 * --------------------------------------------------------------
		 * 키워드 	  | extends					| implements
		 * --------------------------------------------------------------
		 * 추상메소드	  | 추상메소드 0개 이상			| 모든 메소드가 추상메소드
		 * --------------------------------------------------------------
		 * 표현법/개수   | 명시적 abstract 기술		| abstract 생략가능
		 * --------------------------------------------------------------
		 * 일반메소드여부 | O						| X
		 * --------------------------------------------------------------
		 * 필드		  | 일반 필드 가질 수 있음		| 상수필드만 가질 수 있음
		 * --------------------------------------------------------------
		 * 
		 * 
		 * extends 일반 클래스 -> extends 추상클래스 -> implements 인터페이스
		 * --------------------------------------------------->>>>>>>
		 * 					갈수록 강제성이 더 짙어진다.			
		 */
		
		
		
		
		
		
		
		
		
		
	}

}
