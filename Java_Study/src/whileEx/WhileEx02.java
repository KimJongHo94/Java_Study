package whileEx;

// # �ݺ��� �⺻����[1�ܰ�]

public class WhileEx02 {

	public static void main(String[] args) {
		
		// ����1) 1 ~ 10���� �ݺ��� 5 ~ 9 ���
		// ����1) 5, 6, 7, 8, 9
		int i = 1;
		while(i <= 10) {
			if(5 <= i && i < 10) {
				System.out.print(i + " ");
			}
			i++;
		}
		
		System.out.println();
		
		// ����2) 10 ~ 1���� �ݺ��� 6 ~ 3 �Ųٷ� ���
		// ����2) 6, 5, 4, 3
		i = 10;
		while(i >= 1) {
			if(6 >= i && i >= 3) {
				System.out.print(i + " ");
			}
			i--;
		}
		
		System.out.println();
		
		// ����3) 1 ~ 10���� �ݺ��� ¦���� ���
		i = 1;
		while(i <= 10) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}

	}

}
