package whileEx;

import java.util.Scanner;

/*
 * # ATM[2�ܰ�]
 * 1. �α���
 * . �α��� �� �� �α��� �Ұ�
 * . �α׾ƿ� ���¿����� �̿� ����
 * 2. �α׾ƿ�
 * . �α��� �� �̿밡��
 * 3. �Ա�
 * . �α��� �� �̿밡��
 * 4. ���
 * . �α��� �� �̿밡��
 * 5. ��ü
 * . �α��� �� �̿밡��
 * 6. ��ȸ
 * . �α��� �� �̿밡��
 * 7. ����
 */

public class WhileEx10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;
		
		int log = -1;
		
		boolean run = true;
		
		while(run) {
			
			System.out.println("1.�α���");
			System.out.println("2. �α׾ƿ�");
			System.out.println("3.�Ա�");
			System.out.println("4.���");
			System.out.println("5.��ü");
			System.out.println("6.��ȸ");
			System.out.println("0.����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(log == -1) {
					
					System.out.print("���¹�ȣ �Է� : ");
					int acc = scan.nextInt();
					
					System.out.print("��й�ȣ �Է� : ");
					int pw = scan.nextInt();
					
					if(acc == dbAcc1 && pw == dbPw1) {
						log = 1;
						System.out.println("ȯ���մϴ�. " + dbAcc1 + "��");
					}
					else if(acc == dbAcc2 && pw == dbPw2) {
						log = 2;
						System.out.println("ȯ���մϴ�. " + dbAcc2 + "��");
					}
					else {
						System.out.println("���¹�ȣ�� ��й�ȣ�� Ȯ�����ּ���.");
					}
					
				}
			}
			else if(sel == 2) {}
			else if(sel == 3) {}
			else if(sel == 4) {}
			else if(sel == 5) {}
			else if(sel == 6) {}
			else if(sel == 0) {
				run = false;
				System.out.println("���α׷� ����");
			}
			
		}

	}

}
