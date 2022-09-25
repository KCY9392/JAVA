package com.kh.practice.controller;

import com.kh.practice.model.vo.Circle;

public class CircleController {
	
	private Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		c = new Circle(x,y,radius);
		return "면적 : "+ c.toString()+" / "+(Math.PI * (radius * radius));
	}
	
	public String calcCircum(int x, int y, int radius) {
		c = new Circle(x,y,radius);
		return "둘레 : "+ c.toString()+" / "+(Math.PI * (radius * 2));
	}
}
