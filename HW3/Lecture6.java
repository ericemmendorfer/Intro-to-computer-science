import java.util.Scanner;

public class Lecture6{
public static void main(String[] args){
	Scanner sc= new Scanner (System.in);

	System.out.println("Enter a char variable and an int");

	int a=sc.nextInt();
	String b = sc.nextLine();
	int x=(0);

	while(a>x){
		x++;
		System.out.println(b);
	}

	sc.close();

}
}