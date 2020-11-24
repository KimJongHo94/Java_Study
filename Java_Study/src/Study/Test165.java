/*

	�÷��� �����ӿ�ũ(Collection Framework)

*/

import java.util.Vector;
import java.util.Collections;

public class Test165 {

	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors
		= {"����", "���", "�ʷ�", "�Ķ�", "����", "����"};

	public static void main(String[] args) {

		// ���� �ڷᱸ�� ����
		Vector<String> v = new Vector<String>();

		// ���� �ڷᱸ�� v �� colors �����͸� ��ҷ� �߰�
		for(String color : colors) {
			v.add(color);
		}
		
		System.out.println("ù ��° ��� : " + v.firstElement());
		System.out.println("�� ��° ��� : " + v.get(1));
		System.out.println("������ ���  : " + v.lastElement());
		System.out.println("����� ����  : " + v.size());
		// ù ��° ��� : ����
		// �� ��° ��� : ���
		// ������ ���  : ����
		// ����� ����  : 6

		// �� ù ��° ��Ҹ� "�Ͼ�"���� ��.��.  �� set()
		v.set(0, "�Ͼ�");

		System.out.println("ù ��° ��� : " + v.firstElement());
		// --==>> ù ��° ��� : �Ͼ�
		System.out.println("�� ��° ��� : " + v.get(1));
		// --==>> �� ��° ��� : ���

		// �� ù ��° ��ҿ� "��Ȳ" ��.��.	�� insertElementAt()


		/*
		//�� add()
		// add() �� �����ٰ� ���� �߰�

		v.add(0, "��Ȳ");

		System.out.println("ù ��° ��� : " + v.firstElement());
		// --==>> ù ��° ��� : ��Ȳ
		System.out.println("������ ���  : " + v.lastElement());
		// --==>> ������ ���  : ����
		System.out.println("����� ����  : " + v.size());
		// --==>> ����� ����  : 7
		*/

		v.insertElementAt("��Ȳ", 0);

		System.out.println("ù ��° ��� : " + v.firstElement());
		// --==>> ù ��° ��� : ��Ȳ
		System.out.println("�� ��° ��� : " + v.get(1));
		// --==>> �� ��° ��� : �Ͼ�
		System.out.println("����� ����  : " + v.size());
		// --==>> ����� ����  : 7
		
		// �� ��ü ���
		System.out.print("��ü ��� : ");
		for(String str : v) {
			System.out.print(str + " ");
			// ��ü ��� : ��Ȳ �Ͼ� ��� �ʷ� �Ķ� ���� ����
		}
		System.out.println();

		// �� �������� ����
		Collections.sort(v);

		// �� ��ü ���
		System.out.print("�������� ���� �� ��ü ��� : ");
		for(String str : v) {
			System.out.print(str + " ");
			// �������� ���� �� ��ü ��� : ��� ���� ���� ��Ȳ �ʷ� �Ķ� �Ͼ�
			// ������ ������ ����
		}
		System.out.println();

		// �� �˻�
		// Collections.binarySearch()
		// �˻� ��� ����.
		// ��, �������� ������ ����Ǿ� �ִ� �ڷῡ ���ؼ��� ����� �����ϴ�. check~!!!
		// �˻� ����� �������� ���� ��� ������ ��ȯ�Ѵ�.

		int idxBlue = Collections.binarySearch(v, "�Ķ�");
		System.out.printf("�Ķ� : %d��° �ε����� ��ġ�ϰ� �ִ�.\n", idxBlue);
		System.out.println();
		// --==>> �Ķ� : 5��° �ε����� ��ġ�ϰ� �ִ�.

		int idxNavi = Collections.binarySearch(v, "����");
		System.out.printf("���� : %d��° �ε����� ��ġ�ϰ� �ִ�.\n", idxNavi);
		// --==>> ���� : -1��° �ε����� ��ġ�ϰ� �ִ�.
		//        �� �˻� ��� ����
		System.out.println();

		// �� �������� ����
		Collections.sort(v, Collections.reverseOrder());

		// �� ��ü ���
		System.out.print("�������� ���� �� ��ü ��� : ");
		for(String str : v) {
			System.out.print(str + " ");
			// �������� ���� �� ��ü ��� : �Ͼ� �Ķ� �ʷ� ��Ȳ ���� ���� ���
		}
		System.out.println();

		// �� �������� ���� �� �˻�
		idxBlue = Collections.binarySearch(v, "�Ķ�");
		System.out.printf("�Ķ� : %d��° �ε����� ��ġ�ϰ� �ִ�.\n", idxBlue);
		// --==>> �Ķ� : -8��° �ε����� ��ġ�ϰ� �ִ�.
		System.out.println();

		idxBlue = Collections.binarySearch(v, "�Ķ�", Collections.reverseOrder());
		System.out.printf("�Ķ� : %d��° �ε����� ��ġ�ϰ� �ִ�.\n", idxBlue);
		// �Ķ� : 1��° �ε����� ��ġ�ϰ� �ִ�.
		// �� ���� ������ ����
		//   �Ͼ� �Ķ� �ʷ� ��Ȳ ���� ���� ���


	}
}