package com.kh.chap03_map.run;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.model.vo.Snack;

public class Run {

	public static void main(String[] args) {
		
		// 계층 구조를 보면 List나 set계열은 Collection을 구현한 클래스다. => 데이터를 추가할때 add메소드 사용.
		// 단, Map은 아니다. => 데이터를 추가할때 put이라는 메소드를 사용(key + value 세트로 추가해줘야함)
		
		HashMap<String, Snack> hm = new HashMap</* E e */>();
		//		key		value
		
		
		// 1. put(K key, V value) => map공간에 key + value 세트로 추가해주는 메소드.
		hm.put("다이제", new Snack("초코맛",1500));
		hm.put("새우깡", new Snack("짠맛",1500));
		hm.put("포테이토칩", new Snack("짠맛",1500));
		hm.put("칸쵸", new Snack("단맛",600));
		hm.put("칸쵸", new Snack("단맛",1600));
		// key값이 동일하다면, 나중에 나온 put메소드로 덮어씌워진다.
		
		System.out.println(hm);
		// {다이제=Snack [flavor=초코맛, calory=1500], 
		//  새우깡=Snack [flavor=짠맛, calory=1500], 
		//  포테이토칩=Snack [flavor=짠맛, calory=1500], 
		//  칸쵸=Snack [flavor=단맛, calory=600]}
		
		//key값 먼저 들어가고, value값이 들어간 형태
		//순서유지X,
		//중복값은 들어감. => hashCode, equals 정의해도 동일하게 출력. -> value값은 상관없음.
		//value값이 동일해도 key값이 중복되지 않기 때문에, 잘 저장되는 것을 볼 수 있다.
		
		System.out.println("--------------------------------------");
		// 2. get(Object key) : V => Map에서 해당 키값의 value값을 돌려주는 메소드.
		System.out.println(hm.get("다이제"));
		
		
		System.out.println("--------------------------------------");
		// 3. size() -> map에 담겨있는 개수.
		System.out.println(hm.size());
		
		
		System.out.println("--------------------------------------");
		//4. replace(K key, V value) => 맵에 해당 key값을 찾아서 새로 전달된 value로 변경시켜주는 메소드.
		hm.replace("포테이토칩", new Snack("단짠단짠",1000));
		System.out.println(hm.get("포테이토칩"));
		//새로 값이 바뀜.
		//replace보다 put을 많이 사용.
		
		System.out.println("--------------------------------------");
		// 5. remove(Object key) => 맵에 해당하는 key값을 찾아서 key+value 전체를 지워주는 메소드.
		hm.remove("포테이토칩");
		System.out.println(hm);
		//key값을 찾아서 key+value 세트 전체를 지워주는 메소드이다.
		
		
		
		
		System.out.println("--------------------------------------");
		
		//map의 전체를 뽑아오는 방법 ?
		
		// ArrayList list = new ArrayList(hm); -> 사용이 불가능함.
		
		// for(String key : hm){           } -> 사용 불가.
		
		//Iterator it = hm.iterator(); -> 애초에 사용 불가.
		
		
		// Map을 set으로 바꿔주는 메소드가 있다. (2개)
		// HashMap => set계열로 바꿔주고 => 다시 Iterator로 바꿔주는 방법.
		
		// 1. keySet() 을 이용한 방법.
		// 1-1) hm에 있는 key들만 뽑아서 set에 담기.
//		Set<String> keyset = hm.keySet();
		
		// 1-2) 1번과정에서 작업된 keyset을 Iterator에 담기.
//		Iterator<String> it = keyset().iterator();
		
		Iterator<String> it = hm.keySet().iterator();
		//이런식으로 메소드체이닝을 이용하기도 함.
		
		// 1-3) 반복자(iterator)에 담긴것들을 순차적으로 뽑기.
		while(it.hasNext()) {
			String key = it.next();
			Snack value = hm.get(key);
			System.out.println(key);
			System.out.println(value); //map의 key값만 따로 뽑아서 출력해줌.
		}
		
		System.out.println("--------------------------------------");

		// 2. entrySet() 이용하는 방법.
		
		// 2-1) hm에 있는 모든 key + value를 Entry클래스로 담아서 set에 담는 방법.(집합형태)
		Set<Entry<String, Snack>> entrySet = hm.entrySet();
		
		// 2-2) entrySet에 있는 것들을 Iterator에 담기.
		Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();
		
		// 2-3) 반복문을 이용해서 순차적으로 뽑기.
		while(itEntry.hasNext()) {
			Entry<String, Snack> entry = itEntry.next();
			
			System.out.println(entry.getKey());
			//현재 Entry객체에 담겨있는 key를 출력
			System.out.println(entry.getValue());
			//현재 Entry객체에 담겨있는 value를 출력.
		}
		
		System.out.println("--------------------------------------");

		// 이런방법도 있다.
		
		for( Entry<String, Snack> entry :  entrySet ) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		System.out.println("--------------------------------------");

		ArrayList<Entry<String,Snack>> list = new ArrayList(entrySet);
		System.out.println(list);
		
		System.out.println("--------------------------------------");

		System.out.println(hm.values());
		//value값만 출력됨.
		
	}

}
