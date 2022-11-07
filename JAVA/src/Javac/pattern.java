package Javac;
import java.util.*;
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int row,r,c,d;
		    Scanner s = new Scanner(System.in);
		    System.out.println("Enter rows : ");
		    row = s.nextInt();
		    for (r = 0; r < row ; r++) 
		    {
		        // this line prints first column stars
		        System.out.print("* ");
		        for (c = 0; c <= row; c++)
		        { 
		            if (r == row - 1)
		                System.out.print("* ");
		            else
		                System.out.print(" ");
		        }
		        System.out.print ("\n");
		    }
	}

}
