public class Challenge4{
	public static void main(String[] args){

int [] myList={323, 331, 323, 336, 319, 330, 322};
char[] alphabet={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};




 char [] code= {'t','r','e','a','s','u','r','e','l','i','e','s','w','i','t','h','i','n','t','h','i','s','c','h','e','s','t'};

int sum=0;

for (int i=0; i<code.length; i++){
char key=code[i];
for (int j=0; j<alphabet.length; j++){
	if (key==alphabet[j]){
		sum+=j;
		break;
	}
}
}
String password= "";

for (int i=0; i<myList.length; i++){
	int key=(myList[i]-319);
	password+=alphabet[key];

}
System.out.println(password);

}
}