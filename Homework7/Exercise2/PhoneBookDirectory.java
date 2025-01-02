import java.util.Scanner;
import java.util.Arrays;

public class PhoneBookDirectory{
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

        return (1, i);

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
java.util.Arrays.binarySearch(phoneBook, id);





}



	



	//binary search for id numbers 
	//conver first box to int then search 
}