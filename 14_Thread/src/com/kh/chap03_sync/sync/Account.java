package com.kh.chap03_sync.sync;

// 1개의 Account(계좌)
// 2개의 ATM기에서 돈을 뽑는
public class Account { //공유자원

	private int balance = 1000; //잔여금액 1000원
	
	public int getBalance() {
		return balance;
	}
	
	/*
	 * synchronized (해당 객체를 격리공간으로 지정하는 예약어)
	 *  - 동기화 메소드, 동기화블럭에 사용되는 키워드
	 *  - 동기화메소드는 메소드 선언에 "synchronized 키워드"를 붙이고 인스턴스, 정적메소드 어디든 사용가능하다.
	 *  - 동기화메소드는 스레드가 메소드를 실행하면, 메소드 전체에 즉시 락(LOCK)을 걸고, 
	 *  				    메소드가 종료되면, 락이 풀린다.
	 *  - 메소드 전체가 아니라 일부내용만 락을 걸고 싶다면, "동기화블럭"을 만들면 된다.
	 */
	
	
	public /* synchronized */ void withdraw(int money) { //락이 걸려있는 스레드만 Account에 접근 가능.
		
		synchronized (this) { //동기화블럭

			String thName = Thread.currentThread().getName();
			System.out.println("현재 잔액은 ? " + balance);

			if (money <= balance) { // 조건문을 잘못작성하면, synchronized가 종료되지않는 현상을 "데드락"이라고 한다.
				balance -= money;
				System.out.printf("[%s] %d원 출금 -> 잔액 : %d원\n", thName, money, balance);
			} else {
				System.out.printf("[%s] %d원 출금시도 >>> 잔액이 부족합니다.\n", thName, money);
			}
		}
	}
	
}
