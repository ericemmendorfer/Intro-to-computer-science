//user must match password

import java.util.Scanner;

public class Exercise1{
	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);
		String pass="";


		System.out.println("Enter Password:");
		pass= sc.nextLine();


	if (pass!=("NYU42day")) {
		
			System.out.println("Invalid Password");

			System.out.println("Enter Password:");

			pass= sc.nextLine();
		}

		else 
			
			System.out.println("Valid Password");


	sc.close();
	}
}