package ifEx;

import java.util.Scanner;

/*
 * # �α���[3�ܰ�]
 * 1. Id�� �Է¹޾� dbId�� ��ġ�� ��쿡�� Pw�� �Է��� �� �ִ�.
 * 2. Id�� Ʋ�� ���, "Id�� Ȯ�����ּ���"��� �޼����� ����Ѵ�.
 * 3. Pw�� Ʋ�� ���, "Pw�� Ȯ�����ּ���"��� �޼����� ����Ѵ�.
 * 4. Id�� Pw�� ��� ��ġ�ϴ� ���, "�α��� ����"��� �޼����� ����Ѵ�.
 */

public class IfEx09 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int dbId = 1234;
		int dbPw = 1111;
		
		System.out.print("���̵� �Է� : ");
		int myId = scan.nextInt();
		
		if(dbId == myId) {
			System.out.print("��й�ȣ �Է� : ");
			int myPw = scan.nextInt();
			
			if(dbPw == myPw) {
				System.out.println("�α��� ����");
			}
			if(dbPw != myPw) {
				System.out.println("��й�ȣ�� Ȯ�����ּ���");
			}
		}
		if(dbId != myId) {
			System.out.println("���̵� Ȯ�����ּ���.");
		}
		
	}

}
