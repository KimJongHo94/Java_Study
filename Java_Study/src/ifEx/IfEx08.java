package ifEx;

/*
 * # ���̱ⱸ �̿�����
 * 1. Ű�� �Է¹޴´�.
 * 2. �Է¹��� Ű�� 120 �̻��̸�, ���̱ⱸ�� �̿��� �� �ִ�.
 * 3. Ű�� 120 �̸��̸�, ���̱ⱸ�� �̿��� �� ����.
 * 4. ��, �θ�԰� �Բ� �� ��� ���̱ⱸ �̿��� �����ϴ�.
 *    ��) �θ�԰� �Բ� ���̳���?(yes:1, no:0)
 */

import java.util.Scanner;

public class IfEx08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ű�� �Է����ּ��� : ");
		int tall = scan.nextInt();
		
		if(tall >= 120) {
			System.out.println("���̱ⱸ �̿� ����");
		}
		if(tall < 120) {
			System.out.print("�θ�԰� �Բ� ���̳���?(yes:1, no:0) : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println("�̿� ����");
			}
			if(sel == 0) {
				System.out.println("�̿� �Ұ�");
			}
					
		}

	}

}
