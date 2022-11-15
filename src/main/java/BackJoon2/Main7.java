package BackJoon2;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if(a == b && b == c){
            System.out.println(10000 + a*1000);
        }else if(a == b || a == c || b == c){
            if(a==b){
                System.out.println(1000 + a*100);
            }if(a==c){
                System.out.println(1000 + a*100);
            }if(b==c){
                System.out.println(1000 + b*100);
            }
        }else if(a != b && a != c && b != c){
            if(a > b && a > c){
                System.out.println(a*100);
            }if(b > a && b > c){
                System.out.println(b*100);
            }if(c > a && c > b){
                System.out.println(c*100);
            }
        }
    }
}
