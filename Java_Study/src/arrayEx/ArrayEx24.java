package arrayEx;

/*
 * # �ִ밪 ���ϱ�[3�ܰ�]
 * 1. ���� ū ���� ã�� �Է��Ѵ�.
 * 2. �����̸� �ش� ���� 0���� �����Ѵ�.
 * 3. arr�迭�� ��� ���� 0���� ����Ǹ� ���α׷��� ����ȴ�.
 * ��)
 * 11, 87, 42, 100, 24
 * �Է� : 100
 * 
 * 11, 87, 42, 0, 24
 * �Է� : 87
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
			
			System.out.print("�Է� : ");
			int num = scan.nextInt();
			
			if(num == maxNum) {
				arr[maxIdx] = 0;
				count -= 1;
			}
			
			if(count == 0) {
				System.out.println("���α׷� ����");
				break;
			}
		}
		
	}

}
