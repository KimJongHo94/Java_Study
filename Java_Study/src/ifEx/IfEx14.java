package ifEx;

import java.util.Random;
import java.util.Scanner;

/*
 * # ���������� ����[2�ܰ�]��
 * 	if - else if �������� �����غ���
 */

public class IfEx14 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int com = ran.nextInt(3);
		System.out.println("com : " + com);
		
		System.out.print("���������� �Է� : ");
		int me = scan.nextInt();
		
		if(com == me) {
			System.out.println("����.");
		}else if(com == 0 && me == 1) {
			System.out.println("�̰��.");
		}else if(com == 1 && me == 2) {
			System.out.println("�̰��.");
		}else if(com == 2 && me == 0) {
			System.out.println("�̰��.");
		}else {
			System.out.println("����.");
		}

	}

}
