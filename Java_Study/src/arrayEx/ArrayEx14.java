package arrayEx;

import java.util.Scanner;

/*
 * # �����̵�[1�ܰ�]
 * 1. ����2�� ĳ�����̴�.
 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
 *    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
 * 3. ��, �¿� ���� �������� ��, ����ó���� �ؾ��Ѵ�.
 */

public class ArrayEx14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = {0, 0, 2, 0, 0, 0, 0};
		
		int player = 0;
		
		for(int i = 0; i < game.length; i++) {
			if(game[i] == 2) {
				player = i;
			}
		}
		
		boolean run = true;
		
		while(run) {
			
			for(int i = 0; i < game.length; i++) {
				if(game[i] == 2) {
					System.out.print("��  ");
				}
				else {
					System.out.print(game[i] + " ");
				}
			}
			System.out.println();
			
			System.out.print("����[1] ������[2] �Է� : ");
			int move = scan.nextInt();
			
			if(move == 1) {
				if(player - 1 >= 0) {
					game[player - 1] = 2;
					game[player] = 0;
					player -= 1;
				}
				else if(player - 1 < 0) {
					System.out.println("���� �� �Դϴ�.");
					System.out.println("�ٽ� �Է����ּ���.");
					System.out.println();
					continue;
				}
			}
			else if(move == 2) {
				if(player + 1 < 7) {
					game[player + 1] = 2;
					game[player] = 0;
					player += 1;
				}
				else if(player + 1 >= 7) {
					System.out.println("���� �� �Դϴ�.");
					System.out.println("�ٽ� �Է����ּ���.");
					System.out.println();
					continue;
				}
			}
		}

	}

}