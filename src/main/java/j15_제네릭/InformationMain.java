package j15_제네릭;

public class InformationMain {
    public static void main(String[] args) {

        Student student = Student.builder()
                .studentCode(20220001)
                .name("박준현")
                .build();

        Teacher teacher = Teacher.builder()
                .teacherCode(200)
                .name("김준일")
                .build();

        Information<Student> studentInformation
                = new Information<Student>(student); // Student 참조자료형 // 매개변수 student

        Information<Teacher> teacherInformation
                = new Information<Teacher>(teacher); // 가독성을 위해서는 자료형을 생략하지않고 적어주는 것이 좋다.

        Information2 i1 = new Information2(student); // 업캐스팅 (Object타입으로 들어간다.)
        Information2 i2 = new Information2(teacher);

        studentInformation.printInfo();
        teacherInformation.printInfo();

        System.out.println("학생이름 : " + studentInformation.getTarget().getName() ); // student가 target 안에 들어있다.
        System.out.println("학생이름 : " + ((Student)i1.getTarget()).getName() ); // 다운캐스팅 해야지만 사용가능하다.
    }
}
