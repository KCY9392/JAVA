package com.kh.chap01_beforeVsafter.after.model.vo;

			//후손 			 조상
			//자손		 	 부모
			//하위			 상위
public class Desktop extends Product{
	
	private boolean allInOne;

	public Desktop() {}//기본생성자
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {//매개변수있는 생성자
		//받아온 매개변수값을 가지고 부모클래스인 Product에 있는 필드를 초기화해야함.
		
		//1. 부모필드에 직접 접근하여 값을 초기화(잘 쓰지않음)
//		super.brand = brand;
//		super.pCode = pCode;
//		super.pName = pName;
//		super.price = price;
		
		
		//2. 부모클래스의 setter메소드 사용. -> 캡슐화되어있는 메소드(private)를 사용하려면 setter메소드 사용!
//		super.setBrand(brand);
//		super.setpCode(pCode);
//		super.setpName(pName);
//		super.setPrice(price);
		
		
		//3. 부모생성자를 호출.(단, 반드시 첫줄에 작성할 것)
		super(brand,pCode,pName,price);
		
		this.allInOne = allInOne;
		
	}
	
	
	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	//오버라이딩 : 부모클래스의 메소드를 내 입맛대로 바꾸는 것. (재정의한다는 의미)
	public String information() {
		
		//return super.getBrand() + " " + super.getpCode + " " .... get메소드 활용도 가능하다.
		return super.information()+" "+allInOne;
	}
	
	
}
