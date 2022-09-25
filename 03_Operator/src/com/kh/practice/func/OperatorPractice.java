package com.kh.practice.func;

import java.math.BigDecimal;
import java.util.Scanner;

public class OperatorPractice {
	
	//인원 수와 사탕개수를 입력받고, 1인당 동일하게 사탕을 나눠갖는 개수,
	//나눠주고 남는 사탕의 개수를 출력하세요.
	public void practice1() {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		
		System.out.print("사탕개수 : ");
		int candyNum = sc.nextInt();
		
		System.out.println();
		
		System.out.printf("1인당 사탕 개수 : %d\n",(candyNum / people));
		System.out.printf("남은 사탕 개수 : %d\n",(candyNum % people));
		
		//int result1 = people < candyNum ? candyNum % people : candyNum;
		//int result2 = people < candyNum ? candyNum / people : 0;
		
		sc.close();
	}
	
	//키보드로 입력받은 값들을 변수에 기록하고, 저장된 변수값을 화면에 출력해 확인하세요.
	//성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력 처리하세요.
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int class1 = sc.nextInt();
		
		System.out.print("번(숫자만) : ");
		int number = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		String result =( gender == 'M'|| gender =='m' )? "남" : (gender == 'F' || gender == 'f') ? "여" : "잘못입력했습니다.";
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		float test = sc.nextFloat();
		
		System.out.println();
		
		System.out.printf("%d학년 %d반 %d번 %s %s학생의 성적은 %.2f이다.",
				grade,class1,number,name,result,test);
		
		sc.close();
	}
	
	//나이를 키보드로 입력받아 어린이(13세이하)인지, 청소년 (13초과 19이하)인지,
	//성인(19초과)인지 출력하세요.
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.println();
		
		String result = (age > 0 && age <= 13) ? "어린이" : ( age <= 19 ? "청소년" : "성인");
		System.out.println(result);
		
		sc.close();
	}
	
	//국어, 영어, 수학에 대한 점수를 정수로 입력받고,
	//세과목의 합계와 평균(합계/3.0)을 구하세요
	//세과목 점수가 각각 40점 이상이면서 평균이 60점 이상일때 합격, 아니면 불합격을 출력하세요.
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int a = sc.nextInt();
		
		System.out.print("영어 : ");
		int b = sc.nextInt();
		
		System.out.print("수학 : ");
		int c = sc.nextInt();
		
		System.out.println();
		
		System.out.printf("합계 : %d\n", (a+b+c));
		System.out.printf("평균 : %.1f\n\n", ((a+b+c) / 3.0));
		
		double avg = (a+b+c) / 3.0;
		
		String result = (a>=40 && b>=40 && c>=40) && (avg>=60) ? "합격" : "불합격";
		System.out.println(result);
		
		sc.close();
		
	}
	
	//주민번호를 이용해서 남자인지 여자인지 구분하여 출력
	// 주민번호를 입력하세요(- 포함) : 
	//
	// 여자
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		char juminNum = sc.nextLine().charAt(7);
		
		System.out.println();
		
		String result = (juminNum == '1' || juminNum == '3') ? "남자" : (juminNum == '2' || juminNum == '4' ? "여자" : "잘못입력했습니다.");
		System.out.println(result);
		
		sc.close();
	}

	//숙제 1.
	//키보드로 정수 두개 입력받아, 각각 변수(num1, num2)에 저장하세요
	//또 다른 정수를 입력받아 그 수가 num1이하거나 num2초과이면 true 출력하고 아니면 false출력하세요.
	// (단, num1은 num2보다 작아야함)
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int a = sc.nextInt();
		
		System.out.println();
		
		String result = (num1 < num2) ? (( a <= num1 || a > num2 ) ? "true" : "false" ) : "num1이 num2보다 큽니다. 다시입력하세요!";
		System.out.println(result);
		
		sc.close();
	}
	
	//숙제 2.
	//3개의 수를 키보드로 입력 받아서,
	//입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int a = sc.nextInt();
		
		System.out.print("입력2 : ");
		int b = sc.nextInt();
		
		System.out.print("입력3 : ");
		int c = sc.nextInt();
		
		System.out.println();
		
		boolean result = ( a == b && b == c ) ? true : false;
		System.out.println(result);
		
		sc.close();
	}
	
	//숙제 3.
	//A, B, C 사원의 연봉을 입력 받고,
	//각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고,
	
	//인센티브 포함 급여가 3000만원 이상이면 “3000 이상”, 
	//미만이면 “3000 미만”을 출력하세요.
	//
	//(A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int a = sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
		int b = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		int c = sc.nextInt();
		
		//연봉 + 인센티브
		double aa = a + a*0.4;
		double bb = b; //자동형변환
		
		//double cc = c + c*0.15;
		//2990.00000000000000
		//실수간 연산 시, 부정확한 연산 발생한다.
		
		double cc = c*1.15;
		//1.15를 곱하는 것이 더 정확
		//c + c*0.15
		//c(1+1*0.15)
		//c(1.0.15)
		//c(1.15)
		//c * 1.15
		
		String aResult = aa >= 3000 ? "3000 이상" : "3000 미만";
		String bResult = bb >= 3000 ? "3000 이상" : "3000 미만"; 
		String cResult = cc >= 3000 ? "3000 이상" : "3000 미만";
		
		System.out.println();
		
		System.out.printf("A사원의 연봉/연봉+a : %d/%.1f \n",a,aa);
		System.out.println(aResult);
		
		System.out.printf("B사원의 연봉/연봉+a : %d/%.1f \n",b,bb);
		System.out.println(bResult);
		
		System.out.printf("C사원의 연봉/연봉+a : %d/%.13f \n",c,cc);
		
		System.out.println(cResult);
		
		
		//자바에서 정확한 실수 연산시, BigDecimal 사용.
		BigDecimal bd = new BigDecimal(2600.0+"");
		//실수 간 정확한 연산을 위해 필요한 클래스
		
		BigDecimal bd2 = new BigDecimal(1.15+"");
		System.out.println(bd.multiply(bd2));
		
		sc.close();
	}
	
	
	
	
	
	
	
	
	
	
	
}
