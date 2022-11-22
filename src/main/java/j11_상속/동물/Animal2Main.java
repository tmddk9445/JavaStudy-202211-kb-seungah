package j11_상속.동물;

public class Animal2Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[5];
        animals[0] = new Human();
        animals[1] = new Tiger();
        animals[2] = new Human();
        animals[3] = new Tiger();
        animals[4] = new Human();

        System.out.println("[업캐스팅]"); // 객체를 전부 상위 객체의 Animal로 정의하는 업캐스팅
        for (int i = 0; i < animals.length; i++) {
            animals[i].move();
        }
        System.out.println();

        System.out.println("[다운캐스팅]");
        for (int i = 0; i < animals.length; i++) {
            if(animals[i] instanceof Human) {
                // instanceof : Human 객체가 어떤 클래스인지, 어떤 클래스를 상속받았는지 확인하는데 사용하는 연산자 (확인만! Human으로 사용X)
                // 얘가 Human이었니??? 확인하는 것 (업캐스팅 전의 상태를 확인하는 것)
                ((Human) animals[i]).readBooks(); //괄호안에 다운캐스팅을 먼저 해준 다음에 readBooks()를 해주어야한다.(Human으로 사용하기 위해)
            } else if (animals[i] instanceof Tiger) {
                ((Tiger) animals[i]).hunting();
            }
        }
    }
}
// Human을 생성하면 Animal과 Human의 메모리가 같이 할당된다. (각각 New 한것이다.)
// Tiger 을 생성하면 Animal과 Human의 메모리가 같이 할당된다. (각각 New 한것이다.)

// 형 변환 할 수 있다.

// < Animal로 Human을 생성하는 법(업캐스팅) >
// Animal h = new Human(); - 업캐스팅 (Human만(오버라이드, 재정의된 녀석 제외) 가지고 있는 메모리영역을 사용할 수 없다. - 비활성화된다.)
// 메모리 참조가 안된다.
// 그러나 Animal이 가지고 있는 것은 다 사용할 수 있다.

/* <<< 오버라이드 하고 나서 다시 업캐스팅한 객체의 기능을 사용하고 싶을 때 >>>
 오버라이드 Animal이 가지고 있는 move메소드 Tiger가 오버라이딩 하여 move재정의 t.move();
 오버라이딩이 안되어있다면 Animal의 move를 참조하였을 것이다.(우선순위)
 오버라이드를 안하면 그냥 Animal의 move를 사용된다.
 */

// move는 animal참조
// move2()를 super.move(); 하면
// t.move를 실행하면 move2();실행 >> move2();에서 >> 'Animal의 move' 실행

// 상속은 extends 확장이다. 상속은 딱 한번만 할 수 있다.
// (자바는)다중 상속 불가!!

// 인터페이스는 다중구현 가능하다.

/*
 클래스 안에는 변수와 메소드를 포함할 수 있다.
 super.move();는 메소드이다. (메소드를 호출한것)
 class A에 변수 메소드정의가 가능(메소드 호출이 가능한 것은 아니다.)
 메소드 정의한 것 안에 super.move();를 호출 할 수 있다, 메소드 호출은 기능이 동작하는 것이다.
 */

// 중복되지 않는 개별적인 기능을 정의하기 위해서는 다운캐스팅이 필요하다.

