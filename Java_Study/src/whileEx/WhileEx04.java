package whileEx;

import java.util.Scanner;
import java.util.Random;

/*
 * # ������ ����[3�ܰ�]
 * 1. ������ ������ 5ȸ �ݺ��Ѵ�.
 * 2. ������ ���߸� 20���̴�.
 * 3. ���� ���� ��, ������ ����Ѵ�.
 */


public class WhileEx04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int i = 1;
		
		int cnt = 0;
		
		while(i <= 5) {
			
			int x = ran.nextInt(8) + 2;
			int y = ran.nextInt(9) + 1;
			
			int answer = x * y;
			
			System.out.println("����)" + x + " x " + y + " = " + "?");
			
			System.out.print("���� �Է� : ");
			int myAnswer = scan.nextInt();
			
			if(myAnswer == answer) {
				cnt += 1;
			}
			else {
				cnt = 0;
			}
			i++;
			
		}
		
		int score = 20 * cnt;
		
		System.out.println("���� : " + score + "��");
		
		
	}

}
