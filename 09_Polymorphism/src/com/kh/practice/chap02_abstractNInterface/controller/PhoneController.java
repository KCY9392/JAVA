package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNInterface.model.vo.Phone;
import com.kh.practice.chap02_abstractNInterface.model.vo.V40;

public class PhoneController {

	private String[] result = new String [2];
	
	public String[] method() {
		Phone[] p = new Phone [2];
		
		p[0] = new GalaxyNote9();
		p[1] = new V40();
		
		for( Phone pArr : p) {
			if( pArr instanceof GalaxyNote9) {
				result[0] = ((GalaxyNote9) pArr).printInformation();
			}else {
				result[1] = ((V40)pArr).printInformation();
			}
		}
		return result;
	}
}
