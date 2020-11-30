/*

	�÷��� �����ӿ�ũ(Collection Framework)

*/

/*

�� Vector(����)

  �ڹ��� �ڷᱸ�� ����� �����ϴ� Ŭ������ �� ���� �⺻���� Ŭ������
  �迭�� ���������, �迭�� �޸� �ٸ� ������ ������ ���� ����
  ������ ��Ҹ� ���� �� ������, �����Ͱ� �������� �ڵ����� ���� ������
  Ȯ���Ű�� �ȴ�.

  ����, ��ü ���۷����� �����ϱ� ������
  JDK 1.5 �������� �ڹ� �⺻�� �����͸� ������ �� ��������
  JDK 1.5 ���ĺ��ʹ� ����ڽ� / �����ڽ� ����� �����Ǹ鼭
  �⺻ ���������� ������ �����ϴ�.

  ���� Ŭ������ �⺻ ������
  ������(Sequence) ������ ������ ����ϸ�
  ������ ������ ������ �������� �ε��� ���� ���� ��ġ�� �����ϰ� �ȴ�.
  ����, �ڷᱸ���� �� ���ܿ����� ������ ������ ť��
  �� �� �������� ������ ������ ���ð� �޸�
  ������ ������ �ε��� ���� �̿��Ͽ� �ڷ� ������ ������ ��������
  ���� �� ������ �����ϴ�.

  ������ ������ ������
  List �������̽��� ���� �����ް� �ֱ� ������
  List �������̽��� ��� �޼ҵ带 ����� �� �ִ�.

  - void add(int index, E element)
  - void insertElementAt(E obj, int index)
    �־��� ��ġ�� ��ü�� �����Ѵ�.
	�־��� ��ġ�� ��ü���� ���������� �ϳ��� �̵��Ѵ�.
  
  - void removeElementAt(int index)
  - E remove(int index)
    �־��� ��ġ�� ��ü�� �����Ѵ�.
	���� �� �־��� ��ġ ������ ��ü���� �ϳ��� �������� �̵��Ѵ�.
	E remove(int index) �޼ҵ�� ����Ǿ��� ��ü�� ��ȯ�Ѵ�.

  - boolean removeElement(Object obj)
  - boolean remove(Object obj)
    ��� ��ü�� �����Ѵ�.
	���� �� �־��� ��ġ ������ ��ü���� �ϳ��� �������� �̵��Ѵ�.
	��ü�� ���������� ���ŵǾ����� true �� ��ȯ�Ѵ�.

  - void removeAllElement()
  - void clear()
    ������ ��� ��Ҹ� �����Ѵ�.

  - void setElementAt(E obj, int index)
  - E set(int index, E element)
    ������ index ��ġ�� �־��� ��ü�� �����Ѵ�.
	�־��� ��ġ�� ����Ǿ� �ִ� ��ü�� �Ҹ�ȴ�. (�� ������� ����)

  - E elementAt(int index)
  - E get(int index)
    �־��� ��ġ�� ����� ��ü�� ��ȯ�Ѵ�.

  - Enumeration<E> elements()
    ������ ��� ��Ҹ� ��ȯ�Ѵ�.

  - int indexOf(Object o)
    �־��� ��ü�� ����� ��ġ�� ��ȯ�Ѵ�.
	�������� ���� ��� [ ���� ] �� ��ȯ�Ѵ�.

  - int indexOf(object o, int index)
    �־��� ��ü�� ����� ��ġ�� index ��ġ���� ã�Ƽ� ��ȯ�Ѵ�.
	index ��ġ�� ��ĵ�� �����ϴ� ��ġ.

  - boolean contains(Object o)
    ���Ͱ� �־��� ��ü�� �����ϰ� �ִ����� ���θ� ��ȯ�Ѵ�.

  - void ensureCapacity(int minCapacity)
    ������ �뷮�� �־��� ũ�⺸�� ũ���� �����Ѵ�.

  - E firstElement()
    ������ ù ��° ����� �����͸� ��ȯ�Ѵ�.

  - E lastElement()
    ������ ������ ����� �����͸� ��ȯ�Ѵ�.

  - void setSize(int newSize)
    ������ ũ�⸦ �����Ѵ�.
	���� �־��� ũ�Ⱑ ���� ũ�⺸�� �۴ٸ� �������� ������.
	�ݴ�� �־��� ũ�Ⱑ ���� ũ�⺸�� ũ�ٸ�
	�� ������ null ��ü�� ä��� �ȴ�.
	(��ü�� �������� ������ �ǹ�)

  - int capacity()
    ���� ������ �뷮�� ��ȯ�Ѵ�.

  - int size()
    ���� ���Ϳ� ����� ��ü�� ����(size)�� ��ȯ�Ѵ�.

  - int trimToSize()
    ������ �뷮�� ����� ��ü�� ������ �µ��� �ּ�ȭ�Ѵ�.

*/

import java.util.Vector;
import java.util.Iterator;

public class Test163 {

	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors
		= {"����", "���", "�ʷ�", "�Ķ�", "����", "����"};

	public static void main(String[] args) {

		int i;
		String str;

		// Vector(����) �ڷᱸ�� v ����
		Vector<Object> v = new Vector<Object>();

		// v ��� ���� �ڷᱸ���� colors �迭�� ����ִ� ������ ��Ƴ���
		// add()
		for(i = 0; i < colors.length; i++) {	// 0 ~ 5
			v.add(colors[i]);
			System.out.print(colors[i] + " ");
		}
		System.out.println();


		// ������(���) �߰�
		v.addElement("�Ͼ�");





		// firstElement()
		str = (String)v.firstElement();
		System.out.println("ù ��° ��� : " + str);
		// --==>> ù ��° ��� : ����

		// get()
		str = (String)v.get(1);
		System.out.println("�� ��° ��� : " + str);
		// --==>> �� ��° ��� : ���

		// get()
		str = (String)v.get(0);
		System.out.println("ù ��° ��� : " + str);
		// --==>> ù ��° ��� : ����

		// elementAt()
		str = (String)v.elementAt(1);
		System.out.println("�� ��° ��� : " + str);
		// --==>> �� ��° ��� : ���

		// lastElement()
		str = (String)v.lastElement();
		System.out.println("������ ��� : " + str);
		// --==>> ������ ��� : ����
		// �Ͼ� ������ �߰��� --==>> �Ͼ�

		// get()
		str = (String)v.get(5);
		System.out.println("������ ��� : " + str);
		// --==>> ������ ��� : ����

		// elementAt()
		str = (String)v.elementAt(5);
		System.out.println("������ ��� : " + str);
		// --==>> ������ ��� : ����

		// �� ���� �ڷᱸ���� ��� �߰� ��(�� add() / addElement())
		//    �ε��� ������(���� ��)�� ��ġ�� �߰��Ǵ� ���� Ȯ���� �� �ִ�.

		// ��ü ��� ���
		// [ Iterator(���ͷ����� or �����ͷ�����) ] �� ���� ��ü ���
		// [ hasNext() ] : ���� ������ ��Ұ� �ִ����� ���� ��ȯ
		// [ next() ]    : ���� ������ ��Ҹ� ���������� ��ȯ

		Iterator<Object> it = v.iterator();		// ��ȯ�ϴ� Ÿ���� Iterator Ÿ��
		
		while(it.hasNext())
		{
			str = (String)it.next();
			System.out.print(str + " ");
			// ���� ��� �ʷ� �Ķ� ���� ���� �Ͼ�

		}
		System.out.println();


	}

}

/*

���� ���

���� ��� �ʷ� �Ķ� ���� ����
ù ��° ��� : ����
�� ��° ��� : ���
ù ��° ��� : ����
�� ��° ��� : ���
������ ��� : �Ͼ�
������ ��� : ����
������ ��� : ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


*/