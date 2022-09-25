package com.kh.practice.controller;

import com.kh.practice.model.vo.Rectangle;

public class RectangleController {
	
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		r = new Rectangle(x,y,height,width);
		return "면적 : "+ r.toString()+" / "+width * height;
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		r = new Rectangle(x,y,height,width);
		return "둘레 : "+ r.toString()+" / "+(2 * (width + height));
	}
}
