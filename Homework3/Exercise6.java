//judge the strength of passwords according to chart
import java.util.Scanner;

public class Exercise6{
	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		int up=(0);
		int low=(0);
		int num=(0);

		System.out.println("Enter a Password:");

		String pass= sc.nextLine();

//weak password if length is too short

		if (pass.length()<8) {
			System.out.println("Weak password");

			//awesome password if long enough + allows to work between lengths 
			
		} else if (pass.length()>12) {
			System.out.println("Awesome password");
		
		} else if (pass.length()>8) { 

			//gather information to figure out strength of passwords inbetween lengths

			for(int i =0;i<pass.length();i++){

				char c = pass.charAt(i);


				if (Character.isLowerCase(c)){
					low+=1;
					
				} 
				else if (Character.isUpperCase(c)){
					up+=1;
					
				} 
				else if (Character.isDigit(c)){
					num+=1;
					
				}
			//medium pass entries all num or all letter
		}
		 if (num==0) { 
			System.out.println("Medium password");

		}else if (up==0 && low==0) { 
			System.out.println("Medium password");

		}
//ok password entries no upper or no lower cases
		else if (up==0) { 
			System.out.println("Ok password");
		}
		else if (low==0) { 
			System.out.println("Ok password");
		}
//stong passwords have all 3 elements

		else if (up!=0 && low!=0 && num!=0) { 
			System.out.println("Strong password");
		}
		
}

		else {
			System.out.println("Invalid Password");
		}

		sc.close();

	}
}