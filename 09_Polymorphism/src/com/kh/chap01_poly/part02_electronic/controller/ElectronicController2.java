package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;

// 다형성을 적용시킨경우.
public class ElectronicController2 {

	private Electronic [] elec = new Electronic [3];
	
	
	// desktop, notebook, tablet 납부
	private int count = 0;
	public void insert(Electronic any) {
		elec[count] = any;
		count++;
	}
	
	// 상품 조회
//	public Electronic select(int index) {
//		return elec[index];
//	}
	
	public Electronic[] select() {
		return elec;
	}
	
}
