//atm
//1= view balance
//2=Deposit cash
//3=Withdraw cash
//4=Exit
//anything else is invalid selection please try again
//balance starts at 100

//change to a do while


import java.util.Scanner;

public class Exercise1{
	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		double balance =(100.00);
		int entry=(0);
		double deposit=(0);
		double withdraw=(0);

		System.out.println("Enter 1 to view balance ");
		System.out.println("Enter 2 to deposit cash");
		System.out.println("Enter 3 to withdraw cash");
		System.out.println("Enter 4 to exit");

		entry= sc.nextInt();

		do{
	 	System.out.println("Enter 1 to view balance ");
		System.out.println("Enter 2 to deposit cash");
		System.out.println("Enter 3 to withdraw cash");
		System.out.println("Enter 4 to exit");
	 	entry= sc.nextInt();

		if(entry==1){

			System.out.printf("Your balance is "+ "%.2");

		}else if(entry==2){

			System.out.println("Enter amount you would like to deposit:");

			deposit= sc.nextDouble();

			if (deposit>0){
			balance+=deposit;
		}


		}else if (entry==3){

			System.out.println("Enter amount you like to withdraw:");
			withdraw= sc.nextDouble();
			if (withdraw> balance){
				System.out.println("Sorry you don't have enough balance!");
			}else if (balance>withdraw)
			{
				if (withdraw>0){
				balance-=withdraw;
			}
			}

		} 


		}

	while (entry!=4);
	 
	 if (entry==4){
			System.out.println("Goodbye");

		}




		sc.close();
	}
}

