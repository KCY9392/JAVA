package com.kh.hw.member.model.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	
	public final int SIZE = 10;
	Member [] m = new Member [SIZE];
	
	public int existMemberNum() {
		for(int i=0; i< m.length; i++) {
			if(m[i]==null) {
				return i;
			}
		}
		return m.length;
	}
	
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		
			m[existMemberNum()] = new Member(id,name,password,email,gender,age);
		
	}
	
	public boolean checkId(String inputId) {
		Boolean isTrue = false;

		if (existMemberNum() == 0) {
			return isTrue;
		} else {
			for (int i = 0; i < existMemberNum(); i++) {
				if (m[i].getId().equals(inputId)) {
					isTrue = true; // 중복 아이디 있음.
				}
			}
		}
		return isTrue;
	}
	
	public String searchId(String id) {
		for(int i=0; i<m.length; i++) {
			if(m[i]==null) {
				break;
			}
			if(m[i].getId().equals(id)) {
				return "회원O";
			}
		}
		return "회원X";
	}
	
	
	public Member [] searchName(String name) {
		for(int i=0; i<m.length; i++) {
			if(m[i]==null) {
				break;
			}
			if(m[i].getName().equals(name)) {
				return m;
			}
		}
		return null; 
	}
	
	public Member [] searchEmail(String email) {
		for(int i=0; i<m.length; i++) {
			if(m[i]==null) {
				break;
			}
			if(m[i].getEmail().equals(email)) {
				System.out.println("찾으신 회원 조회 결과입니다.\n");
				return m;
			}
		}
		System.out.println("검색 결과가 없습니다.");
		return null; 
	}
	
	public boolean updatePassword(String id, String password) {
		for(int i=0; i<m.length; i++) {
			if(m[i]==null) {
				break;
			}
			if(m[i].getId().equals(id)) {
				m[i].setPassword(password);
				return true;
			}
		}
		return false;
	}
	
	
	public boolean updateName(String id, String name) {
		for(int i=0; i<m.length; i++) {
			if(m[i]==null) {
				break;
			}
			if(m[i].getId().equals(id)) {
				m[i].setName(name);
				return true;
			}
		}
		return false;
	}
	
	
	public boolean updateEmail(String id, String email) {
		for(int i=0; i<m.length; i++) {
			if(m[i]==null) {
				break;
			}
			if(m[i].getId().equals(id)) {
				m[i].setEmail(email);
				return true;
			}
		}
		return false;
	}
	
	
	public boolean delete(String id) {
		boolean isTrue = false;
		for (int i = 0; i < m.length; i++) {
			if(m[i]==null) {
				break;
			}
			if (m[i].getId().equals(id)) {// 삭제하려는 회원의 id와 m[i]의 id가 동일하다면,
				//m[i] = null;
				for (int j = i; j < m.length; j++) {
					if(j+1!=m.length){
					m[j] = m[j+1];
					}
				}
				m[m.length-1]=null;
				isTrue = true;
				break;
			}
		}
		return isTrue;
	}
	
	
	public void delete() {
		for(int i=0; i<m.length; i++) {
			m[i] = null;
		}
	}
	
	
	public Member [] printAll() {
		return m;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
