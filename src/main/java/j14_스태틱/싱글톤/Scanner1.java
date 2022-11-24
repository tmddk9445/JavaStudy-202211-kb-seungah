package j14_스태틱.싱글톤;

import java.util.Scanner;

public class Scanner1 {

    public void inputName(){
        String name = null;
        Scanner scanner =  ScannerSingleton.getInstance().getScanner(); // static 메소드 (생성없이 사용가능) // SS.static { SS {scanner}} 안에있는 scanner를 호출해라!
        // ScannerSingleton.getInstance() 하게되면 100번 주소의 Scanner를 가지고온다. // ScannerSingleton 객체 생성(100번 주소)
        // getScanner(); : scanner변수를 가지고 온다.

        System.out.print("이름을 입력하세요 : ");
        name = scanner.nextLine();

        System.out.println("이름 : " + name);
    }
}
