package randomEx;

import java.util.Random;
import java.util.Scanner;

/*
 * # ����(0)����(1)��(2) ����[2�ܰ�]
 * 1. com�� 0~2 ������ ������ ���ڸ� �����Ѵ�.
 * 2. me�� 0~2 ������ ���ڸ� �Է¹޴´�.
 * 3. com�� me�� ����,
 * 		1) ����.
 * 		2) ���� �̰��.
 * 		3) ���� ����.			�� ����Ѵ�.
 */


public class RandomEx06 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int com = ran.nextInt(3);
		System.out.println("com = " + com);
		
		System.out.print("���������� �Է� : ");
		int me = scan.nextInt();
		
		if(me == com) {
			System.out.println("����!");
		}
		else if((me == 0 && com == 2) || (me == 1 && com == 0) || (me == 2 && com == 1)) {
			System.out.println("�̰��!");
		}
		else {
			System.out.println("����");
		}

	}

}
