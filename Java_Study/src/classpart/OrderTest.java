package classpart;

public class OrderTest {

	public static void main(String[] args) {
		
		Order order = new Order();
		
		order.orderId = 123456;
		order.customerId = "a123456";
		order.orderDate = "2020년 5월 20일";
		order.customerName = "홍길동";
		order.ProductId = "DF456012";
		order.shoppingAddress = "영등포구 1256 - 12";
		
		System.out.println("주문번호 : " + order.orderId);
		System.out.println("고객번호 : " + order.customerId);
		System.out.println("주문일자 : " + order.orderDate);
		System.out.println("고객이름 : " + order.orderDate);
		System.out.println("제품번호 : " + order.ProductId);
		System.out.println("주소     : " + order.shoppingAddress);
		
		
	}
	
}
