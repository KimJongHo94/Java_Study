package ifEx;

import java.util.Scanner;

/*
 * # ������ ���[1�ܰ�]
 * 1. �޴����� ����Ѵ�.
 * 2. ����ڴ� �ֹ��ϰ��� �ϴ� �޴��� ��ȣ�� �Է��Ѵ�.
 * 3. ������ �Է¹޴´�.
 * 4. �Է¹��� ���ݰ� �޴������� Ȯ����, �������� ����Ѵ�.
 * 5. ��, ������ ������ ��� "������ �����մϴ�."��� �޼����� ����Ѵ�.
 */

public class IfEx11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
		System.out.println("2.����    ���� : " + price2 + "��");
		System.out.println("3.��         �� : " + price3 + "��");
		
		System.out.print("�޴� ���� : ");
		int sel = scan.nextInt();
		
		System.out.print("���� �Է� : ");
		int money = scan.nextInt();
		
		if(sel == 1) {
			
			if(money >= price1) {
				money = money - price1;
				System.out.println("�ܵ� : " + money + "��");
			}
			if(money < price1) {
				System.out.println("������ �����մϴ�.");
			}
		}
		if(sel == 2) {
			
			if(money >= price2) {
				money = money - price2;
				System.out.println("�ܵ� : " + money + "��");
			}
			if(money < price2) {
				System.out.println("������ �����մϴ�.");
			}
		}
		if(sel == 3) {
			
			if(money >= price3) {
				money = money - price3;
				System.out.println("�ܵ� : " + money + "��");
			}
			if(money < price3) {
				System.out.println("������ �����մϴ�.");
			}
		}


	}

}
