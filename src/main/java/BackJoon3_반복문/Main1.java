package BackJoon3_반복문;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i = 0; i < 9; i++){
            System.out.println(N + " * " + (i + 1) + " = " + (N*(i + 1)));
        }
    }
}
