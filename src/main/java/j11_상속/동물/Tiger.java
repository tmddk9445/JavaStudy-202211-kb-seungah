package j11_상속.동물;

public class Tiger extends Animal{

    public Tiger(){
        System.out.println("Tiger 객체 생성");
    }

    @Override // ctrl + o 오버라이드 단축키
    public void move() {
        System.out.println("호랑이가 네발로 뜁니다.");
//        super.move(); // 자동으로 부모클래스 실행하도록 지정된다.
    }

    public void hunting(){
        System.out.println("호랑이가 사냥을 합니다.");
    }
}
