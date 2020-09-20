package arrayEx;

import java.util.Random;

/*
 * # OMRī��
 * 1. �迭 answer�� ���蹮���� �������̴�.
 * 2. �迭 hgd�� 1~5 ������ ���� ���� 5���� �����Ѵ�.
 * 3. answer�� hgd ���� ���� ����ǥ�� ����Ѵ�.
 * 4. �� ������ 20���̴�.
 * ��)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * ����ǥ     = {O, X, O, X, X}
 * ����        = 40��
 */

public class ArrayEx08 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[] answer = {1, 3, 4, 2, 5};
		int[] hgd = new int[5];
		
		
		System.out.print("answer : ");
		for(int i = 0; i < answer.length; i++) {
			System.out.print( answer[i] + " ");
		}
		System.out.println();
		
		System.out.print("hgd : ");
		for(int i = 0; i < hgd.length; i++) {
			hgd[i] = ran.nextInt(5) + 1;
			System.out.print(hgd[i] + " ");
		}
		System.out.println();
		
		String[] str = new String[5];
		int cnt = 0;
		
		for(int i = 0; i < answer.length; i++) {
			
			if(answer[i] == hgd[i]) {
				str[i] = "O";
				cnt += 1;
			}
			else {
				str[i] = "X";
			}
		}
		
		int score = cnt * 20;
		
		System.out.print("����ǥ : ");
		for(int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
		System.out.println();
		System.out.println("���� : " + score + "��");
			
	}

}

/*
���� ���

answer = [ 1 3 4 2 5 ]
hgd    = [ 3 1 4 4 3 ]
����ǥ       = [ X X O X X ]
���� = 20��

*/
