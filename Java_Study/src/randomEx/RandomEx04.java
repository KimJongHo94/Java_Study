package randomEx;

import java.util.Scanner;
import java.util.Random;

/*
 * # Ȧ¦ ����
 * 1. 1~100������ ���� ���ڸ� �����Ѵ�.
 * 2. ����� ���� ���ڸ� �����ְ�,
 * 3. �ش� ���ڰ� Ȧ������ ¦������ ���ߴ� �����̴�.
 */

public class RandomEx04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int rNum = ran.nextInt(100) + 1;
		
		System.out.println("���� : " + rNum);
		System.out.println("1.Ȧ��");
		System.out.println("2.¦��");
		
		System.out.print("��ȣ�� �����ϼ��� : ");
		int sel = scan.nextInt();
		
		if(sel == 1) {
			if(rNum % 2 == 1) {
				System.out.println("Ȧ��!");
			}
			else {
				System.out.println("����!");
			}
		}
		else if(sel == 2) {
			if(rNum % 2 == 0) {
				System.out.println("¦��!");
			}
			else {
				System.out.println("����!");
			}
		}
		
	}

}
