package com.kh.chap02_network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	/*
	 *  서버의 연결 순서
		 *  1) 서버의 소켓 객체 생성
		 *  
		 *  2) 클라이언트의 접속 요청을 기다림.
		 *  
		 *  3) 요청이 오면 수락 후, 클라이언트 정보를 저장.
		 *  
		 *  4) 클라이언트 정보를 통해서 OutputStream 생성.
		 *  
		 *  5) 클라이언트 정보를 통해서 InputStream 생성.
		 *  
		 *  6) 보조스트림으로 성능 개선.
		 *  
		 *  7) 스트림을 통해 읽고 쓰기.
		 *  
		 *  8) 통신 종료.
	 */
	public void serverStart() {
		
		int port = 3000;
		
		ServerSocket server = null;
		
		try {
			// 1) 서버 소켓 객체 생성.
			server = new ServerSocket(port);
			System.out.println("서버시작...");
			
			while(true) {
				
			// 2) 클라이언트의 접속 요청을 기다림.
			// 3) 요청이 오면 수락하고, 클라이언트 정보를 저장
				
			Socket client = server.accept(); // accept() : 클라이언트 요청올때까지 서버를 대기상태로 만드는 메소드.
			// Socket == 클라이언트와 통신할 수 있는 소켓객체.
			
			System.out.println("클라이언트 대기중...");
			
			
			
			// 4) 연결된 클라이언트와 입출력 스트림 생성.
			
			OutputStream out = client.getOutputStream();	//클라이언트로 값을 출력하는 "출력스트림"
			InputStream in = client.getInputStream();	//클라이언트로 값을 입력하는 "입력스트림"
			
			
			
			// 5) 보조스트림으로 성능 개선.
			
			// 클라이언트로부터 전달된 값을 한줄단위로 읽어들이기위한 입력용 보조 스트림 
			BufferedReader br = new BufferedReader(new InputStreamReader(in)); // 객체 생성을 따로 해줘야함, BufferedReader로 속도 향상시킴.
			
			// 클라이언트에게 값을 한줄단위로 출력하기위한 출력용 보조 스트림.
			PrintWriter pw = new PrintWriter(out,true); // 데이터 출력할 때, print(),println() 메소드를 가지고 있음.
			
			
			
			// 6) 스트림을 통해 읽고 쓰기
			while(true) {
				
				//읽기
				String message = br.readLine(); //클라이언트에게 받은 데이터를 한줄단위로 message에 저장
				
				if(message == null || "exit".equals(message)) {
					System.out.println("클라이언트 접속 종료");
					break;
				}else {
					//쓰기
					System.out.println("현재 socket에 연결된 ip주소인 "
							+client.getInetAddress().getHostAddress()+"가 보낸 메시지 : "+ message);
					pw.println("메시지 받기 성공");
					pw.flush(); // 현재 스트림에 남아있는 데이터를 강제로 비워주는 메소드(close메소드 호출되면 자동으로 flust호출됨)
				}
			}
			
			// 7) 통신 종료.
			br.close();
			pw.close();
			client.close(); //소켓 닫아줌.
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
