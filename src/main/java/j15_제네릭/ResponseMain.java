package j15_제네릭;

public class ResponseMain {

    // 생성할 때는 와일드 카드 사용X - 생성 시에 모든 자료형을 담고 싶으면 Object를 쓰면된다.
    public static CMRespDto<?> response(String msg, Object data){  //와일드카드 - (리턴될 때)어떤 자료형이 들어올지 모를 때 사용.
        // 메소드의 리턴 자료형으로 쓰인다.
        return new CMRespDto<>(msg, data); // 뒤에 있는 데이터의 자료형을 자동으로 인식해서 Object가 생략된다. <> : 적어주는 것이 좋다.
    }
    // CMRespDto<? extends Object> getInfo(){} : Object를 상속 자료형만 사용 가능하다. // extends || super 사용 가능
    // Info<? extends people> : people 하위에 있는 Student와 Teacher과 people자료형만 쓸 수 있다.
    // <? super Student> : 내 자신과 상위 people 자료형만 써라
    // implement는 사용할 수 없다.

    public static void main(String[] args) {
        Student student = Student.builder()
                .studentCode(20220001)
                .name("ㅇㅅㅇ")
                .build();

        System.out.println(response("학생데이터 응답", student));
        System.out.println(response("student code error!!", "학번에 오류가 있습니다."));
    }
}
