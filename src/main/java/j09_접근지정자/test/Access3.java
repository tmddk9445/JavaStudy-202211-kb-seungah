package j09_접근지정자.test;

public class Access3 {

    private String address;

    private void printAddress() {
        System.out.println("address : " + this.address); // address 앞에 this. 가 생략되어있다. (동일 클래스 안에 중복되는 변수가 없기 때문에)

    }
}
