package arrayEx;

import java.util.Scanner;

public class Ex02_다시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		int[] arr = {1001, 20, 1002, 45, 1003, 54};
		// 학번과 점수가 한쌍이다 1001:20, 1002:45, 1003:54
		
		// 문제1) 학번을 입력하면 점수 출력
		System.out.print("학번 입력 : ");
		int hakbun = scan.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			if(hakbun == arr[i]) {
				System.out.println("학번 : " + hakbun + " " + "점수 : " + arr[i + 1]);
			}
		}
		
		// 문제2) 점수를 입력하면 학번 출력
		System.out.print("점수 입력 : ");
		int score = scan.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			if(score == arr[i]) {
				System.out.println("학번 : " + arr[i - 1] + " " + "점수 : " + score);
			}
		}
		*/
		//========================================================================
		
		int[] score = {1001, 20, 43, 1002, 54, 2, 1003, 76, 6};
		
		// 학번과 국어 수학 점수이다
		// 예) 1001 == (20, 43)
		//    1002 == (54, 2)
		//    1003 == (76, 6);
		
		// 문제3) 점수의 합을 입력하면 번호 출력
		// 예) 63 ==> 1001
		// 예) 56 ==> 1002
		// 예) 82 ==> 1003
		
		System.out.print("점쉬의 합 입력 : ");
		int tot = scan.nextInt();
		
		// -2를 해준 이유는 score index 6번째에서 원하는 결과값이 다 나오지만
		// score의 배열 길이는 8 이기 때문에 
		// index 범위를 벗어나는 계산까지를 해버려서 
		// 결과값이 딱 나오는 배열의 길이를 조건으로 걸기 위해
		// -2를 해주었다.
		for(int i = 0; i < score.length-2; i++) {
			if(tot == (score[i + 1] + score[i + 2])) {
				System.out.println(score[i]);
			}
		}
		
		
	}

}
