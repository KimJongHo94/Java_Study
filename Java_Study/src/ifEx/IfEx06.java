package ifEx;

import java.util.Scanner;

/*
 * # ������ ����[1�ܰ�]
 * 1. ������ ������ �����ϱ� ����, ���� 2���� �Է¹޴´�.
 * 2. �Է¹��� ���ڸ� ���� ������ ������ ����Ѵ�.
 * ��)	3 x 7 = ?
 * 3. ������ �ش��ϴ� ������ �Է¹޴´�.
 * 4. ������ �� "����" �Ǵ� "��"�� ����Ѵ�.
 */

public class IfEx06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����1 �Է� : ");
		int num1 = scan.nextInt();
		System.out.print("����2 �Է� : ");
		int num2 = scan.nextInt();
		
		int answer = num1 * num2;
		
		System.out.println("����) " + num1 + "x" + num2 + "=" + "?");
		
		System.out.print("���� �Է� : ");
		int myAnswer = scan.nextInt();
		
		if(myAnswer == answer) {
			System.out.println("����");
		}
		if(myAnswer != answer) {
			System.out.println("����!");
		}
		
	}

}
