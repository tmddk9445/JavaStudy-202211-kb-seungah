package j14_스태틱.빌더;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor // 전체생성자 (모든 매개변수가 포함되어있다.)
@ToString

public class Student {

    private int studentCode;
    private String name;
    private String address;

    public static StudentBuilder builder(){ // 외부에서 Student.builder를 호출하면 new StudentBuilder(); (생성해서 리턴한다.)
        // static 메소드는 일반메소드 호출이 불가하다.
        // static 끼리는 메모리 생성없이 호출 가능하다.
        // static 메소드 이기 때문에 static 클래스에서 호출이 가능하다.
        return new StudentBuilder(); // 생성
    }

    public static class StudentBuilder {
        // 클래스 안에 클래스를 정의한다. (내부클래스)
        // 내부클래스를 static으로 만들어서 생성없이 사용가능하도록 만들었다.(static StudentBuilder builder() : 같이 static이어야한다.)

        // static : Student 객체 생성 X -> StudentBuilder 사용가능

        private int studentCode;
        private String name;
        private String address; // 값을 입력하면 Student를 생성한다.

        public StudentBuilder studentCode(int studentCode){ // 메소드명, 매개변수명은 변수명과 같아야한다. // 변수를 위한 메소드
            this.studentCode = studentCode;
            return this; // 자기자신의 주소값을 리턴
        }

        public StudentBuilder name (String name){ // 메소드명, 매개변수명은 변수명과 같아야한다. // 변수를 위한 메소드
            this.name = name;
            return this; // 자기자신의 주소값을 리턴
        }

        public StudentBuilder address(String address){ // 메소드명, 매개변수명은 변수명과 같아야한다. // 변수를 위한 메소드
            this.address = address;
            return this; // 자기자신의 주소값을 리턴
        }

        public Student build(){
            // 호출되기 전에 위의  Student.builder().studentCode(메소드 호출) 100번주소(StudentBuilder주소)에 해당 매개변수 입력 -> 자기자신에 주소(입력)값 리턴
            return new Student(studentCode, name, address); // Student 생성해서 리턴한다.
        }
    }
}
