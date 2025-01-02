public class rotateRight{
	public static void main(String[] args){

		double[] myList= {1.9, 2.9, 3.4, 3.5};
		double temp= myList[3];

		for (int i=(2); i>0; i-=1){
			myList[i+1]=myList[i];
		}

			myList[0]=temp;

			System.out.println(myList);

		
	}
}
