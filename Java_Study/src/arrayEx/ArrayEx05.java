package arrayEx;

import java.util.Scanner;

// # �л��������� ���α׷�[2�ܰ�] : �л��˻�

public class ArrayEx05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// �ε���	     0   1   2   3   4
		int[] arr = {87, 11, 45, 98, 23};
		
		// ����1) �ε����� �Է¹޾� ���� ���
		// ����1) �ε��� �Է� : 1		���� : 11��
		System.out.print("�ε��� �Է� : ");
		int idx = scan.nextInt();
		for(int i = 0; i < arr.length; i++) {
			if(arr[idx] == arr[i]) {
				System.out.print("���� : " + arr[idx]);
			}
		}
		
		System.out.println();
		
		// ����2) ������ �Է¹޾� �ε��� ���
		// ����2) ���� �Է� : 11		�ε��� : 1
		System.out.print("���� �Է� : ");
		int score = scan.nextInt();
		for(int i = 0; i < arr.length; i++) {
			if(score == arr[i]) {
				System.out.print("�ε��� : " + i);
			}
		}
		
		System.out.println();
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores = {87, 11, 45, 98, 23};
		
		// ����3) �й��� �Է¹޾� ���� ���
		// ����3) �й� �Է� : 1003		���� : 45��
		
		System.out.print("�й� �Է� : ");
		int hakbun = scan.nextInt();
		for(int i = 0; i < hakbuns.length; i++) {
			if(hakbun == hakbuns[i]) {
				System.out.print("���� : " + scores[i] + "��");
			}
		}
		

	}

}
