package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

//다형성 적용 전 컨트롤러
public class ElectronicController1 {
	
	//용산전자상가에 새로 오픈한 가게.
	private Desktop desk;
	private NoteBook note;
	private Tablet tab;
	
	
	//가게에 전자제품 납부하게 저장하는 메소드
	public void insert(Desktop d) {//저장하기위한 용도
		desk = d; //desk에는 매개변수 d가 저장된다.
	}
	
	public void insert(NoteBook n) {
		note = n;
	}
	
	public void insert(Tablet t) {
		tab = t;
	}
	
	//상품 조회하게하는 메소드
	public Desktop selectDesktop() {
		return desk;
	}
	
	public NoteBook selectNoteBook() {
		return note;
	}
	
	public Tablet selectTablet() {
		return tab;
	}
	
}
