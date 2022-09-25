package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

import com.kh.practice.map.model.vo.Member;

public class MemberController {

	private HashMap<String, Member> map = new HashMap<>();
	
	private Set<Entry<String, Member>> entrySet = map.entrySet();
	
	
	// 전달 받은 id가 없다면, id와 m을 map에 추가 후 true 반환
	// 			   있다면, false 값 반환
	public boolean joinMembership(String id, Member m) {
		if(map.get(id)==null) {
			map.put(id,m);
			return true;
		}else {
			return false;
		}
	}
	
	
	// 전달 받은 id가 존재하는지 확인 후 
	// 존재하면 Member에 저장된 비밀번호와 사용자가 입력한 비밀번호가 같은지 비교.
	// 비교 후, 같다면 저장된 Member의 이름 반환, 그 외 모든 상황에는 null 반환
	public String logIn(String id, String password) {

//		if (map.get(id) != null) {
//			for (Entry<String, Member> entry : entrySet) {
//				if (entry.getValue().getPassword().equals(password)) {
//					return entry.getValue().getName();
//				}
//			}
//			return null;
//		} else {
//			return null;
//		}
		
		//굳이 for문 돌려서 할필요 없을듯..
	
		//강사님 버전.
		String name = null;
		
		if(map.get(id)!=null && map.get(id).getPassword().equals(password)) {
			name = map.get(id).getName();
		}
		return name;
	}
	
	
	// 아이디가 존재하면서 저장된 비밀번호와 사용자가 입력한 비밀번호(oldPw)가
	// 같을 때 새로운 비밀번호로 바꾸고 true 반환, 아니라면 false 반환
	public boolean changePassword(String id, String oldPw, String newPw) {
//		if(map.get(id)==null) {
//			return false;
//		}else {
//			for (Entry<String, Member> entry : entrySet) {
//				if (entry.getValue().getPassword().equals(oldPw)) {
//					entry.getValue().setPassword(newPw);
//					return true;
//				}
//			}
//			return false;
//		}
		
		
		boolean result = false;
		
		if(map.get(id)!=null && map.get(id).getPassword().equals(oldPw)) {
			map.get(id).setPassword(newPw);
			result = true;
		}
		return result;
	}
	
	//전달 받은 id를 통해 Member의 이름을 새로 입력한 이름으로 변경
	public void changeName(String id, String newName) {
//		if(map.get(id)==null) {
//			return false;
//		}else {
//			for (Entry<String, Member> entry : entrySet) {
//				if (entry.getKey().equals(id)) {
//					entry.getValue().setName(newName);
//					return true;
//				}
//			}
//			return false;
//		}
		
		
		if(map.get(id)!=null) {
			map.get(id).setName(newName);
		}
	}
	
	// 전달 받은 name이 저장된 데이터의 이름과 같으면
	// key로 오름차순 해주는 객체에 해당 id와 이름 저장 후 객체 반환
	// 단, 엘리먼트 하나씩 뽑아내는 과정에서 keySet()을 쓸 것
	public TreeMap<String, Member> sameName(String name) {

		TreeMap<String, Member> tm = new TreeMap<>();
		// TreeMap 객체 생성

		Set<String> t = map.keySet();
		for(String id : t) {
			if(map.get(id).getName().equals(name)) {
				tm.put(id,map.get(id));
			}
		}
		return tm;
		
//		Iterator<String> it = map.keySet().iterator();
		// 단, 엘리먼트 하나씩 뽑아내는 과정에서 keySet()을 쓸 것
		
		// 전달 받은 name이 저장된 데이터의 이름과 같으면
		
//			while (it.hasNext()) {
//				if (name.equals(it.next())) {
//				String key = it.next();
//				map1.put(key, name);
//				// key로 오름차순 해주는 객체에 해당 id와 이름 저장 후 객체 반환
//				break;
//				}
//			}
//		return map1;
//	}
}
}
