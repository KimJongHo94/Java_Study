package varEx;

public class VarEx02 {

	public static void main(String[] args) {
		
		// ��) ������ 1000�� �ִ�. 200��¥�� ���� ���� ��, �ܵ� ���
		int ���� = 1000;
		int ���� = 200;
		int �ܵ� = ���� - ����;
		System.out.println("�ܵ� = " + �ܵ� + "��");
		// �ܵ� = 800��
		
		// ����1) ������ 100���̴�. ������? (���� : ���� 10% ����)
		int ���� = 100;
		int �������� = ���� * 12;
		int ���� = �������� / 10;
		int ���Ŀ��� = �������� - ����;
		System.out.println("���� = " + ���Ŀ��� + "��");
		// ���� = 1080��
		
		// ����2) ���������� 30, 50, 4���� �޾Ҵ�. �����?
		int score1 = 30;
		int score2 = 50;
		int score3 = 4;
		int tot = score1 + score2 + score3;
		double avg = tot / 3.0;
		System.out.println("��� = " + avg + "��");
		// ��� = 28.0��
		
		// ����4) 100�ʸ� 1�� 40�ʷ� ���
		int min = 100 / 60;
		int sec = 100 % 60;
		System.out.println(min + "��" + " " + sec + "��");
		// 1�� 40��
		
		// ����5) 800������ 500��¥�� ����, 100��¥�� ����
		// ����5) 500��(1��), 100��(3��)
		int five = 800 / 500;
		int one = (800 % 500) / 100;
		System.out.printf("500��(%d��), 100��(%d��)\n", five, one);
		// 500��(1��), 100��(3��)

	}

}
