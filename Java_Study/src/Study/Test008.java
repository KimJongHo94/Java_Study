package Study;

public class Test008 {

	public static void main(String[] args) {
		
		// ������ ������ ������
		double a = 1 / 2;
		
		System.out.println("double a : " + a);
		// ==> double a : 0.0
		
		double b = 1 / 2 + 1 / 2;
		System.out.println("double b : " + b);
		// ==> double b : 0.0
		
		double c = 1 / 2.0;
		System.out.println("double c : " + c);
		// ������ ����� �����Ͽ�
		// �ǿ����� �� �Ǽ��� ���ԵǾ� �ִٸ�
		// ������ �Ǽ� ����� ������ ����Ǹ�
		// ����� ���� �Ǽ� ���·� ��ȯ�ȴ�.
		
		// ==> double c : 0.5
		
		double d = 3 / 2 + 1 / 2;
		System.out.println("double d : " + d);
		// ==> double d : 1.0
		
		double e = (3 / 2) + (1 / 2.0);
		System.out.println("double e : " + e);
		// ==> double e : 1.5

	}

}
