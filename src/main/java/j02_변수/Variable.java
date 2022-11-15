package j02_변수;
/**
 * 클래스에 대한 설명
 */
public class Variable {
    /**
     * 메소드에 대한 설명
     */
    public static void main(String[] args) {

        boolean checkFlag = false;
        System.out.println("논리자료형 : " + checkFlag);
        checkFlag = true;
        System.out.println("논리자료형 : " + checkFlag);
        System.out.println("=====================");

        char name1 = '김'; // 작은 따옴표에는 한 글자만 입력 가능하다.
        char name2 = '준'; // char 변수형은 (+)더하게 되면 기본값이 유니코드 값으로 계산된다.

        System.out.println("" + name1 + name2); // 출력 : 96064 (유니코드, 10진수의 합) // char을 더할 때 ""를 앞에 입력하면 문자 그대로 출력된다.
        System.out.println(Integer.toHexString(name1)); // 출력 : ae40 (16진수)
        System.out.println("\uae40"); // 출력 : 김
        System.out.println("=====================");

        int width = 100;
        int width2 = 200;

        System.out.println(width + width2);

        String sWidth = "100";
        String sWidth2 = "200";

        System.out.println(sWidth + sWidth2); // 문자열이기 때문에 값이 더해지지 않는다.
        System.out.println("=====================");

        double dNum = 2.1;
        double dNum2 = 3.5;
        System.out.println(dNum + dNum2);

        System.out.println("<<<<<<<<<<<<< 형변환 >>>>>>>>>>>>>");

        // 한 줄 주석

        /*
        여러 줄 주석
        */

        // 업캐스팅
        // 문자 >> 정수 >> 실수 (작은 값을 큰 값에 넣는 것)
        char c1 = 'a';
        System.out.println(c1);
        System.out.println(((int)c1) + 10); // (int) 생략 불가 - 캐스팅 상황이 아니다 (출력하는 상황)

        int n1 = (int) c1; // 묵시적 형 변환 가능 int n1 = c1;
        System.out.println(n1);

        double d1 = (double) n1;
        System.out.println(d1);
        System.out.println("=====================");

        // 다운캐스팅
        // 실수 >> 정수 >> 문자 (큰 값을 작은 값에 넣는 것)
        int n2 = (int) d1;
        System.out.println(n2);

        char c2 = (char)n2;
        System.out.println(c2);

   }
}
