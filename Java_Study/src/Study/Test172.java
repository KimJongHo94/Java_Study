/*

	컬렉션 프레임워크(Collection Framework)

*/

// String[] → List : Arrays.asList()
// List → String[] : List.toArray()

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Test172 {

	public static void main(String[] args) {

		// List 자료구조 mList 생성
		List<String> mList = new ArrayList<String>();


		// mList 에 데이터 담아내기
		mList.add("1");
		mList.add("2");
		mList.add("3");

		// check~!!!

		// List → String[] : List.toArray()
		String[] sArrays = mList.toArray(new String[mList.size()]);
								//        문자열로 처리할려구
		
		/*
		// sArrays 전체 출력
		for(int i = 0; i < sArrays.length; i++) {
			System.out.print(sArrays[i] + " ");
			//--==>> 1 2 3
		}
		System.out.println();
		*/

		
		// check~!!!

		// String[] → List : Arrays.asList()
		List<String> mNewList = Arrays.asList(sArrays);
		// ※ [ Arrays.asList() 의 반환 자료형은 List~!!!
		
		/*
		// mNewList 전체 출력
		for(String s : mNewList)
		{
			System.out.print(s + " ");
		}
		System.out.println();
		//--==>> 1 2 3
		*/
		
	}

}