import java.util.Scanner;

import java.util.Date;

public class Account{


		private int id = 0;
		private double balance=0;
		private double interest=(0);
		private Date dateCreated= new Date();


	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		//private int for id field defualt =0  DONE
		//private double for balance default=0 DONE
		//private double for interest rate defualt=0 all accounts have same interest rate DONE 
		//private Date field for date account is created
		//default constructor that creates default account
		//accesor for id balanxe and annualInterestRate
		//accesor for date created
		//method getMonthlyInterest() returns monthly interest


//test case

Account account1=new Account(1122, 2000,.045, new Date() );
withdraw(account1.balance, 2500);
deposit(account1.balance, 3000);

System.out.println( "Id:"+ account1.id +" Balance:"+  account1.balance+ " Monthly Interest:" + monthlyInterest( account1.balance,  account1.interest)+ " Date created:"+ account1.dateCreated );

		
	}
Account (int id, double balance, double interest, Date dateCreated){
	setId(id);
	setBalance(balance);
	setInterest(interest);

}
	public int setId(int newId){
		this.id=newId;
				return this.id;

	}
	public int getId(){
		return this.id;

	}
	public double setBalance(double newBalance){
		this.balance=newBalance;
		return this.balance;

	}
	public double getBalance(){
		return this.balance;

	}
	public double setInterest(double newInterest){
		this.interest=newInterest;
				return this.interest;


	}
	public double getInterest(){
		return this.interest;

	}
	public Date setDateCreated(Date newDateCreated){
		this.dateCreated=newDateCreated;
				return this.dateCreated;


	}
	public Date getDateCreated(){
		return this.dateCreated;

	}
	//make function for monthly interest
	public static double monthlyInterest(double balance, double interest){
		double monthly= interest*balance/12;
		return monthly;
	}


	public static double deposit(double balance, double deposit){
		
		if (deposit<0){
			System.out.println("Can not deposit a negative amount.");
		}
		else{
			balance+=deposit;
		}
		return balance;

	}
	public static double withdraw( double balance , double withdraw){
		
		if (withdraw> balance){
			System.out.println("Insufficient funds.");
		}
		else {
			balance-= withdraw;
		}
		return balance;
}
	}


