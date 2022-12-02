package j19_익명클래스;

public class Addition implements Calculator {

	@Override
	public int calc(int a, int b) {

		return a + b;
	}
	// 인터페이스로 구현된 클래스를 만들어야지만
	// 다른 생성된 클래스에서 정의된 Addition클래스를 호출가능하다. 
	
	
}

