package whileEx;

import java.util.Scanner;
import java.util.Random;

/*
 * # 구구단 게임[3단계]
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 */


public class WhileEx04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int i = 1;
		
		int cnt = 0;
		
		while(i <= 5) {
			
			int x = ran.nextInt(8) + 2;
			int y = ran.nextInt(9) + 1;
			
			int answer = x * y;
			
			System.out.println("문제)" + x + " x " + y + " = " + "?");
			
			System.out.print("정답 입력 : ");
			int myAnswer = scan.nextInt();
			
			if(myAnswer == answer) {
				cnt += 1;
			}
			else {
				cnt = 0;
			}
			i++;
			
		}
		
		int score = 20 * cnt;
		
		System.out.println("성적 : " + score + "점");
		
		
	}

}
