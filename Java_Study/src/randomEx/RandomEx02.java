package randomEx;

import java.util.Random;
import java.util.Scanner;

/*
 * # ���� ����
 * 1. 0 �Ǵ� 1�� ���� ���ڸ� �����Ѵ�.
 * 2. 0�� ������ �ո�, 1�� ������ �޸��̴�.
 * 3. ������ �յ޸��� ���ߴ� �����̴�.
 */

public class RandomEx02 {

	public static void main(String[] args) {
	
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int coin = ran.nextInt(2);
		
		if(coin == 0) {
			System.out.println("ġƮŰ :" + coin + " �ո�");
		}
		else {
			System.out.println("ġƮŰ : " + coin + " �޸�");
		}
		
		System.out.print("��ȣ �Է� : ");
		int me = scan.nextInt();
		
		if(me == coin) {
			System.out.println("����");
		}
		else if(me != coin) {
			System.out.println("��");
		}
		
		
		
	}

}
