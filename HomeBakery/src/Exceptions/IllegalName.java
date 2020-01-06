package Exceptions;


// TODO: Auto-generated Javadoc
/**
 * The Class IllegalName.
 */
@SuppressWarnings("serial")
public class IllegalName extends Exception 
{
	
	/**
	 * Instantiates a new illegal name.
	 *
	 * @param Name the name
	 */
	public IllegalName(String Name)
	{
	super(Name +" Illegal Name ");
	}
}
