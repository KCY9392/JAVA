package com.kh.chap05_constructor.model.vo;

public class User {
	
	//필드부.
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	

	
	/*
	 * 생성자
	 * [표현법]
	 * public 클래스명(매개변수 => 생략가능) {
	 * 	//해당 생성자를 통해서 객체 생성시 실행하고자 하는 코드.
	 * }
	 * 
	 * 생성자를 작성하는 목적
	 * 1. 객체를 생성해주기 위한 목적
	 * 2. 객체 생성뿐만 아니라 매개변수로 전달된 값을 곧바로 필드에 초기화할 목적.
	 * 
	 * 생성자 작성시 주의사항
	 * 1. 반드시 "클래스명"과 동일해야함(대/소문자 구분)
	 * 2. 반환형이 존재하지 않는다(메소드와 유사하게 생겨서 헷갈릴수 있음)
	 * 3. 여러개 생성이 가능하지만, "매개변수가 중복되면 안된다."
	 * 4. 매개변수 생성자를 명시적으로 작성하게 되면 기본생성자를 jvm이 자동으로 만들어주지 않는다.
	 * (매개변수 생성자를 명시적으로 작성하지 않았던 지금까지의 실습들은 jvm이 자동으로 기본생성자를 만들어줬다)
	 * 즉, 어찌됐던간에 기본생성자는 작성하는 습관을 들이자!
	 * 
	 * 
	 */
	
	public User() {
		//기본생성자(매개변수가 없는 생성자)
		//단지 객체 생성(공간을 확보)만을 목적으로 할때 사용한다.
		//기본생성자 생략하는 경우 => 오류나지 않음.
		//jvm이 자동으로 만들어 줬기때문에, 항상 객체 생성이 가능했던것.
		
		//단, 매개변수가 있는 생성자가 작성되어있는 경우, 
		//	 기본생성자는 반드시 기술해줘야한다.
		//(jvm이 자동으로 생성해주지 않는다.)
		//기본생성자를 작성하는 습관을 들이자!!~~
		
		//System.out.println("Hello"); 
		// -> 실행됨.
	}
	
	
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		//기본생성자 생성과 동시에 초기화하는 방법.
		//this는 현재 객체의 주소값
	}
	
	
//	public User(String userId, String userPwd, String userName) {
//		//매개변수가 중복되었기 때문에 오류
//	}
	
	//필드부에 선언한 변수들 다 매개변수로 한 생성자
	public User(String userId, String userPwd, String userName, int age, char gender) {
//		this.userId = userId;
//		this.userPwd = userPwd;
//		this.userName = userName;
		
		this(userId, userPwd, userName); 
		//위에처럼 중복되는 동일한 초기화하는 내용이 있는 경우,
		//"this생성자" 호출가능.
		//같은 클래스내에 있는 다른 생성자를 호출하는 구문.
		//단, 반드시 생성자 내부 첫줄에 기술해야함.
		
		
		this.age = age;
		this.gender = gender;
	}
	
	
	public String info() { // 정보 출력 위한 메소드
		return userId+" "+userPwd+" "+userName+" "+age+" "+gender;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
