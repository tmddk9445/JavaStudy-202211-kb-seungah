package j19_익명클래스;
// 이름이 없다. (클래스를 만들어야지만 생성을 할 수 있지만 - 만들지 않았다.) 

@FunctionalInterface //람다로 쓰이는 인터페이스에는 반드시 무조건 FunctionalInterface 어노테이션이 있어야한다. 
						// 메소드를 하나만 쓰세요!!!라고 알려주는 어노테이션
public interface Calculator { // 인터페이스

	public int calc(int a, int b); // 추상메소드 = 오버라이드 해서 사용해야한다. 
	
	// 여러개가 들어와야 하는 경우 
	// 인터페이스를 따로 생성 하거나 int자료형이 아닌 여러개를 동시에 받을 수 있는 배열로 지정하여야한다. 
	
	public default int a() { // default메소드 = 오버라이드용이 아니다.
		return 10;
	}
	// @FunctionalInterface는 default메소드는 사용이 가능하다. - 오버라이드용이 아니기 때문에
	
}
