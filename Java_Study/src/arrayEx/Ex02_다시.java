package arrayEx;

import java.util.Scanner;

public class Ex02_�ٽ� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		int[] arr = {1001, 20, 1002, 45, 1003, 54};
		// �й��� ������ �ѽ��̴� 1001:20, 1002:45, 1003:54
		
		// ����1) �й��� �Է��ϸ� ���� ���
		System.out.print("�й� �Է� : ");
		int hakbun = scan.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			if(hakbun == arr[i]) {
				System.out.println("�й� : " + hakbun + " " + "���� : " + arr[i + 1]);
			}
		}
		
		// ����2) ������ �Է��ϸ� �й� ���
		System.out.print("���� �Է� : ");
		int score = scan.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			if(score == arr[i]) {
				System.out.println("�й� : " + arr[i - 1] + " " + "���� : " + score);
			}
		}
		*/
		//========================================================================
		
		int[] score = {1001, 20, 43, 1002, 54, 2, 1003, 76, 6};
		
		// �й��� ���� ���� �����̴�
		// ��) 1001 == (20, 43)
		//    1002 == (54, 2)
		//    1003 == (76, 6);
		
		// ����3) ������ ���� �Է��ϸ� ��ȣ ���
		// ��) 63 ==> 1001
		// ��) 56 ==> 1002
		// ��) 82 ==> 1003
		
		System.out.print("������ �� �Է� : ");
		int tot = scan.nextInt();
		
		// -2�� ���� ������ score index 6��°���� ���ϴ� ������� �� ��������
		// score�� �迭 ���̴� 8 �̱� ������ 
		// index ������ ����� �������� �ع����� 
		// ������� �� ������ �迭�� ���̸� �������� �ɱ� ����
		// -2�� ���־���.
		for(int i = 0; i < score.length-2; i++) {
			if(tot == (score[i + 1] + score[i + 2])) {
				System.out.println(score[i]);
			}
		}
		
		
	}

}
