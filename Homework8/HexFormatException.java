public class HexFormatException extends Exception{

	public HexFormatException(){
		super ("Invalid Hex Format");
	}
	public HexFormatException(String message){
		super(message);
	}
}