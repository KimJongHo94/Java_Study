package arrayEx;

/*
 * # 4의 배수만 저장
 * - arr 배열에서 4의 배수만 골라 temp 배열에 저장
 */

public class ArrayEx13 {

	public static void main(String[] args) {
		
		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null;
		
		int size = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 4 == 0) {
				size += 1;
			}
		}
		
		temp = new int[size];
		// temp = new int[3];
		
		int j = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 4 == 0) {
				temp[j] = arr[i];
				j += 1;
			}
		}
		
		for(int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
	}

}
