package arrayEx;

public class Test09 {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		int temp4[] = new int[5];
		
		// ����1) arr�� ���� temp4�� �Ųٷ� ������ ���
		// ��) temp4 ==> {50, 40, 30, 20, 10};
		// ��Ʈ : �Ʒ�
		int i = 0;
		int back = 4;
		temp4[i] = arr[back];
		
		for(i = 0; i < arr.length; i++) {
			temp4[i] = arr[back - i];
			System.out.print(temp4[i] + " ");
		}
		System.out.println();

	}

}
