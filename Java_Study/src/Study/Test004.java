package Study;

public class Test004 {

	public static void main(String[] args) {
		
		// ���� ���� �� �ʱ�ȭ(�޸𸮿� �� �Ҵ�)
		int a = 10, b = 5;
		
		// ���� ����
		int c, d;
		
		// ���� �� ó��
		c = a + b;		// a + b �� ������� ���� c �� �����϶�
		d = a - b;		// a - b �� ������� ���� d �� �����϶�
		
		// ��� ���
		System.out.println(a + " + " + b + " = " + c);
		// ==> 10 + 5 = 16
		//                ����       ���ڿ�     ����       ���ڿ�     ����
		// �ڹٿ����� ���� �ٸ� �ڷ����� �����͵鳢����
		// [ + ] ������ �����ϸ�
		// �ٸ� � �ڷ����� ���ڿ� �������� [ + ] ���� ����� ���ڿ�
		// ��, ���ڿ� ���� �����ڷμ� [ + ]
		
		System.out.println(a + " - " + b + " = " + d);
		
		// print() / println() / print() / format()
		
		// printf() / format()
		// JDK 1.5 ���� �����Ǵ� �޼ҵ�
		// System.out.printf("O + O + O", 10, 20, 30);
		
		System.out.printf("%d + %d + %d\n", 10, 20, 30);
		System.out.printf("%d + %d + %d%n", 10, 20, 30);
		
		System.out.printf("%d �� %f\n", 10, 3.14);
		// ==> 10 �� 3.14000
		
		// System.out.printf("%d + %d\n", 10, 3.14);
		// ==> 10 �� 3.141592
		
		System.out.printf("%d �� %f\n", 10, 3.141592);
		// ==> 10 �� 3.141592
		
		System.out.printf("%d �� %.2f\n", 10, 3.141592);
		// ==> 10 �� 3.1416 => �ݿø�
		// �Ҽ��� ���� �� ��° �ڸ����� ǥ��
	

	}

}
