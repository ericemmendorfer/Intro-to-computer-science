
//sum of x and y
//subtraction of x and y
//division of x and y
//multiplication of x and y
//remainder of x and y
import java.util.Scanner;

public class Exercise5{
	public static void main(String[] args){
			Scanner input= new Scanner(System.in);


		System.out.print("Enter two values for x and y seperated by a space.");

		 double x= input.nextDouble();
		 double y= input.nextDouble();

System.out.println("The sum of x and y is " + (x+y));
System.out.println("The difference between x and y is " + (x-y));
System.out.println("The dividened of x and y is " + (x/y));
System.out.println("The product of x and y is " + (x*y));
System.out.println("The remainder when x is divided by y is " + (x%y));
}
}