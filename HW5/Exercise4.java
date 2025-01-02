	import java.util.Scanner;


public class Exercise4{
	public static void main(String[] args){


Scanner sc = new Scanner(System.in);

System.out.println("Enter lenght of array, followed by elements");
		
int length= sc.nextInt();

int [] myList= new int[length];

for (int i=0; i<length; i++){
	myList[i]=sc.nextInt();
}

for (int j=1; j<length; j++){
	if (myList[j]<myList[j-1]){
		System.out.println("List is not sorted");
		break;
	}
	if (j==length-1){
		System.out.println("List is sorted");
	}
}

//create array of 2- -1

//array length =sc.nextInt


	

	}
	}