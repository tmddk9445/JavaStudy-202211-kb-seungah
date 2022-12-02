package j19_익명클래스;
// 람다
// 구현 조건!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
// "인터페이스" 안에 메소드는 딱 하나만 있어야지만 람다를 쓸 수 있다. (추상메소드가 딱 한개)
// 생성 정의 오버라이드를 한번에 해주는 공식인데
// 메소드가 두개인 경우에 어느 메소드를 불러야 하는지 혼란이 온다. 

public class CalcMain2 {

	public static void main(String[] args) {

//		Calculator c = new Calculator() { // 클래스 생성
//			@Override // 정의
//			public int calc(int a, int b) { 
//				System.out.println("덧셈"); 
//				return a + b;
//			} // 오버라이드 시 (매개변수 변경 가능)
//		}; // 변수명과 자료형만 바뀌지 않으면 된다. 

//		Calculator c1 = (int x, int y) -> { // 인터페이스 안에 정의되어 있다. 
//		return x + y; // 정의 (생성과 동시에 대입) 
		// return앞에 다른 실행문이 온다면 람다식으로 줄일 수 없다.
		// 실행문이 바로 return인 경우 - {}중괄호 생략, retrun생략 가능
		//	};

		// 람다는 항상 대상이 있어야한다.
		// 대상(자료형이 지정되어있다. Calculator 자료형)
		
		// 람다를 사용하기 위해서는
//		인터페이스 안에는 조건이 무조건 딱 하나만 있어야한다.
//		람다는 무조건 항상 함수형 인터페이스여야 한다.

		Calculator c1 = (x, y) -> x + y;
		// Calculator 안에 calc메소드안에 자료형이 정해져있다. - int자료형으로
		// (x, y) -> x + y; return이 포함되어져 있다. - int자료형으로
		
		// 안에 다른 실행문을 써야하는 경우 중괄호를 쓰고 x + y; 앞에 return을 붙이고 실행문 사용가능

		int r1 = c1.calc(10, 20);
		System.out.println(r1);

		Calculator c2 = new Addition(); // Addition클래스 생성 후 calc 구현 가능하다. (반복해서 사용가능하다.)

		int r2 = c2.calc(20, 30);
		System.out.println(r2);
	}

}
