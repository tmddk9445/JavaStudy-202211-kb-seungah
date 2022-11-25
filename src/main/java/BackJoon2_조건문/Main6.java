package BackJoon2_조건문;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int Min = A * 60;

        if(((Min + B + C) / 60) > 23) {
            A = ((Min + B + C) / 60) - 24;
            System.out.println(A + " " + (Min + B + C) % 60);
        }else if(((Min + B + C) / 60) < 24){
            A = ((Min + B + C) / 60);
            System.out.println(A + " " + (Min + B + C) % 60);
        }
    }
}


//        System.out.println((Min + B + C) / 60 + " " + (Min + B + C) % 60);
//
//        if( B + C > 59 && A < 23){
//            A++;
//            System.out.println(A + " " + (B + C - 60));
//        } else if ( B + C > 59 && A == 23) {
//            A = 0;
//            System.out.println(A + " " + (B + C - 60));
//        } else if ( B + C < 60 ){
//            System.out.println(A + " " + (B + C));
//        }

