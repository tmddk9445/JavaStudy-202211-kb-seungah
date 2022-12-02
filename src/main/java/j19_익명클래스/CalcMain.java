package j19_익명클래스;

public class CalcMain {
	
	public static void main(String[] args) {
		
//		Calculator c1 = new Calculator; // 인터페이스는 생성할 수 없다.
		
		Calculator c1 = new Calculator() { 
			// c1에 Calcalator의 주소값(생성된 Heap메모리의)이 들어간다. - new는 무조건 올라간다. 
			// 원래 라면 클래스를 만들어서 인터페이스를 implement해서 호출하여야한다. 
			
			@Override // 1회용 틀 (한번 메모리 주소에 할당되고 다시 사용할 수 없다.)
			public int calc(int a, int b) { // 클래스 생성 없이 여기서만 딱 한번 임시 오버라이드하였다(임시구현)
				System.out.println("덧셈"); // 이름이 없는 익명 클래스이다. 
				return a + b;
			}
			
		};
		
		CalculatorSub cs = x -> x * x; // 추상 메소드는 람다로 사용 가능 - 메개변수가 한개 인 경우 괄호 생략 가능하다. 
		
		System.out.println(cs.calc(10));
		
		System.out.println(cs.a()); // default메소드는 정의 해서 사용가능
		
		System.out.println("==================");
		
		
			
		int r1 = c1.calc(10, 20);
		System.out.println(r1);
		
		int r3 = c1.calc(20, 40);
		System.out.println(r3); // c1안에 있는 생성자는 계속 호출 가능하다. 
		
		Calculator c2 = new Addition(); // Addition클래스 생성 후 calc 구현 가능하다. (반복해서 사용가능하다.)
		
		int r2 = c2.calc(20, 30);
		System.out.println(r2);
		}
		
	}
