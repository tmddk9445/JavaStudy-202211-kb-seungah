package j16_컬렉션.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapMethod {

	public static void main(String[] args) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("username", "junil");
		map.put("password", "1234");
		map.put("name", "김준일");
		map.put("email", "junil@gmail.com");
		map.put("age", 29);
		map.put("gender", true);
		
		Map<String, String> address = new HashMap<>();
		address.put("address1", "부산광역시");
		address.put("address2", "동래구");
		address.put("address3", "중앙대로1285");
		
		map.put("address", map);
		
		Map<Integer, String> subject = new TreeMap<>(); // HashMap 무작위 TreeMap 순서대로 정렬되어있다
		subject.put(100, "java");
		subject.put(200, "C");
		subject.put(300, "python"); // 키 값을 지정하는 것 뿐만아니라 값을 지정할 수 있다.
		subject.put(401, "python2"); 
		subject.put(403, "python3"); 
		subject.put(502, "python4"); 
		subject.put(604, "python5"); 
		
		map.put("subject", subject);
		System.out.println(map);
		
		System.out.println(((Map<Integer, String>)map.get("subject")).get(403)); 
		//map.get("subject")이 Object로 업캐스팅 되어있다. // 전체를 묶어서 다운캐스팅해야한다.
		
		List<String> hobby = new ArrayList<>();
		
		hobby.add("축구");
		hobby.add("농구");
		hobby.add("야구");
		hobby.add("족구");
		
		map.put("hobby", hobby);
		
		System.out.println(((List<String>)map.get("hobby")).get(2));
		
		Set<Entry<String, Object>> userEntry = map.entrySet(); 
		// userEntry 자료형 Set(반복할 수 있다.)
		// map안에 있는 entry를 Set으로 바꾸는 것
		// entry는 key와 value중 하나만 담을 수 있다.
		// ctrl shift O : import 단축키
		
		List<Map<String, Object>> listMap = new ArrayList<>();

		System.out.println(map); // 중괄호 (map과 set은 안에 entry가 담겨져 있다.)
		System.out.println(userEntry); // 대괄호 묶인 괄호가 다르다.	
		
		Set<String> names = new HashSet<>();
		names.add("김준일");
		names.add("김준이");
		names.add("김준삼");
		names.add("김준사");
		names.add("김준오");
		
		System.out.println(names);
		for(String name : names) { // names에서 name을 꺼낸다.
			System.out.println(name);
		}
		
		for(Entry<String, Object> entry : userEntry) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		// key와 value를 하나로 묶어서 출력할 수 있는 객체가 entry이다.		
		
		System.out.println();
		/*+++++++++++++++++++++++++++++++++++++++++++++++++++++*/
		
		Set<String> keys = map.keySet(); // key값들만 모아서 Set으로 바꾸겠다.
		for(String key : keys) {
			System.out.println(key);
			System.out.println(map.get(key)); 
		}
		System.out.println("------------------------------");
		System.out.println(map.values());
		
		for(Object obj : map.values()) {
			System.out.println(obj);
		}
	}
}







