package randomEx;

import java.util.Random;
import java.util.Scanner;

/*
 * # ������ ����[2�ܰ�]
 * 1. ������ ������ �����ϱ� ����, ���� 2���� �����ϰ� �����Ѵ�.
 * 2. ����� ���ڸ� ���� ������ ������ ����Ѵ�.
 * ��)	3 x 7 = ?
 * 3. ������ �ش��ϴ� ������ �Է¹޴´�.
 * 4. ������ �� "����" �Ǵ� "��"�� ����Ѵ�.
 */

public class RandomEx05 {

	public static void main(String[] args) {
	
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int x = ran.nextInt(8) + 2;
		int y = ran.nextInt(9) + 1;
		
		int answer = x * y;
		
		System.out.println("���� = " + x + "x" + y + "=" + "?");
		
		System.out.print("���� �Է� : ");
		int myAnswer = scan.nextInt();
		
		if(myAnswer == answer) {
			System.out.println("����");
		}
		else {
			System.out.println("����!");
		}
	}

}
