package j05_조건;

import java.util.Scanner;

public class Condition2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int score = 0;

        System.out.print("점수를 입력하세요 : ");
        score = scanner.nextInt();

        if(score < 0 || score > 100){
            System.out.println("잘못된 점수입니다.");
        } else if (score > 89) {
            System.out.println("A 학점");
        } else if (score > 79) {
            System.out.println("B 학점");
        } else if (score > 69) {
            System.out.println("C 학점");
        } else if (score > 59) {
            System.out.println("D 학점");
        } else {
            System.out.println("F 학점");
        }
        /*
            점수가 0보다 작거나 100보다 크면 잘못된 점수입니다. 출력
            90 ~ 100 A학점 출력
            80 ~ 89 B학점 출력
            70 ~ 79 C학점 출력
            60 ~ 69 D학점 출력
            0 ~ 59 F학점 출력
         */
    }
}
