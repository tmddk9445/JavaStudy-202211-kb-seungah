package j08_클래스;

public class PhoneMain {
    public static void main(String[] args) {

        // 생성자
        // 오버로딩 전에는 생략되어있었기 때문에 그냥 사용가능했다. 오버로딩 전에는 () 오류 x

        Phone iPhone14 = new Phone(); // 생성 후 ,,,,,하면서 값을 입력
        // 이름은 클래스 명과 같다 형식은 메소드 형식()과 같다.
        Phone galaxyS22 = new Phone("SAMSUNG", "GalaxyS22"); // 생성하는 시점에 값을 입력
        // 메모리를 할당받는 것, phone 이라는 클래스의 형태를 그대로 복사
        // 생성자가 두번 호출되었다. (메소드 호출)
        System.out.println(iPhone14);
        System.out.println(galaxyS22); // 해당 값의 주소값이 출력된다.

        iPhone14.company = "Apple"; // iPhone14의 주소를 찾아가라.company를 찾아가라 = Apple을 넣어라
//        galaxyS22.company = "SAMSUNG";

        iPhone14.printPhoneCompany();
        iPhone14.printPhoneModel();

        galaxyS22.printPhoneCompany();
        galaxyS22.printPhoneModel();
    }
}
