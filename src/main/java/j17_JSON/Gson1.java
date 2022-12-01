package j17_JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson1 {
	
	public static void main(String[] args) {
		
		Gson gson = new Gson();
		
//		Gson gsonBuilder = new GsonBuilder().create();
		
		// 풀어쓸 수 있다. ▽
		GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson2 = gsonBuilder.setPrettyPrinting().create();
		// setPrettyPrinting() -> 해석한 그대로 예쁘게 정렬해서 프린트해줌
		
		Map<String, Object> map = new HashMap<>();
		map.put("name", "김준일");
		map.put("email", "junil@gmail.com");
		map.put("address", "부산 동래구");
		map.put("phone", "01099881916");
		
		List<String> hobby = new ArrayList<>();
		hobby.add("축구");
		hobby.add("농구");
		hobby.add("야구");
		
		map.put("hobby", hobby);
		
		System.out.println(map);
		
		String json = gson2.toJson(map); // 해당 열을 문자열로 바꿈
		
		System.out.println(json);
		
		Map<String, Object> jsonMap = gson2.fromJson(json, Map.class);
		// json을 map으로 바꿔라
		
		System.out.println(jsonMap);		
	}

}

















