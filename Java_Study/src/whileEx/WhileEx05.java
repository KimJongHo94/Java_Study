package whileEx;

import java.util.Scanner;

/*
 * # ������ ���[2�ܰ�]
 * 1. 5�� �ֹ��� �޴´�.
 * 2. �ֹ��� ���� ��, ���� �Է¹޴´�.
 * 3. �� �޴��� �ֹ������� �ѱݾ��� ����Ѵ�.
 * 
 * ��)
 * �޴� ���� : 1
 * �޴� ���� : 1
 * �޴� ���� : 2
 * �޴� ���� : 2
 * �޴� ���� : 3
 * �� �ݾ� = 31300��
 * ���� �Է� : 32000
 * === �Ե����� ������ ===
 * 1. �Ұ�� ���� : 2��
 * 2. ����    ���� : 2��
 * 3. ��         �� : 1��
 * 4. ��   ��   �� : 31300��
 * 5. ��         �� : 700��
 */

public class WhileEx05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== �Ե����� ===");
		System.out.println("1. �Ұ�� ���� : " + price1 + "��");
		System.out.println("2. ���� ���� : " + price2 + "��");
		System.out.println("3. �� �� : " + price3 + "��");
		
		int i = 1;
		
		int p1 = 0;
		int p2 = 0;
		int p3 = 0;
		
		while(i <= 5) {
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				p1 += 1;
			}
			else if(sel == 2) {
				p2 += 1;
			}
			else if(sel == 3) {
				p3 += 1;
			}
			i++;
			
		}
		int tot = (price1 * p1) + (price2 * p2) + (price3 * p3);
		
		System.out.println("�� �ݾ� = " + tot + "��");
		
		System.out.print("���� �Է� : ");
		int money = scan.nextInt();
		
		if(money >= tot) {
			
			int charge = money - tot;
			
			System.out.println("=== �Ե����� ������ ===");
			System.out.println("1. �Ұ�� ���� : " + p1 + "��");
			System.out.println("2. ���� ���� : " + p2 + "��");
			System.out.println("3. �� �� : " + p3 + "��");
			System.out.println("4. �� �� �� : " + tot + "��");
			System.out.println("5. �� �� : " + charge + "��");
		}
		else {
			System.out.println("�ܾ��� �����մϴ�.");
		}

	}

}
