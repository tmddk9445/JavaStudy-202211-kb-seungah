package j10_배열;

public class Array6 {

    public static void main(String[] args) {
        int [] a = new int[] {1, 2, 3, 4, 5}; // new는 메모리 주소를 생성하는 것
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + (i != a.length - 1 ? ", " : "\n"));
        }

        int [] b = a; // a메모리 주소를 b메모리에 입력

        if(a == b){
            System.out.println("같다");
        }else{
            System.out.println("다르다");
        }

        System.out.println("[배열 b]");
        b[3] = 10; // 메모리주소에 3번째 값에 10을 넣어라 (그럼 a와 b는 메모리 주소가 같기 때문에 같은 값이 입력된다.)
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + (i != b.length - 1 ? ", " : "\n"));
        }

        if(a == b){
            System.out.println("같다");
        }else{
            System.out.println("다르다");
        }

        System.out.println("[배열 a]");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + (i != a.length - 1 ? ", " : "\n"));
        }
    }
}
