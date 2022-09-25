package com.kh.chap02_abstractAndInterface.model.vo;

public class FootBall extends Sports{

	
//	@Override
//	public void rule() {
//		System.out.println("발로 공을 차서 골대에 넣어야한다.");
//	}
	// 작성하지않으면
	//The type FootBall must implement the inherited abstract method Sports.rule()
	//라고 에러가 난다.
	//무조건 추상메소드를 재정의 해줘야한다.
	
	@Override
	public void rule() {
		System.out.println("발로 공을 차서 골대에 넣어야한다.");
	}
	
}
