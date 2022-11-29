package j16_컬렉션.list;

import java.util.ArrayList;
import java.util.List;


public class StudentListName {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();

        Student student = new Student(20220001, "김준일", 2, null);

//        students.add(student);
        students.add(new Student(20220001, "이승아", 21, null)); // 위와 같다.
        students.add(new Student(20220002, "김수현", 22, null));
        students.add(new Student(20220003, "문경원", 23, null));
        students.add(new Student(20220004, "홍지혜", 24, null));
        students.add(new Student(20220005, "고동현", 25, null));

        // 0번 인덱스 학생의 이름을 다음 인덱스의 학생 이름으로 변경
        // 제일 마지막 인덱스의 학생 이름으로 0번 인덱스로 이동

        String lastName = null;
        for (int i = 0; i < students.size(); i++) {
            int nowIndex = students.size() - 1 - i;
            int preIndex = nowIndex - 1;

            Student s = students.get(nowIndex);

            if (nowIndex == 0) {
                s.setName(lastName);
                break; //
            }
            if (nowIndex == students.size() - 1) {
                lastName = s.getName();
            }
            s.setName(students.get(preIndex).getName()); // 현재 나의 인덱스에 내 앞의 인덱스 이름을 가지고 와서 넣는다.
        }
        System.out.println(students);
    }
}
