package Clients;

import Orders.*;
import Products.*;


@SuppressWarnings("serial")
public class OrderToClient extends Order  implements Ordering {
	

	/** The Products array. */
	// declare varibles
	ArrayListProducts ProductsArray = new ArrayListProducts(); // ge
	
	/** The client. */
	Client client;
	
	/** The Sn. */
	int Sn ;
	
	
	/**
	 * Instantiates a new order to client.
	 *
	 * @param daysUntillready the days untillready
	 * @param client the client
	 * @param productsArray the products array
	 */
	public OrderToClient(int daysUntillready, Client client,ArrayListProducts productsArray) {
		super(daysUntillready);
		setClient(client);
		ProductsArray  = productsArray;
		Sn++;

	}
	
	
	
	/**
	 * Gets the sn.
	 *
	 * @return the sn
	 */
	public int getSn() {
		return Sn;
	}



	/**
	 * Gets the client.
	 *
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}



	/**
	 * Sets the client.
	 *
	 * @param client the new client
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	
	


	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "OrderToClient " + ProductsArray + " \nclient= " + client 
				+ "date Of Creation: " + dateOfCreation + ", daysUntillready : " + daysUntillready ;
	}

	

	/**
	 * Order total cost.
	 *
	 * @return the double
	 */
	//calculate price of all the products in the corrent order
	public double OrderTotalCost() 
	{
		
		return ProductsArray.Totalcost() ;
	}




}
