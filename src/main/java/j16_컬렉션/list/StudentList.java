package j16_컬렉션.list;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.getName;

public class StudentList {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();

        Student student = new Student(20220001, "김준일", 2, null);

//        students.add(student);
        students.add(new Student(20220001, "이승아", 21, null)); // 위와 같다.
        students.add(new Student(20220002, "김수현", 22, null));
        students.add(new Student(20220003, "문경원", 23, null));
        students.add(new Student(20220004, "홍지혜", 24, null));
        students.add(new Student(20220005, "고동현", 25, null));

        Student student2 = students.get(3); // List 0번째 입력값을 호출
        System.out.println(student2);

        // 이름이 문경원인 학생의 나이를 26세로 바꾸세요
//        students.get(2); // 학생의 주소(객체)

//        for(int i = 0; i < students.size(); i++){
//            Student s = students.get(i);
//            if(s.getName().equals("문경원")){
//                s.setAge(26);
//                break;
//            }
//        }
        for (Student s : students) {
            if (s.getName().equals("문경원")) {
                s.setAge(26);
                break;
            }
        }
        System.out.println(students);
//        students.get(2).setAge(26);
//        System.out.println(students.get(2));
    }
}

