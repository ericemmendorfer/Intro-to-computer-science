//enter desired grade
//enter minimum average required
//enter current average
//Enter weight of test
//you need to get a score of '' on the final to get a ''
import java.util.Scanner;

public class Exercise4{
		public static void main(String[] args){


		Scanner input= new Scanner(System.in);

		System.out.print("Enter desired grade:");
		String grade=input.nextLine();

		System.out.print("Enter minimum average required:");
		Double need = input.nextDouble();

		System.out.print("Enter current average:");
		Double average = input.nextDouble();

		System.out.print("Enter percent weight of the test:");
		Double weight= input.nextDouble();

		Double needed=(need - (average * (1 - (weight / 100))));



	System.out.println( "To get a " + grade + " you must get a " + needed + " on the final.");
}
}