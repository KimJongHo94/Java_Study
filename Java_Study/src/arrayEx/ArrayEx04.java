package arrayEx;

/*
 * # �л��������� ���α׷�[1�ܰ�] : �л�����
 */

import java.util.Random;

public class ArrayEx04 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[] arr = new int[5];
		
		// ����1) arr�迭�� 1 ~ 100�� ������ ������ 5�� ����
		// ��  1) 87, 11, 92, 14, 47
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100) + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// ����2) �������� ������ ��� ���
		int tot = 0;
		double avg = 0;
		for(int i = 0; i < arr.length; i++) {
			tot += arr[i];
		}
		avg = tot / 5.0;
		System.out.println("���� : " + tot);
		System.out.println("��� : " + avg);
		
		// ����3) ������ 60�� �̻��̸� �հ�, �հݻ� �� ���
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= 60) {
				cnt += 1;
			}
		}
		System.out.println("�հݻ� �� : " + cnt);
		

	}

}
