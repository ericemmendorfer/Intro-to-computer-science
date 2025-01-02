import java.util.Scanner;

public class Exercise3{
	public static void main(String[] args){
//figure out if palindrome
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter a word");
		String word=sc.nextLine();

		//remove punctuation and spaces

		int length=word.length();
		int half = length/2;

		int i=0;

		while (half>i) {

			if (word.charAt(i)== word.charAt(length-1)){
				i+=1;
				length-=1;
			} 
			else if (word.charAt(i)!= word.charAt(length-1)){
				System.out.println("This is not a palindrome");
				break;
			}
		}

		if (i==(half)){
		System.out.println(word + " is a palindrome.");

}
		//length
		//if i(0)==i(length-1)
sc.close();
}
}

