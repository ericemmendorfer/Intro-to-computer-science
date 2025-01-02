import java.util.Scanner;

public class Exercise5{
	public static void main(String[] args){
//Write a java program that contain two overloaded methods that accepts two numbers or 
		//two characters representing a range example (11, 37) or (c, w) inputted by the user. 
		//The method generates a random integer within the given range and returns it, or a random char 
		//within the given range of chars and returns it. The method needs to be called in the main and main prints 
		//he return of the method.
		
System.out.println("Input two numbers or charecters" );
//if input is int
Scanner sc= new Scanner(System.in);

String x= sc.nextLine();



if (Character.isDigit(x.charAt(1))){
int a= sc.nextInt();
int b=sc.nextInt();

double c= (Math.random()*(b-a)+a);

int d= (int)c;
System.out.println(d);
}
else;{


char e= x.charAt(0);
char g= x.charAt(1);
	int f=(e);
	int h=(g);

	double i= (Math.random()*(g-e)+e);

	int j= (int)i;
	char k=(char)j;
	System.out.println(k);
}

sc.close();

	}
}