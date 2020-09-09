package arrayEx;

import java.util.Scanner;

public class ArrayEx12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 30, 40, 50};
		
		/*
		// 문제1) 인덱스 2개를 입력받아 값 교체하기
		// 예)   인덱스1 입력 : 1
		//      인덱스2 입력 : 3
		//      {10, 40, 30, 20, 50}
		int temp = 0;
		
		System.out.print("인덱스 입력1 : ");
		int idx = scan.nextInt();
		
		System.out.print("인덱스 입력2 : ");
		int idx2 = scan.nextInt();
	
		temp = arr[idx];
		arr[idx] = arr[idx2];
		arr[idx2] = temp;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
		System.out.println();
		
		
		// 문제2) 값 2개를 입력받아 값 교체하기
		// 예)   값1 입력 : 40
		//      값2 입력 : 20
		//      {10, 20, 30, 40, 50};
		System.out.print("값1 입력 : ");
		int num1 = scan.nextInt();
		
		System.out.print("값2 입력 : ");
		int num2 = scan.nextInt();
		
		int temp1 = 0;
		int temp2 = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(num1 == arr[i]) {
				temp1 = i;
			}
			if(num2 == arr[i]) {
				temp2 = i;
			}
			
		}
		
		temp = arr[temp1];
		arr[temp1] = arr[temp2];
		arr[temp2] = temp;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		*/
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores = {87, 11, 45, 98, 23};
		
		// 문제3) 학번 2개를 입력받아 성적 교체하기
		// 예)   학번1 입력 : 1002
		//      학번2 입력 : 1003
		//      {87, 45, 11, 98, 23};
		
		System.out.print("학번 입력 : ");
		int hak1 = scan.nextInt();
		
		System.out.print("학번 입력 : ");
		int hak2 = scan.nextInt();
		
		int idx1 = 0;
		int idx2 = 0;
		
		int temp = 0;
		
		for(int i = 0; i < hakbuns.length; i++) {
			if(hak1 == hakbuns[i]) {
				idx1 = i;
			}
			if(hak2 == hakbuns[i]) {
				idx2 = i;
			}
		}
		
		temp = scores[idx1];
		scores[idx1] = scores[idx2];
		scores[idx2] = temp;
		
		for(int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
		

	}

}
