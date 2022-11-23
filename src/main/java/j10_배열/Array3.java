package j10_배열;

import java.util.Random;

public class Array3 {

    public static int foundMinNumber(int[] numbers) {
        int min = numbers[0];
        // 배열의 첫 번째 값으로 최소값을 초기화.
        // min에 0을 넣어두면 음수가 나오기 때문에 넣으면 안된다.

        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min; // int 자료형이기 때문에 return 필요
    }

    public static int foundMaxNumber(int[] numbers) {
        int max = numbers[0]; // 배열의 첫 번째 값으로 최대값을 초기화.

        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Random random = new Random();
        int[] randomArray = new int[10]; // 크기가 같은 10개의 공간을 할당

        // 배열에 1 ~ 10까지 '중복되지 않도록' 랜덤 배열
        for (int i = 0; i < randomArray.length; i++) {
            while (true) { // 무한루프
                int randomNumber = random.nextInt(10) + 1; // 1 ~ 10 중에 랜덤으로 1개의 값을 대입
                boolean found = true;
                for (int j = 0; j < randomArray.length; j++) {
                    if (randomArray[j] == randomNumber) { // 앞의 배열들과 같은 값이 있는지 확인
                        found = false;
                        break; // 값을 찾는 로직 이후에는 break;
                    }
                }
                if (found) { // 앞의 배열들과 같은 값이 없다면 found가 그대로 true이기 때문에
                    randomArray[i] = randomNumber; // 배열에 값을 입력
                    break;
                    // else가 있는 경우(조건을 찾는 경우가 많을 경우) break;는 필수이.
                    // 현재는 생략 가능
                    // break가 걸려 while문의 처음으로 돌아가게 된다.
                }
            }
        }

        /*
        1. 배열에서 값을 하나씩 꺼내어 total에 더한다.
        2. 배열의 값을 하나씩 꺼내어 출력한다. (단, 마지막에는 쉼표를 찍지 않는다.)
         */
        int total = 0;

        for (int i = 0; i < randomArray.length; i++) {
            total += randomArray[i];

            System.out.print(randomArray[i]);
            if (i != randomArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("총합 : " + total);

        System.out.println("최소값 : " + foundMinNumber(randomArray));
        System.out.println("최대값 : " + foundMaxNumber(randomArray));
    }
}