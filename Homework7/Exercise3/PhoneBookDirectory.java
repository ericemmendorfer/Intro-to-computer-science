import java.util.Scanner;
import java.util.Arrays;

public class PhoneBookDirectory{
	public class PhoneBookEntry{
private int id=0;
private String firstName="";
private String lastName="";
private String email="";
private String zipcode="";
private String phoneNumber="";


	public static void main(String[] args){

		//2d array by element 6x6
		 phoneBook= new String  [6];
		 int i=0;
		}

 public int addEntry(PhoneBookEntry entry) {
 	if (i==6)
		return 0;
	else if( i<6){

        phoneBook[i] = entry;

        i++;
    }
    
        // returning array of elements
        return 1;


    }
      public void printAllEntries() {

        for (int j = 0; j < i; j++) {

            phoneBook[j].printBookEntry();

        }

    }
    public int LinearSearchByPhoneNumber(String phoneNumber) {
    	//if empty can not have any numbers

        if (i == 0){
            return 0;
        }
        //cycle through all of them and return if found

        else if (i>0){
        	for (int j = 0; j < i; j++) {

            if (phoneBook[j].getPhoneNumber() == phoneNumber) {

                return 1;
//if not found still have to return 0

            }
                    return 0;


        }


    }
}
public PhoneBookEntry SearchByIdBinarySearch(int id){
for (int j=0; j<6; j++){
	for (int k =j+1; k<6; k++){
		if (phoneBook[j]<phoneBook[k]){
			int hold=phoneBook[k];
			phoneBook[k]=phoneBook[j];
			phoneBook[j]=hold;
		}
	}
}
return java.util.Arrays.binarySearch(phoneBook, id);






}
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


public int Edit(String firstName, String lastName){

        if (i == 0){
            return 0;
        }
        //cycle through all of them and return if found

        else if (i>0){
        	for (int j = 0; j < i; j++) {
Scanner sc= new Scanner(System.in);
            if (phoneBook[j].getfirstName() == firstName && phoneBook[j].getlastName() == lastName) {
            	System.out.println("Enter the data field you would like to change");
            	String change =sc.nextString();
            	if (change=="id"){
            		   System.out.println("Enter new id:");
            		   changeTo=sc.nextInt;
            		setId(changeTo);

            	}
            	else if (change=="firstName"){
            		   System.out.println("Enter new first name:");
            		   changeTo=sc.nextString;
            		setFirstName(changeTo);

            	}
            		else if (change==("lastName")){
            		   System.out.println("Enter new last name:");
            		   changeTo=sc.nextString;
            		setLastName(changeTo);

            	}
            	else if (change==("email")){
            		   System.out.println("Enter new email:");
            		   changeTo=sc.nextString;
            		setEmail(changeTo);

            	}
            	else if (change==("phoneNumber")){
            		   System.out.println("Enter new phone number:");
            		   changeTo=sc.nextString;
            		setPhoneNumber(changeTo);

            	}
            	else if (change==("zipcode")){
            		   System.out.println("Enter new zipcode:");
            		   changeTo=sc.nextString;
            		setZipcode(changeTo);

            	}




                return 1;

}

	

	//binary search for id numbers 
	//conver first box to int then search 
}
}
}
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


}