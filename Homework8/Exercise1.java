import java.util.Scanner;

public class Exercise1{
	public  static void main(String[] args){

		//The hex2Dec takes the string “hexString” as an input and returns its decimal conversion as an int. 
		//Also, the method throws a custom exception called HexFormatException if any character of the input is not a proper hex string.
		//Create the custom exception class HexFormatException which extends Exception class.
		//Main method will call hex2Dec method and you will need to catch the exception from the main
//method and just print the message “Illegal hex character” in the console. Your code can use the just have the following five hexadecimal numbers
//A5, FAA, T10, ABC, 10A as shown in the following pseudo code illustration
System.out.println("Enter Hex format:");
Scanner sc= new Scanner(System.in); 
String hexString= sc.nextLine();

System.out.println(hex2Dec(hexString));
}

public static double hex2Dec(String hexString){
	int length= hexString.length();
	 int[] arr;

arr = new int[length];	
try{
for (int i=0; i<length; i++){
		if (hexString.charAt(i)=='1'){
			arr[i]=1;
		}
		else if (hexString.charAt(i)=='2'){
			arr[i]=2;
		}
		else if (hexString.charAt(i)=='3'){
			arr[i]=3;
		}
		else if (hexString.charAt(i)=='4'){
			arr[i]=4;
		}
		else if (hexString.charAt(i)=='5'){
			arr[i]=5;
		}
		else if (hexString.charAt(i)=='6'){
			arr[i]=6;
		}
		else if (hexString.charAt(i)=='7'){
			arr[i]=7;
		}
		else if (hexString.charAt(i)=='8'){
			arr[i]=8;
		}
		else if (hexString.charAt(i)=='9'){
			arr[i]=9;
		}
		else if (hexString.charAt(i)=='0'){
			arr[i]=0;
		}
		else if (hexString.charAt(i)=='B'){
			arr[i]=12;
		}
		else if (hexString.charAt(i)=='C'){
			arr[i]=13;
		}
		else if (hexString.charAt(i)=='D'){
			arr[i]=14;
		}
		else if (hexString.charAt(i)=='E'){
			arr[i]=15;
		}
		else if (hexString.charAt(i)=='F'){
			arr[i]=16;
		}
	
		else{
			throw new HexFormatException();
}		
}
}
catch (HexFormatException e){
		System.out.println( "Invalid input");
	}

	
	int dec=0;
	for (int j=0; j<length-1; j++){
		dec+= arr[j];
		dec=dec*10;

	}
	dec+=arr[length-1];

			return dec;

	}

    }

//break point