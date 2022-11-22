package j12_추상.추상클래스;
/*
    추상 메소드를 하나라도 포함하는 클래스는
    추상 클래스로 정의하여야한다.
 */

public abstract class Animal { // 추상메소드를 필요로 하지는 않는다. class에 abstract을 쓰면 추상클래스이다.

    private String kind; //일반 변수 정의 가능

    public Animal(){ // 생성자 - 모든 클래스에는 생성자가 있고 생략되어져있다.

    } // 오버로딩 후에는 직접 정의를 해주어야한다. 생략불가

    public Animal(String kind) { // 생성자도 정의 가능
        System.out.println(kind + "이(가) 생성되었습니다.");
    } // (기본생성자를)오버로딩 : 이름은 같지만! 메소드, 생성자 안에 매개변수를 다르게 하는 것
    // 생략되어있던 기본생성자를 사용할 수 없게 된다.

    // abstract : 추상메소드
    public abstract void move();// 기능 사용X(틀) - 오버라이드의 용도로 사용한다. // 정의할 필요가 없다.

    public void eat(){ // 메소드 정의 가능
        System.out.println("동물이 밥을 먹습니다.");
    }
}

// 묶어서 하위 객체들을 한 번에 제어하겠다.(하나의 클래스로 정의 = 추상화)
// 구현도 {}가 필요없기 때문에 세미클론으로 끝낸다.

/*
    클래스는 명확한 것
 */
