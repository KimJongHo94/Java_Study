package arrayEx;

public class ArrayEx02 {

	public static void main(String[] args) {
		
		// 1. �迭 ����(1)
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// 2. �迭 ����(2) : �����
		int[] temp = {10, 20, 30};
		
		for(int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.println();

	}

}
