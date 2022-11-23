package j13_Object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StudentMain {

    public static void print(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {

        Student student = new Student(20220001, "김준일");
        Student student2 = new Student(20220001, "김준일");

//        System.out.println(student.toString());
        System.out.println(student); // toString을 쓰지않아도 자동으로 호출된다.
        System.out.println(student2);
        // student를 재정의 했다. (주소값이 뜨지 않는다.)???????????????????

        System.out.println(student == student2); // false - 주소값이 다르다.( Object로 업캐스팅된 주소가 다르다.)
        System.out.println(student.equals(student2)); // false를 true로 출력되도록!! (오버라이드 후 (정보값 비교) : true값 출력)
        // this : student, 매개변수 student2

        System.out.println();

        // print 안에 Object만 들어와야하는데 student 가 들어온 이유는 student가 Object를 상속받고 있기 때문이다.
        print(student); // 주소가 Object obj로 업캐스팅 되어지고 // obj가 출력 : Student{code=20220001, name='김준일'} 출력
        print(student2);
//        Object s = student; // 상속을 받게 되면 상위 클래스 변수에 대입을 해서 '업캐스팅'할 수 있다.

        System.out.println();
        System.out.println(student.hashCode()); // 실제 주소 출력 940060004 // hashCode 오버라이드 후 671335484
        System.out.println(student2.hashCode()); // 실제 주소는 다르지만, hashCode(실제 주소값 X)는 같다.(안의 입력 값이 같을 경우 같아진다.)

        System.out.println(student.hashCode() == student2.hashCode()); // true
        System.out.println(student.equals(student2)); // false
        // 차이점  : 안의 구조와 값이 동일, 그러나 패키지가 다를경우 false가 출력된다. // 패키지 위치가 달라서 클래스 자체가 다르다.
        // hashCode는 안의 값으로만 비교한다. true

        System.out.println();

        Class c = student.getClass(); // 객체가 어떻게 만들어졌는지 알 수 있다. // getClass는 Class 클래스를 포함하고 있다.
        System.out.println(c); // 어떤 클래스 안에 들어 있는 어느 클래스이다.
        System.out.println(c.getName()); // 클래스의 이름을 출력
        System.out.println(c.getSimpleName()); // 클래스명만 출력

        System.out.println();

        Field[] fields = c.getDeclaredFields(); // Fields배열
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].getName()); //
        }
        System.out.println();

        Method[] methods = c.getDeclaredMethods(); // 이 클래스의 변수의 이름
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].getName());
        }

    }


}
