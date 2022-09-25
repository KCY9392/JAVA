package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class ChacracterController {

	public ChacracterController() {}
	
	public int countAlpha(String s) throws CharCheckException{
		
			char [] cArr = s.toLowerCase().toCharArray();
			
			int count = 0;
			for(int i=0; i<cArr.length; i++) {
				if(cArr[i]==' ') {
					throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
				}
				if (cArr[i] >= 'a' && cArr[i] <= 'z' /* || cArr[i] >= 97 && cArr[i] <= 122 */) {
					count ++;
				}
			}
		return count;
	}
}
