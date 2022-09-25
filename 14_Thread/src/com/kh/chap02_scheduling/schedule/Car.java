package com.kh.chap02_scheduling.schedule;

public class Car implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
		for(int i=0; i<20; i++) {
			System.out.println("Car driving,,,");
			
			try {
				Thread.sleep(100); // 0.1초 속도로 실행.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
