package arrayEx;

public class Test09 {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		int[] temp4 = new int[5];
		
		// ����1) arr�� ���� temp4�� �Ųٷ� ������ ���
		for(int i = 0; i < temp4.length; i++) {
			temp4[i] = arr[4 - i];
			System.out.print(temp4[i] + " ");
		}
	}

}
