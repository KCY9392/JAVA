package com.kh.chap01_beforeVsafter.after.model.vo;

public class Product {
	
	/*
	 * 세 클래스 모두 공통적으로 기술했던 요소들만 추출해서 단 한번 정의해둔 클래스 : "부모"클래스.
	 */

	private String brand;
	private String pCode;
	private String pName;
	private int price;
	
	public Product() {}//기본생성자
	
	public Product(String brand, String pCode, String pName, int price) {//매개변수있는 생성자
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}//Desktop에 생성자안에 super();로 이 부모클래스(Product)의 생성자를 호출함.
	
	//우클릭 + source + generate Getters and Setters 클릭 후, 필드 선택하고, generate 누르면, 자동으로 get/set메소드 자동완성해줌.
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getpCode() {
		return pCode;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public String information() {
		return brand+" "+pCode+" "+pName+" "+price;
	}
	
}
