package j18_예외;

public class ThrowsException {

	public static void printArray(int[] numbers) throws Exception {
		// throws Exception
		// : printArray 메소드에서 예외가 일어날 수 있기 때문에 호출하려면 try catch 해야한다(강제화)
		// : printArray 메소드에서 일어날 예외를 throw했다. 
		for (int i = 0; i < 6; i++) {
			System.out.println(numbers[i]);
		}
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 4, 5 };

		try {
			printArray(nums);
			// 메소드를 사용하기 위해서 surround try catch를 통해 자동완성
			// 호출하는 단계로 예외를 미룬다.
			// 프로그램이 실행된 이후에 예외가 호출된다. 
		} catch (Exception e) {  
			// ( NullPointerException | ArrayIndexOutOfBoundsException e)-두 개를 비교해서 맞는 것으로 사용한다.
			e.printStackTrace();
		}

		System.out.println("프로그램 정상 종료");
	}
}
