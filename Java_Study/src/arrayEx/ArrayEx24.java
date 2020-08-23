package arrayEx;

/*
 * # 최대값 구하기[3단계]
 * 1. 가장 큰 값을 찾아 입력한다.
 * 2. 정답이면 해당 값을 0으로 변경한다.
 * 3. arr배열의 모든 값이 0으로 변경되면 프로그램은 종료된다.
 * 예)
 * 11, 87, 42, 100, 24
 * 입력 : 100
 * 
 * 11, 87, 42, 0, 24
 * 입력 : 87
 * 
 * 11, 0, 42, 0, 24
 */

import java.util.Scanner;

public class ArrayEx24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {11, 87, 42, 100, 24};
		
		int count = 5;
				
		while(true) {
			
			int maxNum = 0;
			int maxIdx = 0;
			
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			
			for(int i = 0; i < arr.length; i++) {
				if(maxNum < arr[i]) {
					maxNum = arr[i];
					maxIdx = i;
				}
			}
			
			System.out.print("입력 : ");
			int num = scan.nextInt();
			
			if(num == maxNum) {
				arr[maxIdx] = 0;
				count -= 1;
			}
			
			if(count == 0) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
	}

}
