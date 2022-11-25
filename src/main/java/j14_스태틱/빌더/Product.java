package j14_스태틱.빌더;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString

public class Product { // 생성되어야지만 내부클래스가 생성된다.

    private int productCode;
    private String productName;
    private int price;
    private int stock;

    public static ProductBuilder productBuilder(){ // 외부에 있다.
        return new ProductBuilder();
    }

//    public static Product.ProductBuilder builder() {
//        return new Product.ProductBuilder();
//    }
//
//    public static class ProductBuilder {
//        private int productCode;
//        private String productName;
//        private int price;
//        private int stock;
//
//        public ProductBuilder productCode(int productCode) {
//            this.productCode = productCode;
//            return this;
//        }
//
//        public ProductBuilder productName(String productName) {
//            this.productName = productName;
//            return this;
//        }
//
//        public ProductBuilder price(int price) {
//            this.price = price;
//            return this;
//        }
//
//        public ProductBuilder stock(int stock) {
//            this.stock = stock;
//            return this;
//        }
//
//        public Product build(){
//            return new Product(productCode, productName, price, stock);
//        }
//    }
}

