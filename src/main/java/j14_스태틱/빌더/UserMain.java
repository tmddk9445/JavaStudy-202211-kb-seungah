package j14_스태틱.빌더;

public class UserMain {

    public static void main(String[] args) {
        User user = User.builder() // 클래스에서 바로 접근하는 것은 static메소드(호출) // . 앞에있는 것이 주소
                .username("seungah") // . 뒤의 메소드
                .password("1234")
                .email("seungah@gmail.com")
                .name("이승아")
                .build(); // 결과값 user를 생성해서 return한다. // user객체가 리턴된다.
        System.out.println(user);
        // 순서와 상관없이 주소를 찾아간다.
    }
}
