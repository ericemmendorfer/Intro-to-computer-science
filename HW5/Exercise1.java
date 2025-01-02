
import java.util.Scanner;
public class Exercise1{
	public static void main(String[] args){


	Scanner sc= new Scanner(System.in);

		//reverse entered numbers 10 ints

	//create array 
	//input to array
int[] myList = new int [10];

System.out.println("Enter 10 values for array");

for (int i=0; i<10; i++){
	myList[i]=sc.nextInt();

}
String reverse="";

for (int j=9; j>0;  j--){
reverse+=myList[j]+ " ";
}

System.out.println(reverse);


	}
	}