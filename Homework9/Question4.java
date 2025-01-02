
import java.util.Scanner;

public class Question4(){
	public static void main (Strings [] args){

java.io.File names= new java.io.File("names.txt");
Scanner sc=new Scanner(names);


int bob=0;

int alice=0;

//traverse file line by line.. if bob occurs bob count++ else if alice occrs alice count++

while (sc.hasNextLine()) {

String name = sc.nextLine();

if(name.equalsIgnoreCase("bob")) bob++;

if(name.equalsIgnoreCase("alice")) alice++;
	
	}
	System.out.println("There are "+ bob+ " Bob and "+alice+ " Alice in names.txt");
}
}


