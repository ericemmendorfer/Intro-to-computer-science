import java.util.Scanner;

public class PhoneBookEntry{
private int id=0;
private String firstName="";
private String lastName="";
private String email="";
private String zipcode="";
private String phoneNumber="";


	public static void main(String[] args){

		
//create variables

	}
	//one with all variables
	PhoneBookEntry(int id, String firstName, String lastName, String email, String zipcode, String phoneNumber){
		setId(id);
		setEmail(email);
		setFirstName(firstName);
		setLastName(lastName);
		setZipcode(zipcode);
		setPhoneNumber(phoneNumber);
	}
	//one with only first and number
	PhoneBookEntry(String firstName, String phoneNumber){
		setFirstName(firstName);
		setPhoneNumber(phoneNumber);
	}
	PhoneBookEntry(String firstName){
		setFirstName(firstName);
	}


	public static void printPhoneBookEntry(PhoneBookEntry object){
		if (object.id!=0){
			System.out.print(object.id + ", ");
		}
		if (object.firstName!=""){
			System.out.print(object.firstName+", ");
		}
		if (object.lastName!=""){
			System.out.print(object.lastName+", ");
		}
if (object.email!=""){
			System.out.print(object.email+", ");
		}
if (object.zipcode!=""){
			System.out.print(object.zipcode+", ");
		}
		if (object.phoneNumber!=""){
			System.out.print(object.phoneNumber+", ");
		}




	}
	//make all of the setters/getters

	//setters
public int setId(int id) {
    this.id = id;
    return id;
}
public String setFirstName(String firstName) {
    this.firstName = firstName;
    return firstName;
}
public String setLastName(String lastName) {
    this.lastName = lastName;
    return lastName;
}
public String setEmail(String email) {
    this.email = email;
    return email;
}
public String setZipcode(String zipcode) {
    this.zipcode = zipcode;
    return zipcode;
}
public String setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return phoneNumber;
}





	//getters
	public int getId(){
		return id;
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public String getEmail(){
		return email;
	}
	public String getZipcode(){
		return zipcode;
	}
	public String getPhoneNumber(){
		return phoneNumber;
	}
}



//figure out if this should be done as a stack or an array 

//setters and getters all class variables are private
