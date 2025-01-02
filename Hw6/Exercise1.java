import java.util.Arrays;

public class Exercise1{
public static void main( String[] args){

//sample values

int n=2;
int arr[][]={{1,2,3},{4,5,6},{7,8,9}};

System.out.println("Original array via approach1"+Arrays.deepToString(approach1(arr,0)));
System.out.println("Shifted array via approach1"+Arrays.deepToString(approach1(arr,n)));
int arr3[][]={{1,2,3},{4,5,6},{7,8,9}};
System.out.println("Original array via approach2"+Arrays.deepToString(approach2(arr3,0)));
System.out.println("Shifted array via approach2"+Arrays.deepToString(approach2(arr3,n)));

}

public static int[][] approach1(int arr[][], int flag){
	//shift through storing first/last number then shift all 1 and reassign first/last number for n times
	if (flag>0){
		for (int i=0; (i<flag); i++) {

			shiftRightbyOne(arr);


		}


	} else if(flag<0){
		for (int i=0; (i>flag); i--){
			shiftLeftbyOne(arr);

		}

}
return  arr;

}


//use shift right by one method, and shift left by one methods
public static int[][] shiftRightbyOne(int arr[][]){//start from right
	for (int row = 0; row < arr.length; row++) {
		 int hold=arr[row][arr[row].length-1];
    for (int column = arr[row].length-1; column >0; column--) {
    	arr[row][column]=arr[row][column-1];
        }
        arr[row][0]=hold;


}
return arr;
}
public static int[][] shiftLeftbyOne(int arr[][]){ //start from left
	for (int row = 0; row < arr.length; row++) {
		 int hold=arr[row][0];
    for (int column = 0; column < arr[row].length-1; column++) {
    	arr[row][column]=arr[row][column+1];
        }
        arr[row][arr[row].length-1]=hold;

    }
    return  arr;

}
	

public static int[][] approach2(int arr[][] , int flag ){
	int arr2[]= new int [Math.abs(flag)];

//do it all in one loop
	if (flag>0){  //shift to right
		for (int row = 0; row < arr.length; row++) {
			for (int j=0; j<flag;j++){
//hold numbers i need to save
				arr2[j]=arr[row][arr[row].length-1-j];
				
			}

			for (int column = arr[row].length-1; column >flag; column--) {
    	arr[row][column]=arr[row][column-flag-1];
        }
        for (int a=0; a<flag; a++){
        	arr[row][flag-a-1]=arr2[a];
        }


		}
	} else if (flag<0){ //shift to left
int f=Math.abs(flag);
		for (int row = 0; row < arr.length; row++) {
			for (int j=0; j<f;j++){
				arr2[j]=arr[row][j];

			}

			for (int column = 0; column < arr[row].length-f; column++) {
    	arr[row][column]=arr[row][column+f];
        }
        for (int a=0; a<f; a++){
        	arr[row][arr[row].length-f+a]=arr2[a];

        }

		}


}
return arr;

}
}




