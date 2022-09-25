package com.kh.chap01_thread.run;

import com.kh.chap01_thread.thread.Thread1;
import com.kh.chap01_thread.thread.Thread2;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * 프로세스
		 * - 현재 동작하고 있는 프로그램
		 * 
		 * 스레드
		 * - 한 개의 프로세스 내에서 실제로 작업을 수행하는 소단위
		 * - 모든 프로세스에는 한 개 이상의 스레드가 존재하여 작업을 수행(일꾼)
		 * 
		 * ex) 스레드 예시
		 * - 청소(메인스레드, 나, 1시간) + 설거지(메인스레드, 나, 30분) + 설거지(메인스레드, 나, 30분) + 빨래(서브스레드, 세탁기, 2시간)
		 * - 무조건 필요로 하는 중심이 되는 스레드 = 메인스레드 = 나
		 * - 추가로 필요한 스레드 = 서브스레드 = main메소드에서 생성해서 실행.
		 * - 비행기 게임 속 총알(서브스레드)
		 * 
		 * 멀티스레드
		 * - 한개의 프로그램을 실행하고, 그 내부적으로 여러 작업(스레드)를 처리하는 것.
		 * - 멀티스레드의 장점
		 * 	1) 자원을 보다 효율적으로 사용
		 * 	2) 사용자 입장에서 일처리가 빠르게 보인다.
		 * 	3) 작업이 분리되어 있음.
		 * 	
		 */
		
		//우리가 여태까지 해오던 방식.
		/*
		 * for(int i=1; i<=100; i++) { System.out.println("작업 1 : ["+i+"]"); }
		 * 
		 * for(int i=1; i<=100; i++) { System.out.println("작업 2 : ["+i+"]"); }
		 */
			
			
			
		// 스레드 생성 방법 1. Thread 클래스 상속받기.
		Thread1 th1 = new Thread1();
		th1.setName("스레드1"); 
		//스레드 이름 지정하는 메소드.
		th1.start(); // 스레드 시작.
		//서브스레드 공간 하나 생김.
		
		
		// 스레드 생성 방법 2. Runnable 인터페이스 구현하기.
		Thread th2 = new Thread(new Thread2());
		th2.setName("스레드2");
		th2.start(); // 스레드 실행.
		//서브스레드 공간 하나 생김.
		
			
		// 스레드 생성 방법 3. 익명클래스 이용.
		// 굳이 클래스 만들 필요없이, 일회용으로 만들고자 할때 사용.
		// 클래스와 비슷하지만, 클래스 이름이 없기때문에 익명클래스라고 한다.
		Thread th3 = new Thread() {
			@Override
			public void run() {
				for(int i=1; i<=100; i++) {
					System.out.println(getName()+"["+i+"]");
				}
			}
		};
		th3.start();
		
		
		System.out.println("메인스레드 종료!!");	
		// 메인스레드가 종료되더라도 실행 중인 스레드가 하나라도 있다면, 프로세스는 종료되지 않는다.
		// 매번 결과가 다르게 보일 것. -> 스케줄에 따라 순차적으로 번갈아 가며 작업이 수행된다.
			
	}

}
