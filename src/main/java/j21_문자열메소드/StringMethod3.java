package j21_문자열메소드;

import java.util.function.Function;

public class StringMethod3 {

	public static void main(String[] args) {

		Function<String, String> replacePhoneToken = phoneNumber -> phoneNumber.replaceAll(" ", "").replaceAll("/", "")
				.replaceAll("-", "").replaceAll("[.]", "");
		// 정규식에서는 온점을 그냥 사용하면 안된다. 대괄호 안에 묶어서 사용
		// 함수를 한번 설정하여 사용한다.

		String phone1 = "010-1111/2222";
		String phone2 = "010/1111-2222";
		String phone3 = "010-1111.2222";
		String phone4 = "010.1111/2222";

		System.out.println(replacePhoneToken.apply(phone1));
		System.out.println(replacePhoneToken.apply(phone2));
		System.out.println(replacePhoneToken.apply(phone3));
		System.out.println(replacePhoneToken.apply(phone4));

	}
}
