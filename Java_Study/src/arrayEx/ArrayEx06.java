package arrayEx;

import java.util.Scanner;

// # �л��������� ���α׷�[3�ܰ�] : ����ó��

public class ArrayEx06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores = {87, 11, 45, 98, 23};
		
		// ����) �й��� �Է¹޾� ���� ���
		//      ��, �����й� �Է� �� ����ó��
		// ��) 
		// �й� �Է� : 1002		���� : 11��
		// �й� �Է� : 1000		�ش��й��� �������� �ʽ��ϴ�.
		
		System.out.print("�й� �Է� : ");
		int hakbun = scan.nextInt();
		
		/*
		for(int i = 0; i < hakbuns.length; i++) {
			if(hakbun == hakbuns[i]) {
				System.out.print("���� : " + scores[i] + "��");
			}
			else if(hakbun != hakbuns[i]) {
				System.out.println("�ش��й��� �������� �ʽ��ϴ�.");
				break;
			}
		}
		*/
		
		int check = -1;
		for(int i = 0; i < hakbuns.length; i++) {
			if(hakbun == hakbuns[i]) {
				check = i;
			}
		}
		
		if(check == -1) {
			System.out.println("�ش��й��� �������� �ʽ��ϴ�.");
		}
		else {
			System.out.println(scores[check] + "��");
		}
		

	}

}
