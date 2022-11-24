package j14_스태틱;
/*
    공유(정적)하는 영역

 */
import lombok.Data;

@Data

public class Product {

    private static int autoIncrement = 20220000; // static 변수 (생성필요 X)
    // private 외부에서 접근 X - 생성자 안에서만 동작한다.
    // static  Product 클래스에 stitic을 할당 받아서 autoIncrement = 2022000;을 입력
    // new의 경우 새롭게 생성
    // 새롭게 생성된 메모리에는 static 영역은 데이터를 가져오지 못하고(복사하지 못한다.) 참조하게된다.(공유한다.)
    // 생성자가 호출되면 name에는 값이 입력되고 serialNumber는 참조변수의 데이터를 공유해서 사용한다.

    // static 변수에서 일반 변수에 접근이 가능한가?? No.
        // static 메소드 : 언제든지 접근 가능 (생성을 하지않아도!) // Product. : 접근가능
        // 에서 일반 변수를 불러서 사용하면 오류이다. (일반 메소드는 아직 생성이전 new하지않았다.)
        // 메모리 할당(new) 이후 참조는 가능하다.

    // Method(Static) Heap Stack 영역으로 나뉜다.

    private int serialNumber;
    public String name;

    public Product(String name) {
        this.serialNumber = ++autoIncrement; // static 변수를 1 증가시킨다. (static에서 동작시키고 생성자에 값을 공유)
        this.name = name;
    }

    public static void print(){ // static이라서 heap 메모리에 생성되지 않아도 사용가능 // static 메소드 (생성필요 X)
        System.out.println(autoIncrement); // 언제든지 접근 가능
//        System.out.println(serialNumber); heap메모리에 생성된 이후에만 사용가능하다. (아직 생성 이전이라서 접근이 불가하다.)
        Product product = new Product("모니터"); // heap 메모리에 할당(생성) - 메인메소드
        System.out.println(product.getSerialNumber());

        System.out.println(product.add(10, 20));

//        add(10, 20); // static메소드에서 일반메소드 호출 불가
    }

    public int add(int a , int b){ // 일반메소드
        return a + b;
    }

//    public static String name;
//
//    public static String getName() {
//        return name;
//
//    }
//
//    public static void setName(String name) {
//        Product.name = name; // this.name = name; 오류
//    }

}