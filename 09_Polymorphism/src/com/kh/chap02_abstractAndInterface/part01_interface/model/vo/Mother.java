package com.kh.chap02_abstractAndInterface.part01_interface.model.vo;

public class Mother extends Person implements Basic{

	private String babyBirth;
	
	public Mother() {}
	
	public Mother(String name, String weight, int height, String babyBirth) {
		super(name,weight,height);
		this.babyBirth = babyBirth;
	}

	public String getBabyBirth() {
		return babyBirth;
	}

	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}

	@Override
	public String toString() {
		return "Mother ["+super.toString()+ ", babyBirth=" + babyBirth + "]";
	}
	
	@Override
	public void eat() {
		//엄마가 밥을 먹으면 ?
		super.setWeight(super.getWeight()+" 1키로 증가"); //몸무게 증가
		
		super.setHealth(super.getHealth()+10); //건강증가
	}
	
	@Override
	public void sleep() {
		super.setHealth(super.getHealth()+20); // 잠을 자면 건강증가.
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
