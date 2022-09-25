package com.kh.chap02_abstractAndInterface.part01_interface.model.vo;

public class Baby extends Person implements Basic{

	public Baby() {}
	
	public Baby(String name, String weight, int height) {
		super(name,weight,height);
	}
	
	@Override
	public String toString() {
		return "Baby ["+super.toString()+"]";
	}
	
	@Override
	public void eat() {
		super.setWeight(super.getWeight()+" 500g 증가");
		
		super.setHealth(super.getHealth()+5);
	}
	
	@Override
	public void sleep() {
		super.setHealth(super.getHealth()+10);
	}
}
