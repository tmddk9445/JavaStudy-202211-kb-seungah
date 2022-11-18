package j10_배열;

import java.util.Random;

/*
randomArray 배열을 생성(10개)
10, 2, 4, 5, 3, 7, ... , 6
범위는 1 ~ 10
총합 : 모든 값들의 총합
 */
public class Array3 {
    public static int foundMinNumber(int[] numbers) {
        int min = numbers[0]; // min에 0을 넣어두면 음수가 나오기 때문에 넣으면 안된다.
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min; // int 자료형이기 때문에 return 필요!
    }

    public static int foundMaxNumber(int[] numbers) {
        int max = numbers[0];
        for(int i = 0; i < numbers.length; i++) {
            if(max < numbers[i]){
                max = numbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Random random = new Random();
        int[] randomArray = new int[10]; // 같은 크기의 10개의 공간을 할당
        int total = 0;

        // 배열에 랜덤한 값 대입
        // 중복되지 않도록 출력하는 법
        for (int i = 0; i < randomArray.length; i++) {
            while (true) { // 무한루프
                int randomNumber = random.nextInt(10) + 1;
                int count = 0; // <<<<< boolean found = true; >>>>>
                for (int j = 0; j < randomArray.length; j++) {
                    if (randomArray[j] == randomNumber) { // 위에서 선택된 수와 같은 값이 있는지 체크
                        count++; // 위의 randomArray[j] == randomNumber이 같다면 count가 1로 증가할 것이다. // <<<<< found = false; >>>>>
                        break; // 찾는 로직 이후에는 break;를 걸어주는 것이 좋다.
                    }
                }
                if (count == 0) { // count가 1이 되기 때문에 // <<<<< if(found){ >>>>>
                    randomArray[i] = randomNumber; // 값을 넣지않고
                    break; // else가 있는 경우(조건을 찾는 경우가 많을 경우) break;는 필수이다, break가 걸려 while문의 처음으로 돌아가게 된다.
                    // 현재 상태에서는 생략가능 (조건을 비교하는 것이 하나밖에 없다.)
                }
            }
        }
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
        /*
        1. 배열에서 값을 하나씩 꺼내어 total에 더한다.
        2. 배열의 값을 하나씩 꺼내어 출력한다. (단, 마지막에는 쉼표를 찍지 않는다.)
         */
}
