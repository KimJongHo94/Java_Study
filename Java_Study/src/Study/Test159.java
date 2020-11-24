
/*
○ 스택(Stack)

 

   Stack 클래스는 오브젝트 후입산출(LIFO) 구조의 Stack 을 나타낸다.

   이는 벡터(Vector)을 스택으로 처리하는 5개의 메소드로

   벡터(Vector) 클래스를 확장하게 된다.

 

   통상의 push() 메소드와 pop() 메소드가 제공되는 것 외에

   스택의 선두 항목으로 peek() 을 실시하는 메소드,

   스택이 비어있는지의 여부를 확인하는 메소드 inEmpty(),

   스택으로 항목을 찾아서 선두로부터 몇 번째인지를 찾아내는 메소드 등이 제공된다.

 

   스택이 처음으로 작성되었을 때, 항목은 존재하지 않는다.

 

   - boolean empty()

     스택이 비어있는지 확인한다.

 

   - E Object peek()

     스택의 맨 위의 객체를 스택에서 제거하지 않고 반환한다.

 

   - E Object pop()

     스택의 맨 위의 객체를 반환하고 스택에서 제거한다.

 

   - E Object push(E item)

     객체를 스택 자료구조에 저장한다.

 

   - int search(Object o)

     스택의 맨 위에서부터 파라미터 값으로 넘겨받은 객체까지의 거리를 반환한다.

	 맨 위의 객체의 경우 1을 반환하고 그 아래는 2를 반환하는 형식.


제네릭, 제네릭 표현식
<E> <K, V>
데이터의 안정성 확보

*/

import java.util.Stack;

public class Test159 {
	public static void main(String[] args) {

		// Stack 자료구조 생성
		Stack myStack = new Stack();

		String str1 = "가";
		String str2 = "나";
		String str3 = "다";
		String str4 = "라";

		// myStack 이라는 Stack 자료구조 안에 str1 ~ str4 까지 담아내기
		// add(), push() 사용하는 메소드
		myStack.add(str1);		// 적재
		myStack.add(str2);
		myStack.push(str3);
		myStack.push(str4);
		

		// peek() : 스택 맨 위의 객체 반환, 제거는 하지 않는다.
		String val1 = (String)myStack.peek();	// 형변환 check~!!!
		System.out.println("val1 : " + val1);
		
		String val2 = (String)myStack.peek();
		System.out.println("val2 : " + val2);

		String val3 = (String)myStack.peek();
		System.out.println("val3 : " + val3);

		System.out.println();

		String value = "";

		while(!myStack.isEmpty())
		{
			value = (String)myStack.pop();
			System.out.println("value : " + value);
		}


		// myStack 이라는 이름을 가진 Stack 자료구조에
		// 데이터가 비어있지 않은 상태라면...
		// (즉, 채워져 있는 상태라면...)
		// [ isEmpty() ]			// 가 나 다 라
		//							// 가 나 다
									// 가 나
									// 가
									// 
		while(!myStack.isEmpty())	// true → true → true → true → false
		{
			value = (String)myStack.pop();
			System.out.println("value : " + value);
		}

		

	}
}