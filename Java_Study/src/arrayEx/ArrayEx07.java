package arrayEx;

// # �л��������� ���α׷�[4�ܰ�] : 1���л�

public class ArrayEx07 {

	public static void main(String[] args) {
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores = {87, 11, 45, 98, 23};
		
		// ����) 1���л��� �й��� ���� ���
		// ����) 1004��(98��)
		
		int maxNum = 0;
		int maxIdx = 0;
		
		for(int i = 0; i < scores.length; i++) {
			if(maxNum < scores[i]) {
				maxNum = scores[i];
				maxIdx = i;
			}
		}
		
		System.out.println("1���л� �й� : " + hakbuns[maxIdx] + "��" + "(" + maxNum + "��)");

	}

}
