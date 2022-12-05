package j21_문자열메소드;

public class StringMethod2 {

	public static void main(String[] args) {
		
		// 문자열을 배열로 만드는 법
		
		String roles = "ROLE_USER, ROLE_MANAGER, ROLE_ADMIN";
		
		String[] roleArray = new String[3];
		
		String tempRoles = roles;
		
		// 처음부터 쉼표 전까지 자른다. 
		roleArray[0] = tempRoles.substring(0, tempRoles.indexOf(",") != -1 ? tempRoles.indexOf(",") : tempRoles.length());
		// 쉼표의 위치를 찾아서 그 위치에서 2칸 뒤의 자리 앞자리를 다 날려서 tempRoles에 담겠다. 
		tempRoles = tempRoles.substring(tempRoles.indexOf(",") + 2);
		
		roleArray[1] = tempRoles.substring(0, tempRoles.indexOf(",") != -1 ? tempRoles.indexOf(",") : tempRoles.length());
		tempRoles = tempRoles.substring(tempRoles.indexOf(",") + 2);
		
		// -1은 해당 부분에 쉼표가 없으면 false값인 부분의 길이를 담는다. 
		roleArray[2] = tempRoles.substring(0, tempRoles.indexOf(",") != -1 ? tempRoles.indexOf(",") : tempRoles.length());

		for(String role : roleArray) {
			System.out.println(role);
		}				
		
		// split '쉼표와 띄어쓰기'를 기준으로 값을 잘라서 각각 배열에 넣어라
		// 값이 변경된다면?(띄어쓰기가 없다면?) - roles에서 스페이스바를 다 없애고 , 를 기준으로 나눈다. 
		String[] roleArray2 = roles.split(", ");
		for(String role : roleArray2) {
			System.out.println(role);
		}
	}
}
