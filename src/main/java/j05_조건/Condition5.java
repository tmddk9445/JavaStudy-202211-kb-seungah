package j05_조건;

import java.util.Scanner;

public class Condition5 {
    public static void main(String[] args) {

        String select = null;

        Scanner scanner = new Scanner(System.in); // Alt + enter
        System.out.print("선택 : ");
        select = scanner.nextLine();

        switch (select){
            case "아" :
                System.out.println("아침 식사");
            case "점" :
                System.out.println("점심 식사");
                break;
            case "저" :
                System.out.println("저녁 식사");
            default :
                System.out.println("잘못 입력되었습니다.");
        }
    }
}
