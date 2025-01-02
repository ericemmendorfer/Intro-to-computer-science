import java.util.Scanner;

public class PhoneBook{
	public static void main(String[] args){

		  Scanner sc=new Scanner(System.in);

		  //first object uses all variables

		  System.out.println("Enter details for First Object");
		  System.out.println("Enter first objects id:");
		  int id=sc.nextInt();
		  System.out.println("Enter first objects First Name:");
		  String firstName=sc.nextString();
		  System.out.println("Enter first objects Last Name:");
		  String lastName=sc.nextString();
		  System.out.println("Enter first objects email:");
		  String email=sc.nextString();
		  System.out.println("Enter first objects zipcode:");
		  String zipcode=sc.nextString();
		  System.out.println("Enter first objects phone number:");
		  String phoneNumber=sc.nextString();


		PhoneBookEntry object1= new PhoneBookEntry(id, firstName, lastName, email, zipcode, phoneNumber);

		//second object was a name and number

		System.out.println("Enter Second for First Object");
		  
		  System.out.println("Enter Second objects First Name:");
		   firstName=sc.nextString();
		 
		  System.out.println("Enter Second objects phone number:");
		   phoneNumber=sc.nextString();

		PhoneBookEntry object2= new PhoneBookEntry(firstName, phoneNumber);

		//last object was just a name 
		System.out.println("Enter details for Third Object");
		  
		  System.out.println("Enter Third objects First Name:");
		   firstName=sc.nextString();

		PhoneBookEntry object3= new PhoneBookEntry(firstName);

		//make the changes 
		object1.setPhoneNumber("202555555");
		object1.PrintBookEntry();
		object2.setZipcode(object1.getZipcode);


}

}

  //change home number of John Smith to 202555555
//print attributes of john smith using PrintBookEntry
//assign johns zip to james 