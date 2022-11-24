package j14_스태틱.싱글톤;


import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {

        Scanner1 s1 = new Scanner1(); // 객체 생성 - 주소를 s1에 담는다.
        Scanner2 s2 = new Scanner2();

//        ScannerSingleton scannerSingleton = new ScannerSingleton(); 접근지정자가 private이다.



        s1.inputName();
        s2.inputAge();
    }
}
