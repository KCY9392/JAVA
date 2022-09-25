package com.kh.chap02_scheduling.run;

import com.kh.chap02_scheduling.schedule.Car;
import com.kh.chap02_scheduling.schedule.Plane;
import com.kh.chap02_scheduling.schedule.Tank;

public class Run {

	public static void main(String[] args) {
		
		//원래 하던 방식.
		Thread th1 = new Thread(new Car());
		Thread th2 = new Thread(new Plane());
		Thread th3 = new Thread(new Tank());
		//ctrl + shift + o -> 모두 임포트해줌.
		
		th1.setName("자동차");
		th2.setName("비행기");
		th3.setName("탱크");
		
		//스레드는 기본적으로 1~10의 우선순위중 5의 우선순위를 가지고있음.
		th3.setPriority(Thread.MAX_PRIORITY); 
		th2.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("쓰레드1의 우선순위는 : "+th1.getPriority());//5
		System.out.println("쓰레드2의 우선순위는 : "+th2.getPriority());//1
		System.out.println("쓰레드3의 우선순위는 : "+th3.getPriority());//10
		
		// 주종관계 설정
		// main스레드가 종료 시, 다른 스레드도 종료시키기위해서는 반드시 "setDaemon을 사용".
		// 주의사항 : 스레드 중 한 개라도 setDaemon으로 설정하면, 모든 스레드에 setDaemon 시켜줘야한다.
		// 하나라도 빠져있으면, setDaemon하지않은 스레드가 같이 종료되지않는다.
		
		th1.setDaemon(true);
		th2.setDaemon(true);
		th3.setDaemon(true);
		
		th1.start();
		th2.start();
		th3.start();
		
		// 시작 순서는 우선 순위와 다를 수 있지만, 되도록이면 종료순서는 우선순위가 높은 순으로 끝나게 된다.
		
		System.out.println("메인메소드 종료!!");
	}

}
