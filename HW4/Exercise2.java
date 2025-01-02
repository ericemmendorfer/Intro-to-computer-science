import java.util.Scanner;

public class Exercise2{
	public static void main(String[] args){
//flip number input 

		Scanner sc= new Scanner(System.in);
		System.out.println("Input a number");

		String normal=sc.nextLine();
		int amt=normal.length();

		String out=("");


		for (int i=0; i<amt;i++){
			out+=(normal.charAt((amt-1)-i));

		}
		System.out.println(out);
		

//not allowed arrays
		sc.close();
}
}
