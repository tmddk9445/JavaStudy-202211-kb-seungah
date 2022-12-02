package j20_함수형인터페이스;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

public class Main3 {

	public static void forEachTest(Consumer<String> consumer, List<String> list) {
		for (String s : list) {
			consumer.accept(s);
		}
	}

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();

		names.add("임지현");
		names.add("신경수");
		names.add("고희주");
		names.add("문승주");
		names.add("장건녕");

//		for(String n : names) {
//			System.out.println(n);
//		}

		names.forEach(n -> {
			System.out.println(n);
		}); // 구현과 생성을 동시에
		// forEach는 메소드이다. (메소드 안에 값이 들어올 수 있다.)
		// Consumer 인터페이스를 통해 구현된 객체의 값이 들어올 수 있다.
		// Consumer를 구현한 객체가 업캐스팅되어서 들어온다. - action 값에
		// Consumer클래스에 accept메소드가 들어있다. (오버라이드되어 : n -> {System.out.println(n);})
		// 매개변수로 n을 받으며 자료형은 Consumer 생성시 입력한 자료형은 <? super T> = List<String> 이기 때문에
		// String으로 입력

		System.out.println();

		// < forEach >
//		default void forEach(Consumer<? super T> action) {
//	        Objects.requireNonNull(action); // List안에 넣어둔 입력값이 없을 때까지 반복한다. // null이 아닌 녀석이 필수다. 
//	        for (T t : this) {
//	            action.accept(t);
//	        }
//	    }

//		public interface Consumer<T> {
//			void accept(T t);

		// 위의 for문에서 하나씩 나오는 출력값을 forEachTest에서 받아서
		// 하나씩 빠져나오면서 출력된다.

		// accept메소드
		forEachTest(n -> { // n -> {System.out.println();} 구현과 생성이 동시에 이루어진 Consumer객체
			System.out.println(n);
		}, names);

//		Consumer<String> cons = n -> System.out.println(n);
//		// 인수를 받아 리턴하지않고 출력만 한다. 
//		
//		cons.accept("a"); // Consumer안에 있는 하나의 메소드를 accept에 받아놓았다. (재정의하였다.)

	}

}
