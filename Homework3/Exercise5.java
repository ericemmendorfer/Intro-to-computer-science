// Enter month in random caps and non caps and return the season
//output "Season is ..."

import java.util.Scanner;

public class Exercise5{
	public static void main(String[] args){

	Scanner sc= new Scanner(System.in);

	System.out.println("Enter a month:");

	String month= sc.nextLine();
	String season=(" ");

	month.toLowerCase();

	//convert to all lower case

	//run to output season

	if (month=="december")
	{
		season=("Winter");
		
		} else if (month=="january") 
	{
		season=("Winter");
		}  else if (month=="february") 
	{
		season=("Winter");
		} else if (month=="march") 
		{
			season=("Spring");
		
		} else if (month=="april") 
		{
			season=("Spring");
		
		} else if (month=="may") 
		{
			season=("Spring");
		
		} else if (month=="june") 
		{
			season=("Summer");
		
		} else if (month=="july") 
		{
			season=("Summer");
		
		} else if (month=="august") 
		{
			season=("Summer");
		
		} else if (month=="september") 
		{
			season=("Fall");
		
		} else if (month=="october") 
		{
			season=("Fall");
		
		} else;
			season=("Fall");

	System.out.println("Season is: " + season);

	sc.close();
}
}