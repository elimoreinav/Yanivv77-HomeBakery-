package Products;
import java.io.Serializable;
import java.util.ArrayList;


@SuppressWarnings("serial")
public class ArrayListIngredients implements Serializable

{
	
	/** The List. */
	protected ArrayList<Ingredient> List;
	
	/** The total cost. */
	double totalCost;

	/**
	 * Instantiates a new array list ingredients.
	 */
	public ArrayListIngredients() 
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
	 * Showlist.
	 */
	public void Showlist()
	{
		for (Ingredient ingredient : List) 
		{
			System.out.println(ingredient);
		}
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		 
	 	String str  ="\n";
	
		for (Ingredient ingredient : List) 
		{
			str += ingredient.Name +" | ";;
			
		}
		
		return str;
	}
	
	/**
	 * To stringfull.
	 *
	 * @return the string
	 */
	public String toStringfull() {
		 
	 	String str  ="\n";
	
		for (Ingredient ingredient : List) 
		{
			str += ingredient +" | \n";;
			
		}
		
		return str;
	}
	
	
	/**
	 * Totalcost.
	 *
	 * @return the int
	 */
	public int Totalcost() 
	{
		int IngredientsCost = 0;
		for (Ingredient  ingredients : this.List) 
		{
			IngredientsCost += ingredients.Totalcost;
		}
		
		return IngredientsCost;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * Gets the list.
	 *
	 * @return the list
	 */
	public ArrayList<Ingredient> getList() {
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
