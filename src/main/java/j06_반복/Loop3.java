package j06_반복;

public class Loop3 {
    public static void main(String[] args) {


        /*
        1.
        *
        **
        ***
        ****
        *****
        2.
        *****
        ****
        ***
        **
        *
        3.
            *
           **
          ***
         ****
        *****
        4.
        *****
         ****
          ***
           **
            *
         */

        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println(

            );
        }
        System.out.println("-----------------");
    }
}

