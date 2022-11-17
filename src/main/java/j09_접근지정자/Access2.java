package j09_접근지정자;

public class Access2 {

    int age;

    public Access2() { // 생성자는 public이 붙은 채로 생략되어져있다.

    }

    void printAge() {
        System.out.println("age: " + age);
    }
}
