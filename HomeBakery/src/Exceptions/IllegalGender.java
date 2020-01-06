package Exceptions;

// TODO: Auto-generated Javadoc
/**
 * The Class IllegalGender.
 */
@SuppressWarnings("serial")
public class IllegalGender extends Exception 
{
	
	/**
	 * Instantiates a new illegal gender.
	 *
	 * @param sex the sex
	 */
	public IllegalGender(String sex)
	{
		super(sex+" Illegal Gender ");
	}

	
}
