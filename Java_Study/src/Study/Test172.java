/*

	�÷��� �����ӿ�ũ(Collection Framework)

*/

// String[] �� List : Arrays.asList()
// List �� String[] : List.toArray()

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Test172 {

	public static void main(String[] args) {

		// List �ڷᱸ�� mList ����
		List<String> mList = new ArrayList<String>();


		// mList �� ������ ��Ƴ���
		mList.add("1");
		mList.add("2");
		mList.add("3");

		// check~!!!

		// List �� String[] : List.toArray()
		String[] sArrays = mList.toArray(new String[mList.size()]);
								//        ���ڿ��� ó���ҷ���
		
		/*
		// sArrays ��ü ���
		for(int i = 0; i < sArrays.length; i++) {
			System.out.print(sArrays[i] + " ");
			//--==>> 1 2 3
		}
		System.out.println();
		*/

		
		// check~!!!

		// String[] �� List : Arrays.asList()
		List<String> mNewList = Arrays.asList(sArrays);
		// �� [ Arrays.asList() �� ��ȯ �ڷ����� List~!!!
		
		/*
		// mNewList ��ü ���
		for(String s : mNewList)
		{
			System.out.print(s + " ");
		}
		System.out.println();
		//--==>> 1 2 3
		*/
		
	}

}