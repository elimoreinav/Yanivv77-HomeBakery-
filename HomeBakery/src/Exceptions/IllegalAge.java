package Exceptions;
// TODO: Auto-generated Javadoc

/**
 * The Class IllegalAge.
 */
@SuppressWarnings("serial")
public class IllegalAge extends Exception 
{

	/**
	 * Instantiates a new illegal age.
	 *
	 * @param age the age
	 */
	public IllegalAge(String age)
	{
		super(age+" Illegal Age ");
	}


}
