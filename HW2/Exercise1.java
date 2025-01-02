//input x and y non-zeroes (take as doubles)
import java.util.Scanner;

public class Exercise1{
	public static void main(String[] args){
//take x and y values
		Scanner input= new Scanner(System.in);
		double x;
		double y;

		//ask for x and y
		System.out.print("Please enter a non-zero value for X");
		 x= input.nextDouble();

		System.out.print("Please enter a non-zero value for Y");
		 y= input.nextDouble();

		//equation
		//if x!=0 and y!=0;
		//add Character.isDigit()
		double answer = (((3+4*x)/5)-(10*(y-5)/x))+9*(4/x + (9+x)/y);

		//display
		System.out.println( "The solution is" + answer);

		input.close();
	}
}