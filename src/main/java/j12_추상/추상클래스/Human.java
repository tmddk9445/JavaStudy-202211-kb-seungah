package j12_추상.추상클래스;

public class Human extends Animal{

    // 생략되어져 있는 생성자
    public Human(String kind) {
        super(kind); // Animal의 생성자
    }
    // Animal에 기본생성자가 없으면 상속받아 호출할 수가 없다.
    // 상속되어 있는 상위 클래스를 호출하기 위해서 사용했으나,
    // 상속 되는 곳에 기본 생성자가 입력이 되어있지 않으면, super 안에 값을 입력해 주어야한다.

    @Override
    public void move() {
        System.out.println("사람이 움직인다.");
    }
}
