package Orders;

import Products.*;
import Suppliers.*;


@SuppressWarnings("serial")
public class OrdersFromSupplier extends Order implements Ordering {
	
	/** The Ingredients array. */
	// declare varibles
	ArrayListIngredients IngredientsArray ; // ge
	
	/** The supplier. */
	Supplier supplier;
	
	/** The Sn. */
	int Sn;
	

	/**
	 * Instantiates a new orders from supplier.
	 *
	 * @param daysUntillready the days untillready
	 * @param supplier the supplier
	 * @param ingredientsArray the ingredients array
	 */
	public OrdersFromSupplier(int daysUntillready, Supplier supplier,ArrayListIngredients ingredientsArray) {
		super(daysUntillready);
		setSupplier(supplier);
		Sn++;
		IngredientsArray = ingredientsArray;
		
		
	}

	//calculate sum of all the ingridients in the corrent order

	
	/**
	 * Gets the supplier.
	 *
	 * @return the supplier
	 */
	public Supplier getSupplier() {
		return supplier;
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
	 * Sets the supplier.
	 *
	 * @param supplier the new supplier
	 */
	public void setSupplier(Supplier supplier) 
	{
		this.supplier = supplier;
		
	}

	
	
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "OrderFromSupplier: "+ supplier.getCompanyName()  
				+ " | Date of order: " + dateOfCreation +" | "+ daysUntillready +" "+ "days Untill ready"  ;
	}




	/**
	 * Order total cost.
	 *
	 * @return the double
	 */
	public double OrderTotalCost() 
	{
		return IngredientsArray.Totalcost();
	}





	

	
	



}
