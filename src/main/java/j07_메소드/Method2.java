package j07_메소드;

public class Method2 {
    /*
        메소드 오버로딩
     */

    public static void print(String name) {// 같은 자료형을 받는다면 같은 메소드 명을 사용할 수 없다.
        System.out.println("이름 : " + name);
    }

    public static void print(int age) { // 리턴타입은 다르다고 해서 오버로딩(구분이) 되어지지않는다.
        System.out.println("나이 : " + age);
    }

    public static void print(String name, int age) {
        System.out.println("이름 : " + name + "나이 : " + age);
    }

    public static void print(int age, String name) {
        System.out.println("나이 : " + age + "이름 : " + name);
    }

    public static void main(String[] args) {

        print("이승아"); // 호출 시 자료형의 종류를 따라간다.
        print(26);
        print("이승아", 26);
        print(26, "이승아");
    }
}

