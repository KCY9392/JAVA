package com.kh.chap01_oneVsMany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsMany.model.vo.Book;

public class ObjectRun {

	public static void main(String[] args) {
//		
//		//1. 기본생성자로 객체 생성한 후, setter 메소드로 각 필드에 값을 전달해서 대입
//		Book bk1 = new Book();
//		
//		bk1.setTitle("자바의 정석");
//		bk1.setAuthor("김채영");
//		bk1.setPrice(50000);
//		bk1.setPublisher("kh정보교육원");
//		
//		System.out.println(bk1.info());
//		
//		//2. 매개변수 생성자로 객체 생성과 동시에 각 필드에 값 대입
//		Book bk2 = new Book("C언어", "이상엽", 70000,"kh정보교육원");
//		System.out.println(bk2.info());
//		
//		
//		//3. 사용자가 입력한 값들로 객체 생성.
//		//Book bk3 = new Book()
//		
//	    Scanner sc = new Scanner(System.in);
//	    System.out.print("책 제목 : ");
//	    String title = sc.nextLine();
//	    
//	    System.out.print("책 저자 : ");
//	    String author = sc.nextLine();
//	    
//	    System.out.print("책 가격 : ");
//	    int price = sc.nextInt();
//	    
//	    sc.nextLine();
//	    
//	    System.out.print("출판사 : ");
//	    String publisher = sc.nextLine();
//	    
//	    Book bk3 = new Book(title,author,price,publisher);
//	    System.out.println(bk3.info());
	    
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.print("책 제목 : ");
			String title = sc.nextLine();

			System.out.print("책 저자 : ");
			String author = sc.nextLine();

			System.out.print("책 가격 : ");
			int price = sc.nextInt();

			sc.nextLine();

			System.out.print("출판사 : ");
			String publisher = sc.nextLine();

			if (i == 0) {
				bk1 = new Book(title, author, price, publisher);
			} else if (i == 1) {
				bk2 = new Book(title, author, price, publisher);
			} else {
				bk3 = new Book(title, author, price, publisher);
			}
		}
		 System.out.println(bk1.info());
		 System.out.println(bk2.info());
		 System.out.println(bk3.info());
		 sc.close();
	}
}
