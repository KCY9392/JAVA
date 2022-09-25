package com.kh.chap04_assist.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {

	// BufferedReader / BufferedWriter
	
	// 프로그램 -> 파일 로 저장하는 방법.
	public void fileSave() {
		// 1. 기반 스트림(FileWriter)객체를 먼저 생성.
		// 보조 스트림도 Readaer/Writer , InputStream/OutputStream 
		
		//BufferedWriter bw = null;
//		try {
//			
//			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
//			
//			bw.write("안녕하쇼");
//			bw.newLine(); // 개행(\n)을 넣어주는 메소드.
//			bw.write("반갑소 \n"); // \n 가능.
//			bw.write("저리가세요");
//			
//		}catch(IOException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				bw.close();
//			}catch(IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		
		//try ~ with ~ resource 구문 (jdk7버전 이상부터 사용 가능)
		/*
		 * [표현법]
		 * try(스트림객체생성;){
		 * 		
		 * 	//예외가 발생될 법한 구문.
		 * 
		 * } catch (예외클래스명 e) {
		 * 	
		 *	//예외가 발생했을 때 실행할 구문.
		 *
		 * }
		 *
		 *스트림 객체를 try안에 넣어버리면,
		 *스트림 객체생성 후 해당블록의 구문이 실행완료되면, 알아서 자원 반납이 된다.
		 *bw.close() 안해도된다!
		 */
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))){
			bw.write("안녕하쇼");
			bw.newLine();
			bw.write("반갑네 \n");
			bw.write("저리좀가세요.");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	// 프로그램 <-- 파일 (프로그램에서 파일의 내용을 읽어옴)
	public void fileRead() {
		
		//FileReader
		//BufferedReader
		
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){
			//System.out.println(br.readLine()); //한줄그대로 출력 
			//안녕하쇼
			//System.out.println(br.readLine()); //다음 라인 출력
			//반갑네
			//System.out.println(br.readLine());
			//저리좀가세요.
			
			//System.out.println(br.readLine()); // null
			// 값이 없다면, null 출력
			
			String value = null;
			while((value = br.readLine()) != null) {//파일의 마지막값까지 다 읽은 경우가 아니라면,
				System.out.println(value); //출력
			}
			
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
