package j14_스태틱.내부클래스;

public class Main {
    public static void test(){}


    public static void main(String[] args) {
    // static 안에서 일반변수, 일반메소드 호출불가 // static은 공간할당이 되어야지만 사용가능하기 때문에
        A.B b = new A().new B("김준일");
        System.out.println(b.getName());

        test();

    }
}
