package whileEx;

import java.util.Scanner;
import java.util.Random;

/*
 * # Up & Down ����[2�ܰ�]
 * 1. ������ ���߸� ������ ����ȴ�.
 * 2. 100������ ������ ������ �Է��� ������ 5���� �����ȴ�.
 * 3. ���� ���� ��, ������ ����Ѵ�.
 */

public class WhileEx07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int cnt = 0;
		
		int com = ran.nextInt(100) + 1;
		System.out.println("ġƮŰ = " + com);
		
		while(true) {
			
			System.out.print("���� �Է� : ");
			int me = scan.nextInt();
			
			if(me < com) {
				System.out.println("Up!!");
				cnt += 1;
			}
			if(me > com) {
				System.out.println("Down!!");
				cnt += 1;
			}
			if(me == com) {
				System.out.println("Bingo!!!");
				break;
			}
			
		}
		
		int score = 100 - (cnt * 5);
		System.out.println("���� = " + score + "��");

	}

}
