package j04_입력;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = null;
        int age = 0;
        String phone = null;
        String address = null;

        // 이승아 스페이스 26 enter
        name = scanner.nextLine(); // 이승아 입력 + enter입력
        age = scanner.nextInt(); // 26 + enter // Int는 입력 시 자동으로 enter를 생성한다.
        scanner.nextLine(); // 26 뒤의 enter를 날려준다.
        phone = scanner.nextLine(); // 버퍼에 남아있는(Int는 enter를 포함하지 않기 때문에) enter를 허용한다.( enter를 친 것과 같다. )
        address = scanner.nextLine();
        // nextLine 띄어쓰기와 enter를 포함한다.
        // next는 띄어쓰기와 enter를 포함하지 않는다.
        // 버퍼 :

        // Int -> Line 으로 넘어갈 떄 자동으로 enter가 생성
        // nextLine 전에 nextLine이 아닐 경우 무조건 scanner.nextLine();으로 enter 를 날려주어야 한다.

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("연락처 : " + phone);
        System.out.println("주소 : " + address);
    }
}
