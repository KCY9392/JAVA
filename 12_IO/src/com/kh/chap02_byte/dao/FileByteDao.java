package com.kh.chap02_byte.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteDao {

	//dao (data access object) : 데이터가 보관되어있는 공간과 직접 접근해서 데이터를 입출력하는 클래스.
	
	
	//프로그램 --> 외부매체(파일)
	//출력 : 프로그램내의 데이터를 파일로 내보내기 ( 즉, 파일에 저장(기록)하겠다. )
	public void filesave() {
		
		//FileOutputStream : "파일"로 데이터를 1byte단위로 출력하는 스트림.
		
		FileOutputStream fout = null;  
		//변수선언 및 null 초기화
		
		//스트림은 한번 열려있으면, 다른 외부에서 접근하기쉬움. 
		//따라서 닫아주는 것이 중요!!!필수!!
		
		try {
			// 1. FileOutputStream 객체 생성 => 해당 파일과 직접 연결되는 통로(스트림)을 만들겠다.
			// 해당 파일이 존재하지않으면, 해당 파일이 생성되면서 통로가 연결됨.
			// 존재하는 파일이라면, 그냥 통로만 연결.
			
			fout = new FileOutputStream("a_byte.txt"); //덮어씌우기
			//경로 지정을 안하고 생성자를 통해 직접 생성했기때문에, 
			//12_IO아래에 생성된다.
			
			//fout = new FileOutputStream("a_byte.txt",true); //이어쓰기
			// true를 추가하게 되면, 기존 해당 파일이 있을 경우, 이어서 작성한다.
			// false를 추가하면, 덮어씌우는 것과 똑같음.
			// true를 추가하지 않은 생성자는 기존 해당 파일이 있을 경우, 덮어씌워짐.
			
			
			// 2. 연결 통로로 데이터 출력 : write()메소드 사용.
			// 1byte : -128 ~ 127까지의 숫자.
			fout.write(97);  // 'a'
			fout.write(112); // 'p'
			fout.write(112); // 'p'
			fout.write(108); // 'l'
			fout.write(101); // 'e'
			
			//fout.write('a'); -> 도 가능, 자동형변환일어남.
			//fout.write(1byte배열, 시작위치, 종료위치);
			
			byte [] b = {99,100,101};
			fout.write(b);
			
			byte [] c = {102, 103, 104, 105, 106 };
			fout.write(c, 0, 3);
			
			//fout.close();
			//연결통로를 막겠다. 꼭 닫아주는 것이 필요하다.
			//예상치 못한 오류가 있는 경우, 실행되지 않음.
			
		}catch(IOException e) {
			
			e.printStackTrace();
		
		}finally { //어떤 에러가 발생하든 안하든, 항상 실행되는 구문을 작성하는 블럭이다.
			
			try {
				// 3. 스트림을 다 사용했다면, 반드시 자원을 반납해야한다.
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	//프로그램 <--- 외부매체(파일)
	// 입력 : 파일로부터 데이터를 가지고오겠다.
	public void fileRead() {
		
		//FileInputStream 객체 생성 (통로를 열겠다.)
		FileInputStream fin = null;
		
		try {
			// 1. a_byte.txt 와 프로그램을 연결하는 입력스트림을 열겠다.
			fin = new FileInputStream("a_byte.txt"); //반드시 존재하는 파일로 제시.
			
			// 2. 통로로 데이터를 입력받기 위한 메소드 read()
			// 1byte단위로 하나씩 읽어옴.
//			System.out.println(fin.read()); // 97
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			
//			System.out.println(fin.read());
			// 파일의 끝을 만나는 순간 fin.read() => -1을 읽어옴.
			
			
//			while(fin.read() != -1) { 
			//fin.read()가 호출되었기때문에, 일단 a 가 -1이 아니어서 true기때문에 while문안의 코드를 실행하는데,
//				System.out.println(fin.read()); 
			//fin.read()가 또 호출되었기때문에, a의 다음값인 p가 출력되는 순서.
			//fin.read()는 문자값을 하나하나 가져오는 메소드이다.
//			}
			//fin.read()가 호출될때마다 값을 하나씩 차례대로 입력되었기때문에,
			//따로 int형변수를 생성해서 fin.read()를 호출해서 값을 담아주고 그 변수를 출력해야한다.
			
			
			
			//fin.read를 출력할때 권장하는 방법.
			
			int value = 0;
			
			while((value = fin.read()) != -1) {
				System.out.println(value);
				//System.out.println((char)value);
				//로 하면 형변환되어서 문자들로 출력된다.
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. 다 쓴 스트림 자원 반납하기.
			try {
				fin.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}