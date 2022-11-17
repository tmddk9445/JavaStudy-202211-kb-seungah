package j09_접근지정자.캡슐화;

public class StudentMain {

    public static void main(String[] args) {
        Student s1 = new Student("김준일", "남");
        s1.printInfo();

        s1.setName("김준이");
        // s1에 대입이된다. "남"을 입력하지 않아도 대입되어져서 출력된다.
        s1.printInfo();

        s1.gender = "여";
        s1.printInfo();
        System.out.println(s1.gender); // Student클래스의 name이 public
         // private의 경우 가지고 올 수 없다.
        System.out.println(s1.getName());
    }
}
