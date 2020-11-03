package classpart;

public class FunctionTest {
	
	public static int addNum(int num1, int num2)
	{
		int result;
		result = num1 + num2;
		return result;
	}
	
	public static int subNum(int num1, int num2)
	{
		int sub_result;
		sub_result = num1 - num2;
		return sub_result;
	}
	
	public static int multiNum(int num1, int num2)
	{
		int multi_result;
		multi_result = num1 * num2;
		return multi_result;
	}
	
	public static double divNum(int num1, int num2)
	{
		int div_result;
		div_result = num1 / num2;
		return div_result;
	}
	
	public static void sayHello(String greeting)
	{
		System.out.println(greeting);
	}
	
	public static int calcSum()
	{
		
		int sum = 0;
		int i;
		
		for(i = 0; i <= 100; i++)
		{
			sum += i;
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		
		int sum = addNum(n1, n2);
		// 반환 값이 없으면 받을 수 없다.
		
		int sub = subNum(n1, n2);
		int multi = multiNum(n1, n2);
		double div = divNum(n1, n2);
		
		// int num = sayHello("안녕하세요.");
		// Type mismatch: cannot convert from void to int
		// 반환값이 없다.
		
		int num = calcSum();
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(multi);
		System.out.println(div);
		System.out.println(num);
	}
}
