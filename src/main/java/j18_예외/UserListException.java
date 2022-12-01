package j18_예외;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
class User { // public X - 내부의 서브클래스 (접근지정자x : default)
	private String username;
	private String password;

}

public class UserListException { // public O -

	public static void main(String[] args) {
		List<User> userList = new ArrayList<>();

		userList.add(new User("aaa", "1111"));
		userList.add(new User("bbb", "2222"));
		userList.add(new User("ccc", "3333"));
		userList.add(new User("ddd", "4444"));
		userList.add(null);

		int length = userList.size();

		try { // 예외가 indexOutOfBoundsException -> catch에서 IndexOutOfBoundsException를 받는다. 

			for (int i = 0; i < length; i++) {
				System.out.println(userList.get(i));
			}
			for (int i = 0; i < 6; i++) { // try안에서 오류를 만나게 되면 후 프로그램은 실행되지 않는다.
				System.out.println("username : " + userList.get(i).getUsername());
				System.out.println("password : " + userList.get(i).getPassword());
			}
		} catch (IndexOutOfBoundsException indexOutOfBoundsException) { // java.lang.IndexOutOfBoundsException:
			length -= 1;
			System.out.println(indexOutOfBoundsException.getMessage());
			try {
				for (int i = 0; i < 6; i++) { // 실행되지 않는 for문을 다시 적어주어야한다.
					System.out.println("username : " + userList.get(i).getUsername());
					System.out.println("password : " + userList.get(i).getPassword());
				}
			} catch (NullPointerException nullPointerException) { // if문의 else 값이다. 
				System.out.println(nullPointerException.getMessage());
			}
		} 
//		catch (NullPointerException nullPointerException) { // if문의 else 값이다. 
//			System.out.println(nullPointerException.getMessage());
//		} 
		catch(Exception e) { // 반드시 있어야 한다. - 예외처리 실행 O
			e.printStackTrace();
			/*
			 *  모든 예외는 Exception를 상속받았다. 
			 *  위에서 내가 예상한 예외를 처리하지 못한 경우 마지막 예외에서 로그기록을 남긴다. 
			 *  
			 *  오류가 있습니다. 라는 메시지를 로그파일로 남겨준다.
			 *  해당 파일을 통해 어디에서 어떤 오류가 났는지 알 수 있다. (개발자가 오류수정을 위해 필요한 장치)
			 */

		} 
		finally { // 예외가 정상적으로 실행 여부 상관X, 예외의 유무 상관X : 무조건 마지막에 실행되는 부분.  - 예외처리 실행 X
			System.out.println("무조건 실행!!");
		} // 예외가 있는 경우 예외를 처리하지 못한 경우에도 finally은 반드시 실행된다.  
		System.out.println("무조건 실행? - NO - 예외 처리X 실행X");
		System.out.println("프로그램 정상 종료");
	}
}
