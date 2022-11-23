package j13_Object;

public class ObjectArray {

    public static Object getObject(Object obj){ // 모든 자료형의 객체를 받을 수 있다.
        return obj; // return할 때 obj 자료형으로 모든 값을 return할 수 있다. (자료형의 제한이 없어졌다.)
    }

    public static void main(String[] args) {
        Object[] object = new Object[7]; // 모든 객체를 object로 변환할 수 있다.

        object[0] = new Student(20220001, "박수현"); // 참조변수??
        object[1] = new Car("쏘나타", "화이트");
        object[2] = new Student(20220002, "박수현");
        object[3] = new Car("k5", "블랙");
        object[4] = new Student(20220003, "황석민");
        object[5] = "김준일";
        object[6] = 20221123.5; // 일반자료형

        for (int i = 0; i < object.length; i++) {
            System.out.println(object[i]);
        }
        System.out.println(object[5].getClass()); // String
        System.out.println(object[6].getClass()); // 20221123 - Integer 자료형 타입 (일반자료형이 아니다.) // 20221123.5 - Double 자료형
    }
}
