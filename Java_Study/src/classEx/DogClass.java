package classEx;

public class DogClass {

	public static void main(String[] args) {
		// Ŭ������ ����� ��ü�� ���� �� �ִ�.
		// Dog ��ü ����
		Dog d = new Dog();
		//  ������� ��ü�� ���� d�� ������ = ��ü ����(new Dog())
		
		// Dog ��ü �ʵ� �� ���
		System.out.printf("�̸� : %s\n", d.name);
		System.out.printf("ǰ�� : %s\n", d.breeds);
		System.out.printf("���� : %s\n", d.age);
		// String �⺻�� : null
		// int    �⺻�� : 0
	}

}

class Dog {
	/* �ʵ� ���� */
	String name;	// �̸�
	String breeds;  // ǰ��
	int age;		// ����
	
	/* �޼ҵ� ���� */
	void wag() {	// ����ġ��
		System.out.println("������ ������ ģ��!");
	}
	
	void bark() {	// ���� ¢�� ����!
		System.out.println("�۸�! ���� ¢���ϴ�!");
	}
}

/*
���� ���
�̸� : null
ǰ�� : null
���� : 0
*/
