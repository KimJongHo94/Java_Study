package classpart;

public class StudentTest {
	public static void main(String[] args) {
		
		// new Ű���带 ����Ͽ� �����ڷ� ����
		Student studentLee = new Student("�̼���");
		
		// Ŭ������ �Ӽ�, �޼��� �����ϱ�
		// ������ ����� ����(��������)�� Ŭ������ �Ӽ�, �޼��� ����
		studentLee.studentName = "�̼���";
		studentLee.address = "����";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(100, "������");
		// studentKim.studentName = "������";
		// studentKim.address = "����";
		
		studentKim.showStudentInfo();
		
		// System.out.println(studentLee);
		// System.out.println(studentKim);
		
	}

}
