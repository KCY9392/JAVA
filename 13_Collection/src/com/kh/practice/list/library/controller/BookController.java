package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {


	private List<Book> booklist = new ArrayList<Book>();

	public BookController() {
		//ctrl + f 를 누르면 코드의 모든 문자를 검색할 수 있다.
		booklist.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		booklist.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		booklist.add(new Book("대화의 기술", "강보람", "인문", 17500));
		booklist.add(new Book("암 정복기", "박신우", "의료", 21000));
	
	}
	
	public void insertBook(Book bk) {
		booklist.add(bk);
	} 
	
	public ArrayList<Book> selectList() {
		return (ArrayList)booklist;
		
	}
	
	public ArrayList<Book> searchBook(String keyword) {
		ArrayList<Book> searchList = new ArrayList<Book>();
		
		for(int i=0; i<booklist.size(); i++) {
			//Book bk = booklist.get(i);
			//String title = bk.getTitle(); 이것도 가능.
			//if(title.contains(keyword)){
				//searchList.add(bk);
			//}
			if(booklist.get(i).getTitle().contains(keyword)){
				searchList.add(booklist.get(i));
			}
		}
		return searchList;
	}
	
	public Book deleteBook(String title, String author) {
		Book removeBook = null;
		
		// int index = 0;
		// for(Book bk : bookList){
		// if(bk.getTitle().equals(title) && bk.getAuthor().equals(author)){
			// removeBook = bookList.remove(index);
			// }
			// index ++;
		// }
		
		for(int i=0; i<booklist.size(); i++) {
			if(booklist.get(i).getTitle().equals(title) && booklist.get(i).getAuthor().equals(author)) {
				removeBook = booklist.get(i);
				booklist.remove(i);
				break;
				//리스트에서 배열을 삭제하게되면, 내부적으로 count하고 있는 숫자가 그대로인상태에서
				//리스트의 크기 줄어들기때문에, 이제는 없는 객체에 접근하게되면 에러가 발생하기때문이다.
			}
		}
		return removeBook;
	}
	
	public int ascBook() {
		// 책 이름으로 오름차순 후 1 반환
		int result = 0;
		try {
			// 1 3 4 5 9
			// ["민", "경" , "민"]
			
		Collections.sort(booklist);
		//컬렉션안의 리스트의 내부적으로 정의된 compareTo메소드를 실행시킨다. 
		//리스트의 모든 객체들간의 비교를 한 후, 정렬을 해준다.
		result = 1;
		}catch(RuntimeException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
