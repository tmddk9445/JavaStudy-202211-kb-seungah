package j06_반복;
// 홀수 구하기
public class Continue2 {
    public static void main(String[] args) {

        for(int i = 0; i < 100; i++) {
            if(i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
