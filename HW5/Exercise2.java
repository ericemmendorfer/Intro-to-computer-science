	import java.util.Scanner;
	import java.util.Arrays;


public class Exercise2{
	public static void main(String[] args){

Scanner sc=new Scanner(System.in);

	System.out.println("Enter integers between 1-100");
	int [] arr= new int[10];

	while (sc.nextInt()!=0);
	for (int i=0; i<arr.length;i++){
	arr[i]= sc.nextInt();
}


	//scanner 
	//each input ends with 0
int count=0;
for (int i=0;i<arr.length;i++){
	for(int j=i; j>0; j--){
	if(arr[i]!=arr[j]){
	int num=arr[i];

	for (i=0; i<arr.length; i++){

	if (num==arr[i]){
		count+=1;
	}
	System.out.print(num +": "+ count);
	count=0;

	}
} 

}
}


	}
	}