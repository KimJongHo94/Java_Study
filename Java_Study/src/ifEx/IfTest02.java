package ifEx;

import java.util.Scanner;

public class IfTest02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 1. �α��� ==> 1.�Ա� 2.��� 3.��ȸ
		int cash = 20000;		// �Աݽ� ����, ��ݽ� ����
		int balance = 30000;	// �Աݽ� ����, ��ݽ� ����
		int account = 1111;		// �α��ν� ���
		int password = 1234;	// �α��ν� ���
		
		System.out.println("===MEGA ATM===");
		System.out.println("1.�α��� 2.����");
		int sel = scan.nextInt();
		
		if(sel == 1) {
			System.out.print("���¿� ��й�ȣ�� �Է����ּ��� : ");
			int acc = scan.nextInt();
			int pw = scan.nextInt();
			
			if(acc == account && pw == password) {
				System.out.print("1.�Ա� 2.��� 3.��ȸ");
				sel = scan.nextInt();
				
				if(sel == 1) {
					System.out.print("�Ա��� �ݾ��� �Է� : ");
					int deposit = scan.nextInt();
					
					if(deposit <= cash) {
						deposit -= cash;
						deposit += balance;
						System.out.println("�Ա��� �Ϸ��߽��ϴ�.");
					}
					else {
						System.out.println("�ܾ��� �����մϴ�.");
					}
				}
				else if(sel == 2) {
					System.out.print("����� �ݾ��� �Է� : ");
					int withdraw = scan.nextInt();
					
					if(withdraw <= balance) {
						cash += withdraw;
						balance -= withdraw;
						System.out.println("����� �Ϸ��߽��ϴ�.");
					}
					else {
						System.out.println("�ܾ��� �����մϴ�.");
					}
				}
				else if(sel == 3) {
					System.out.println("��ȸ : " + balance + "��");
				}
			}
			else {
				System.out.println("���¹�ȣ�� ��й�ȣ�� Ȯ�����ּ���.");
			}
		}
		else if(sel == 2) {
			System.out.println("����");
		}

	}

}
