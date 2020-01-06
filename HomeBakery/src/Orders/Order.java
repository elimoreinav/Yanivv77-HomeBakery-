package Orders;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import Exceptions.IllegalNumberInput;


@SuppressWarnings("serial")
public class Order implements Serializable
{
	
	// declare varibles
	
	/** The now. */
	protected Date now = new Date();
	
	/** The date of creation. */
	protected String dateOfCreation;
	
	/** The days untillready. */
	protected  int daysUntillready;
	
	/**
	 * Instantiates a new order.
	 *
	 * @param daysUntillready the days untillready
	 */
	public Order( int daysUntillready) 
	{
		this.daysUntillready = daysUntillready;
		dateOfCreation = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH).format(now);
	}
	
	
	
	/**
	 * Gets the days untillready.
	 *
	 * @return the days untillready
	 */
	public int getDaysUntillready()
	{
		return daysUntillready;
	}

	
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Order [dateOfCreation= " + dateOfCreation + ", daysUntillready= " + daysUntillready
				+ "]";
	}



	/**
	 * Sets the days untillready.
	 *
	 * @param daysUntillready the new days untillready
	 * @throws IllegalNumberInput the illegal number input
	 */
	public void setDaysUntillready(int daysUntillready) throws IllegalNumberInput
	{
		if (daysUntillready>0)
			this.daysUntillready = daysUntillready;
		else
			throw new IllegalNumberInput(daysUntillready);
		
	}

	


	

	
	
}
