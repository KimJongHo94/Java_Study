package whileEx;

import java.util.Scanner;

/*
 * # �ݺ��� ����(-100)
 * 1. ���� �ݺ��� �ϸ鼭 ���ڸ� �Է¹޴´�.
 * 2. �Է��� ���ڰ� -100�̸�, ���α׷��� ����ȴ�.
 */

public class WhileEx06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[-100 �Է� Ż�� ]");
		
		while(true) {
			
			System.out.print("���� �Է� : ");
			int num = scan.nextInt();
			
			if(num == -100) {
				System.out.println("���α׷� ����");
				return;
			}
			
		}

	}

}
