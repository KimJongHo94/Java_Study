package Study;

/*
�ܡܡ� �ڹ� �⺻ ���α׷��� �ܡܡ�

- ����
  �ﰢ���� �غ��� ���̿� ���̸� ����ڷκ��� �Է¹޾�
  �� �ﰢ���� ���̸� ���ϴ� ���α׷��� �����Ѵ�.
*/

//���� ��)
//- �ﰢ���� ���� ���ϱ� -
//�ﰢ���� �غ� �Է� : 3
//�ﰢ���� ���� �Է� : 5

//>> �غ��� 3, ���̰� 5�� �ﰢ���� ���̴� : OO 
//����Ϸ��� �ƹ� Ű�� ��������...

//�ﰢ���� ���� : �غ� * ���� / 2
//����ڷκ��� �����͸� �Է¹޾� ó�� -> BufferedReader Ȱ��

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test011 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// ���� ����
		int weight, height;
		double area;
		
		// ���� �� ó��
		System.out.print("�ﰢ���� �غ� �Է� : ");
		weight = Integer.parseInt(br.readLine());
		
		System.out.print("�ﰢ���� ���� �Է� : ");
		height = Integer.parseInt(br.readLine());
		
		area = (weight * height) / 2.0;
		
		// ������ => ������ ������ -> ���� ��� ���� -> �� ���ϴ� ����
		// ������ => ������ �Ǽ��� -> �Ǽ� ��� ���� -> ������ ���� ����
		
		
		// �Ǽ� �ڷ����� ��������� ������ ��������
		// �Ǽ� ����� ������ �ʿ��� ��Ȳ�̴�.
		// ������ [ 2 ] �� �ƴ� �Ǽ��� [ 2.0 ] ���� ������ ������ �����ϰ� �Ǹ�
		// �� ������ �Ǽ� ������� ó���ȴ�.
		
		// ��� ���
		// System.out.println("�ﰢ���� ���� : " + area);
		
		// System.out.println();		// ����
		// System.out.println();
		// System.out.print();			// ���� �߻�
		
		System.out.printf(">> �غ��� %d, ���̰� %d�� �ﰢ���� ���̴� : %.2f\n", weight, height, area);

		// %.2f -> �ݿø� �߻�
		
	}

}
