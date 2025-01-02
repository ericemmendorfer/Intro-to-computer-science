import java.util.Scanner;


public class DNABarcodeGenerator{
	public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
System.out.println("How many sequences of DNA barcodes you would like to generate?");
int amount = sc.nextInt();
System.out.println("What is the length of the DNA barcode?");
int length = sc.nextInt();

for (int i=0; i<amount; i++){
	//do each one individually and print out each time so that we do not deal with multiple output variables
	String barcode="";

	barcode= generateBarcode(length);

	char [] barcode1 = new char[length];
	for (int j=0; j<length; j++){
		barcode1[j]=barcode.charAt(j);
	}


	isRedundantBarcode(length,barcode,barcode1);
	isRestrictedList(length,barcode,barcode1);

	String barcode2="";
	for (int k=0; k<length; k++){
		barcode2+=barcode1[k];
	}

	System.out.println("barcode" + i + ":" + barcode2);
}

}

public static String generateBarcode(int length){ //just get letters order does not matter 
String barcode="";
double nucleo=0;
	for (int i=0; i<length; i++){
		nucleo=Math.random();
		if (nucleo<.25){
			barcode+='A';
		}
		else if (nucleo<.50){
			barcode+='T';
		}
		else if (nucleo<.75){
			barcode+='C';
		}
		else{
			barcode+='G';
		}

	}
	//validating here so I can create a new barcode easier if needed 

	while (validateGCCount(length,barcode)==false){
	 barcode="";
	for (int i=0; i<length; i++){
		 nucleo=Math.random();
		if (nucleo<.25){
			barcode+='A';
		}
		else if (nucleo<.50){
			barcode+='T';

		}
		else if (nucleo<.75){
			barcode+='C';

		}
		else{
			barcode+='G';

		}

	}

	}
	
return barcode;




}

public static void isRestrictedList(int length, String barcode, char [] barcode1){
	//must exclude the following patterns
//AgeI = ACCGGT
//AscI = GGCGCGCC
//BamHI = GGATCC
//SbfI = CCTGCAGG

	if (barcode.contains("ACCGT")){
		int replace =(barcode.indexOf("ACCGT") + 4);
		barcode1[replace]='A';
	}
	if (barcode.contains("GGCGCGCC")){
		int replace =(barcode.indexOf("GGCGCGCC") + 7);
		barcode1[replace]='G';
	}
	if (barcode.contains("GGATCC")){
		int replace =(barcode.indexOf("GGATCC") + 5);
		barcode1[replace]='G';
	}
	if (barcode.contains("CCTGCAGG")){
		int replace =(barcode.indexOf("CCTGCAGG") + 7);
		barcode1[replace]='C';
	}


}

public static boolean validateGCCount(int length, String barcode){

	boolean a=false;

	//make sure between40-60% of nucleotides are g/c
	double gCount=0;
	double cCount=0;
	for (int i=0; i<length; i++){	//figure out how to count each letter 
		if (barcode.charAt(i)=='C'){
			cCount+=1;
		}
		else if (barcode.charAt(i)=='G'){
			gCount+=1;
		}
}
//then divide by length and make sure it is not <40 or >60

double percent = ((gCount+cCount)/length);
if (percent>.4 && percent<.6){
	 a= true;
	return a;

}
//create a brand new DNA strand 

return a;
}
public static void isRedundantBarcode(int length, String barcode, char [] barcode1){
	for (int i=0; i<(length-2); i++){
		if (barcode.charAt(i)==barcode.charAt(i+1) && barcode.charAt(i) ==barcode.charAt(i+2)){			//already checked the ratios of the nucleos so flip c to g and a to t

			if (barcode.charAt(i)=='A'){
				barcode1[i+2]='T';
		}
		else if (barcode.charAt(i)=='T'){
				barcode1[i+2]='A';
	}
	else if (barcode.charAt(i)=='C'){
				barcode1[i+2]='G';

}
	else if (barcode.charAt(i)=='G'){
				barcode1[i+2]='C';
}
}

}
}
}


//rules for quiz

//TO DO


//DONE

//generateBarcode ()
			// takes no argument and return a random string of nucleotides of the length, L, which is inputted by the user  
//isRedundantBarcode(String barcode)
		//Takes the generated barcode and validates there are no three
		//nucleotides on a row for given barcode
		//Use class variables when reading the input from the user
//isRestrictedList(String barcode)
			//Takes the generated barcode and validate if the generated barcode is in
			//the restricted list or not, if it is, ignore it and generate a new barcode o 

//validateGCCount(String barcode)
			// Takes the generated barcode and validates that count of G nucleotides and the count of C nucleotides is greater or equal than 40% and less or
			// equal than 60% of the total count of nucleotides in the generated barcode
