package com.kh.lamda;

public class Product {
	
	private String pName;
	private int price;
	private int stock;
	
	public Product() {
		
	}

	public Product(String pName, int price, int stock) {
		super();
		this.pName = pName;
		this.price = price;
		this.stock = stock;
		
		
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

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
