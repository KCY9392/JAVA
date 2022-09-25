package com.kh.chap04_properties.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Run2 {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		System.out.println(prop); //{} -> 값이 비어있음.
		
		try {
			prop.load(new FileInputStream("test.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(prop);
		//{Set=HashSet, List=ArrayList, Map=Properties}
		// 파일의 내용을 읽어들임. (FileInputStream이용)
		
		
		/*
		 * .properties 사용하는 경우는
		 * 해당 프로그램이 기본적으로 가져야 할 정보들을 .properties 확장자 문서로 저장해두면
		 * key value 모두 문자열이기 때문에 개발자가 아닌 일반 관리자가 해당 문서를 다루기 쉽다.
		 * => jdbc 가서 사용할 예정
		 * 
		 * .xml 사용하는 경우는
		 * .xml 확장자 문서는 다양한 프로그래밍 언어간에 호환성이 쉽기 때문이다.
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
