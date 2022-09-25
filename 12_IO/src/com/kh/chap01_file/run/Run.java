package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class Run {

	public static void main(String[] args) {
		
		//간단한 파일 만드는 과정 메소드
		//java.io.File 클래스
		
		try {
			// 1. 별도의 경로 지정을 하지 않고, 
			//    파일명(test.txt)만 제시해서 생성할 수 있는 방법.
			File file1 = new File("test.txt");
			file1.createNewFile();
			
			// 2. 사용자가 직접 생성한 경로와 파일명을 함께 제시해서 File을 생성할 수 있는 방법.
			File file2 = new File("C:\\test\\test.txt");
			file2.createNewFile();
			
			// 3. 폴더를 생성하고나서 그 안에 파일을 생성하는 방법.
			File bbbFolder = new File("C:\\bbb");
			bbbFolder.mkdir();
			//make directory약자
			//현재 경로에 디렉토리(폴더)를 생성하고자할때 메소드.
			//디렉토리란 ? 폴더 구조.
			
			File file3 = new File("C:\\bbb\\test.txt");
			file3.createNewFile();
			
			// 4. 별도의 경로 지정 없이 폴더 생성 후 파일 생성하기.
			File folder = new File("test");
			folder.mkdir();
			
			File file4 = new File("test\\person.txt");
			file4.createNewFile();
			
			
			
			
			// File에서 제공하는 메소드들.
			
			System.out.println(folder.isFile()); 
			//폴더가 파일이니 물어보는 메소드. -> false
			System.out.println(file4.isFile());
			//파일이므로 -> true
			
			//파일명 가져오는 메소드 : 파일변수명.getName()
			System.out.println("파일명 : "+file4.getName()); //person.txt
			
			//상위폴더 알려주는 메소드 : 파일변수명.getParent()
			System.out.println("상위폴더 : "+file4.getParent()); //test
			
			//파일용량 알려주는 메소드 : 파일변수명.length()
			System.out.println("파일용량 : "+file4.length()); //35
			
			//절대경로(파일이 존재하는) 알려주는 메소드 : 파일변수명.getAbsolutePath()
			System.out.println("절대경로 : "+file4.getAbsolutePath()); //C:\workspace\12_IO\test\person.txt
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		 * 프로그램 상의 데이터를 외부매체(모니터, 스피커, 파일 등)로 출력하거나 
		 * 입력장치(키보드, 마우스 등)로 입력받는 과정을 진행하고자 한다면,
		 * 반드시 프로그램과 외부매체와의 "통로"를 만들어야한다. => "스트림" stream
		 * 
		 * 스트림의 특징
		 * 
		 *  - 단방향 : 입력이면 입력, 출력이면 출력
		 *  			입력, 출력용 스트림이 따로 존재한다.
		 *  			즉, 동시에 입출력 하고자 한다면, 하나의 스트림으로는 불가능함.
		 *  - 선입선출 ( FIFO ) : 먼저 전달한 값이 먼저 나오게 됨.
		 *  - 시간지연 문제가 발생할 수 있다.
		 *  
		 *  
		 * 스트림의 구분
		 * 
		 *  - 통로의 사이즈 : 
		 *  	바이트 스트림 : 1byte짜리가 이동할 수 있을 정도의 사이즈(좁은통로) -> 입력(InputStream) / 출력(OutputStream)
		 *  	  문자 스트림 : 2byte짜리가 이동할 수 있을 정도의 사이즈(넓은통로) -> 입력(Reader) / 출력(Writer)
		 *  
		 *  - 외부매체와의 직접적인 연결여부 : 
		 *  	기반 스트림 : 외부매체와 직접적으로 연결되는 통로
		 *  	보조 스트림 : 기반 스트림만으로 부족한 성능을 향상시켜주는 용도의 스트림(외부매체와 직접적으로 연결X) -> 단독 사용X
		 *  			   (속도향상, 자료형에 맞춰 변환한다거나, 객체 단위로 입출력하게 도와준다거나, 등등)
		 *  				단, 보조스트림은 단독으로 사용불가능함. 반드시 외부매체와 직접적으로 연결되는 기반 스트림이 필수.
		 *  
		 */
			
	}

}
