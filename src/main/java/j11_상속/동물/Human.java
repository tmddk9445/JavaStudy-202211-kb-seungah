package j11_상속.동물;

public class Human extends Animal{

    public Human(){
        super(); // 생략되어있다. 상위객체를 의미한다. = 상위(확장된)객체의 주소 // this. 자기자신의 주소
        // 상위 객체의 주소 50
        // Human의 주소 100
        // super의 주소 150

        System.out.println("Human 객체 생성");
    }
    // Animal 객체가 생성되고 Human 객체가 생성된다.( 상속 순서 )
    // 메모리할당이 상위객체가 우선되고
    // 그 이후에 하위객체가 생성된다.
    // 재정의 = 오버라이드

    @Override // @붙은 문법 --> '어노테이션'이라고 부른다. // 어노테이션오버라이드 // 상위객체에서 재정의 된 메소드입니다.
    public void move(){
        System.out.println("사람이 두 발로 걷습니다.");
    }
    // 메소드는 같은 명칭, 같은 매개변수를 담을 수가 없다.
    // 상속된 Animal 클래스에 같은 메소드가 존재한다.

    public void readBooks(){
        System.out.println("사람이 책을 읽습니다.");
    }
}
