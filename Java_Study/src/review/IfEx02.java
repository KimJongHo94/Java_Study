package review;

import java.util.Scanner;

/*
 * # Up & Down ����[1�ܰ�]
 * 1. com�� 8�̴�.
 * 2. me�� com�� ���ڸ� ���ߴ� �����̴�.
 * 3. ������ ���� �޼����� ����Ѵ�.
 * 1) me < com	: Up!
 * 2) me == com : Bingo!
 * 3) me > com  : Down!
 */

public class IfEx02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int com = 8;
		
		System.out.print("���� �Է� : ");
		int me = scan.nextInt();
		
		if (me < com)
		{
			System.out.println("Up!");
		}
		if (me == com)
		{
			System.out.println("Bingo!!");
		}
		if (me > com)
		{
			System.out.println("Down");
		}
		
	}

}
