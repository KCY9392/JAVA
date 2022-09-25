package com.kh.chap01_thread.thread;

// 스레드 생성 방법
// 2. Runnable 인터페이스를 구현하는 방법.
// 	  - Runnable 인터페이스의 run()메소드 오버라이딩.
public class Thread2 implements Runnable{
	
	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			System.out.println(Thread.currentThread().getName()+"["+i+"]");
			// 인터페이스이기때문에 getName()메소드 사용못한다.
			// 대신 Thread.currentThread().getName()로 스레드의 이름을 알아낼 수 있다.
			
		}
	}
}
