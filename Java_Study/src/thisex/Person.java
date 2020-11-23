package thisex;

public class Person {

	String name;
	int age;
	
	public Person() {
		// this.name = "이름없음";
		// age = 100;  // Constructor call must be the first statement in a constructor
		this("이름 없음", 1);
	}
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void showInfo()
	{
		System.out.println(name + ", " + age);
	}
	
	public Person getSelf()
	{
		return this;
	}
	
}
