package inputEx;

import java.util.Scanner;

public class InputEx02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 문제 1) 숫자 2개를 입력받아, 합 출력
		System.out.print("정수1 입력 : ");
		int num1 = scan.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = scan.nextInt();
		
		int sum = num1 + num2;
		
		System.out.println("두 개 정수의 합은 : " + sum + "입니다");
		
		System.out.println();
		
		
		// 문제2) 숫자 1개를 입력받아, 홀수이면 true 출력
		System.out.print("숫자 입력 : ");
		int num3 = scan.nextInt();
		System.out.println(num3 % 2 == 1);
		
		// 문제3) 성적을 입력받아, 60점 이상이고 100점 이하이면 true 출력ㅏ
		System.out.print("성적 입력 : ");
		int score = scan.nextInt();
		
		System.out.println((60 <= score) && (score <= 100));
		
	}

}
