package com.kh.chap02_scheduling.schedule;

public class Plane implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
		for(int i=0; i<20; i++) {
			System.out.println("Plane flying,,,");
		}
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
