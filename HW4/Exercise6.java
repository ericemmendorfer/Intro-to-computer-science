public class Exercise6{
		public static void main(String[] args){
		//print ascii charecters and codes 65-126 in rows of 5

		for (int i=65; i<125; i++){
			String row=("");

			char letter= (char)i;

			row+=(i +":" + letter +"  ");
			i+=1;
			row+=(i +":" + letter +"  ");
			i+=1;
			row+=(i +":" + letter +"  ");
			i+=1;
			row+=(i +":" + letter +"  ");
			i+=1;
			row+=(i +":" + letter +"  ");
			
		

			System.out.println(row);
		row=("");

		}
		for (int i=125; i<127; i++){
			String row2=("");

			char letter= (char)i;

			row2+=(i +":" + letter +"  ");
			i+=1;
			row2+=(i +":" + letter +"  ");
			System.out.println(row2);
		}
			
}
}

//create array