package com.kh.chap01_oneVsMany.model.vo;

public class Book {
	//도서명, 저자명, 가격, 출판사
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	// 기본생성자 
	
	public Book() {}
	
	// 매개변수 생성자
	
	public Book(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	
	
	// 각 필드에 대한 setter/getter 메소드
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublisher() {
		return publisher;
	}
	
	
	// 모든 필드를 하나의 문자열로 합치는 info메소드
	
	public String info() {
		return title +" "+ author + " " +price+ " " +publisher;
		//System.out.println("책의 제목은 "+title+"이고, 책의 저자는 "+author+"이고, 책의 가격은 "+price+"원 이고, 책의 출판사는 "+publisher+"이다.");
	}
	
}
