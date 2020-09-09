package arrayEx;

import java.util.Scanner;
import java.util.Random;

/*
 * # 즉석복권
 * 1. 숫자 7이 연속으로 3번 등장하면, 당첨복권이다.
 */

public class ArrayEx10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] lotto = {0, 0, 7, 7, 7, 0, 0};

		int cnt = 0;
		
		boolean run = true;
		
		while(run) {
			
			System.out.println("1) 복권 결과확인");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				
				for(int i = 0; i < lotto.length - 2; i++) {
					if(lotto[i] == 7 && lotto[i + 1] == 7 && lotto[i + 2] == 7) {
						System.out.println("당첨");
						i = lotto.length - 2;
					}
						
				}
				
			}
			run = false;
		}
		// 추가 문제) lotto에 처음부터 값이 있는게 아니라
		//         랜덤으로 7 이나 0을 넣은 후 다른 겨로가가 나오도록 만들기
		/*
		 * 
		Random ran = new Random();
		
		int[] lotto = new int[7];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = ran.nextInt(8);
			if(lotto[i] == 0 || lotto[i] == 7) {
				System.out.print(lotto[i] + " ");
			}
			else {
				i--;
			}
			
		}
		
		 */
		
	}

}
