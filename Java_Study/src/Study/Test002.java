package Study;

public class Test002 {

	public static void main(String[] args) {
		
		// ���� ����
		int a;
		
		// ���� �ʱ�ȭ(���� a�� 10�� ����)
		a = 10;
		
		// ���� ���� �� �ʱ�ȭ
		int b = 20;
		
		// ���� ����
		int c;
		
		// �׽�Ʈ
		System.out.println(a);	// ������ : 10
		System.out.println(b);  // ������ : 20
		
		// ���� ���� : �ʱ�ȭ ���� ���� ���� ������ �����Ͽ� ����� �õ�
		// System.out.println(c);		==> ������ ����
		// ���� ��� : java:29: error: variable c might not have been initialized

		// ���� �� ó��
		c = a + b;
		
		// �׽�Ʈ
		System.out.println(c);	// ������ : 30
		
		// System.out.println(a b c); ==> ���� �߻�(������ ����)
		
		
		
		// ��� ���� Ǯ���� ����)
		System.out.print(a + " " + b + " " + c + " \n");
		System.out.print(a + "\t" + b + " \t" + "\n");
		
		// # ���� ������(+)
		// �ǿ����� �� ��� �ϳ��� ���ڿ� ������ �����Ͱ� �����Ѵٸ�
		// ��������ڷν� ����� �����ϴ� ���� �ƴ϶�
		// ���ڿ� ���� �����ڷμ��� ����� �����ϰ� �ȴ�.
		
		System.out.println("a�� ���� " + a + "�Դϴ�.");
		System.out.println("b�� ���� " + b + "�Դϴ�.");
		System.out.println("c�� ���� " + c + "�Դϴ�.");
		
	}

}
