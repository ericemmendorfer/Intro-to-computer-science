
//Write a Java program to declare two integer variables, one float variable, 
//and one string variable and assign 20, 3, 14.6, and "Hello 101 " to them respectively. 
//Then display their values on the screen.
import java.util.Scanner;
public class Exercise2{
	public static void main(String[] args){
	Scanner values= new Scanner(System.in);

	System.out.print ( "Please enter two integers, and one float all seperated by a space.");
	int a= values.nextInt();
	int b= values.nextInt();
	float c = values.nextFloat();
	String d = values.nextLine();

	 

	System.out.println ("Integers inlcude " + a + ", " +b);
	System.out.println("Float is  " + c);
	System.out.println ("The string is  " + d);

	values.close();
}	
}