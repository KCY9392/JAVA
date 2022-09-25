package com.kh.chap01_Inet.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Run {

	public static void main(String[] args) {
		
		/*
		 *  네트워크
		 *   - 여러대의 컴퓨터들이 연결되어있는 통신망 같은 것들 -> 네트워크를 통해서 데이터 송, 수신이 가능.
		 *  
		 *  네트워크의 목적
		 *   - 여러개의 통신기기(컴퓨터, 핸드폰 등등)들을 연결하여 데이터를 손쉽게 주고받기 위함.
		 *   
		 *  자바에서 네트워크 관련 지원하는 클래스
		 *  java.net. 안에 존재함.
		 * 
		 * 
		 * 	서버와 클라이언트
		 * 	- 서버 (Server) : 클라이언트(고객)에게 서비스를 제공해주는 프로그램(클라이언트의 요청을 처리해서 응답해주는)
		 * 	- 클라이언트 (Client) : 서비스를 제공받는 고객(서버에 요청하는 컴퓨터)
		 * 
		 * 	단, 서버에 요청을 하기 위해서는 요청하고자 하는 서버의 ip주소, 포트번호를 알아야한다.
		 * 
		 * IP 주소와 Port 번호
		 * 	IP 주소 : 네트워크 상에서 통신기기를 구별하기위한 고유주소
		 *  		 ex) 192.168.10.96
		 *  
		 *  Port 번호 : 서비스 구분번호
		 *  		   잘 알려진 포트번호의 경우, 생략 가능.
		 *  		   0~1000은 잘 알려진 포트번호(well-known port number)이므로 사용하지 않는다.
		 *  
		 */

		// InetAddress : 네트워크 정보 관련해서 확인할 수 있는 클래스.
		try {
			InetAddress localhost = InetAddress.getLocalHost();
			// 내 pc를 localhost라고 한다.
			// 내 pc에 대한 정보를 반환하는 메소드 : getLocalHost()
			
			System.out.println(localhost/* .toString() */); 
			//DESKTOP-M02V90U/192.168.120.42
			//내 pc 이름       / 내 pc의 IP 주소
			
			System.out.println("내 pc명은 "+localhost.getHostName());	// DESKTOP-M02V90U
			System.out.println("내 ip주소는 "+localhost.getHostAddress()); // 192.168.120.42
			
			System.out.println("------------------------------------");
			
			// 내가 알고있는 도메인 주소를 이용해서 그 서버 관련 정보 얻어보기.
			InetAddress googlehost = InetAddress.getByName("www.google.com");
			// 도메인의 이름을 통해 도메인의 주소(호스트에 대한 정보)를 얻어오는 메소드
			
			System.out.println("구글 서버명 : "+googlehost.getHostName());	// www.google.com
			System.out.println("구글 ip주소 : "+googlehost.getHostAddress());	// 142.250.196.132
			// 서버명을 치고 들어가던, ip주소를 치고 들어가던 동일한 페이지가 나온다.
			// ip주소로 매번 검색하면 번거롭기때문에, 
			// 사람이 알기쉬운 언어로 번역한 도메인 서버명을 설정해서 들어간다.
			
			System.out.println("------------------------------------");
			
			// 서버명을 배열로 받기
			InetAddress [] naverhost = InetAddress.getAllByName("www.naver.com"); // 호스트명이 없으면 unknownhostException 발생
			
			for(InetAddress i : naverhost) {
				System.out.println("네이버 서버명 : "+i.getHostName());
				System.out.println("네이버 ip주소 : "+i.getHostAddress());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		/*
		 * 현재 구동중인 서버가 있으면,
		 * 클라이언트는 그 서버로 요청을 보낼 수 있게 됨. => 응답결과 반환
		 * 
		 * - 요청과 응답에 의해서 프로그램은 돌아간다. ( "통신한다" 라고 표현 )
		 * - 웹에서는 통신방식 : http프로토콜로 통신
		 * 
		 * 자바만을 가지고 서버와 클라이언트 간 통신 실습.
		 * 이때 데이터를 입출력하고자 한다면, 서버와 클라이언트 간에 스트림(통로)가 필요함.
		 * 
		 * 소켓 : 프로세스 간 통신을 담당하는 것(스트림을 열기위한 문 = 통로를 열기위한 문)
		 * 
		 * 소켓프로그램명(tcp / udp)
		 *  - TCP방식 : 데이터 전송속도가 느리다! 데이터가 정확하고, 안정적으로 전송이 가능하다.
		 *  			( 신뢰성이 요구되는 프로그램에서 사용하는 방식 EX) http, email )
		 *  
		 *  - UDP방식 : 데이터 전송속도가 빠르다! 신뢰성 없는 데이터가 전달될 수 있다.
		 *  			( 데이터를 빠른 속도로 전송하고자 하는 프로그램에 사용되는 방식 EX) 실시간 동영상 서비스 )
		 */
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
