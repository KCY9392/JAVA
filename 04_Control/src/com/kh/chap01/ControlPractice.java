package com.kh.chap01;

import java.util.Scanner;

public class ControlPractice {

	//실습 1.
	//아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
	//종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" 1. 입력\n 2. 수정\n 3. 조회\n 4. 삭제\n 7. 종료\n 메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		String menu = "";
		switch(num) {
		case 1 : menu = "입력"; break;
		case 2 : menu = "수정"; break;
		case 3 : menu = "조회"; break;
		case 4 : menu = "삭제"; break;
		case 7 : menu = "종료"; sc.close();return;
		default : System.out.println("잘못입력했습니다. 다시 입력해주세요."); 
					practice1();
		}
		System.out.printf(" %s 메뉴입니다.",menu);
		
		sc.close();
	}
	
	//실습 2.
	//키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
	//짝수가 아니면 “홀수다“를 출력하세요.
	//양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			if(num%2 == 0) {
				System.out.println("짝수다");
			}else {
				System.out.println("홀수다");
			}
		}else {
			System.out.println("양수만 입력해주세요.");
			}
		sc.close();
		}
	
	//실습 3.
	//국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
	//합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
	//(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
	//합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
	//불합격인 경우에는 “불합격입니다.”를 출력하세요.
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int a = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int b = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int c = sc.nextInt();
		
		//과목별 합계, 평균
		int sum = a + b + c;
		double avg = sum / 3;
		
		if( a >= 40 && b >= 40 && c >= 40 && avg >= 60) {
			System.out.printf("국어 : %d\n",a);
			System.out.printf("수학 : %d\n",b);
			System.out.printf("영어 : %d\n",c);
			System.out.printf("합계 : %d\n",sum);
			System.out.printf("평균 : %.1f\n",avg);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
		sc.close();
	}
	
	//실습 4.
	//pdf파일 (11page)에서 
	//if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요.
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		String season = "";
		switch(month) {
		case 1 : case 2 : case 12 :
			season = "겨울";
			break;
		case 3 : case 4 : case 5 :
			season = "봄";
			break;
		case 6 : case 7 : case 8 :
			season = "여름";
			break;
		case 9 : case 10 : case 11:
			season = "가을";
			break;
		default : System.out.printf("%d월은 잘못 입력된 달입니다.",month);
			sc.close();
			return;
		}
		System.out.printf("%d월은 %s입니다.",month,season);
		sc.close();
	}
	
	//실습 5.
	//아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
	//로그인 성공 시 “로그인 성공”, 
	//아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
	//비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		
		String setid = "kcy";
		String setpw = "kcy123";
		
		if(setid.equals(id)) {
			if(setpw.equals(pw)) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}
		sc.close();
	}
	
	//실습 6.
	//사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아
	//각 등급이 행할 수 있는 권한을 출력하세요.
	//단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
	//회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
	//비회원은 게시글 조회만 가능합니다.
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String level = sc.nextLine();
		
		// .equals 가 switch문보다 성능이 안좋다.
		
		switch(level) {
		case "관리자" :
			System.out.print("회원관리, 게시글 관리 ");
		
		case "회원" :
			System.out.print("게시글 작성, 댓글 작성 ");
			
		case "비회원" :
			System.out.print("게시글 조회");
		}
		sc.close();
	}
	
	//실습 7.
	//키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
	//저체중/정상체중/과체중/비만을 출력하세요.
	//BMI = 몸무게 / (키(m) * 키(m))
	//BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
	//BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
	//BMI가 30이상일 경우 고도 비만
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.printf("BMI 지수 : %.14f\n",bmi);
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		}else if(bmi < 23) {
			System.out.println("정상체중");
		}else if(bmi < 25) {
			System.out.println("과체중");
		}else if(bmi < 30) {
			System.out.println("비만");
		}else {
			System.out.println("고도비만");
		}
		sc.close();
	}
	
	//실습 8.
	//키보드로 두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
	//(단, 두 개의 정수 모두 양수일 때만 작동하며 없는 연산 기호를 입력 했을 시
	//  “잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char ch = sc.nextLine().charAt(0);
		
		if(!(num1 > 0 && num2 > 0)) {//양수 입력하지않으면 종료시키는 조건문
			System.out.println("잘못입력하셨습니다. 프로그램을 종료합니다.");
			practice8();
		}
		
		double result = 0.0;
		switch(ch) {
		case '+' :
			result = num1 + num2;
			break;
		case '-' :
			result = num1 - num2;
			break;
		case '*' :
			result = num1 * num2;
			break;
		case '/' :
			result = (double)num1 / (double)num2;
			break;
		case '%' :
			result = (double)num1 % (double)num2;
			break;
		default :
			System.out.println("잘못입력했습니다. 다시 입력하세요\n");
			practice8();
		}
		System.out.printf("%d %s %d = %.6f",num1,ch,num2,result);
		sc.close();
	}
	
	//숙제 9.
	//중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
	//평가 비율은 
	//중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
	//이 때, 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산하세요. 
	//70점 이상일 경우 Pass, 70점 미만이거나 || 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int score1 = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int score2 = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int score3 = sc.nextInt();
		
		System.out.print("출석 회수 : ");
		int num = sc.nextInt();
		
		System.out.println("==============  결과  ==============");
		
		//총점
		double sum = (score1 * 0.2) + (score2 * 0.3) + (score3 * 0.3) + num;
		
		if(num > 14) {	// 출석비율의 30프로인 14일 초과 출석했다면, 일단 1차 통과
			if(sum >= 70) {	// 총점이 70점 이상이라면, 2차 통과로 Pass 확정
				System.out.printf("중간 고사 점수 (20) : %.1f\n", score1 * 0.2);
				System.out.printf("기말 고사 점수 (30) : %.1f\n", score2 * 0.3);
				System.out.printf("과제 점수     (30) : %.1f\n", score3 * 0.3);
				System.out.printf("출석 점수     (20) : %.1f\n", (double)num);
				
				System.out.printf("총점 : %.1f\n", sum );
				System.out.println("Pass");
					}
				else {	//총점 점수가 70점 미만으로 낮다면, Fail
					
					System.out.printf("중간 고사 점수 (20) : %.1f\n", score1 * 0.2);
					System.out.printf("기말 고사 점수 (30) : %.1f\n", score2 * 0.3);
					System.out.printf("과제 점수     (30) : %.1f\n", score3 * 0.3);
					System.out.printf("출석 점수     (20) : %.1f\n", (double)num);
					
					System.out.printf("총점 : %.1f\n", sum );
					
					System.out.printf("Fail [총점 점수 부족 (%d / 70)]",(int)sum);
				}
			}
			else { //출석 비율의 30프로인 14일보다 이하로 출석했다면, Fail
			
				System.out.printf("Fail [출석 회수 부족(20) (%d / 20)",num);
			}
		sc.close();
	}

	//숙제 10.
	//앞에 구현한 실습문제를 선택하여 실행할 수 있는 메뉴화면을 구현하세요.
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		//가독성위해
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수 / 홀수");
		System.out.println("3. 합격 / 불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		
		System.out.print("선택 : ");
		int number = sc.nextInt();
		
		switch(number) {
		case 1 : practice1();	//메뉴출력
				break;
		case 2 : practice2();	//짝수/홀수
				break;
		case 3 : practice3();	//합격/불합격
				break;
		case 4 : practice4();	//계절
				break;
		case 5 : practice5();	//로그인
				break;
		case 6 : practice6();	//권한확인
				break;
		case 7 : practice7();	//BMI
				break;
		case 8 : practice8();	//계산기
				break;
		case 9 : practice9();	//P/F
				break;
		default : System.out.println("잘못입력했습니다. 다시 입력해주세요!");
				practice10();
		}
		sc.close();
	}
	
	//숙제 11.
	//정수를 이용해서 4자리 비밀번호를 만들려고 하는데
	//이 때 4자리 정수를 입력 받아 각 자리 수에 중복되는 값이 없을 경우 ‘생성 성공’
	//중복 값이 있으면 ‘중복 값 있음‘
	//자리수가 안 맞으면 ‘자리 수 안 맞음‘ 출력
	//단, 제일 앞자리 수의 값은 1~9 사이 정수
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("비밀번호(1000~9999) : ");
		int pw = sc.nextInt();
		
		int one = ((pw % 1000) % 100) % 10; // 1의 자리수
		// pass % 10; -> 1234 % 10 = 4
		int ten = ((pw % 1000) % 100) / 10; // 10의 자리수
		// pass / 10 % 10; -> 1234 / 10 = 123.4 % 10 = 3
		int hundred = (pw % 1000) / 100; 	// 100의 자리수
		// pass / 100 % 10; -> 1234 / 100 = 12.34 -> 12 % 10 = 2
		int thousand = pw / 1000;			// 1000의 자리수
		// pass / 1000; -> 1234 / 1000 = 1.234 = 1
		
		if(pw < 1000 && pw > 9999) {// 1000~9999 범위안에 없다면, 
			System.out.println("자리수 안맞음");
			
			}else if( one == ten || one == hundred || one == thousand || ten == hundred || ten == thousand || hundred == thousand ) {
			System.out.println("중복 값 있음");
			
			}else {
			System.out.println("생성 성공");
			}
//		else if( one != ten && one != hundred && one != thousand ) {	// 1의 자리수 와 ( 10의 자리수, 100의 자리수, 1000의 자리수 ) 가 같지 않고,
//					// one == ten || one == hundred || one == thousand || ten == hundred || ten == thousand || hundred == thousand 
//					if( ten != hundred && ten != thousand ) {	// 10의 자리수와 ( 100의 자리수,1000의 자리수 )가 같지않고,
//						
//							if(hundred != thousand) {	// 100의 자리수와 ( 1000의 자리수 ) 가 같지 않다면,
//								
//								System.out.println("생성 성공");
//								
//							}else {	// 100의 자리수와 ( 1000의 자리수 )가 같다면,
//								System.out.println("중복 값 있음");
//							}
//						}else {	// 10의 자리수와 ( 100의 자리수,1000의 자리수 )가 같다면,
//							System.out.println("중복 값 있음");
//						}
//					}else {	// 1의 자리수 와 ( 10의 자리수, 100의 자리수, 1000의 자리수 ) 가 같다면,
//						System.out.println("중복 값 있음");
//					}
		sc.close();
	}
}
