package ifEx;

import java.util.Random;
import java.util.Scanner;

/*
 * # ��� ���� ���߱� ����
 * 1. 150 ~ 250 ������ ���� ���� ����
 * 2. ���� ������ ��� ���ڸ� ���ߴ� �����̴�.
 * 
 * ��)
 * 		249 : 4
 */

public class IfEx16 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int rNum = ran.nextInt(100) + 150;
		
		System.out.println("���� : " + rNum);
		
		int answer = (rNum % 100) / 10;
		
		System.out.print("���� �Է� : ");
		int myAnswer = scan.nextInt();
		
		if(myAnswer == answer) {
			System.out.println("����!");
		}
		else {
			System.out.println("��!");
		}

	}

}
