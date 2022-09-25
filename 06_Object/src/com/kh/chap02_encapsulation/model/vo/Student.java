package com.kh.chap02_encapsulation.model.vo;

public class Student {
	/*
	 * 7. 캡슐화 과정을 통해 완벽한 클래스의 형태를 갖추게 하자.
	 * 캡슐화란 ? 추상화를 통해 정의된 속성들과 기능들을 하나로 묶어 관리하는 기법 중 하나로,
	 * 클래스에서의 가장 중요한 목적인 "데이터의 접근권한"을 원칙으로
	 * 외부로부터 "데이터의 접근을 막고"
	 * 대신에 "데이터를 간접적으로나마 처리(값을 대입, 값을 반환)"할 메소드를 클래스내부에 작성해서 관리하는 방식
	 * 
	 * 캡슐화를 하지 않으면 ? 
	 * 외부로부터 직접접근이 가능하기때문에 함부로 값이 변질되거나 조회를 막지 못하는 문제 발생.
	 * 
	 * 1) 정보 은닉 : private
	 * 		- 필드들을 외부로부터 직접 접근을 막기위해
	 * 		  public 대신에 private 접근제한자를 사용
	 * 		예) 학생들이 본인의 성적을 함부로 바꿀 수 없게, 다른학생의 성적이 함부로 조회되지 않도록.
	 * 
	 * 2) setter / getter 메소드
	 * 		간접적으로나마 접근해서 값을 담거나(변경하거나) 
	 * 		그 값을 가져올 수 있는 메소드가 
	 * 		setter / getter 메소드이다.
	 * 		예) 선생님은 학생의 성적을 기록(setter)하거나, 조회(getter)할 수 있는 권한이 있다.
	 */
	
	
	/*
	 * [필드부]
	 * 필드 == 멤버변수 == 인스턴스변수
	 * 
	 */
	//[표현법] 접근제어자 [예약어 -> 생략가능] 자료형 필드명;
	private String name;
	private int age;
	private double height;
	

	//메소드부.
	/*
	 * 각 기능을 구현하는 부분
	 * 
	 * [표현법]
	 * 접근제어자 반환형 메소드명(매개변수 => 생략가능함.){
	 * 		//기능 구현
	 * }
	 */
	
	
	//setter 메소드
	
	//이 메소드에 접근 가능하도록 public 접근 제한자를 사용한다.
	//이름 값을 기록 및 수정할 수 있는 기능의 메소드(객체의 name필드값에 대입하는 용도)
	public void setName(String name) {//접근제한자 반환형 메소드명(자료형 매개변수)
		//매개변수 : 해당 이 메소드 호출 시, 전달되는 값을 받아주기 위한 변수 선언문(이 메소드에서만 사용가능함)
		//만약 필드명과 매개변수명이 동일하다면, 
		//메소드{}내에 해당변수명 제시 시, 해당영역에서 만들어진 변수가 우선순위가 높다. 뒤의 name이 더높다는 말.
		//따라서 두값을 구분하려면, this라는 키워드를 사용해야한다.
		this.name = name;// this.에는 해당 객체의 주소값이 담겨있다!
	}
	
	//나이값을 기록 및 수정할 수 있는 기능의 메소드(set메소드)
	public void setAge(int age) {
		this.age = age;
	}
	
	//키 값을 기록 및 수정할 수 있는 기능의 메소드(set메소드)
	public void setHeight(double height) {
		this.height = height;
	}
	//private는 같은 클래스안에서만 접근가능하다.
	
	
	
	//getter 메소드
	//데이터를 반환해주는 기능의 메소드.
	
	public String getName() {
		return name;	//return 결과값; -> 결과값을 돌려주겠다.
		//return은 결과값을 반환한 후 메소드를 종료시킨다.
	}
	
	public int getAge() {
		return age;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void method1() {
		
		return; // void: 반환형이 없기때문에 return뒤에 아무것도 안적어도 에러X
	}
	
	//모든 필드값을 하나의 문자열로 합쳐서 돌려주는 용도의 메소드.
	public String info() {
		return name + "님의 나이는" + age + "살이고, 키는 " + height + "cm 입니다.";
	}
	
}
