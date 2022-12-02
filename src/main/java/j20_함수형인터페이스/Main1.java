package j20_함수형인터페이스;

public class Main1 {

	public static void main(String[] args) {

		int a = 10;
		/*
		 * 메소드 안에서 메소드를 정의할 수 있다.
		 */
		Runnable application1 = () -> { // 메소드 정의 부분
			// 매개변수 대입 없이 값 사용 가능
			// 메소드 안에서 쓰기 위해서는 매개변수로 값을 받아야 하는데 없이 사용!
			// 매개변수 없을 때 생략 불가 (딱 하나일 경우에만 생략 가능)
			System.out.println("프로그램을 시작합니다. ");
			System.out.println("a : " + a);

		};

		application1.run();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 100; i++) {
				try {
					System.out.println("채팅기능");
					System.out.println(i + " : " + (i + 1));
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		// Thread 클래스 생성이 가능하다.
		// Thread클래스 안에는 Runnable 인터페이스를 객체로 받는다.
		// Runnable인터페이스 안에는 run메소드를 가지고 있다.

		// timer : Runnable타입으로 되어져 있다. (안에 run메소드를 가지고있다.)
		// 따라서 Runnable 타입이기 때문에 매개변수 대신에 바로 람다식으로 표현 가능하다.
		Thread t2 = new Thread(() -> {

			for (int i = 0; i < 100; i++) {
				try {
					System.out.println("알림기능");
					System.out.println(i + " : " + (i + 1));
					Thread.sleep(100); // 100 millisecond
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t1.start(); // start할 경우 Thread에 실행문을 던진다. (Runnable에 정의 되어져 있는 run이 실행된다.)
		t2.start(); // 비동기처리 : t1의 실행이 끝날 때까지 기다리는 것이 아니라 바로 실행된다.
		// 네이버 메인화면의 광고처리부분이 비동기처리로 실행된다.
		// 동기처리 : 무조건 순서대로 처리

		// 웹서버는 자체적으로 멀티 Thread로 구성되어져있다.

	}

}
