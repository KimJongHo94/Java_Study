package arrayEx;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
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

	}

}
