package whileEx;

// # �ݺ��� �⺻����[2�ܰ�]

public class WhileEx03 {

	public static void main(String[] args) {
		
		// ����1) 1 ~ 5������ �� ���
		int i = 1;
		int sum = 0;
		
		while(i <= 5) {
			sum += i;
			i++;
		}
		System.out.println("1~5������ �� : " + sum);
		
		// ����2) 1 ~ 10���� �ݺ��� 3�̸� 7�̻� ���
		i = 1;
		while(i <= 10) {
			if(3 > i || i >= 7) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();
		
		// ����3) ����2�� ���ǿ� �´� ������ �� ���
		i = 1;
		sum = 0;
		
		while(i <= 10) {
			if(3 > i || i >= 7) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
		
		// ����4) ����2�� ���ǿ� �´� ������ ���� ���
		i = 1;
		int cnt = 0;
		
		while(i <= 10) {
			if(3 > i || i >= 7) {
				cnt += 1;
			}
			i++;
		}
		System.out.println(cnt);

	}

}
