package review;

public class OpEx06 {

	public static void main(String[] args) {
		
		// ��) ������ 60�� �̻��̸� true ���
		int score = 30;
		System.out.println(score >= 60);
		
		// ����1) 3�� ����̸� true ���
		// ��Ʈ1) ���� % 3 == 0 (3�� ���)
		int num = 12;
		System.out.println(num % 3 == 0);
		
		// ����2) ¦���̸� true ���
		// ��Ʈ2) ���� % 2 == 0 (¦��)
		// ��Ʈ2) ���� % 2 == 1 (Ȧ��)
		int num2 = 22;
		System.out.println(num2 % 2 == 0);
		System.out.println(num2 % 2 == 1);

	}

}
