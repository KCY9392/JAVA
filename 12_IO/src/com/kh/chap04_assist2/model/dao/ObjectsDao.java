package com.kh.chap04_assist2.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist2.model.vo.Phone;

public class ObjectsDao {

	public void fileSave(String fileName) {
		
		Phone [] arr = new Phone [3];
		
		arr[0] = new Phone("아이폰", 1_500_000);
		arr[1] = new Phone("갤럭시", 1_300_000);
		arr[2] = new Phone("플립폰", 2_000_000);
		
		//ctrl + shift + o -> 한번에 임포트됨.
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
			
			for(int i=0; i<arr.length; i++) {
				oos.writeObject(arr[i]);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phoneList.txt"))){
			
			while(true) {
			System.out.println(ois.readObject());
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(EOFException e) { // 먼저실행되어야함.
			System.out.println("파일을 다 읽었습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
