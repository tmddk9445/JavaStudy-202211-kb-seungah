package j09_접근지정자.캡슐화;

public class StudentMain {

    public static void main(String[] args) {
        Student s1 = new Student("김준일", "남");
        Student s2 = new Student();

        s2.setName("김준이");
        s2.setGender("여");

        System.out.println(s2.getName());
        System.out.println(s2.getGender());

        s2.printInfo();
        s1.printInfo();
    }
}
