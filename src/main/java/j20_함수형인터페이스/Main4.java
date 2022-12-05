package j20_함수형인터페이스;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main4 {
	
	public static void main(String[] args) {
		
		Function<Integer, String> fx1 = age -> age + "살"; // <매개변수, 리턴타입>
		
		System.out.println(fx1.apply(20));
		
		Function<Function<Integer, String>, String> fx2 = fx -> fx.apply(20) + "입니다.";// 매개변수로 함수형 인터페이스가 또 들어올 수 있다. 
		
		System.out.println(fx2.apply(age -> age + "살")); // 람다 안에서 람다 사용 가능, 리턴 자체를 람다로 사용 가능?
		
		BiFunction<Integer, String, Map<Integer, String>> createMap = (number, name) -> {  // T 매개변수 U 매개변수 R 리턴(Map)
			Map<Integer, String> map = new HashMap<>();
			map.put(number, name);
			return map;
		}; // Map을 만들어서 두개의 값을 항상 쌍으로 만드는 식
		
		List<Map<Integer, String>> list = new ArrayList<>();
		list.add(createMap.apply(100, "김준일"));
		list.add(createMap.apply(200, "유열림"));
		list.add(createMap.apply(300, "이승아"));
		list.add(createMap.apply(400, "이영인"));
		list.add(createMap.apply(500, "임지현"));
		
		System.out.println(list);
		
	} 
}
