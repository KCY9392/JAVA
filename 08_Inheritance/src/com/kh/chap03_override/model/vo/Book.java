package com.kh.chap03_override.model.vo;

public class Book /*extends Object*/{
	
	private String title;
	private String author;
	private int price;
	
	public Book() {}
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	/*
	 * 오버라이딩
	 * 
	 * 	- 상속받고 있는 부모클래스의 메소드를 자식클래스에서 재정의하는 것.
	 * 	- 부모가 제공하고 있는 메소드를 자식이 메소드 내용을 일부 고쳐서 사용하겠다는 의미(자식메소드가 우선권을 지닌다.)
	 * 	
	 * 
	 * 오버라이딩 성립 조건
	 * 
	 * 	- 부모메소드의 메소드명과 동일.
	 * 	- 매개변수 자료형, 갯수, 순서가 동일(매개변수명과는 무관함.)
	 * 	- 반환형 동일.
	 * 	- 부모메소드의 접근제한자 보다 같거나 공유 범위가 커야한다.
	 * 	ex) 부모메소드의 접근제한자가 protected라고 한다면, 자식은 public , protected여야한다.
	 * 	=> 규약의 개념이 들어가있음(재정의하려면 요정도 규칙은 지켜야 한다는 것.)
	 * 
	 * 
	 * @Override 어노테이션
	 * 
	 * 	- 생략가능 ( 명시를 안해도 부모메소드와 형태가 같으면 오버라이딩이 된것이다. )
	 * 	- 어노테이션을 붙이는 이유 ?
	 * 		> 잘못 기술했을 경우, "오류를 알려주기 때문에" 다시 한번 "검토할 수 있게 유도"한다.
	 * 		> 혹시라도 "부모메소드가 후에 수정되었을때" 오류로 알려주기 때문에 검토할 수 있게끔 유도한다. -> 부모클래스가 수정될 경우는 거의 없음.
	 * 		> 이 메소드가 "오버라이딩 된 메소드라는 걸 알리기 위한 목적으로도 사용"된다.
	 */
	
	//Overrides : toString() in Object
	//Returns : a string representation of the object.
	//toString은 Object클래스안에 속한 메소드로, toString이 아닌 tostring로 쓸수는 없다.
	
	@Override
	public String toString() {
		return "title : "+ title +" author : "+ author + " price : "+ price;
	}
}
