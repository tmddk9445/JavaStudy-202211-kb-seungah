package j18_예외;

public class ArrayException {
	public static void main(String[] args) {

		Integer[] numberArray = new Integer[] { 1, 2, 3, 4, 5 };

		try {

			for (int i = 0; i < 6; i++) {
				System.out.println(numberArray[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// try 안에서 예외 객체가 발견되는 경우 catch 한테 메개변수로 던져준다.
			System.out.println(e); // 예외 메시지를 가지고 있다.
			e.printStackTrace(); // 이 예외가 가지고 있는 문제점과 위치를 모두 실행
			System.out.println(e.getMessage()); // 안에 있는 메시지만 가져올 수 있다.
			System.out.println("예외가 생성됨"); // i < 5 일경우 실행되지 X
			// catch 에서 Throwable을 상속받아서 사용할 수 있다. ?????????????????????????????????????
		}
		System.out.println("프로그램 정상 종료"); // 예외 발생 후에도 시스템이 종류 되지않았다.

	}
}
// Index 5 out of bounds for length 5
