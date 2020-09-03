package whileEx;

import java.util.Scanner;
import java.util.Random;

/*
 * # Up & Down 게임[2단계]
 * 1. 정답을 맞추면 게임은 종료된다.
 * 2. 100점부터 시작해 오답을 입력할 때마다 5점씩 차감된다.
 * 3. 게임 종료 후, 점수를 출력한다.
 */

public class WhileEx07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int cnt = 0;
		
		int com = ran.nextInt(100) + 1;
		System.out.println("치트키 = " + com);
		
		while(true) {
			
			System.out.print("숫자 입력 : ");
			int me = scan.nextInt();
			
			if(me < com) {
				System.out.println("Up!!");
				cnt += 1;
			}
			if(me > com) {
				System.out.println("Down!!");
				cnt += 1;
			}
			if(me == com) {
				System.out.println("Bingo!!!");
				break;
			}
			
		}
		
		int score = 100 - (cnt * 5);
		System.out.println("점수 = " + score + "점");

	}

}
