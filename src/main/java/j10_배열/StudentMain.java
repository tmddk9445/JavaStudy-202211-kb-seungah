package j10_배열;

public class StudentMain {
    public static void main(String[] args) {

        Student[] students = new Student[3]; // 의자를 두는 것

        students[0] = new Student("임지현", 1);
        students[1] = new Student("신경수", 2);
        students[2] = new Student("고희주", 3);

        System.out.println(students[0]); // 주소값 출력
        System.out.println(students[0].getName()); // 이름 출력
        System.out.println(students[1].getYear()); // 학년 출력

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름 :  " + students[i].getName() + ", 학년 : " + students[i].getYear());
        }
    }
}
