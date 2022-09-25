package com.kh.chap04_assist2.run;

import com.kh.chap04_assist2.model.dao.ObjectDao;
import com.kh.chap04_assist2.model.dao.ObjectsDao;

public class Run {

	public static void main(String[] args) {
		
		// 객체 단위로 입출력할 수 있는 기능을 제공하는 보조 스트림.
		// ObjectInputStream / ObjectOutputStream

		ObjectDao od = new ObjectDao();
		//od.fileSave("phone.txt");
		//객체단위로 기록되어있어서 깨져보인다. 하지만 정상적으로 기록된것임.
		
		//od.fileRead();
		
		ObjectsDao osd = new ObjectsDao();
		//osd.fileSave("phoneList.txt");
		osd.fileRead();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
