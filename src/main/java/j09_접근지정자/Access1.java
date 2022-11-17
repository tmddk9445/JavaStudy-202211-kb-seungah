package j09_접근지정자;

import j09_접근지정자.test.Access4;

public class Access1 {
     String name; // 아무것도 없으면 default - 동일 패키지 안에서만!

    protected void printName() {
        System.out.println("name : " + name);
        Access4 access4 = new Access4();
    }
}
