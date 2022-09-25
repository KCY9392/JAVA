package com.kh.chap03_sync.run;

import com.kh.chap03_sync.sync.ATM;
import com.kh.chap03_sync.sync.Account;

public class Run {

	public static void main(String[] args) {
		
		Account acc = new Account();
		
		//다형성 이용.
		Runnable run1 = new ATM(acc);
		Runnable run2 = new ATM(acc);
		
		Thread th1 = new Thread(run1, "ATM1");
		Thread th2 = new Thread(run2, "ATM2");
		
		th1.start();
		th2.start();
		
		// 동기화 되어있지 않으면, 값이 마구마구 섞여버림.(스레드가 서로 순서없이 계속 접근하는 상황)
		// 즉, 앞의 스레드가 실행되는 동안은 다른 스레드가 같은 자원에 접근하면 안된다.(동기화 필요)
		
		
		// 동기화란 ?
		// 	"멀티스레드 프로그램에서 스레드간의 공유자원(현재는 Account를 의미)에 대한 처리"를 의미한다.
		// 	공유자원에 대한 "사용순서를 정해주는 것". 공유자원에 대한 "LOCK을 획득한 스레드만 접근이 가능"하다.
		
		// 동기화 사용방법.
		// 1. synchronized메소드로 메소드를 작성하면된다.
		// 2. 메소드 내부에 synchronized 작성.
		

	}

}
