package BackJoon3_반복문;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;
        for(int i = 0; i < n; i++) {
            result += (i + 1);
        }
        System.out.println(result);
    }
}
