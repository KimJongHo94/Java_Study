package ifEx;

import java.util.Scanner;

/*
 * # �α���[2�ܰ�]
 * 1. Id�� Pw�� �Է¹޾� ȸ�������� �����Ѵ�.
 * 2. ���� �α����� ���� �ٽ� Id�� Pw�� �Է¹޴´�.
 * 3. ���� �� ����� �����Ϳ� �α��� �� �Է¹��� �����͸� ���Ѵ�.
 * ��) �α��� ���� or �α��� ����
 */

public class IfEx05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=== ȸ �� �� �� ===");
		
		System.out.print("���̵� �Է� : ");
		int dbId = scan.nextInt();
		System.out.print("��й�ȣ �Է� : ");
		int dbPw = scan.nextInt();

		System.out.println("ȸ�������� ���ϵ帳�ϴ�!!");
		
		System.out.println();
		
		System.out.println("=== �� �� �� ===");
		
		System.out.print("���̵� �Է� : ");
		int myId = scan.nextInt();
		System.out.print("��й�ȣ �Է� : ");
		int myPw = scan.nextInt();
		
		if(dbId == myId && dbPw == myPw) {
			System.out.println("�α��� ����");
		}
		if(dbId != myId || dbPw != myPw) {
			System.out.println("�α��� ����");
		}

	}

}
