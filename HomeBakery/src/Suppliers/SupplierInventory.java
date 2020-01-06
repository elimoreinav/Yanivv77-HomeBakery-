/*
 * 
 */
package Suppliers;
import java.io.Serializable;
import java.util.ArrayList;

import Products.Ingredient;


@SuppressWarnings("serial")
public class SupplierInventory implements Serializable

{
	
	/** The List. */
	protected ArrayList<Ingredient> List;
	
	/** The total cost. */
	double totalCost;

	/**
	 * Instantiates a new supplier inventory.
	 */
	public SupplierInventory() 
	{
		List = new ArrayList<Ingredient>();

	}

	/**
	 * Adds the ingredient.
	 *
	 * @param I the i
	 */
	public void AddIngredient(Ingredient I)
	{
		List.add(I);
	}
	
	/**
	 * Removes the ingredient.
	 *
	 * @param I the i
	 */
	public void RemoveIngredient(Ingredient I)
	{
		List.remove(I);
	}
	
	
	/**
	 * List size.
	 *
	 * @return the int
	 */
	public int ListSize()
	{
		return List.size();
	}
	
	/**
	 * Show list.
	 */
	public void Showlist()
	{
		System.out.println("Suppliers Inventory : ");
		
		for (Ingredient ingredient : List) 
		{
			System.out.println(ingredient.getName());
		}
	}
	
 /**
  * To string.
  *
  * @return the string
  */
 @Override
	public String toString() {
	 
	 	String str  ="\n";
	
		for (Ingredient ingredient : List) 
		{
			str += ingredient.getName() +" | ";;
			
		}
		
		return str;
	}

/**
 * Gets the list.
 *
 * @return the list
 */
ArrayList<Ingredient> getList() {
		return List;
	}

	/**
	 * Sets the list.
	 *
	 * @param list the new list
	 */
	public void setList(ArrayList<Ingredient> list) {
		List = list;
	}

	
	
	
	
	
	
}
