package ifEx;

import java.util.Scanner;

/*
 * # �ִ밪 ���ϱ�[1�ܰ�]
 * 1. ���� 3���� �Է¹޴´�.
 * 2. �Է¹��� 3���� ���� ���Ͽ�,
 * 3. ���� ū ��(MAX)�� ����Ѵ�.
 */

public class IfEx12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����1 �Է� : ");
		int num1 = scan.nextInt();
		System.out.print("����2 �Է� : ");
		int num2 = scan.nextInt();
		System.out.print("����3 �Է� : ");
		int num3 = scan.nextInt();
		
		int maxNum = 0;
		
		maxNum = num1;
		
		if(maxNum < num2) {
			maxNum = num2;
		}
		if(maxNum < num3) {
			maxNum = num3;
		}
		
		System.out.println("�ִ밪 = " + maxNum);
		
	}

}
