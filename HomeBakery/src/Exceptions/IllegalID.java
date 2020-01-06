package Exceptions;

// TODO: Auto-generated Javadoc
/**
 * The Class IllegalID.
 */
@SuppressWarnings("serial")
public class IllegalID extends Exception 
{
	
	/**
	 * Instantiates a new illegal ID.
	 *
	 * @param id the id
	 */
	public IllegalID(String id)
	{
		super(id+" Illegal ID ");
	}
}
