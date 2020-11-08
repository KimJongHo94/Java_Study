package classpart;

/*
������ (constructor)
  - ��ü�� ������ �� new Ű����� �Բ� ȣ��(��ü ���� �ܿ��� ȣ���� �� ����)
    �ν��Ͻ��� �ʱ�ȭ �ϴ� �ڵ尡 ���� ��(�ַ� ��� ���� �ʱ�ȭ)
    ��ȯ ���� ����, ��ӵ��� ����
    �����ڴ� Ŭ���� �̸��� �����ؾ� �Ѵ�.

�⺻ ������(default constructor)
  - �ϳ��� Ŭ�������� �ݵ�� �ϳ� �̻��� �����ڰ� �����ؾ� ��
    ���α׷��Ӱ� �����ڸ� �������� ������ �����Ϸ��� ������ �ڵ带 �־��ش�.
    => �⺻ ������
    �⺻ �����ڴ� �Ű� ������ ����, �����ΰ� ����.
    ���� Ŭ������ �ٸ� �����ڰ� �ִ� ��� ����Ʈ �����ڴ� �������� ����.
    
������ �����ε�(constructor overloading)
  - �����ڸ� �� �� �̻� �����ϴ� ���
    ����ϴ� �ڵ忡�� ���� ������ �� �����Ͽ� ����� �� ����
    private ������ �����ڸ� �̿��Ͽ� �ʱ�ȭ�� �� �� ����.
*/

public class Student 
{
	public int studentID;
	public String studentName;
	public String address;
	
	// ����Ʈ ������
	// public Student() {}
	
	
	public Student(String name) {
		studentName = name;
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "�ּ� ����";
	}
	
	
	// void ��ȯ �� ����
	public void showStudentInfo()
	{
		System.out.println(studentName + ", " + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
}  
