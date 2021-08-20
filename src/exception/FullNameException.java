package exception;

public class FullNameException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public FullNameException() {
		
	}
	
	public FullNameException(String meString) {
		super(meString);
	}
	
	public String getMessage() {
		return "FullName entered has exception: " + super.getMessage();
	}
}
