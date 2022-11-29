package j10_배열;


public class Array1 {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        // int[](!=int) - int배열 자료형, numbers - 변수명 = new(생성, 동적메모리를 할당한다.), 인덱스 - 자료형[배열수];
        // 같은 형태의 변수들을 하나로 묶어서 사용하는 것 ex) 100~103, 104~107, 108~111 주소값을 묶어서 사용
        // new int[5]의 주소값을 numbers에 담았다.(같은 자료형이기 때문에 가능)
        // index는 항상 0부터 시작한다.

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        for(int i = 0; i < 5; i++){
            System.out.print(numbers[i]);
        }
        System.out.println();

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

    }
}
