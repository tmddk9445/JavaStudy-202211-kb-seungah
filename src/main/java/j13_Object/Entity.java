package j13_Object;
    /**
     *  mvn : maven
     *     lombok
     *     pom.xml에 설치
     */
import lombok.*;

import java.util.Objects;

@NoArgsConstructor // 매개변수가 없다. 기본생성자.
@AllArgsConstructor // 전체생성자

//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data

public class Entity {
    /*
     클래스의 2가지용도
     1. 정보를 담는 객체 : Entity객체

     2. 동작을 하기위한 (로직들을 정리한 객체)기능을 담은 객체 : Service(Business) 객체
     ex) Objects 클래스
     */

//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }

    private String name;
    private int age;
    private Object address;

    public boolean cmp(){
        return this.getClass() == Entity.class;
        // this. : 생성된 클래스 (클래스가 생성된 클래스의 주소)
        // 둘 다 Entity클래스이다. (생성하지 않은 클래스의 주소)

    }
}
