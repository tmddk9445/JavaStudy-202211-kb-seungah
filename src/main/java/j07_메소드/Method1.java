package j07_메소드;

public class Method1 {
    public static void method1() {
        System.out.println("메소드1 호출");
        System.out.println();
        method2(100);
        // void : 반환 자료형 자리 - return 이 없다. (void 빈, 없는)
        // mathod1 : 자료형 이름
        // () 매개변수 자리
    }

    public static void method2(int a) {
        System.out.println("메소드2 호출");
        System.out.println("매개변수 a : " + a);
        System.out.println();
    }

    public static int method3(int a, int b) {
        System.out.println("메소드2 호출");
        System.out.println("매개변수 a : " + a);
        System.out.println("매개변수 b : " + b);
        System.out.println("a + b = " + (a + b));
        System.out.println();
        return a + b;
    }

    public static int max(int a, int b) { // int max : int 값을 무조건 리턴해야한다.
        if (a < b) {
            return b; // return을 만나면 메소드를 호출한다. (끝낸다.)
        } else { // else 생략하고 return a 를 쓸 수 있다.
            return a; // int 를 무조건 리턴해야하는 함수이다. 생략 시 오류
        }
    }
    public static int max1(int a, int b) {
        int result = 0;

        if(a < b) {
            result = b;
        } else {
            result = a;
        }
        return result;
    } // 좋은 코드!!!!!!!!!!!!!!!!!!!!!!

    public static void main(String[] args) {
        method1(); // 메소드 호출
        System.out.println("메소드1 호출 후 출력");
        method2(10);
        int result1 = method3(3000, 7000);
        // method3이 int 값이어야 result1에 대입을 한다.
        // return 값이 method3가 실행된 후에 return값이 나오며 그 값이 result1 이다.
        System.out.println("result1 : " + result1);
    }
}
