package opEx;

/*
 * 4. �� ������
 * 
 * 1. ����
 * 1) &&(and) : ���� ��� ���̾��, ��
 * 2) ||(or)  : ��� �����̶� ���̸�, ��
 * 
 * 2. ����
 * 1) �� �����ڸ� ���� �������� �񱳿����ڸ� ������ �� �ִ�.
 * 2) �� �����ڸ� ���� ���� ������ �����ϴ�.
 */

public class OpEx07 {

	public static void main(String[] args) {

		System.out.println(10 == 10 && 3 == 3);
		System.out.println(10 != 10 && 3 == 3);
		System.out.println(10 == 10 && 3 != 3);
		System.out.println(10 != 10 && 3 != 3);
		
		System.out.println();
		
		System.out.println(10 == 10 || 3 == 3);
		System.out.println(10 != 10 || 3 == 3);
		System.out.println(10 == 10 || 3 != 3);
		System.out.println(10 != 10 || 3 != 3);

	}

}
