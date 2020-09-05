package printEx;

/*
 * # ��¹��� ����
 * 1. System.out.println();
 * 1) ln = new line;
 * 2) �ٹٲ� ���
 * 
 * 2. System.out.print();
 * 1) �ٹٲ� �Ұ�
 * 
 * 3. System.out.printf();
 * 1) ���Ĺ��� ���
 * 2) ����
 * 		%d : ����
 * 		%f : �Ҽ�(�Ǽ�)
 * 		%c : ���� 1��
 * 		%s : ���� ������
 */

public class PrintEx03 {

	public static void main(String[] args) {
		
		System.out.println("�ȳ��ϼ���.");
		
		System.out.print("�ȳ�");
		System.out.println("�ϼ���.");
		
		/*
		 * �̽������� ����(escape sequence)
		 * 1) \n : �ٹٲ�
		 * 2) \t : tab
		 * 3) \" : "
		 * 4) \' : '
		 */
		
		System.out.println("�ȳ�\n�ϼ���.");
		System.out.println("�ȳ�\t�ϼ���.");
		System.out.println("\"�ȳ��ϼ���.\"");
		System.out.println("\'�ȳ��ϼ���.\'");
	
	}

}