package j12_추상.인터페이스;

public class CalcMain {
    public static void main(String[] args) {
        int[] taxPay = new int[]{2000000, 2500000, 2600000, 2700000};
        int[] salaryPay = new int[]{1000000, 1000000, 1000000, 1000000};

        int result1 = 0;
        int result2 = 0;

        Calculator calculator = new Tax(); // 인터페이스에 Tax를 넣어서 Tax를 실행 // 업캐스팅
        result1 = calculator.calc(taxPay); // 연말정산하는 것
        if (result1 == 0) {
            System.out.println("오류 : " + Calculator.ERROR_CODE); // Calculator. >> 생성된 객체가 아니라 클래스 이름이다.
        } else {
            System.out.println("result1 => " + result1);
        }

        calculator = new Salary();
        result2 = calculator.calc(salaryPay);
        if (result2 == 0) {
            System.out.println("오류 : " + Calculator.ERROR_CODE);
        } else {
            System.out.println("result2 => " + result2);
        }
    }
}
