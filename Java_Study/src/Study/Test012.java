package Study;

/*
�ܡܡ� �ڹ� �⺻ ���α׷��� �ܡܡ�

- ������ �ڷ���
- �ڹ��� �⺻ ����� : BufferedReader Ŭ����
*/

//����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
//�̸��� ������ ����ϴ� ���α׷��� �����Ѵ�.

//���� ��)
//�̸��� �Է��ϼ��� : 
//���� ���� �Է� : 
//���� ���� �Է� :
//���� ���� �Է� :
//
//=== ��� ===
//�̸� : �ƹ���
//���� : 240
//����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test012 {

	public static void main(String[] args) throws IOException {
		
		// InputStreamReader isr = new InputStreamReader(System.in);
		// BufferedReader br = new BufferedReader(isr);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// ���� ����
		String name;
		int kor, eng, math;
		double tot;
		
		// ���� �� ó��
		System.out.print("�̸� �Է� : ");
		name = br.readLine();
		
		System.out.print("���� ���� �Է� : ");
		kor = Integer.parseInt(br.readLine());
		
		System.out.print("���� ���� �Է� : ");
		eng = Integer.parseInt(br.readLine());
		
		System.out.print("���� ���� �Է� : ");
		math = Integer.parseInt(br.readLine());
		
		tot = kor + eng + math;
		
		System.out.println();
		
		// ��� ���
		
		/*
		System.out.println("=== ���  ===");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + tot);
		*/
		
		System.out.println("=== ��� ===");
		System.out.printf("�̸� : %s\n���� : %.2f\n", name, tot);
		
		/*
		// �ֿ� ���� ����(�밡��)
		String strName;           -> �̸� ����
		int nKor, nEng, nMat      -> ����, ����, ���� ���� ����
		int nTot;                 -> ���� ����

		// �߰� ���� ����
		String strTemp;           -> ���ڿ� �����͸� �ӽ÷� ������ ����
		

		// ���� �� ó��
		// 1. ����ڿ��� �ȳ� �޼��� ���(�̸� �Է� �ȳ�)
		System.out.print("�̸� �Է� : ");
		
		// 2. ����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strName = br.readLine();

		// 3. ����ڿ��� �ȳ� �޼��� ��� -> �������� �Է� �ȳ�
		System.out.print("���� ���� �Է� : ");

		// 4. ����ڰ� �Է��� ���� ���� ���·� ��ȯ�� �� nKor ������ ��Ƴ���
		strTemp = br.readLine();
		nKor = Integer.parseInt(strTemp);

		// 5. ����ڿ��� �ȳ� �޼��� ��� -> �������� �Է� �ȳ�
		System.out.print("���� ���� �Է� : ");

		// 6. ����ڰ� �Է��� ���� ���� ���·� ��ȯ�� �� nEng ������ ��Ƴ���
		strTemp = br.readLine();
		nEng = Integer.parseInt(strTemp);

		// 7. ����ڿ��� �ȳ� �޼��� ��� -> �������� �Է� �ȳ�
		System.out.print("���� ���� �Է� : ");

		// 8. ����ڰ� �Է��� ���� ���� ���·� ��ȯ�� �� nMat ������ ��Ƴ���
		strTemp = br.readLine();
		nMat = Integer.parseInt(strTemp);

		// 9. �� ���� ������ ����ִ� ������(�Է� ������)����
		//    �����Ͽ� ���� ������ �����ϴ� ������ ���� ������ �����ϰ�
		//    �� ����� ���� ������ ��Ƴ���
		nTot = nKor + nEng + nMat;



		// ��� ���

		// ���� ���
		// 1. System.out.println();
		// 2. System.out.println("\n===[���]===");

		System.out.println("=== �� �� ===");
		// System.out.println("�̸� : " + strName);
		// System.out.printf("�̸� : %s\n", strName

		// System.out.println("�� �� : " + nTot);
		// System.out.printf("�� �� : %d\n", nTot);
		

	*/

	}

}
