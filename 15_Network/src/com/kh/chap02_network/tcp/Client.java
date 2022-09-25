package com.kh.chap02_network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	
	/*
	 * 클라이언트 TCP소켓 프로그래밍 순서
	 * 
	 * 1) 서버의 IP주소와 서버가 정한 포트번호를 매개변수로 하여 클라이언트용 소켓 객체 생성.
	 * 
	 * 2) 서버와의 입출력 스트림 오픈
	 * 
	 * 3) 보조스트림을 통해 성능 개선.
	 * 
	 * 4) 스트림을 통해 읽고 쓰기.
	 * 
	 * 5) 통신 종료(스트림, 소켓 닫기)
	 */
	
	public void clientStart() {
		//142.250.196.132
		
		// 1) 서버의 IP주소와 포트번호를 매개변수로 하여 클라이언트 소켓 객체 생성.
		int port = 3000;
		String serverIP = "192.168.120.42";
		Socket socket = null;
		String str = null;
		
		try {
			// 서버에 연결요청을 보내는 구문(요청하고자 하는 IP주소와 지정된 포트번호를 제시하여 매개변수로 보내며 소켓객체 생성
			socket = new Socket(serverIP, port); // 연결 실패시, null반환.
			
			if(socket != null) {
				// 2) 서버와 입출력 스트림 오픈.
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				
				
				// 3) 보조스트림을 통해 성능 개선.
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				PrintWriter pw = new PrintWriter(os,true);
				
				
				// 4) 스트림을 통해 읽고 쓰기. - Scanner 사용
				Scanner sc = new Scanner(System.in);
				
				do{
					//쓰기
					System.out.print("서버에 보낼 내용 : ");
					str = sc.nextLine();
					
					pw.println(str);
					pw.flush();
					if(str.equals("exit") || str == null) {
						System.out.println("접속 종료!");
						break;
					}
					
					//읽기
					String message = br.readLine();
					System.out.println("받은 메시지 : "+message);
					
				}while(true);
				
				// 5) 통신 종료.
				br.close();
				pw.close();
				socket.close();
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
