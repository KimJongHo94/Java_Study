package review;

import java.util.Scanner;

/*
 * # ����(0)����(1)��(2) ����[1�ܰ�]
 * 1. com�� ����(1)�� �� �� �ִ�.
 * 2. me�� 0~2 ������ ���ڸ� �Է¹޴´�.
 * 3. com�� me�� ����,
 * 		1) ����.
 * 		2) ���� �̰��.
 * 		3) ���� ����.			�� ����Ѵ�.
 */

public class IfEx03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int com = 1;
		
		System.out.print("���� �Է� : ");
		int me = scan.nextInt();
		
		if (me == com) 
		{
			System.out.println("����.");
		}
		
		if (me == 2)
		{
			System.out.println("�̰��.");
		}
		
		if (me == 0)
		{
			System.out.println("����.");
		}

	}

}
