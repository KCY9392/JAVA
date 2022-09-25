package com.kh.practice.list.music.model.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.music.model.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {

	private Scanner sc = new Scanner(System.in);
	
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		
		while(true) {
		System.out.println("******* 메인 메뉴 *******");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("9. 종료");
		
		System.out.print("메뉴 번호 입력 : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		switch(num) {
		case 1 : addList(); break;
		case 2 : addAtZero(); break;
		case 3 : printAll(); break;
		case 4 : searchMusic(); break;
		case 5 : removeMusic(); break;
		case 9 : System.out.println("종료"); return;
		default : System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
		}
		}
	}
	
	public void addList() {
		System.out.println("****** 마지막 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		
		Music m = new Music(title,singer);
		int result = mc.addList(m);
		
		if(result == 1) {
			System.out.println("추가 성공\n");
		}else {
			System.out.println("추가 실패\n");
		}
	}
	
	public void addAtZero() {
		System.out.println("****** 첫 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		
		Music m = new Music(title,singer);
		int result = mc.addAtZero(m);
		//int result = mc.addAtZero(new Music(title,singer));
		// 얘도 가능.
		
		if(result == 1) {
			System.out.println("추가 성공\n");
		}else {
			System.out.println("추가 실패\n");
		}
	}
	
	public void printAll() {
		System.out.println("****** 전체 곡 목록 출력 ******");
//		List<Music> list = mc.printAll();
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		System.out.println(mc.printAll());
		
	}
	
	public void searchMusic() {
		System.out.println("****** 특정 곡 검색 ******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		
		if(mc.searchMusic(title)==null) {
			System.out.println("검색한 곡이 없습니다.");
		}else {
			System.out.println(mc.searchMusic(title).getSinger()+" - "+mc.searchMusic(title).getTitle());
		}
	}
	
	public void removeMusic() {
		System.out.println("****** 특정 곡 삭제 ******");
		System.out.print("삭제할 곡 명 : ");
		String title = sc.nextLine();
		Music m = mc.removeMusic(title);
		
		if(m==null) {
			System.out.println("삭제할 곡이 없습니다.");
		}else {
			System.out.println(m.getSinger()+" - "+m.getTitle()+" 을 삭제하였습니다.");
		}
	}
	
	
}
