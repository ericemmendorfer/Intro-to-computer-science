
// maximum of two given numbers
import java.util.Scanner;
//import the math to do maxes

public class exercise2{
	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		System.out.println("Input 2 numbers seperated by a space:");
		float a = sc.nextFloat();
		float b = sc.nextFloat();

		//figure out what to import here
		float c= Math.max(a,b);

		System.out.println("The maximum of "+a+" and "+b+" is " +c);
		
sc.close();

	}
}