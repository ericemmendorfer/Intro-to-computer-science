//calculate letter grade based off of first lecture

import java.util.Scanner;

public class Exercise4{
	public static void main(String[] args){

	Scanner sc= new Scanner(System.in);

	int grade=(0);

	System.out.println("Enter numeric grade value:");

	grade= sc.nextInt();
	String letterGrade=("");

	if (grade>89) {
		letterGrade=("A");
		
	}

	else if (grade>79) {

		letterGrade=("B");
	}
	else if (grade>69) {
		letterGrade=("C");
	}
	else if (grade>59) {
		letterGrade=("D");
	}
	else{
		letterGrade=("F");
	}

	System.out.println("You entered: " + grade+ "Your letter grade is " + letterGrade);

	sc.close();

	}
}