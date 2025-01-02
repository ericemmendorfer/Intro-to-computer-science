import java.util.Scanner;

public class Exercise4{
	public static void main(String[] args){

		


System.out.println("Enter a number");

Scanner sc= new Scanner(System.in);
	int number= sc.nextInt();
	int ones= number;

	String binary=("");

while (ones>0){

if ((ones%2)==(1)){
	binary+=("1");
	ones=ones/2;

} else if ((ones%2)==(0)){
	binary+=("0");
	ones=ones/2;
}
}

int amt=binary.length() -1;

String bin=("");

for (int i=0; i<=amt; i++){
 bin += (binary.charAt(amt- i));
}

		
		

System.out.println(number + " in binary is: "+ bin);


sc.close();

	}
}
//decimal number to binary ie 45 to 10101