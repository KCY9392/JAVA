package com.kh.chap04_properties.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_map.model.vo.Snack;

public class Run1 {

	public static void main(String[] args) {
		// Properties : Map계열 => key와 value 로 저장된다.
		//		단, Properties만의 특징이라고 한다면 key,value 모두 String으로 제한되어있다.
		
		Properties prop = new Properties();
		
//		prop.put("씬다이제", new Snack("초코맛",1500));
//		System.out.println(prop);
//		//{씬다이제=Snack [flavor=초코맛, calory=1500]}
//		//잘 저장되어있음.
//		
//		System.out.println(prop.get("씬다이제"));
		//Snack [flavor=초코맛, calory=1500] 
		// "씬다이제"의 value값도 잘 출력된다.
		
		// 주로 Properties를 사용하는 경우는 Properties 에 담겨있는 key + value 세트들을 파일로 기록.(storexxx 메소드)
		// 파일에 기록되어있는 key + value를 가져올때 (loadxxx메소드)가 사용된다.
		
//		try {
//			prop.store(new FileOutputStream("test.properties"), "테스트");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		// java.lang.ClassCastException 형변환오류
		// Snack클래스는 String으로 형변환할 수 없어라는 오류.
		
		//실제로 저장할 때는 String으로 안써도 문제가 안되나, 
		//실제 파일로 저장할 때 String으로 안쓰면 문제가 발생한다.
		
		// 그래서 properties에 값을 추가할때는 보통 어떻게하나??
		// 1. setProperty(String key, String value)
		
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop);
		// {set=HashSet, List=ArrayList, Map=Properties}
		// 저장 순서 유지X , key값 중복 X
		
		
		// 2. 값을 가져오는 건 getProperty(String key) 이용.
		// key값으로 value값 출력하기
		System.out.println(prop.getProperty("Url")+"test.txt");//파일을 업로드하거나 다운로드 받는데에 사용된다.
		//HashSet
		
		
		try {
			// 3. store(outputStream os, String comments) : prop에 담긴 key - value값들을 파일로 출력.

			prop.store(new FileOutputStream("test.properties"),"코멘트");
			//test.properties 파일이 생성된다.
			//코멘트 로 한것은 #\uCF54\uBA58\uD2B8 이렇게 저장됨.
			
			prop.storeToXML(new FileOutputStream("test.xml"),"TEST");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
