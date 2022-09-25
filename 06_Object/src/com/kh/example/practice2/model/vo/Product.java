package com.kh.example.practice2.model.vo;

public class Product {

	private String pName;
	private int price;
	private String brand;
	
	
	public Product() {}
	
	//set + pName -> set뒤에 낙타표기법을 해야하는 데 만약 매개변수의 두번째가 대문자라면, set 뒤에 원본으로 적는다. ->  setpName 
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public String getpName() {
		return pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	
	public void information() {
		System.out.println("상품의 이름은  "+pName+"이고,");
		System.out.println("상품의 가격은  "+price+"원 이고,");
		System.out.println("상품의 브랜드는 "+brand+ "이다.");
	}
}
