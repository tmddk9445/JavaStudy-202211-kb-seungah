package j20_함수형인터페이스;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Main2 {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("임지현");
		names.add("신경수");
		names.add("고희주");
		names.add("문승주");
		Supplier<String> firstName = () -> names.get(0); // Getter의 람다식
		// 변수명을 통해서 return값의 정체?를 알려줄 수 있다. 
		
		System.out.println(firstName.get());
			
	}
}
