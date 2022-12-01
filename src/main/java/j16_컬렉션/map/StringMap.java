package j16_컬렉션.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class StringMap {
	
	public static void main(String[] ars) {
		Map<String, String> language = new HashMap<String, String>();
		
		language.put("java", "자바2"); // add = put
		language.put("html", "에이치티엠엘"); 
		language.put("css", "씨에스에스");
		language.put("js", "자바스크립트");
		language.put("phthon", "파이썬"); // 출력시 무작위로 출력된다.
		language.put("phthon2", "파이썬"); // value는 중복 값 입력 가능 // key값은 중복불가
		language.put("phthon", "파이썬?!?"); // 동일 key값인 경우 뒤에 입력된 key값이 덮어쓴다. 
		
		System.out.println(language);	
		String s = language.get("java");
	
		System.out.println(s);
		
		language.replace("java", "자바2", "자바3"); // set
		System.out.println(language.get("java"));
		
		language.remove("phthon2");
		System.out.println(language);
		
		
		language.forEach((k, v) -> {
			System.out.println("key : " + k);
			System.out.println("value : " + v);
		});
		
		for(Entry<String, String> entry : language.entrySet()) {
			System.out.println("key : " + entry.getKey());
			System.out.println("value : " + entry.getValue());
		}
		System.out.println();
		
		Iterator<String> ir = language.keySet().iterator();
		
		while(ir.hasNext()) {
			String key = ir.next();
			System.out.println("key : " + key);
			System.out.println("value : " + language.get(key));
		}
	}
}








