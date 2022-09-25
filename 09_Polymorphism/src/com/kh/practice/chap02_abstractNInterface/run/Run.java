package com.kh.practice.chap02_abstractNInterface.run;

import com.kh.practice.chap02_abstractNInterface.controller.PhoneController;

public class Run {

	public static void main(String[] args) {
		
		PhoneController pc = new PhoneController();
		
		String [] sArr = pc.method();
		
		for(String s : sArr) {
			System.out.println(s);
		}		
	}
}
