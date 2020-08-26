package ifEx;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가운데 숫자 맞추기 게임
 * 1. 150 ~ 250 사이의 랜덤 숫자 저장
 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
 * 
 * 예)
 * 		249 : 4
 */

public class IfEx16 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int rNum = ran.nextInt(100) + 150;
		
		System.out.println("문제 : " + rNum);
		
		int answer = (rNum % 100) / 10;
		
		System.out.print("정답 입력 : ");
		int myAnswer = scan.nextInt();
		
		if(myAnswer == answer) {
			System.out.println("정답!");
		}
		else {
			System.out.println("땡!");
		}

	}

}
