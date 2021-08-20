package exception;

public class BirthDayException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BirthDayException() {
		
	}
	
	public BirthDayException(String meString) {
		super(meString);
	}
	
	public String getMessage() {
		return "Date entered has exception: " + super.getMessage();
	}
}
