package classpart;

public class OrderTest {

	public static void main(String[] args) {
		
		Order order = new Order();
		
		order.orderId = 123456;
		order.customerId = "a123456";
		order.orderDate = "2020�� 5�� 20��";
		order.customerName = "ȫ�浿";
		order.ProductId = "DF456012";
		order.shoppingAddress = "�������� 1256 - 12";
		
		System.out.println("�ֹ���ȣ : " + order.orderId);
		System.out.println("����ȣ : " + order.customerId);
		System.out.println("�ֹ����� : " + order.orderDate);
		System.out.println("���̸� : " + order.orderDate);
		System.out.println("��ǰ��ȣ : " + order.ProductId);
		System.out.println("�ּ�     : " + order.shoppingAddress);
		
		
	}
	
}
