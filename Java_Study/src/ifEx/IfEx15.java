package ifEx;

import java.util.Scanner;

/*
 * # ATM[1�ܰ�] : ��ü�ϱ�
 * 1. ��ü�� ���¹�ȣ�� �Է¹޴´�.
 * 2. ���¹�ȣ�� ��ġ�ϸ�,
 * 3. ��ü�� �ݾ��� �Է¹޴´�.
 * 4. ��ü�� �ݾ� <= myMoney : ��ü����
 *		  myMoney - ��ü�� �ݾ�
 *		  yourMoney + ��ü�� �ݾ�
 *    ��ü�� �ݾ� > myMoney : ��ü�Ұ�
 */

public class IfEx15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1234;
		int myMoney = 8700;
		
		int yourAcc= 4321;
		int yourMoney = 12000;
		
		System.out.print("���¹�ȣ �Է� : ");
		int transAcc = scan.nextInt();
		
		if(transAcc == yourAcc) {
			
			System.out.print("��ü�� �ݾ��� �Է����ּ��� : ");
			int transMoney = scan.nextInt();
			
			if(transMoney <= myMoney) {
				myMoney -= transMoney;
				yourMoney += transMoney;
				System.out.println("��ü�� �Ϸ��߽��ϴ�.");
			}
			else if(transMoney > myMoney) {
				System.out.println("�ܾ��� �����մϴ�.");
			}
			
		}
		else {
			System.out.println("���¹�ȣ�� Ȯ�����ּ���.");
		}
		
		System.out.println("myMoney = " + myMoney + "��");
		System.out.println("yourMoney = " + yourMoney + "��");

	}

}