package j13_Object;

import java.util.Objects;

public class Student {

    private int code;
    private String name;

    public Student(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override // alt ins >> equals & hashCode
    // 주소값 비교가 아닌 안에 담긴 값(정보값)을 비교하는 재정의
    // 오버라이드 시 자료형은 바꿀 수 없지만 변수명은 바꿀 수 있다.
    public boolean equals(Object o) { // 매개변수로 Object 클래스를 받고 있다.(모든 객체가 업캐스팅 되어있다.)
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false; // 클래스 타입을 비교
        // getClass : instanceof와 같다. (o가 Student자료형으로 생성된 적 있느냐?), (instanceof이 자료형으로 생성되었는지 확인시켜주는 것 - 사라질 예정이)
        // 비교 대상이 다르고 비교할 자료형이 없다면 : 당연히 false이다.
        Student student = (Student) o; // 다운캐스팅 - 명시적 형변환
        return code == student.code && Objects.equals(name, student.name);
        // 숫자 비교 && 문자열 비교(Objects 클래스의 기능)
    }

    // Student클래스 자체를 가리키는 것이 getClass이다.

    @Override
    public int hashCode() {
        return Objects.hash(code, name);
    }

    @Override
    public String toString() {
        return "Student{" + // return 값으로 재정의 가능하다.
                "code=" + code +
                ", name='" + name + '\'' +
                '}'; // 해당 클래스의 정보를 출력한다.
    }
}
