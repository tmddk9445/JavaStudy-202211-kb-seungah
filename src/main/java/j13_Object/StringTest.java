package j13_Object;

public class StringTest {

    public static void main(String[] args) {

        String str = "A"; // 리터럴 개념 - 이미 어딘가에 A라는 값이 정의 되어져있다. (이미 있는 주소값을 가지고 왔다.)
        String str2 = "A"; // (이미 있는 주소값을 가지고 왔다.)
        String str3 = new String("A"); // 새로운 주소값을 생성하여 A를 가지고와서 담았다.

        // nextLine 새로운 공간 할당 (버퍼)
        // Scanner 입력 후 enter (새로운 클래스 생성 후 (주소)값을 입력)

        System.out.println(str == str2); // true (주소값이 같다.)

        System.out.println(str.equals(str2)); // true

        System.out.println(str); // 주소값이 아니라 문자열(값)이 출력된다.
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str == str3); // false (주소값이 다르다.)

        System.out.println(str.toString()); // 문자열(값)이 출력된다. toString은 Object클래스안에 들어있는 메소드이다.


        // 상속(extends) 또는 구현(implement)이 되어있어야지만 오버라이드 할 수 있다.
        // 모든 클래스는 Object클래스를 상속받는다.

    }
}

/*
        hashCode(); - 주소

        getClass();

        equals(Object obj) {
            return (this == obj);
         }

        toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
            주소값 @ 주소값을 16진수로 바꿔라
        }
 */