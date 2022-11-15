package BackJoon3;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = 0;
        N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------");
    }
}
