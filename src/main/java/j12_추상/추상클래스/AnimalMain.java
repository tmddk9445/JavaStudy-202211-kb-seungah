package j12_추상.추상클래스;

import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Animal animal = null; // 클래스가 참조자료형일 때 - null 주소가 비었다.(메모리의 제일 앞 0번주소)

        while (true) {
            String select = null;

            System.out.println("1. 사람");
            System.out.println("2. 호랑이");
            System.out.println("q. 종료");
            System.out.println("동물을 선택하세요 >>>");

            select = scanner.nextLine();

            if (select.equals("1")) {
                animal = new Human("사람");
            } else if (select.equals("2")) {
                animal = new Tiger("호랑이");
            } else if (select.equals("q")) {
                break;
            } else {
                System.out.println(" 다시 입력하세요.");
            }
            if (select.equals("1") || select.equals("2")) {
                animal.move(); // 공통으로 묶을 때 사용
            }
            System.out.println();
        }
        System.out.println("프로그램이 종료되었습니다.");
    }
}
//    public static void main(String[] args) {
//
//        Animal[] animals = new Animal[2]; // 업캐스팅 가능하다.(묶어둘 수 있다.) 생성은 불가하다.
//
//        animals[0] = new Human(); // 생성할때 Human의 생성자가 호출된다.
//        animals[1] = new Tiger();
//
//        for(int i=0; i<animals.length; i++){
//            animals[i].move(); // 상속 또는 구현되어 있어야한다.
//        }
//
////        Animal animal = new Animal(); //생성 할 수 없다. 추상클래스는 생성 자체를 할 수가 없다.
////        animal.move(); // 출력되지 않는다.
//    }
//}
//// 추상클래스 아파트(방3 욕실2)
//// 클래스 실제 구현할 수 있는 구체화가 필요하다.( 추상클래스를 상속받아서 )
