package whileEx;

import java.util.Scanner;

/*
 * # �ִ밪 ���ϱ�[2�ܰ�]
 * 1. 3ȸ �ݺ��� �ϸ鼭 ������ �Է¹޴´�.
 * 2. �Է¹��� 3���� ���� �� ���� ū ���� ����Ѵ�.
 */

public class WhileEx14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i = 1;
		
		int maxNum = 0;
		
		while(i <= 3) {
			
			System.out.print("���� �Է� : ");
			int num = scan.nextInt();
			
			if(maxNum < num) {
				maxNum = num;
			}
			i += 1;
			
		}
		
		System.out.println("�ִ밪 = " + maxNum);
		
	}

}
