package BackJoon3_반복문;

import java.util.Scanner;

public class Main12_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        T = (N % 10) * 10; // T의 십의 자릿수
//        T = ((N / 10) + (N % 10)) % 10; // T의 일의 자릿수

        int N = sc.nextInt(); // 주어진 수 N, 새로운 수 T
        int count = 0;
        int copy = N; // 변수 복사
        int T = 0;



        while(true){
            N = (N % 10) * 10 + ((N / 10) + (N % 10)) % 10;
            count++;

            if(copy == N){

            }
        }
    }
}
