package com.kh.chap04_assist2.model.vo;

import java.io.Serializable;

public class Phone implements Serializable{
	//Serializable는 직렬화를 바로 해준다.
	
	private String name;
	private int price;
	
	public Phone() {}
	
	public Phone(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + "]";
	}
}
