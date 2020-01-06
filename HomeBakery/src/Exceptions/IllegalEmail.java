package Exceptions;

// TODO: Auto-generated Javadoc
/**
 * The Class IllegalEmail.
 */
@SuppressWarnings("serial")
public class IllegalEmail extends Exception {
	
	/**
	 * Instantiates a new illegal email.
	 *
	 * @param email the email
	 */
	public IllegalEmail(String email) {
		super(email + " Illegal Email");
	}
}

	




