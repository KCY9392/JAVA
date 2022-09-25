package com.kh.chap01_poly.part01_baic.model.vo;

public class Child1 extends Parent{

	private int z;
	
	public Child1() {
		//super(); 자식 기본생성자에 부모생성자를 호출하는 메소드가 자동으로 jvm이 호출한다.
		
	}
	
	public Child1(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public void printChild1() {
		System.out.println("Child1 클래스");
	}
	
	@Override
	public void print() {
		System.out.println("자식1임.");
	}
	
}
