package arrayEx;

import java.util.Scanner;
import java.util.Random;

/*
 * # �Ｎ����
 * 1. ���� 7�� �������� 3�� �����ϸ�, ��÷�����̴�.
 */

public class ArrayEx10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] lotto = {0, 0, 7, 7, 7, 0, 0, 0};

		int cnt = 0;
		
		boolean run = true;
		
		while(run) {
			
			System.out.println("1) ���� ���Ȯ��");
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				
				for(int i = 0; i < 7 - 2; i++) {
					if(lotto[i] == 7 && lotto[i + 1] == 7 && lotto[i + 2] == 7) {
						System.out.println("��÷");
						i = lotto.length - 2;
					}
						
				}
				
			}
			run = false;
		}
		// �߰� ����) lotto�� ó������ ���� �ִ°� �ƴ϶�
		//         �������� 7 �̳� 0�� ���� �� �ٸ� �ܷΰ��� �������� �����
		/*
		 * 
		Random ran = new Random();
		
		int[] lotto = new int[7];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = ran.nextInt(8);
			if(lotto[i] == 0 || lotto[i] == 7) {
				System.out.print(lotto[i] + " ");
			}
			else {
				i--;
			}
			
		}
		
		 */
		
	}

}
