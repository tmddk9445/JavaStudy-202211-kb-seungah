package j03_연산자;

public class LeapMonth {
    public static void main(String[] args) {

        int year = 2000;
        int year2 = 1999;

        String result = null;
        String result2 = null;
        int result3 = 0;

        /*
        윤달의 조건
        4의 배수이고 100의 배수는 아니거나 400의 배수여야 윤달이다.

        2000 : 윤달입니다.
        1999 : 윤달이 아닙니다.
         */

        // 조건연산자 : 조건식 ? "참" : "거짓" ;
        // 삼항연산자
        result = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)? "윤달입니다." : "윤달이아닙니다.";
        // true && false || true = true ( 1 * 0 + 1 = 1)
        result2 = (year2 % 4 == 0 && year2 % 100 != 0 || year2 % 400 == 0)? "윤달입니다." : "윤달이아닙니다.";
        result3 = (5 > 3) ? 1 : 0;

        // && 이고, || 이거나

        System.out.println(year + ": " + result);
        System.out.println(year2 + ": " + result2);
        System.out.println(result3);




    }
}
