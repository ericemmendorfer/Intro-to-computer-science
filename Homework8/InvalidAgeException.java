public class InvalidAgeException extends Exception{

	public InvalidAgeException(){
		super ("Must be at least 21 years old to vote.");
	}
	public InvalidAgeException(String message){
		super(message);
	}
}