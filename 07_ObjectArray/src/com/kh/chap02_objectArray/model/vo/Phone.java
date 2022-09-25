package com.kh.chap02_objectArray.model.vo;

public class Phone {
	
	// 이름, 시리즈, 브랜드명, 가격
	private String name;
	private String series;
	private String brand;
	private int price;
	
	// 기본생성자
	public Phone() {}
	
	// 매개변수있는 생성자
	public Phone(String name, String series, String brand, int price) {
		this.name = name;
		this.series = series;
		this.brand = brand;
		this.price = price;
	}
	
	// setter/getter 
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setSeries(String series) {
		this.series = series;
	}
	public String getSeries() {
		return series;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	// info 메소드
	public String info() {
		return name+" " +series+ " " +brand+" " +price+"원";
	}
}
