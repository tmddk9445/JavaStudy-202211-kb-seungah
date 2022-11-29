package j06_반복;
/**
 * shift f6 - 파일 명 변경
 * f5 - 파일 복사
 * ctrl alt L - 라인 정리
 */
public class Loop1 {
    public static void main(String[] args) {

        int n = 10;

        for (int i = 0; i < n; i++) {
            System.out.print(i);
            if (i < n - 1) {
                System.out.print(", ");
                // 0 부터 9 까지 10번 오름차순 반복해라
            }
        }
        System.out.println(); // 줄바꿈 (print + enter)

        for (int i = 0; i < n; i++) {
            System.out.print(i + 10);
            if (i < n - 1) {
                System.out.print(", ");
                // 10 부터 19 까지 10번 오름차순 반복해라
            }
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(n - i); // 10 - i
            if (i < n - 1) {
                System.out.print(", ");
                // 10 부터 1 까지 10번 내림차순 반복해라
            }
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(n - i + 10); // 20 - i
            if (i < n - 1) {
                System.out.print(", ");
                // 20 부터 19 까지 10번 내림차순 반복해라
            }
        }
        System.out.println();

        for (int i = 0, j = n; i < n; i++, j--) {
            System.out.print(i + " ");
            System.out.print(j + " ");
        }
    }
}
