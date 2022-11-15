package j01_출력;

public class UserInfo {
    public static void main(String[] args) {
        // 변수
        String name = "이승아";
        String address = "부산 연제구 거제동";
        String phone = "010-3448-1254"; // int 맨앞에는 0을 표현할 수가 없다.
        int age = 26;
        int age2 = -26; // int 정수에는 음수,양수를 모두 포함한다.

        System.out.println(name + "의 주소는 " + address + "입니다.");
        System.out.println(name + "의 연락처는 " + phone + "입니다.");
        System.out.println(name + "의 나이는 " + age + "살 입니다.");

//        int a = 123;
//        int b = 0123;
//        int c = 029;

//        System.out.println(a);
//        System.out.println(b);

    }
}
