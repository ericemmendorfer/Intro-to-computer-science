
//a generates (a-z) A generates (A-Z)
//anything else invalid try again

import java.util.Scanner;

import java.util.Random;


public class Exercise3{
	public static void main(String[] args){

		System.out.println("Enter letter 'a' to generate random char (a-z), or letter 'A' to generate random char (A-Z)");

	String letter =("");

	Scanner sc= new Scanner(System.in);
	letter= sc.nextLine();

	Random ran= new Random();


	if (letter == ("a")){
		int output= (ran.nextInt(26) +95);
		char result= (char)output;
		System.out.println(result);

	}

	else if (letter ==("A")){
		int output= (ran.nextInt(26) +65);
		char result= (char)output;
		System.out.println(result);

	}else{
		System.out.println("Invalid entry please try again:");
		letter= sc.nextLine();

	}


	sc.close();

	}
}