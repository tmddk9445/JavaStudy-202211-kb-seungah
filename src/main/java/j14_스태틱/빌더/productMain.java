package j14_스태틱.빌더;

public class productMain {
    public static void main(String[] args) {

        Product product = Product.productBuilder()
                .productCode(20220001)
                .productName("빼빼로")
                .price(1500)
                .stock(50)
                .build();

        System.out.println(product);
    }
}
