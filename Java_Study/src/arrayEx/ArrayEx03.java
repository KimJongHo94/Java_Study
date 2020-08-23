package arrayEx;

/*
 * # �迭 �⺻����
 */

public class ArrayEx03 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		// ����1) 10���� 50���� arr �迭�� ����
		// ����1) 10 20 30 40 50
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i * 10) + 10;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// ����2) 4�� ����� ���
		// ����2) 20 40
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 4 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		
		// ����3) 4�� ����� �� ���
		// ����3) 60
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 4 == 0) {
				sum += arr[i];
			}
		}
		System.out.println("4�� ����� �� : " + sum);
		
		// ����4) 4�� ����� ���� ���
		// ����4) 2
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 4 == 0) {
				cnt += 1;
			}
		}
		System.out.println("4�� ����� ���� : " + cnt + "��");
		
		// ����5) ¦���� ���� ���
		// ����5) 5
		int even = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				even += 1;
			}
		}
		System.out.println("¦���� ���� : " + even + "��");

	}

}
