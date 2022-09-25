package com.kh.practice1.func;
import java.util.Scanner;

//실습 문제 1. 
//인적사항 변수로 입력받아 출력하세요.
public class VariablePratice1 {
	public void printInfo() {
		//이름, 성별, 나이, 키를 사용자에게 입력받아 각각의 값을 
		//변수에 담고 출력하세요.
	Scanner sc = new Scanner(System.in);
	System.out.print("이름을 입력하세요 : ");
	String name = sc.nextLine();
	
	System.out.print("성별을 입력하세요(남/여) : ");
	char gender = sc.nextLine().charAt(0);
	//글자중 첫번째(0) 한 글자를 뽑겠다는 의미
	
	System.out.print("나이를 입력하세요 : ");
	int age = sc.nextInt();
	
	System.out.print("키를 입력하세요(cm) : ");
	double height = sc.nextDouble();
	
	System.out.println("키 "+height+"cm 인 "+age+"살 "+gender+"자 "+name+"님 반갑습니다^^");
	
	sc.close();
	}
}
