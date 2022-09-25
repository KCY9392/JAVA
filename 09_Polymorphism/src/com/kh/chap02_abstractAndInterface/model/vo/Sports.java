package com.kh.chap02_abstractAndInterface.model.vo;

public abstract class Sports { //abstract 키워드를 사용하면, 추상 클래스가 된다.
	
	
	private int people;
	
	public Sports() {}
	
	public Sports(int people) {
		this.people = people;
	}
	
	public void setPeople(int people) {
		this.people = people;
	}
	
	public int getPeople() {
		return people;
	}
	
	@Override
	public String toString() {
		return "people : "+people;
	}
	
	public abstract void rule();
	/*
	 * 추상화 메소드란 ? == 몸통부({})가 존재하지 않는 미완성된 메소드
	 * 몸통부가 없는 미완성 메소드(추상메소드)를 정의 하고자 하면, abstract 예약어를 사용해야한다.
	 * 
	 * 미완성 메소드(추상메소드)가 하나라도 포함되는 순간, 해당 클래스는 미완성 클래스(추상클래스)가 되어버린다.
	 * 클래스 명 앞의 예약어에 abstract를 꼭 적어줘야한다.
	 */
}
