package com.kh.chap04_Field.run;

//import com.kh.chap04_Field.model.vo.FieldTest1;
//import com.kh.chap04_Field.model.vo.FieldTest2;
import com.kh.chap04_Field.model.vo.FieldTest3;

public class Run {

	public static void main(String[] args) {
//		FieldTest1 ft1 = new FieldTest1();
//		ft1.method1(1);
		
//		FieldTest2 ft2 = new FieldTest2();
		
		//public 접근제한자
//		System.out.println(ft2.pub);
		 
		//protected 접근제한자는 같은 패키지에서만 가능.(상속구조일땐 가능)
//		System.out.println(ft2.pro);
		
		//default 접근제한자는 같은 패키지에서만 가능.
		//ft2.def;
		
		//private -> 같은 클래스에서만 접근가능(캡슐화)
		//ft2.pri;
		
		
//		FieldTest3 ft3 = new FieldTest3();
		
		System.out.println(FieldTest3.str);
		//-> 어느 클래스에 있는 지 클래스명은 적어줘야함.
		
		FieldTest3.method1();
		
		System.out.println(FieldTest3.NUM);
		
		FieldTest3.str = "스태틱 값 변경후 ";
		System.out.println(FieldTest3.str);
		
		//FieldTest3.NUM = 12;
		// 에러남, static변수는 변경 불가!
		
	}

}
