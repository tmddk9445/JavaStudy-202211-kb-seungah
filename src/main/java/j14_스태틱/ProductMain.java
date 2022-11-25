package j14_스태틱;

import j07_메소드.Method1;

public class ProductMain {

    public void show(){ // class 안에 담겨 있는 메소드 이기 때문에 생성없이 사용 가능 (static 할당)
        System.out.println("메인메소드에서 호출"); // static이 없으면 show();사용불가 - 현재 생성했기 때문에 사용 가능하다.
        System.out.println("---");
    }

    public static void main(String[] args) { // public 어디서든 접근 가능 + static 생성없이 사용가능

        // Product 생성없이 변수로 사용했다.
        // 클래스를 static으로 정의 할 때부터 - 클래스의 존재 자체가 메모리에 할당
        // : 생성을 하지 않고도 변수를 메모리에 할당을 하여 사용할 수 있다.

        Product product1 = new Product("아이폰14"); // heap 메모리에 동적할당 ( 생성을 하면 생성자가 호출된다. )
        Product product2 = new Product("아이폰14_Mini");

        System.out.println(product1);
        System.out.println(product2);

        System.out.println("-----------");
        System.out.println(product1.name);
        product1.print();

        System.out.println("-----------");
        System.out.println(product2.name);
        product2.print();

        System.out.println("-----------");
        Product.print(); // heap메모리 할당 없이 사용가능

        ProductMain pm = new ProductMain();
        pm.show();

        Method1.main(null);
        Method1.method1();
        Method1.main(new String[] {}); // static 영역이기때문에 생성없이 어디서든지 사용가능


//        Product.name = "seungah";
//
//        System.out.println(Product.name);
//
//        Product.setName("이승아");
//
//        System.out.println(Product.getName());
    }
}
