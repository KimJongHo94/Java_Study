package ifEx;

import java.util.Scanner;

/*
 * # �α���[1�ܰ�]
 * 1. Id�� Pw�� �Է¹޴´�.
 * 2. �Է¹��� �����Ϳ� db�����͸� ���� �α��� ó���� �����Ѵ�.
 * ��) �α��� ���� or �α��� ����
 */

public class IfEx04 {

	public static void main(String[] args) {
	
		int dbId = 1234;
		int dbPw = 1111;
		
		Scanner scan = new Scanner(System.in);
		
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
