/*

	�÷��� �����ӿ�ũ(Collection Framework)

*/

// Map �� Hashtable, HashMap
// - java.util.Map �������̽���
//   Ű(key)�� ��(value)�� ����(mapping)�ϸ�
//   ������ Ű�� ����� �� ����, �����ؾ� �ϸ�,
//   �� Ű�� �� ���� ������ �����ؾ� �Ѵ�.
//   ��, �ϳ��� Ű ���� �����ϴ� �ϳ��� ���� ���� �ڷᱸ���̴�.

// Ű�� �ߺ��� �� ����
// ���� �ߺ��� �� �ִ�.

/*

�� Hashtable<K, V> Ŭ����

  - �ؽ����̺� ������ ��ü �𵨸��� Ŭ������
    �˻��� �����ϱ� ������ ��� �󵵰� ���� ���� ���Ѵ�.
  
  - �ؽ����̺��̶� Ű(key)�� �׿� �����ϴ� ������(value)��
    ���е� ������ �����̴�.

  - �����͸� �����ϰ�, �˻��ϱ� ���ؼ� Ű(key)�� �����ϸ�
    �� ���������� Ű ���� �ο��ϸ� �ش� �����Ͱ� ��ȯ�ȴ�.

  - ����, Hashtable Ŭ������ key �Ǵ� value ������ null �� ������� �ʴ´�.

*/

import java.util.Hashtable;

public class Test175 {

	private static final String[] names
			= {"�ڹ���", "������", "������", "������", "��¹�", "������"};

	private static final String[] tels
			= {"010-3308-8316", "010-9060-5327", "010-9458-3671"
		       , "010-3690-7828", "010-3441-0260", "010-9013-7469"};

	public static void main(String[] args) {

		// Hashtable �ڷᱸ�� �ν��Ͻ� ����
		Hashtable<String, String> ht = new Hashtable<String, String>();

		// ht ��� Hashtable �ڷᱸ���� �迭(names, tels)�� ����ִ�
		// �����͸� ��ҷ� ��Ƴ���
		// �� put(k, v);			(Ű ��, value ��)

		for(int i = 0; i < names.length; i++)	// tels.length	 
		{
			ht.put(names[i], tels[i]);
		}

		// ht ��� Hashtable �� ����... key �� �̿��Ͽ� �˻�
		// �� get(k)
		String findName1 = "������";
		String str = ht.get(findName1);

		if(str != null)
		{
			System.out.println(findName1 + " ��ȭ��ȣ : " + str);
		}
		System.out.println();
		//--==>> ������ ��ȭ��ȣ : 010-9458-3671

		// ht ��� Hashtable �ڷᱸ����... key �� �����ϴ����� ���� Ȯ��
		// �� containsKey()
		String findName2 = "��¹�";
		// String findName2 = "��ȫ��";
		if(ht.containsKey(findName2)) {
			System.out.println(findName2 + " �����Ͱ� �����մϴ�.");
		}
		else {
			System.out.println(findName2 + " �����Ͱ� �������� �ʽ��ϴ�.");
		}
		System.out.println();
		//--==>> ��¹� �����Ͱ� �����մϴ�.
		//--==>> ��ȫ�� �����Ͱ� �������� �ʽ��ϴ�.

		String findName3 = "������";
		if(ht.containsKey(findName3)) {
			System.out.println(findName3 + " �����Ͱ� �����մϴ�.");
		}
		else {
			System.out.println(findName3 + " �����Ͱ� �������� �ʽ��ϴ�.");
		}
		System.out.println();
		//--==>> ������ �����Ͱ� �����մϴ�.

		// ht ��� Hashtable �ڷᱸ����... value �� �����ϴ����� ���� Ȯ��
		// �� contains()
		String findTel1 = "010-7383-1339";
		if(ht.contains(findTel1)) {
			System.out.println(findTel1 + " �����Ͱ� �����մϴ�.");
		}
		else {
			System.out.println(findTel1 + " �����Ͱ� �������� �ʽ��ϴ�.");
		}
		System.out.println();
		//--==>> 010-7383-1339 �����Ͱ� �������� �ʽ��ϴ�.


		String findTel2 = "010-9060-5327";
		if(ht.contains(findTel2)) {
			System.out.println(findTel2 + " �����Ͱ� �����մϴ�.");
		}
		else {
			System.out.println(findTel2 + " �����Ͱ� �������� �ʽ��ϴ�.");
		}
		System.out.println();
		//--==>> 010-9060-5327 �����Ͱ� �����մϴ�.

		

		// ht ��� Hashtalbe �ڷᱸ������
		// [ ������ ] ������ ����
		// �� remove()
		ht.remove("������");
		// Ű ���� ������ �ִ� value �� ���� ���� ����
		// [ remove() ] �޼ҵ�� ���ڰ����� key �� �Ѱܹ�����
		// �� ��, key �� �����Ǵ� ���� �ƴϴ�.
		// �ش� key �� ����Ǿ�(���εǾ�) �ִ� value �� �Բ� remove() �ȴ�.

		// ����(remove()) ���� key �� �����ϴ��� Ȯ��
		if(ht.containsKey("������")) {
			System.out.println("�����̰� �����մϴ�.");
		}
		else {
			System.out.println("������ ��𰬾�?!!!");
		}
		System.out.println();
		//--==>> ������ ��𰬾�?!!!

		// ����(remove()) ���� value �� �����ϴ��� Ȯ��
		if(ht.contains("010-3690-7828")) {
			System.out.println("010-3690-7828 �����Ͱ� �����մϴ�.");
		}	
		else {
			System.out.println("010-3690-7828 �����Ͱ� �������� �ʽ��ϴ�.");
		}
		System.out.println();
		//--==>> 010-3690-7828 �����Ͱ� �������� �ʽ��ϴ�.

		// null ���� ó��
		// ht.put(null, null);				//-- key, value ��� null  �� ��Ÿ�� ����
		// ht.put("�̿���", null);			//-- value �� null		  �� ��Ÿ�� ����
		// ht.put(null, "010-3690-7828");  //-- key �� null			  �� ��Ÿ�� ����

		// �ߺ��� key �Է�
		ht.put("��¹�", "010-1234-1234");
		
		System.out.println(ht.get("��¹�"));
		System.out.println();
		//--==>> 010-1234-1234
		//-- ���� "010-3441-0260" ���� "010-1234-1234" �� ����Ǿ����� Ȯ��
		//   (����� ����)

		// �ߺ��� value �Է�
		ht.put("���ر�", "010-9013-7469");

		System.out.println(ht.get("������"));
		System.out.println(ht.get("���ر�"));
		System.out.println();
		//--==>> 010-9013-7469
		//		 010-9013-7469

		// �� value �� �ߺ��� ���� �ԷµǾ
		//    ���� �����Ϳ� �ƹ��� ������ ��ġ�� ����.

	}

}