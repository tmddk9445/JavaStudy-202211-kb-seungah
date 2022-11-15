package j03_연산자;

public class Operation2 {
    public static void main(String[] args) {

        int num = 10;
        num = num + 1;

//        ++num; 현재 num의 값에 1을 더해라
//        num++; 현재 num을 나타내고 그 다음 값에 1을 더해라

        System.out.println(num++); // 11 (num)
        System.out.println(num); // 12 (++num) 과 같다.
        System.out.println(num++); // 12
        System.out.println(++num);
    }
}
