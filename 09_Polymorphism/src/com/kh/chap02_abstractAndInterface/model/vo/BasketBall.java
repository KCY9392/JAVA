package com.kh.chap02_abstractAndInterface.model.vo;

public class BasketBall extends Sports{
	
	@Override
	public void rule() {
		System.out.println("손으로 공을 잡아서 골대에 넣어야한다.");
	}
}
