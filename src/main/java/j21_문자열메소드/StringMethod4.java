package j21_문자열메소드;

import java.util.Arrays;
import java.util.List;

public class StringMethod4 {
	public static void main(String[] args) {

		String roles = "ROLE_USER, ROLE_MANAGER, ROLE_ADMIN, GUEST";
		roles = roles.replaceAll(" ", "");

		String[] roleArray = roles.split(",");
		List<String> roleList = Arrays.asList(roleArray);

		System.out.println(roleList);

		roleList.forEach(role -> {
			// prefix(접두어) startsWith()
			// suffix(접미어) endWith()
			if (role.startsWith("ROLE_") && role.equalsIgnoreCase("role_user")) {
				// equalsIgnoreCase 소대문자 구분없이 글자로만 판단한다.
				System.out.println("권한 : " + role);
			}
			// GUEST는 접미어가 없기 때문에 출력되지 않는다.
		});
	}	
	
}
