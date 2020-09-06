package whileEx;

/*
 * # �ݺ��� for
 * 1. �ݺ����� ���� 3����
 * 1) �ʱ��
 * 2) ���ǽ�
 * 3) ������
 * 
 * 2. for���� ����
 * for(�ʱ��; ���ǽ�; ������) {
 * 		���ǽ��� ���� ���� ������ ����;
 * }
 * 
 * 3. for���� �������
 * �ʱ�� �� ���ǽ� �� ���๮ �� ������ �� ���ǽ� �� ���๮ �� ������ ...
 */

public class WhileEx19 {

	public static void main(String[] args) {
		
		// 1 ~ 5���� ���
		int x = 1;
		while(x <= 5) {
			System.out.println(x);
			x += 1;
		}
		System.out.println();
		
		for(int y = 1; y <= 5; y++) {
			System.out.println(y);
		}
		
		System.out.println();
		
		// ����1) 1���� 5���� ���
		for(int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// ����2) 1���� 10���� �ݺ���, 5 ~ 9���� ���
		for(int i = 1; i <= 10; i++) {
			if(5 <= i && i <= 9) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		// ����3) 1���� 10���� �ݺ��� 6 ~ 3���� ���
		for(int i = 10; i >= 1; i--) {
			if(6 >= i && i >= 3) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		// ����4) 1���� 10���� �ݺ��� 3�̸� 7�̻� ���
		for(int i = 1; i <= 10; i++) {
			if(3 > i || i >= 7) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
	}

}
