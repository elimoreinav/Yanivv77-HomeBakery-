package Exceptions;


// TODO: Auto-generated Javadoc
/**
 * The Class IllegalDigitsInput.
 */
@SuppressWarnings("serial")
public class IllegalDigitsInput extends Exception {
	
	/**
	 * Instantiates a new illegal digits input.
	 *
	 * @param num the num
	 */
	public IllegalDigitsInput(int num) {
		super(num +" Input must contian of letters only");
	}
}

	




