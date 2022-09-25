package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;

public class Run {

	public static void main(String[] args) {
		Car c = new Car("자동차",5000.0,"세단",4);
		Ship s = new Ship("배",6000.0,"어선",3);
		Airplane a = new Airplane("비행기",10000.0,"여객기",6,2);
		
		c.howToMove();
		s.howToMove();
		a.howToMove();
		
//		System.out.println(c.information());
//		System.out.println(s.information());
//		System.out.println(a.information());
	}
}
