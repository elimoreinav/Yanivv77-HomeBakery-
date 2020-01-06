package Orders;
import java.util.LinkedList;
import java.util.Queue;


public class QueueOrdersSupplier 
{

	/** The List. */
	protected Queue<OrdersFromSupplier> List =  new LinkedList<>() ;

	/**
	 * Instantiates a new queue orders supplier.
	 */
	public QueueOrdersSupplier() 
	{
		
		
	}
	

	/**
	 * Adds the order.
	 *
	 * @param O the o
	 */
	public void AddOrder(OrdersFromSupplier O)
	{
		List.add(O);
	}
	
	/**
	 * Removes the ingredient.
	 *
	 * @param O the o
	 */
	public void RemoveIngredient(OrdersFromSupplier O)
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
		for (OrdersFromSupplier orderFromSupplier : List) 

		{
			ProductCost +=  orderFromSupplier.OrderTotalCost() ;
		}
		
		return ProductCost;
	}


	/**
	 * Gets the list.
	 *
	 * @return the list
	 */
	public Queue<OrdersFromSupplier> getList() {
		return List;
	}


	/**
	 * Sets the list.
	 *
	 * @param list the new list
	 */
	public void setList(Queue<OrdersFromSupplier> list) {
		List = list;
	}


	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		String str  ="\n";
		
		for (OrdersFromSupplier order : List) 
		{
			str += order +" | ";;
			str  += "\n";
			
		}
		return str;
		
	
	}
	

	
}
