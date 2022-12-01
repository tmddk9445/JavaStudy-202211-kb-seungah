package j17_JSON;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Gson3 {
	
	public static void main(String[] args) {
		
		JsonObject jsonObject = new JsonObject();
		
		jsonObject.addProperty("username", "junil");
		jsonObject.addProperty("password", "1234");
		// property 지정된 자료형을 사용해야한다.
		
		System.out.println(jsonObject);
		
//		JsonElement element = new JsonArray(); //abstract class : 추상클래스 - 생성이 안된다.
		// JsonElement로 업캐스팅 되어있다.
		
		JsonArray jsonArray = new JsonArray();
		jsonArray.add("java");
		jsonArray.add("pathon");
		jsonArray.add("javascript");
		jsonArray.add("c#");
		
		System.out.println(jsonArray);
		
		jsonObject.add("subject", jsonArray);
		
		System.out.println(jsonObject);
	}
}
