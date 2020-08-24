package arrayEx;

import java.util.Scanner;

/*

 * # ��ȭ�� �¼�����
 * 1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�.
 * 2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� �����Ѵ�.
 * 3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����.
 * 4. �� �¼��� ���� ������ 12000���̴�.
 * 5. ���α׷� ���� ��, �ش� ��ȭ���� �� ������� ����Ѵ�.
 * 
 * ��)
 * seat = 0 0 0 0 0 0 0
 * 
 * �¼����� : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * �̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.
 * ----------------------
 * ����� : 24000��

 */

public class ArrayEx09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] seat = new int[7];
		
		boolean run = true;
		
		int cnt = 0;
		
		
		while(run) {
			
			for(int i = 0; i < seat.length; i++) {
				if(seat[i] == 0) {
					System.out.print("[ ]");
				}
				else {
					System.out.println("[O]");
				}
			}
			System.out.println();
			
			System.out.println("===�ް� ��ȭ��===");
			System.out.println("1. �¼� ����");
			System.out.println("2. ����");
			
			System.out.print("�¼� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				
				System.out.print("�¼���ȣ ����[1 ~ 7] : ");
				int idx = scan.nextInt();
				idx -= 1;
				
				if(seat[idx] == 0) {
					seat[idx] = 1;
					cnt += 1;
				}
				else {
					System.out.println("�̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.");
				}
				
			}
			else if(sel == 2) {
				
				int total = cnt * 12000;
				System.out.println("����� : " + total + "��");
				
				run = false;
			}
		}
		

	}

}
