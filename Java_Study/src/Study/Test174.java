/*

	�÷��� �����ӿ�ũ(Collection Framework)

*/

// Set �� HashSet, TreeSet
// - ���� ����
// - �ߺ��� ������� �ʴ� ����(�⺻)

/*

�� TreeSet<E> Ŭ����

  java.util.TreeSet<E> Ŭ������
  Set �������̽��� ����� SortedSet �������̽��� ������ Ŭ������
  �����͸� �߰��ϸ� �����͵��� �ڵ����� �������� ������ �ȴ�.

*/

// VO	�� Value Object
// DAO  �� Data Asscess Object     ------
//                                     | �츮 �� ���̿��� ���� ����
// DTO  �� Data Transfer Object    ------

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

class GradeDTO		// GradeVO
{

	// �ֿ� �Ӽ� ����
	private String hak;			// �й�
	private String name;		// �̸�
	private int kor, eng, mat;	// ����, ����, ���� ����

	// ������(����� ���� ������ �� 5���� �Ű������� ���� ������)
	GradeDTO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	// ������(����� ���� ������ �� �Ű����� ���� ������)
	// -- �Ű������� �����ϴ� �����ڸ� ����� ���� �����ڷ� �����Ͽ��� ������
	GradeDTO()
	{

	}

	// getter / setter ����
	String getHak()
	{
		return hak;	
	}

	void setHak(String hak)
	{
		this.hak = hak;
	}

	String getName()
	{
		return name;
	}

	void setName(String name)
	{
		this.name = name;
	}
	
	int getKor()
	{
		return kor;
	}

	void setKor(int kor)
	{
		this.kor = kor;
	}

	int getEng()
	{
		return eng;
	}

	void setEng(int eng)
	{
		this.eng = eng;
	}

	int getMat()
	{
		return mat;
	}

	void setMat(int mat)
	{
		this.mat = mat;
	}

	// �߰� �޼ҵ� ����(���� ����)
	int getTot()
	{
		return kor + eng + mat;
	}

}

class MyComparator<T> implements Comparator<T>
{
	@Override
	public int compare(T o1, T o2)
	{
		GradeDTO s1 = (GradeDTO)o1;
		GradeDTO s2 = (GradeDTO)o2;

		// ���� ����(��������)
		// return s1.getTot() - s2.getTot();

		// ���� ����(��������)
		// return s2.getTot() - s1.getTot();

		// �й� ����(��������)
		// return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());
		//                      "2000883"					   "2000824"
		// return 2000883 - 2000824
		// return 59;

		// �й� ����(��������)
		// return Integer.parseInt(s2.getHak()) - Integer.parseInt(s1.getHak());

		// �̸� ����(��������)
		//return ������;
		// return s1.getName().compareTo(s2.getName());

		// �̸� ����(��������)
		return s2.getName().compareTo(s1.getName());
	}
}

public class Test174 {

	public static void main(String[] args) {

		// TreeSet �ڷᱸ�� �ν��Ͻ� ����
		TreeSet<String> set = new TreeSet<String>();

		// TreeSet �ڷᱸ�� set �� ��� �߰�  �� add();
		set.add("���ǽ�");
		set.add("������");
		set.add("��ö�ǿ��ݼ���");
		set.add("�����ǰ���");
		set.add("�͸���Į��");
		set.add("�̿��������");
		set.add("����ť");
		set.add("����������");
		set.add("�Ƶ�����");

		// set ��� ��ü ��� �� Iterator Ȱ��
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		System.out.println();
		//--==>> ��ö�ǿ��ݼ��� �͸���Į�� ������ ���������� �Ƶ����� ���ǽ� �̿�������� �����ǰ��� ����ť
		// �������� ����

		// TreeSet �ڷᱸ�� �ν��Ͻ� ����
		TreeSet<GradeDTO> set2 = new TreeSet<GradeDTO>(new MyComparator<GradeDTO>());

		// GradeDTO dto1 = new GradeDTO("2000883", "�ƹ���", 90, 80, 70);

		// set2.add(dto1);
		set2.add(new GradeDTO("2000883", "�ƹ���", 90, 80, 70));
		set2.add(new GradeDTO("2000824", "������", 91, 81, 71));
		set2.add(new GradeDTO("2000831", "������", 98, 78, 88));
		set2.add(new GradeDTO("2000816", "�ڸ���", 62, 49, 99));
		set2.add(new GradeDTO("2000835", "��¥��", 96, 31, 90));
		// ==> �����̶� ���簡 ���� ��Ȳ

		// Iterator �� Ȱ���� set ��� ��ü ���
		/*
		Iterator<GradeDTO> it2 = set2.iterator();
		while(it2.hasNext())
		{
			System.out.print(it2.next() + " ");
		}
		System.out.println();
		*/

		Iterator<GradeDTO> it2 = set2.iterator();
		while(it2.hasNext())
		{
			GradeDTO dto = it2.next();
			System.out.printf("%7s %7s %4d %4d %4d %6d\n", dto.getHak(), dto.getName(), dto.getKor(), dto.getEng(), dto.getMat(), dto.getTot());
		}
		System.out.println();
		/*

			// ��������
			2000816     �ڸ���   62   49   99    210
			2000835     ��¥��   96   31   90    217
			2000883     �ƹ���   90   80   70    240
			2000824     ������   91   81   71    243
			2000831     ������   98   78   88    264

			// ��������
			2000831     ������   98   78   88    264
			2000824     ������   91   81   71    243
			2000883     �ƹ���   90   80   70    240
			2000835     ��¥��   96   31   90    217
			2000816     �ڸ���   62   49   99    210

			// �й� ����(��������)
			2000816     �ڸ���   62   49   99    210
			2000824     ������   91   81   71    243
			2000831     ������   98   78   88    264
			2000835     ��¥��   96   31   90    217
			2000883     �ƹ���   90   80   70    240

			// �й� ����(��������)
			2000883     �ƹ���   90   80   70    240
			2000835     ��¥��   96   31   90    217
			2000831     ������   98   78   88    264
			2000824     ������   91   81   71    243
			2000816     �ڸ���   62   49   99    210

			// �̸� ����(��������)
			2000824     ������   91   81   71    243
			2000831     ������   98   78   88    264
			2000835     ��¥��   96   31   90    217
			2000883     �ƹ���   90   80   70    240
			2000816     �ڸ���   62   49   99    210

			// �̸� ����(��������)
			2000816     �ڸ���   62   49   99    210
			2000883     �ƹ���   90   80   70    240
			2000835     ��¥��   96   31   90    217
			2000831     ������   98   78   88    264
			2000824     ������   91   81   71    243

		*/

	}

}