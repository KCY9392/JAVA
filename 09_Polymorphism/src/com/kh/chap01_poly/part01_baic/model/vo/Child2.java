package com.kh.chap01_poly.part01_baic.model.vo;

public class Child2 extends Parent{

	private int n;
	
	public Child2() {
		//super(); 자식 기본생성자에 부모생성자를 호출하는 메소드가 자동으로 jvm이 호출한다.
	}
	
	public Child2(int x, int y, int n) {
		super(x,y);
		this.n = n;
	}
	
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public void printChild2() {
		System.out.println("Child2 클래스");
	}
	
	@Override
	public void print() {
		System.out.println("자식2임.");
	}
}
