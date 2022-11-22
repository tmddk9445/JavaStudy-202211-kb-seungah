package j12_추상.추상클래스;

public class Human extends Animal{

    public Human(String kind) {
        super(kind); // Animal의 생성자
        // Animal에 기본생성자가 없으면 상속받아 호출할 수가 없다.
    } // 생략되어져 있는 생성자

    @Override
    public void move() {
        System.out.println("사람이 움직인다.");
    }
}
