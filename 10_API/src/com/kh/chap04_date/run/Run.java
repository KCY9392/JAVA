package com.kh.chap04_date.run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * java.util.Date 클래스
		 *  - 날짜와 시간에 대한 정보를 담을 수 있는 클래스.
		 *  - 자바 개발 초창기에 급하게 만든 완성도가 높지 않은 클래스(다국적으로 쓰기도 적합하지 않다.)
		 *  
		 */
		// 사용은 할 수 있지만, 자바에서도 사용을 권장하지 않는다.
		
		
		// 기본생성자를 통해 Date객체를 생성 -> 현재 날짜 및 시간을 가지고 온다.
		Date today = new Date();
		System.out.println("기본생성자 : "+today);
	
		
		// 내가 원하는 날짜
		// 방법 1. 매개변수 생성자를 통해 변경
		// Date date1 = new Date(2022, 7, 18) // Deprecated : 권장하지 않음.
		// 년도 -> 내가 전달한 년도 + 1900로 출력됨.
		
		Date date1 = new Date(2022 - 1900, 7 - 1, 18);
		System.out.println(date1);
		
		
		
		// 내 입맛대로 출력 형식을 지정하는 방법.
		// java.text.SimpleDateFormat
		
		// 1. 형식을 지정하면서, SimpleDateFormat 객체 생성.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy. MM. dd");
													//Google에 y나 M같은 패턴을 사용한다.
		//몇시 몇분 몇초 format 찾아보기 
		
		// 2. sdf 객체에서 제공하는 format 메소드 호출 시, Date객체로 매개변수 전달. -> 포멧에 지정된 String으로 변환됨.
		String formatDate = sdf.format(date1);
		System.out.println(formatDate); //2022. 08. 09
		
		//2022/08/09로 substring으로 바꿀수있다.
		String newDate = formatDate.substring(0,4)+"/"+formatDate.substring(6,8)+"/"+formatDate.substring(10);
		System.out.println(newDate);
		
	}

}
