package Exceptions;


// TODO: Auto-generated Javadoc
/**
 * The Class IllegalPhone.
 */
@SuppressWarnings("serial")
public class IllegalPhone extends Exception {
	
	/**
	 * Instantiates a new illegal phone.
	 *
	 * @param phone the phone
	 */
	public IllegalPhone(int phone) {
		super(phone+" Illegal Phone");
	}
	
	/**
	 * Instantiates a new illegal phone.
	 *
	 * @param phone the phone
	 */
	public IllegalPhone(String phone) {
		super(phone+" Illegal Phone");
	}
}

	




