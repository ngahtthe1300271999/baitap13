package exception;

public class EmailException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public EmailException () {
		
	}
	
	public EmailException(String meString) {
		super(meString);
	}
	
	public String getMessage() {
		return "Email entered has exception: " + super.getMessage();
	}
}
