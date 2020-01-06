package Exceptions;


// TODO: Auto-generated Javadoc
/**
 * The Class IllegalNumberInput.
 */
@SuppressWarnings("serial")
public class IllegalNumberInput extends Exception {
	
	/**
	 * Instantiates a new illegal number input.
	 *
	 * @param num the num
	 */
	public IllegalNumberInput(int num) {
		super(num + "Input must a postive number");
	}
	
	/**
	 * Instantiates a new illegal number input.
	 *
	 * @param num the num
	 */
	public IllegalNumberInput(double num) {
		super(num + "Input must a postive number");
	}
}

	




