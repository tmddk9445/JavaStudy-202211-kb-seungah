package j04_입력;

import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = null;
        int age = 0;
        String address = null;
        String schoolName = null;
        int passward = 0;

        name = scanner.next();
        age = scanner.nextInt();
        scanner.nextLine();
        address = scanner.next();
        scanner.nextLine();
        schoolName = scanner.nextLine();
        passward = scanner.nextInt();

        System.out.println("A :" + name);
        System.out.println("B :" + age);
        System.out.println("C :" + address);
        System.out.println("D :" + schoolName);
        System.out.println("E :" + passward);
    }
}
