package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {
	
	private Scanner sc = new Scanner(System.in);
	
	private PersonController pc = new PersonController();
	
	//메인메뉴 
	public void mainMenu() {

		while (true) {
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + pc.personCount()[0] +"명입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + pc.personCount()[1] +"명입니다.");

			System.out.println();
			
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");

			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();

			sc.nextLine();

			switch (num) {
			case 1:
				studentMenu();
				break;
			case 2:
				employeeMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	//학생 메뉴
	public void studentMenu() {

		while (true) {
			System.out.println();

			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");

			if (pc.personCount()[0] == 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상활성화 되지 않습니다.");

				System.out.print("메뉴 번호 : ");
				int num = sc.nextInt();

				sc.nextLine();

				switch (num) {
				case 2:
					printStudent();
					break;
				case 9:
					System.out.println("메인으로 돌아갑니다.");
					System.out.println();
					return;
					//return을 사용하면, 자신이 호출했던 곳으로 돌아간다.!!!!
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
			} else {

				System.out.print("메뉴 번호 : ");
				int num = sc.nextInt();

				sc.nextLine();

				switch (num) {
				case 1:
					insertStudent();
					break;
				case 2:
					printStudent();
					break;
				case 9:
					System.out.println("메인으로 돌아갑니다.");
					System.out.println();
					return;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
			}
		}
	}
	
	//사원 메뉴
	public void employeeMenu() {
		while (true) {
			System.out.println();
			
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인으로");

			if (pc.personCount()[1] == 10) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가 메뉴는 더 이상활성화 되지 않습니다.");

				System.out.print("메뉴 번호 : ");
				int num = sc.nextInt();

				sc.nextLine();

				switch (num) {
				case 2:
					printEmployee();
					break;
				case 9:
					System.out.println("메인으로 돌아갑니다.");
					System.out.println();
					return;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
			} else {
				System.out.print("메뉴 번호 : ");
				int num = sc.nextInt();

				sc.nextLine();

				switch (num) {
				case 1:
					insertEmployee();
					break;
				case 2:
					printEmployee();
					break;
				case 9:
					System.out.println("메인으로 돌아갑니다.");
					System.out.println();
					return;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
			}
		}
	}
	
	public void insertStudent() {

		while (true) {
			System.out.println();
			
			System.out.print("학생 이름 : ");
			String inputName = sc.nextLine();

			System.out.print("학생 나이 : ");
			int inputAge = sc.nextInt();

			System.out.print("학생 키 : ");
			double inputHeight = sc.nextDouble();

			System.out.print("학생 몸무게 : ");
			double inputWeight = sc.nextDouble();

			System.out.print("학생 학년 : ");
			int inputGrade = sc.nextInt();

			sc.nextLine();

			System.out.print("학생 전공 : ");
			String inputMajor = sc.nextLine();

			pc.insertStudent(inputName, inputAge, inputHeight, inputWeight, inputGrade, inputMajor);

			if (pc.personCount()[0] == 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
				return;
				
			} else { //학생객체배열의 데이터 수가 3이 아니라면,
				System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
				char n = sc.nextLine().charAt(0);
				
				if (n == 'N' || n == 'n') {
					return;
				} else {
					continue;
				}
			}
		}
	}
	
	public void printStudent() {
		System.out.println();
		
		for (Student sArr : pc.printStudent()) {
			if(sArr!=null) {
			System.out.println(sArr.toString());
			}
		}
	}
	
	public void insertEmployee() {
		
		while (true) {
			System.out.println();
			
			System.out.print("사원 이름 : ");
			String inputName = sc.nextLine();

			System.out.print("사원 나이 : ");
			int inputAge = sc.nextInt();

			System.out.print("사원 키 : ");
			double inputHeight = sc.nextDouble();

			System.out.print("사원 몸무게 : ");
			double inputWeight = sc.nextDouble();

			System.out.print("사원 급여 : ");
			int inputSalary = sc.nextInt();

			sc.nextLine();

			System.out.print("사원 부서 : ");
			String inputDept = sc.nextLine();

			pc.insertEmployee(inputName, inputAge, inputHeight, inputWeight, inputSalary, inputDept);

			if (pc.personCount()[1] == 10) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가를 종료하고 사원 메뉴로 돌아갑니다.");
				return;
				
			} else { //사원객체배열의 데이터 수가 10이 아니라면,
				System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
				char n = sc.nextLine().charAt(0);
				
				if (n == 'N' || n == 'n') {
					return;
				} else {
					continue;
				}
			}
		}
	}
	
	public void printEmployee() {
		System.out.println();
		
		for (Employee eArr : pc.printEmployee()) {
			if(eArr != null) {
			System.out.println(eArr.toString());
			}
		}
	}
}
