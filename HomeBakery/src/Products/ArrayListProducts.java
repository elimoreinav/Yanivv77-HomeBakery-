package Products;
import java.util.ArrayList;


public class ArrayListProducts 
{

	/** The List. */
	protected ArrayList<Product> List = new ArrayList<Product>();
	
	
	/**
	 * Instantiates a new array list products.
	 */
	public ArrayListProducts () 
	{
		

	}

	/**
	 * Adds the product.
	 *
	 * @param P the p
	 * @param times the times
	 */
	public void AddProduct(Product P, int times)
	{
		for (int i = 0; i < times; i++) 
		{
			List.add(P);
		}
		
	}
	
	/**
	 * Removes the product.
	 *
	 * @param P the p
	 */
	public void RemoveProduct(Product P)
	{
		List.remove(P);
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
		for (Product  product : this.List) 
		{
			ProductCost += product.getPrice();
		}
		
		return ProductCost;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		 
	 	String str  ="\n";
	 	int sum = 0;
	
		for (Product product : List) 
		{
			str += product.Name +" | ";
			sum += product.Price;
			
		}
		str = str +" total price for order is " + sum +" shekel" ;
		return str;
	}

	
	
	
}
