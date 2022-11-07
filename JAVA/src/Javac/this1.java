
package Javac;
class Student
{
	int rollno;
	String name;
	float fee;
	Student(int rollno, String name, float fee)
	{
		this.rollno = rollno;
		this.name= name;
		this.fee= fee;
		
	}

void Display()
	{
	System.out.println(rollno+" "+name+" "+fee);
	}
}

public class this1 {

	public static void main(String[] args)
	{
		Student s1 = new Student(111,"ankit",5000f);
		Student s2 = new Student(111,"ankit",6000f);
		
		s1.Display();
		s2.Display();

	}

}
