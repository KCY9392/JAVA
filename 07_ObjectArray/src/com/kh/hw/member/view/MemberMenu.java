package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.model.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {

	Scanner sc = new Scanner(System.in);

	MemberController mc = new MemberController();

	public MemberMenu() {
	}

	public void mainMenu() {

		while (true) {
			System.out.println("최대 등록 가능한 회원 수는 10명입니다.");
			System.out.println("현재 등록된 회원 수는 " + mc.existMemberNum() + "명 입니다.");

			if (mc.existMemberNum() < 10) {
				System.out.println("1. 새 회원 등록");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");

				System.out.print("메뉴 번호 : ");
				int num = sc.nextInt();
				
				sc.nextLine();//버퍼 지우기

				switch (num) {
				case 1:
					insertMember();
					break;
				case 2:
					searchMember();
					break;
				case 3:
					updateMember();
					break;
				case 4:
					deleteMember();
					break;
				case 5:
					printAll();
					break;
				case 9:
					break;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					continue;
				}
				break;
			} else {
				System.out.println("회원 수가 모두 꽉찼기 때문에 일부 메뉴만 오픈합니다.");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");

				System.out.print("메뉴 번호 : ");
				int num = sc.nextInt();
				
				sc.nextLine();

				switch (num) {
				case 2:
					searchMember();
					break;
				case 3:
					updateMember();
					break;
				case 4:
					deleteMember();
					break;
				case 5:
					printAll();
					break;
				case 9:
					break;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					continue;
				}
				break;
			}
		}
		return;
	}
	
	public void insertMember() {
		System.out.println("새 회원을 등록합니다.");
		String inputId =" "; 
		char gender = ' ';
		
		while(true) {
		System.out.print("아이디 : ");
		inputId = sc.nextLine();
		
		if(mc.checkId(inputId)) {
			System.out.println("중복된 아이디 입니다. 다시 입력해주세요.");
			continue;
		}else {
			break;
			}
		}
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		
		while(true) {
		System.out.print("성별 : ");
		gender = sc.nextLine().charAt(0);
		if(gender != 'M'&& gender != 'm' && gender != 'F' && gender != 'f' ) {
			System.out.println("성별을 다시 입력하세요");
			continue;
		}
		break;
		}
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		mc.insertMember(inputId, name, password, email, gender, age);
		
		System.out.println("\n");
		
		mainMenu();
	}
	
	public void searchMember() {
		System.out.println("1. 아이디 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 검색하기");
		
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		switch(num) {
		case 1 : searchId();
		case 2 : searchName();
		case 3 : searchEmail();
		case 9 : System.out.println("메인으로 돌아갑니다.\n\n");
				mainMenu();
		default : System.out.println("잘못 입력하셨습니다.\n\n");
		 			mainMenu();
		}
	}
	
	public void searchId() {
		System.out.print("검색할 아이디 : ");
		String fintId = sc.nextLine();
		
		if(mc.searchId(fintId).equals("회원O")) {
			System.out.println("찾으신 회원 검색 결과입니다.");
			Member [] mArr = mc.printAll();
			for(int i=0; i<mArr.length; i++) {
				if(mArr[i].getId().equals(fintId)) {
					System.out.println(mArr[i].inform());
				}
			}
			System.out.println("\n");
			mainMenu();
		}
		
		else if(mc.searchId(fintId).equals("회원X")){
			System.out.println("검색 결과가 없습니다.\n\n");
			mainMenu();
		}
	}
	
	
	public void searchName() {
		System.out.print("검색할 이름 : ");
		String findName = sc.nextLine();

		if (mc.searchName(findName) != null) {
			System.out.println("찾으신 회원 검색 결과입니다.");
			Member mArr[] = mc.searchName(findName);
			for (int i = 0; i < mArr.length; i++) {
				if (mArr[i].getName().equals(findName)) {
					System.out.println(mArr[i].inform());
				}
			}
			System.out.println("\n");
			mainMenu();
		} else {
			System.out.println("검색 결과가 없습니다.\n\n");
			mainMenu();
		}
	}
	
	
	public void searchEmail() {
		System.out.print("검색할 이메일 : ");
		String findEmail = sc.nextLine();

		if (mc.searchEmail(findEmail) != null) {
			System.out.println("찾으신 회원 검색 결과입니다.");
			Member mArr[] = mc.searchEmail(findEmail);
			for (int i = 0; i < mArr.length; i++) {
				if (mArr[i].getEmail().equals(findEmail)) {
					System.out.println(mArr[i].inform());
				}
			}
			System.out.println("\n");
			mainMenu();
		} else {
			System.out.println("검색 결과가 없습니다.\n\n");
			mainMenu();
		}
	}
	
	
	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		switch(num) {
		case 1 : updatePassword(); break;
		case 2 : updateName(); break;
		case 3 : updateEmail(); break;
		case 9 : System.out.println("메인으로 돌아갑니다.\n\n");
				mainMenu();
		default : System.out.println("잘못 입력하셨습니다.\n\n");
		 			mainMenu();
		}
	}
	
	
	public void updatePassword() {
		System.out.print("수정할 회원의 아이디 : ");
		String updateId = sc.nextLine();
		
		System.out.print("수정할 비밀번호 : ");
		String updatePassword = sc.nextLine();
		
		if(mc.updatePassword(updateId, updatePassword)) {
			System.out.println("수정이 성공적으로 되었습니다.\n\n");
			mainMenu();
		}else {
			System.out.println("존재하지 않는 아이디입니다.\n\n");
			mainMenu();
		}
	}
	
	
	
	public void updateName() {
		System.out.print("수정할 회원의 아이디 : ");
		String updateId = sc.nextLine();
		
		System.out.print("수정할 이름 : ");
		String updateName = sc.nextLine();
		
		if(mc.updateName(updateId, updateName)) {
			System.out.println("수정이 성공적으로 되었습니다.\n\n");
			mainMenu();
		}else {
			System.out.println("존재하지 않는 아이디입니다.\n\n");
			mainMenu();
		}
	}
	
	
	
	public void updateEmail() {
		System.out.print("수정할 회원의 아이디 : ");
		String updateId = sc.nextLine();
		
		System.out.print("수정할 이메일 : ");
		String updateEmail= sc.nextLine();
		
		if(mc.updateEmail(updateId, updateEmail)) {
			System.out.println("수정이 성공적으로 되었습니다.\n\n");
			sc.nextLine();
			mainMenu();
		}else {
			System.out.println("존재하지 않는 아이디입니다.\n\n");
			mainMenu();
		}
	}
	
	
	
	public void deleteMember() {
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		switch(num) {
		case 1 : deleteOne(); break;
		case 2 : deleteAll();  break;
		case 9 : System.out.println("메인으로 돌아갑니다.\n\n");
				mainMenu();
		default : System.out.println("잘못 입력하셨습니다.\n\n");
		    		mainMenu();
		}
	}
	
	
	
	public void deleteOne() {
		System.out.print("삭제할 회원의 아이디 : ");
		String deleteId = sc.nextLine();
		
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		char yesNo = sc.nextLine().charAt(0);
		
		if(yesNo == 'y' || yesNo == 'Y') {
			if(mc.delete(deleteId)) {
				System.out.println("성공적으로 삭제하였습니다.\n\n");
				mainMenu();
			}else {
				System.out.println("존재하지 않는 아이디입니다.\n\n");
				mainMenu();
			}
		}else if(yesNo == 'n' || yesNo == 'N'){
			System.out.println("삭제가 취소되었습니다.\n\n");
			mainMenu();
		}
	}
	
	
	public void deleteAll() {
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		char yesNo = sc.nextLine().charAt(0);

		if (yesNo == 'y' || yesNo == 'Y') {
			mc.delete();
			System.out.println("성공적으로 삭제하였습니다.\n\n");
			mainMenu();

		} else if(yesNo == 'n' || yesNo == 'N') {
			System.out.println("삭제가 취소되었습니다.\n\n");
			mainMenu();
		}
	}
	
	
	
	public void printAll() {
		if (mc.existMemberNum() != 0) {
			Member mArr [] = mc.printAll();
			for (int i=0; i< mc.printAll().length; i++) {
				if(mArr[i]!=null) {
					System.out.println(mArr[i].inform());
				}
			}
			System.out.println("\n");
			mainMenu();
		} else {
			System.out.println("저장된 회원이 없습니다.\n\n");
			mainMenu();
		}
	}
}
