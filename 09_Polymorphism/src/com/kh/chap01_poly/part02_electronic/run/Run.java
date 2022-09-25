package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicController1;
import com.kh.chap01_poly.part02_electronic.controller.ElectronicController2;
import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class Run {

	public static void main(String[] args) {
		
		// 1. 다형성 적용 전 (ElectronicController1)
		ElectronicController1 ec = new ElectronicController1();
		
		// 가게에 전자제품을 납부.
		ec.insert(new Desktop("삼성","데탑",1200000,"Geforce 1070"));
		ec.insert(new NoteBook("엘지","그램",2000000,4));
		ec.insert(new Tablet("애플","아이패드",500000,true));
		
		// 가게에 있는 상품들을 조회하는 메소드
//		System.out.println(ec.selectDesktop());
//		System.out.println(ec.selectNoteBook());
//		System.out.println(ec.selectTablet());
		
		
		// 2. 다형성 적용 후 (ElectronicController2)
		ElectronicController2 ec2 = new ElectronicController2();
		
		//가게에 전자제품을 납부
		ec2.insert(new Desktop("삼성","데탑",1200000,"Geforce 1070"));
		ec2.insert(new NoteBook("엘지","그램",2000000,4));
		ec2.insert(new Tablet("애플","아이패드",500000,true));
		
		// 가게의 상품들 조회
//		System.out.println(ec2.select(0));
//		System.out.println(ec2.select(1));
//		System.out.println(ec2.select(2));
		
		Electronic [] arr = ec2.select();//부모객체하나로
		
		for(int i=0; i< arr.length; i++) {
			System.out.println(arr[i]); //자식들 다 받아줄 수 있다.
		}
		
		/*
		 * 다형성을 사용하는 이유
		 * 1. 부모타입의 객체배열로 자식들을 받아줄 수 있다.
		 * => 부모타입 하나만으로 다양한 자식객체들 커버 가능하다.
		 * 
		 * 2. 메소드의 매개변수나 반환형에 다형성을 적용하게되면, 메소드 갯수가 확 줄어든다.
		 * => ElectronicController1 과 ElectronicController2의 차이 를 보면된다.
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
