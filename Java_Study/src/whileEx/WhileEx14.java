package whileEx;

import java.util.Scanner;

/*
 * # 최대값 구하기[2단계]
 * 1. 3회 반복을 하면서 정수를 입력받는다.
 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
 */

public class WhileEx14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i = 1;
		
		int maxNum = 0;
		
		while(i <= 3) {
			
			System.out.print("정수 입력 : ");
			int num = scan.nextInt();
			
			if(maxNum < num) {
				maxNum = num;
			}
			i += 1;
			
		}
		
		System.out.println("최대값 = " + maxNum);
		
	}

}
