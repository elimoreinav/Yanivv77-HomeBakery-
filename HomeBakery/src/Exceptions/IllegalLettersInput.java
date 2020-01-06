package Exceptions;


// TODO: Auto-generated Javadoc
/**
 * The Class IllegalLettersInput.
 */
@SuppressWarnings("serial")
public class IllegalLettersInput extends Exception {
	
	/**
	 * Instantiates a new illegal letters input.
	 *
	 * @param input the input
	 */
	public IllegalLettersInput(String input) {
		super(input +" Input must contian of digits only");
	}
}

	




