package whileEx;

import java.util.Random;

/*
 * # �����л�
 * 1. 10ȸ �ݺ��� �Ѵ�.
 * 2. 1~100 ������ ���� ���ڸ� �����Ѵ�.(�л��� ����)
 * 3. ������ 60�� �̻��̸� �հݻ��̴�.
 * ---------------------------------------
 * . ������(10��)�� ������ ����� ����Ѵ�.
 * . �հ��� ���� ����Ѵ�.
 * . 1�� �л��� ��ȣ�� ������ ����Ѵ�.
 */

public class WhileEx15 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int maxIdx = 0;
		int maxScore = 0;
		int tot = 0;
		double avg = 0;
		
		int cnt = 0;
		
		int i = 1;
		
		while(i <= 10) {
			
			int ranScore = ran.nextInt(100) + 1;	// 1 ~ 100 ���� ����
			System.out.print(ranScore + " ");
			
			tot += ranScore;
			
			if(ranScore >= 60) {
				cnt += 1;
			}
			
			if(maxScore < ranScore) {
				maxScore = ranScore;
				maxIdx = i;
			}
			
			
			i++;
	
		}
		
		System.out.println();
		
		avg = tot / 10.0;
		
		System.out.println("���� = " + tot + "��");
		System.out.println("��� = " + avg + "��");
		System.out.println("�հ��� �� = " + cnt + "��");
		System.out.println("1�� �л� ��ȣ =" + maxIdx + ", ���� = " + maxScore + "��");

	}

}
