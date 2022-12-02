package j19_익명클래스;

@FunctionalInterface
public interface CalculatorSub {
	
	public int calc(int a); // Calculator 인터페이스와 메개변수의 개수가 다르다. (다를경우 새로 생성)
	
	public default int a() { // 인터페이스에서 기본메소드는 추상메소드이다. (기본메소드 ???? default????)
		return 10;
	}

}
