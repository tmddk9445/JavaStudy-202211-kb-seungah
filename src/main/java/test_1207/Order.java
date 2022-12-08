package test_1207;

public class Order {
	private int orderId;
	private String productName;
	private String consumerName;
	private int price;
	private int stock;

	public Order(int orderId, String productName, String consumerName, int price, int stock) {
		this.orderId = orderId;
		this.productName = productName;
		this.consumerName = consumerName;
		this.price = price;
		this.stock = stock;
	}

	public void showOrderInfo() {
		System.out.println("주문번호: " + orderId);
		System.out.println("상품명: " + productName);
		System.out.println("구매자: " + consumerName);
		System.out.println("가격: " + price);
		System.out.println("수량: " + stock);
	}

}
