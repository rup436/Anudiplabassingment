package Javac;

class Animal
{
	String color = "White";
	
}
class Dog extends Animal
{
	String color = "Black";
	public void test()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
	
}

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj = new Dog();
		obj.test();
	}

}
