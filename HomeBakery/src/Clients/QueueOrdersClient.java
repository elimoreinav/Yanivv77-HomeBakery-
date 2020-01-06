package Clients;
import java.util.LinkedList;
import java.util.Queue;


public class QueueOrdersClient 
{

	/** The List. */
	protected Queue<OrderToClient> List =  new LinkedList<>() ;

	/**
	 * Instantiates a new queue orders client.
	 */
	public QueueOrdersClient() 
	{
		
	}
	

	/**
	 * Adds the order.
	 *
	 * @param O the o
	 */
	public void AddOrder(OrderToClient O)
	{
		List.add(O);
	}
	
	/**
	 * Removes the ingredient.
	 *
	 * @param O the o
	 */
	public void RemoveIngredient(OrderToClient O)
	{
		List.remove(O);
	}
	
	
	/**
	 * List size.
	 */
	public void ListSize()
	{
		List.size();
	}
	
	/**
	 * Showlist.
	 *
	 * @return the string
	 */
	public String Showlist()
	{
		return List.toString();
	}
	
	
	/**
	 * Totalcost.
	 *
	 * @return the int
	 */
	public int Totalcost() 
	{
		int ProductCost = 0;
		for (OrderToClient orderToClient : List) 

		{
			ProductCost +=  orderToClient.OrderTotalCost() ;
		}
		
		return ProductCost;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		String str  ="\n";
		
		for (OrderToClient order : List) 
		{
			str += order +" | ";;
			str  += "\n"+"\n";
			
		}
		return str;
	
	}
}
