package j16_컬렉션.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringSet {

	public static void main(String[] args) { // main입력 + ctrl + space + enter
		// 줄 정렬 ctrl shift f
		// alt shift s (alt ins)
		// 예정이 블로그 보기 단축키
		
		Set<String> nameSet = new HashSet<String>();
		nameSet.add("김준일"); // ctrl alt 밑으로 : 줄 복사 // ctrl d : 라인삭제
		nameSet.add("김수현"); // alt 움직이기 // 인텔리제이 alt shift
		nameSet.add("문경원");
		nameSet.add("권용범");
		nameSet.add("이영인");
		
		System.out.println(nameSet); // set은 인덱스가 없어서 그냥 for문을 사용할 수가 없다.
		
		for(String s : nameSet) {
			if(s.equals("김준일")) {
				System.out.println(s);
				break;
			}
		}
		
		List<String> nameList = Arrays.asList(new String[] {"김준일", "권용범"});
		
		System.out.println(nameList);
		
		Set<String> listToSet = new HashSet<String>();
		listToSet.addAll(nameList); 
		// list를 모두 set으로 옮길 때 addAll(매개변수로 collection을 받는다.) 사용
		// collection이면 모두 addAll로 받을 수 있다.
		// map(collection 인터페이스를 상속 받지 않기 때문에)에서는 addAll을 받을 수 없다.
		System.out.println(listToSet);
		
		nameSet.remove("김준일");
		// 원하는 값을 직접 지운다.
		
		System.out.println(nameSet);
		
		// 업데이트(수정) : 기존의 값을 바꾸는 것 값 자체가 key값이다.
		// 수정의 개념이 없고 지우고 값을 넣어야 한다. (삭제 + 추가가 동시에 일어난다.)
		
		// set은 인터페이스
		// hastSet은 클래스 ( hashSet은 set의 인터페이스를 받고 있다. 다운캐스팅.....????????)
		
		
	}

}














