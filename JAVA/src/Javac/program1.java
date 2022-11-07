package Javac;

public class program1 {

	public static void main(String[] args)
	{
		Car obj1 = new Car("BMW",300,"Black");
		obj1.display
		();
		
	}

}

class Car
{
	String brand;
	int speed;
	String colour;
	
	Car(String b, int s,String c)
	{
		brand = b;
		speed = s;
		colour = c;
	}
	public void display()
	{
		System.out.println(brand+" "+speed+" "+colour);
	}
}
