package exception;

public class PhoneException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PhoneException(String meString) {
		super(meString);
	}
	public PhoneException() {
		// TODO Auto-generated constructor stub
	}
	public String getMessage() {
		return "Phone Number entered has exception: " + super.getMessage();
	}
}
