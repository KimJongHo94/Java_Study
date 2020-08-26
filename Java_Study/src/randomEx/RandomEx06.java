package randomEx;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가위(0)바위(1)보(2) 게임[2단계]
 * 1. com은 0~2 사이의 랜덤한 숫자를 저장한다.
 * 2. me는 0~2 사이의 숫자를 입력받는다.
 * 3. com과 me를 비교해,
 * 		1) 비겼다.
 * 		2) 내가 이겼다.
 * 		3) 내가 졌다.			를 출력한다.
 */


public class RandomEx06 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int com = ran.nextInt(3);
		System.out.println("com = " + com);
		
		System.out.print("가위바위보 입력 : ");
		int me = scan.nextInt();
		
		if(me == com) {
			System.out.println("비겼다!");
		}
		else if((me == 0 && com == 2) || (me == 1 && com == 0) || (me == 2 && com == 1)) {
			System.out.println("이겼다!");
		}
		else {
			System.out.println("졌다");
		}

	}

}
