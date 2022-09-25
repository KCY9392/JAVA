package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
	
		//매개변수 3개
		Book bk1 = new Book("어린왕자","kcy출판사","홍길동");
		
		bk1.inform();
		
		System.out.println();
		
		//매개변수 5개
		Book bk2 = new Book("어린왕자","kcy출판사","홍길동",10000,10.5);
		
		bk2.inform();
	}

}
