package inputEx;

import java.util.Scanner;

public class InputEx02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// ���� 1) ���� 2���� �Է¹޾�, �� ���
		System.out.print("����1 �Է� : ");
		int num1 = scan.nextInt();
		System.out.print("����2 �Է� : ");
		int num2 = scan.nextInt();
		
		int sum = num1 + num2;
		
		System.out.println("�� �� ������ ���� : " + sum + "�Դϴ�");
		
		System.out.println();
		
		
		// ����2) ���� 1���� �Է¹޾�, Ȧ���̸� true ���
		System.out.print("���� �Է� : ");
		int num3 = scan.nextInt();
		System.out.println(num3 % 2 == 1);
		
		// ����3) ������ �Է¹޾�, 60�� �̻��̰� 100�� �����̸� true ��¤�
		System.out.print("���� �Է� : ");
		int score = scan.nextInt();
		
		System.out.println((60 <= score) && (score <= 100));
		
	}

}
