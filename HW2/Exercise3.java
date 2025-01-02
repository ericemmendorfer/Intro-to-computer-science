
//If $1 Dollar equals to 0.9 Euros
//Write a java program that ask the user to enter the amount they need to convert.
//Then the program will ask the user to enter either 1 or 2
//If the user enters 1, then you convert the values from dollars to euros
//If the user enters 2, then you convert the values from euros to dollars.
//The output of the program is a single line
//You entered xx.xx in “Dollars/Euros” based on the user and they are equals to zz.zz (Euros/Dollars)

//1 usd to euro = *.9
//2 euro to usd = /.9
import java.util.Scanner;

public class Exercise3{
	public static void main(String[] args){

			Scanner input= new Scanner(System.in);
//create variables
		double m=(0);
		int a=(0);
		double c=(0);
		String d=("d");
		String e=("e");


		System.out.print ( "Please enter amount of money you wish to convert.");
		 m = input.nextDouble();

		System.out.print ( "Please enter 1 for converting USD to Euros, or 2 to convert Euros to USD.");
		 a = input.nextInt();
//conversions
		if (a ==(1));
			 c= (m * .9);
			 d =("Euros");
			 e=("USD");
		
		if (a ==(2));
			 c = (m/.9);
			 d =("USD");
			 e=("Euros");

//format to 2 decimals
			 //"xx.xx" e" is equal to" yy.yy" d
			 System.out.printf("%.2f %s is equal to %.2f %s", m, e, c, d);
	}
		}

