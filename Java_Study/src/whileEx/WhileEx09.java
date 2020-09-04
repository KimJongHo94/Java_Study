package whileEx;

import java.util.Scanner;

/*
 * # ATM[2�ܰ�]
 * 1. �Ա�
 * . �Ա��� �ݾ��� �Է¹޾�, myMoney�� �Ա�
 * 2. ���
 * . ����� �ݾ��� �Է¹޾�, myMoney���� ���
 * . ��, ����� �ݾ��� myMoney �ܾ��� �ʰ��� ��� ��ݺҰ�
 * 3. ��ü
 * . yourAcc ���¹�ȣ�� �Է¹޾�, ��ü
 * . ��ü�� �ݾ��� myMoney �ܾ��� �ʰ��� ��� ��ü �Ұ�
 * . ��ü �� yourMoney �ܾ� ����
 * 4. ��ȸ
 * . myMoney�� yourMoney �ܾ� ��� ���
 */

public class WhileEx09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1111;
		int myMoney = 50000;
		
		int yourAcc = 2222;
		int yourMoney = 70000;
		
		boolean run = true;
		
		while(run) {
			
			System.out.println("1.�Ա�");
			System.out.println("2.���");
			System.out.println("3.��ü");
			System.out.println("4.��ȸ");
			System.out.println("0.����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				
				System.out.print("�Ա��� �ݾ� �Է� : ");
				int money = scan.nextInt();
					
				myMoney += money;
				System.out.println("�Ա��� �Ϸ��߽��ϴ�.");
				
			}
			else if(sel == 2) {
				
				System.out.println("����� �ݾ� �Է� : ");
				int money = scan.nextInt();
				
				if(money <= myMoney) {
					myMoney -= money;
					System.out.println("����� �Ϸ��߽��ϴ�.");
				}
				else {
					System.out.println("�ܾ��� �����մϴ�.");
				}
				
			}
			else if(sel == 3) {
				
				System.out.print("��ü�� ���¹�ȣ �Է� : ");
				int transAcc = scan.nextInt();
				
				if(transAcc == yourAcc) {
					System.out.println("��ü�� �ݾ� �Է� : ");
					int money = scan.nextInt();
					
					if(money <= myMoney) {
						myMoney -= money;
						yourMoney += money;
						System.out.println("��ü�� �Ϸ��߽��ϴ�.");
					}
					else {
						System.out.println("�ܾ��� �����մϴ�.");
					}
					
				}
				else {
					System.out.println("���¹�ȣ�� Ȯ�����ּ���.");
				}
				
			}
			else if(sel == 4) {
				System.out.println("myAcc �ܾ� = " + myMoney + "��");
				System.out.println("yourAcc �ܾ� = " + yourMoney + "��");
			}
			else if(sel == 0) {
				run = false;
				System.out.println("���α׷� ����");
			}
			
		}

	}

}
