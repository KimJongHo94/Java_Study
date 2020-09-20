package arrayEx;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {1001, 20, 1002, 45, 1003, 54};
		// 학번과 점수가 한쌍이다.
		
		// 문제1) 학번을 입력하면 점수 출력
		System.out.print("학번 입력 : ");
		int hakbun = scan.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == hakbun) {
				System.out.println("점수 = " + arr[i + 1] + "점");
			}
		}
		
		// 문제2) 점수를 입력하면 학번 출력
		System.out.print("점수 입력 : ");
		int score = scan.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			if(score == arr[i]) {
				System.out.println("학번 = " + arr[i - 1]);
			}
		}
	}

}
