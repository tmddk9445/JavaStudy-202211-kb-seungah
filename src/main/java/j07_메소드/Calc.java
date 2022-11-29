package j07_메소드;

public class Calc {
    /*
        1. add(덧셈) -> return int, parameter(매개변수) int x, int y
        2. sub(뺄셈)
        3. mul(곱셈)
        4. div(나눗셈)
        5. mod(나머지)
     */
    public static int add(int x, int y) {
//        System.out.println(x + y); 아래에 출력이 있기 때문에 생략 가능하다.
        return x + y;
    }

    public static int sub(int x, int y) {
        return x - y;
    }

    public static int mul(int x, int y) {
        return x * y;
    }

    public static int div(int x, int y) {
        return x / y;
    }

    public static int mod(int x, int y) {
        return x % y;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 2;


        int addResult = add(a, b);
        int subResult = sub(a, b);
        int mulResult = mul(a, b);
        int divResult = div(a, b);
        int modResult = mod(a, b);

        System.out.println("a + b = " + addResult);
        System.out.println("a - b = " + subResult);
        System.out.println("a x b = " + mulResult);
        System.out.println("a / b = " + divResult);
        System.out.println("a % b = " + modResult);
    }
}
// 메소드 : 반복적이고 똑같은(재사용되어지는) 로직들을 묶어두는 것
// 반복문과 다른 개념 (메소드 : 하나의 코드 집합)