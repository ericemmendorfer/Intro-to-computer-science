import java.util.Scanner;

public class VotingValidator{
 public static void main(String[] args){

		System.out.println("Please enter birthday in the format of MM/DD/YYYY");

		Scanner sc= new Scanner (System.in);
		int month= sc.nextInt();
		int day =sc.nextInt();
		int year =sc.nextInt();
	

	
		if (ValidateAge(month,day,year)==true){
			System.out.println("Old enough to vote.");
		}
	}
	


public static boolean ValidateAge(int month, int day, int year){
	try{
		if (year< 2001){
	return true;
	}
	else if (year==2001){
		if (month<11){
		return true;
		}
		else if (month==11){
		if (day< 4){
		return true;
		}
		}
	
	
		else {
			throw new  InvalidAgeException ("Too young to vote");
			}
		}
	}


catch (InvalidAgeException e){
		System.out.println( "Not old enough");
	}

return false;

}
}
//- Ask the user to enter their DoB in the format MM/DD/YYYY or ask the user to enter
//Day of birth, month of birth and year of birth separatly.
//- The class has a method named ValidateAge which accepts the user input and throws a
//custom exception named InvalidAgeException.
//Election day (November 3rd , 2022) or not.


//try catch in main method
//use date and calendar in age validation