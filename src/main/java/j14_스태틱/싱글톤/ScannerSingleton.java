package j14_스태틱.싱글톤;

import lombok.Getter;

import java.util.Scanner;

//SS.static { SS {scanner}}
//        SS{ scanner} 구조

public class ScannerSingleton {
    // 2. 자기 자신을 static 변수로 가지고 있어야한다. (공유되어지는 영역)
    private static ScannerSingleton instance = null; // static ScannerSingleton자료형// Singleton에는 변수명이 instance로 고정해서 사용한다.

    @Getter // private 접근 불가 - getter를 사용해서 접근!
    private Scanner scanner; // 생성자의 접근지정자가 private이다. /////////생성되었기 때문에 사용가능하다.(Getter)

    // 1. 생성자가 private 접근지정자여야한다.
    private ScannerSingleton() {
        scanner = new Scanner(System.in); // 생성 한번으로 두 개의 클래스에서 사용 가능하다.
    }

    public static ScannerSingleton getInstance() { // 반환하는 것이 SS {scanner} 이다.
        // ScannerSingleton의 객체(instance)를 리턴한다.
        // ScannerSingleton.getInstance 을 부르면 null을 호출한다.
        if(instance == null){ // (객체가 없을 때 null에 뜬다. - 가비지콜렉터)생성을 딱 한번만 한 후에 공유해서 사용한다.(100번 주소를 계속 return해서 사용한다. )
            instance = new ScannerSingleton(); // 생성을 class내부에서 한다.
            // /////ScannerSingleton 객체를 생성한다. (생성할 때 Scanner를 한개 대입한다. - ScannerSingleton instance에 주소가 담긴다. 주소 100번 )
        }
        return instance; // 100 주소값 return
    }
}
