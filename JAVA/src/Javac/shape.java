package Javac;

class circle {
    static final double PI = Math.PI;
 
    void Area(float a)
    {
        float A = a * a;
        System.out.println("Area of the Square: " + A);
    }
 
    void Area(double a)
    {
        double A = PI * a * a;
        System.out.println("Area of the Circle: " + A);
    }

}
public class shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 circle obj = new circle();
	        obj.Area(10.5);
	        obj.Area(3);
	        
	}

}
