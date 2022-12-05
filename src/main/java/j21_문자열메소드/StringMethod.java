package j21_문자열메소드;

public class StringMethod {

	public static void main(String[] args) {

		String name = "김준일김수현";

		System.out.println(name.length());
		// 문자열도 위치가 0부터 시작한다.
		// .length()라는 메소드를 통해 길이를 알 수 있다.

		// 문자의 위치 찾기
		System.out.println(name.indexOf("김"));
		System.out.println(name.indexOf("준"));

		// 문자의 위치 뒤에서부터 찾기
		System.out.println(name.lastIndexOf("김"));

		// 리턴 자료형이 char
		char name1 = name.charAt(0);
		System.out.println(name1);

		char name2 = name.charAt(name.indexOf("준"));
		System.out.println(name2);

		String subName1 = name.substring(0, 2); // 프로그램에서는 0번 index에서 2번 index앞까지 잘라라
		System.out.println(subName1);

		String subName2 = name.substring(2); // 2번 index부터 끝까지
		System.out.println(subName2);

		String nameJunil = "김준일"; // 값에 김수현을 입력하면 김수현을 찾아준다.

		// 원하는 입력값의 시작부터 그 입력값의 길이 만큼 더해서 출력
		System.out.println(name.substring(name.indexOf(nameJunil), name.indexOf(nameJunil) + nameJunil.length()));

		// 파일의 경로 찾기

		String file = "C:/String.java";
		String fileName = null; // 파일이름
		String extension = null; // 확장자

		String fileJava = "String";
//		System.out.println(
//				file.substring(file.indexOf(fileJava), file.indexOf(fileJava) + fileJava.length()));

		fileName = file.substring("C:/".length(), file.lastIndexOf("."));
		System.out.println(fileName);

		extension = file.substring(file.lastIndexOf("."));
		System.out.println(extension);

	}
}
