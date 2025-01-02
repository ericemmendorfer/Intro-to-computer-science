
import java.util.Scanner;
import java.util.Arrays;

public class Exercise5{
	public static void main(String[] args){



double [][] arr = new double [7][7];

for (int i=0; i<7; i++){
	for (int j=0; j<7; j++){

	double a=( Math.random());
	double c = a * (100);
	double b = Math.rint(c);

arr[i][j]=b;

}
}

System.out.println (arr);
sortArrayRows(arr);
sortArray(arr);

}



public static void sortArrayRows( double[][]arr){
	for (int i=0; i<7; i++){
	Arrays.sort(arr[i]);



				//do the same for the next just dont do per lien



			}
			Arrays.toString(arr);
			System.out.println(arr);
		

}

public static void sortArray(double[][] arr){
Arrays.sort(arr);

Arrays.toString(arr);
System.out.println(arr);

}
}






//create a random array 7x7
//print result

//other method sorts that array
//print result
	