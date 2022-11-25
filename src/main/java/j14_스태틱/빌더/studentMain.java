package j14_스태틱.빌더;

public class studentMain {
    public static void main(String[] args) {

        Student student = Student.builder()
                .studentCode(20220001)
                .name("이승아")
                .address("부산")
                .build();

        // Student.builder() : class StudentBuilder생성

        System.out.println(student);

        Student.StudentBuilder sb = new Student.StudentBuilder(); // 바로접근해서 생성가능하다.
        // Student안에 있는 StudentBuilder()의 생성자
        // 내부클래스 접근할때 생성이 필요없는 것
        // B 클래스를 생성하기위해서 A 클래스를 메모리에 할당해야 된다.
        // A 클래스를 생성하지 않고 B클래스를 사용하려면 B클래스가 static이어야한다.
        // 접근이 가능한거지 생성된 것은아니다.
        // 접근하면 생성자가 호출 가능하다.
        // new를 통한 '생성자 호출'이 가능하다.
    }
}
