/*

	��ü ����ȭ(Object Serialization)

*/

/*

�� ��ü ����ȭ(Object Serialization)

  �޸𸮿� ������ Ŭ���� ��ü�� ��� ������ ���� ���¸�
  �״�� �����ؼ� ���Ͽ� �����ϰų�
  ��Ʈ��ũ�� ���� ������ �� �ִ� �������
  ��� ������ ���� �����Ѵٰų�
  �ٸ� ��Ʈ��ũ�� �ִ� ȣ��Ʈ�� ���� ���� ��� ����ϰ� �ȴ�.

  ��, ��ü ����ȭ�� ���빰�� ����Ʈ ������ ��ȯ�Ͽ�
  ���� �Ǵ� ��Ʈ��ũ�� ���� �ۼ���(��Ʈ��)�� �����ϰ�
  ������ִ� ������ �� ��, ��ü�� ��� ������ �޸𸮸�����
  ������ ���� ���Ѵ�.

  ����, �޼ҵ�� �����ڴ� ��ü ����ȭ�� ��󿡼� ���ܵȴ�.


�� ��ü ����ȭ�� ����

  ��ü ��ü�� ������ ����� ���Ŀ� ���ֹ��� �ʰ�
  ��ü�� ���Ͽ� ���������ν� ���Ӽ��� ������ �� ������
  ��ü ��ü�� ��Ʈ��ũ�� ���� �ս��� ��ȯ�� �� �ְ� �ȴ�.

  ��ü ����ȭ�� �ڹ� 1.1 ���Ŀ� ���ԵǾ��µ�
  �� ������ RMI �� Bean �����̾���.
  RMI �� ���� ��ü ����� �����ؾ� �ϱ� ������
  ��ü�� �״�� �̵��� �� �־�� �Ѵ�.
  ���� �̸� �����ϱ� ���ؼ��� ��ü ����ȭ�� �ʼ����̾���.

  ����, Bean �� ���� �� ���¿� ���� ������ ������ ��
  �� ��ü ����ȭ�� ����ϸ� ���ϰ� ��ü ���¸� ������ �� �ִ�.

  �� RMI(Remot Method Invocation)
     ���� �ٸ� ���� �����ġ�� �����ϴ� �Լ���
	 ȣ���ϰ� �����ϴ� ����� ����Ѵ�.
	 ���� �ٸ� ��� ������ ��ġ�� ������ ���� ��ü�� ����
	 ��� ������ �����ϴ� �������� �����ϸ� ���ڴ�.

  �� Bean(��)
     C/S ������ �𵨿��� ������ ������ �ش��ϸ�,
	 ���� ������ ����Ʈ���� ��ü�� ���� �� �ְ� �ϴ� ������Ʈ ���.
	 �ۼ��� ��ü�� ������ �����ϸ� ������Ʈ�� ���� ���Խ�ų �� �ֵ��� �Ѵ�.
	 Ŭ���̾�Ʈ���� ���̶�� ���α׷� ������Ʈ�� �й��ϴ� ������� ó��.


�� Serializable �������̽�

  ��ü ����ȭ�� �ϱ� ���� ���� ��ü ����ȭ�� �����ϵ���
  java.io.Serializable �������̽��� ������ �־�� �Ѵ�.
  �� �������̽��� ��ü ����ȭ�� �����Ǿ�� �Ѵٴ� �����
  JVM ���� �˷��ִ� ������ �����Ѵ�.
  ����, �������̽��� �޸� �����ؾ� �� �޼ҵ尡 ���� ������
  ���� ���� ���ָ� �ȴ�.

  ����)
  ��
  public class Ŭ������ implements Serializable
  {
	// ...
  }

  ��
  Serializable �������̽��� ������ ��
  ObjectInputStream Ŭ������ ObjectOutputStream Ŭ������ �̿��Ͽ�
  ��ü ������ ������� �����ϰ� �ȴ�.

  �� ��� ������ static ���� ����� ���(��, Ŭ���� ������ ���)
     ��ü ����ȭ�� ��󿡼� ���ܵȴ�.


�� Object Stream

  java.io.ObjectInputStream
  ObjectInputStream Ŭ������ ObjectOutputStream Ŭ������ ����
  ���Ͽ� ����Ǿ� �ִ� ��ü�� ��Ʈ��ũ�� ���� ���޵� ��ü��
  ����ȭ�� �����ϴ� ����� �����Ѵ�.
  ��, java.io.Serializable �������̽���
  java.io.Enternalizable �������̽��� �������ִ� ��ü�� ���ؼ���
  ����� �����ϴ�.
  ��, Serializable �������̽��� Enternalizable �������̽���
  ������ ��ü������ ����� �����ϴٴ� ���̴�.
  �� �� readObject() �޼ҵ带 �̿��Ͽ�
  ��Ʈ�����κ��� ����ȭ�� ��ü�� ���� �� ������

  �̷��� ���� ��ü�� �迭, ���ڿ� �Ǵ� �� ��ü ��
  ������ Ÿ��(Type, ��)���� ĳ���� �� �־�� �Ѵ�.

*/

import java.io.File;
import java.util.Hashtable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;

public class Test182 {

	public static void main(String[] args) throws Exception {
	
		String appDir = System.getProperty("user.dir");

		// Ȯ��(�׽�Ʈ)
		// System.out.println(appDir);
		//--==>> C:\Users\pc\Desktop\Study

		// ���� ��ü ����
		File f0 = new File(appDir, "\\data\\test.ser");
		//-- appDir �� C:\Users\pc\Desktop\Study
		//-- appDir ��ġ�� �߽����� "\\data\\test.ser"��
		//   �����ϰڴٴ� �ǹ�
		//-- ��������� [ C:\Users\pc\Desktop\Study\data\test.ser ] ����.

		
		// Ȯ��(�׽�Ʈ)
		// System.out.println(f0.getParentFile().exists());
		//--==>> true

		// ���͸� ������ �Ǿ����� ���� ��Ȳ�̶��...
		// �� ���͸��� �����ϰڴ�.(����ڴ�.)
		if(! f0.getParentFile().exists())
		{
			// �� ���͸��� �����ϰڴ�.(����ڴ�.)
			f0.getParentFile().mkdirs();
		}

		// Hashtable �ڷᱸ�� �ν��Ͻ� ����
		Hashtable<String, String> h1 = new Hashtable<String, String>();

		// ������ h1 �̶�� Hashtable �ڷᱸ���� ��� �߰�
		h1.put("4", "������");
		h1.put("2", "���ر�");
		h1.put("5", "�����");
		h1.put("3", "������");
		h1.put("1", "������");

		// Ȯ��(�׽�Ʈ)
		// System.out.println(h1.get("1"));
		//--==>> ������

		// ���� ���� ��� ��Ʈ�� ����(�������� ����)
		FileOutputStream fos = new FileOutputStream(f0);
		//-- ���� ���� ��� ��Ʈ��(���ٱ�)��
		//   f0 ��� ���� ��ü�� ���ڴ�...
		//����) InputStreamReader isr = new InputStreamReader(System.in);
		
		// ��ü ���� ��� ��Ʈ�� ����
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//-- ��ü ���� ��� ��Ʈ��(���ٱ�)����
		//   fos ��� ���� ���� ��� ��Ʈ���� ���ΰڴ�.
		//����) BufferedReader br = new BufferedReader(isr);

		// ���� 147 ���� + 153 ���� ������ ������ ����
		// ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream());

		// �� ����� ���� ����(�� ���������� ������ ����)
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �� ObjectOutputStream Ŭ������
		//    ��ü���� ����ϴ� ����� �����ϴ� Ŭ������
		//    ��� ��Ʈ���� ����ϱ� ����
		//    ���������� ��ü ����ȭ�� �����ϰ� �ȴ�.
		//    �ڹ� �⺻�� ������ �Ǵ� ��ü����
		//    ���Ͽ� �����ϰų� ��Ʈ��ũ�� ���� �����ϱ� ����
		//    ������ ��ü�� ����ȭ�ϴ� ����� �����ϴ� ���̴�.

		oos.writeObject(h1);
		//-- ������ ��Ʈ���� ������ ��ü(h1)�� ���

		oos.close();
        //-- ObjectOutputStream ���ҽ� �ݳ�
		fos.close();
		//-- FileOutputStream ���ҽ� �ݳ�

		// �������� ��~!!!

		//----------------------------------------------------------------------------- ����ȭ

		// �о���̱� ����~!!!

		if(f0.exists()) //-- f0 ���� ��ü�� �����Ѵٸ�...
		{
			FileInputStream fis = new FileInputStream(f0);
			ObjectInputStream ois = new ObjectInputStream(fis);

			// ois(ObjectInputStream) �� ���� �о���� ��ü(Object)
			// �� ĳ����(Hashtable) �Ͽ�
			// h2 ��� �ڷᱸ�� Hashtable �� ��Ƴ���
			// Object obj = ois.readObject();
			Hashtable h2 = (Hashtable)ois.readObject();
			// Hashtable�� Iterator ��� �� ��

			ois.close();
			//-- ois ���ҽ� �ݳ� �� ObjectInputStream ���ҽ� �ݳ�

			fis.close();
			//-- fis ���ҽ� �ݳ� �� FileInputStream ���ҽ� �ݳ�

			// ----------------------------------------- ������� �����ϸ� �о���̴� �۾� ��~!!!

			// �о���� h2 ��ü�� ���� Ȯ��
			String key;
			String value;

			// �� Iterator ����� �� ����

			Enumeration e = h2.keys();

			while(e.hasMoreElements())
			{
				key = (String)e.nextElement();
				//-- key ���� �о���̴� ����

				// Ȯ��(�׽�Ʈ)
				// System.out.print(key + " ");
				//--==>> 5 4 3 2 1

				value = (String)h2.get(key);
				//-- key�� Ȱ���Ͽ� value �� ��� ���� �� get()

				System.out.println(key + " �� " + value);

			}

		}

	}

}