package arrayEx;

import java.util.Scanner;

public class ArrayEx12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 30, 40, 50};
		
		/*
		// ����1) �ε��� 2���� �Է¹޾� �� ��ü�ϱ�
		// ��)   �ε���1 �Է� : 1
		//      �ε���2 �Է� : 3
		//      {10, 40, 30, 20, 50}
		int temp = 0;
		
		System.out.print("�ε��� �Է�1 : ");
		int idx = scan.nextInt();
		
		System.out.print("�ε��� �Է�2 : ");
		int idx2 = scan.nextInt();
	
		temp = arr[idx];
		arr[idx] = arr[idx2];
		arr[idx2] = temp;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
		System.out.println();
		
		
		// ����2) �� 2���� �Է¹޾� �� ��ü�ϱ�
		// ��)   ��1 �Է� : 40
		//      ��2 �Է� : 20
		//      {10, 20, 30, 40, 50};
		System.out.print("��1 �Է� : ");
		int num1 = scan.nextInt();
		
		System.out.print("��2 �Է� : ");
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
		
		// ����3) �й� 2���� �Է¹޾� ���� ��ü�ϱ�
		// ��)   �й�1 �Է� : 1002
		//      �й�2 �Է� : 1003
		//      {87, 45, 11, 98, 23};
		
		System.out.print("�й� �Է� : ");
		int hak1 = scan.nextInt();
		
		System.out.print("�й� �Է� : ");
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
