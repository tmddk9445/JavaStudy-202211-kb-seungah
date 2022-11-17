package j08_클래스;

public class StudentMain {

    public static void main(String[] args) {

        Student student = new Student();
        Student student2 = new Student("부경대학교", "홍길순", 2, false);

        student.school = "부산대학교";
        student.name = "홍길동";
        student.studentYear = 3;
        student.gender = true;

//        student1.school = "부산대학교";
//        student1.name = "홍길동";
//        student1.studentYear = 3;
//        student1.gender = true;

        student.showStudentInfo();
        student2.showStudentInfo();

    }
}
