package ifEx;

import java.util.Scanner;
import java.util.Random;

/*
 * # ������ ��ȣ ���߱� ����
 * 1. 1~10 ������ ���� ���� 2���� �����Ѵ�.
 * 2. 1~4 ������ ���� ���� 1���� �����Ѵ�.
 * 3. �� ���ڴ� ������ ��ȣ�� �ش�ȴ�.
 * 	  1) ����	  2)  �E��     3) ����	 4) ������
 * 4. ����ڴ� ������ ��ȣ�� ���ߴ� �����̴�.
 * ��) 3 ? 4  = 7
 *    1) + 2) - 3) * 4) %
 *    ���� : 2��
 */

public class IfEx19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int x = ran.nextInt(10) + 1;
		int y = ran.nextInt(10) + 1;
		
		int z = ran.nextInt(4) + 1;
		
		int answer = 0;
		
		if(z == 1) {
			answer = x + y;
		}
		else if(z == 2) {
			answer = x - y;
		}
		else if(z == 3) {
			answer = x * y;
		}
		else if(z == 4) {
			answer = x % y;
		}
		
		System.out.println("����) " + x + " ? " + y + " = " + answer);
		
		System.out.print("���� �Է�( 1) + 2) - 3) * 4) % ) : ");
		int myAnswer = scan.nextInt();
		
		if(myAnswer == z) {
			System.out.println("����");
		}
		else {
			System.out.println("����");
		}

	}

}
