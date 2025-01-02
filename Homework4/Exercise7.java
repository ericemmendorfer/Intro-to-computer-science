import java.util.Scanner;

public class Exercise7{
	public static void main(String[] args){

//Write a program that prompts the user to enter two strings and displays the largest common prefix of the two strings (ignoring the letters case). Here are some sample runs: e.g. Enter the first string: Welcome to Java 
//Enter the second string: Welcome to programming
//The common prefix is: Welcome to
//e.g. Enter the first string: Atlanta Enter the second string: Miami Output: Miami and Atlanta have no common prefix
Scanner sc= new Scanner(System.in);

//store both strings

System.out.println("Enter string one");
String one = sc.nextLine();

System.out.println("Enter string two");
String two= sc.nextLine();

String three=("");



for ( int i=0; i<one.length(); i++) {
	if (one.charAt(i)==two.charAt(i)){
		three+=one.charAt(i);
	}else if (one.charAt(i)==two.charAt(i)){
	break;
}
}

if(three==("")){
	System.out.println(one + " and " + two + " have no common prefix.");
} else;
System.out.println(three);


//create third string to add similarities to

sc.close();
}
}

//convert into arrays