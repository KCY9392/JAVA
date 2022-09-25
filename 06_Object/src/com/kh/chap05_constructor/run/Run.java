package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class Run {

	public static void main(String[] args) {
		User u = new User(); // 매개변수없는 기본생성자 호출함.
		
		User u2 = new User("김채영","kcy","김채영");
		
//		System.out.println(u2.info());
		
		User u3 = new User("김채영","kcy","김채영",23,'F');
		
		System.out.println(u3.info());

	}

}
