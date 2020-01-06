package Exceptions;

// TODO: Auto-generated Javadoc
/**
 * The Class IllegalAddress.
 */
@SuppressWarnings("serial")
public class IllegalAddress extends Exception {
	
	/**
	 * Instantiates a new illegal address.
	 *
	 * @param Address the address
	 */
	public IllegalAddress(String Address) {
		super(Address + " Illegal Email");
	}
}

	




