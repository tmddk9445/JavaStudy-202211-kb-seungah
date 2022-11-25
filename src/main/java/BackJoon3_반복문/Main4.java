package BackJoon3_반복문;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int N = sc.nextInt();
        int result = 0;

        for(int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a * b;
            result += c;
        }
        if(result == X){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
