package Products;
import Exceptions.*;
import TypesOfProducts_Enum.TypesOfPastries;


@SuppressWarnings("serial")
public class Pastry extends Product
{
	
	/** The Pastry type. */
	TypesOfPastries PastryType;
	
	
	/**
	 * Instantiates a new pastry.
	 *
	 * @param name the name
	 * @param price the price
	 * @param WeightInGrams the weight in grams
	 * @param ingredientsList the ingredients list
	 * @param pastryType the pastry type
	 * @param recipe the recipe
	 * @throws IllegalName the illegal name
	 * @throws IllegalNumberInput the illegal number input
	 * @throws IllegalRecipeInput the illegal recipe input
	 */
	public Pastry(String name, int price,int WeightInGrams,ArrayListIngredients  ingredientsList, TypesOfPastries pastryType ,String recipe) throws IllegalName, IllegalNumberInput, IllegalRecipeInput{
		super(name, price, WeightInGrams, ingredientsList, recipe);
		setPastryType(PastryType);
		
	}


	/**
	 * Gets the pastry type.
	 *
	 * @return the pastry type
	 */
	public TypesOfPastries getPastryType() {
		return PastryType;
	}


	/**
	 * Sets the pastry type.
	 *
	 * @param pastryType the new pastry type
	 */
	public void setPastryType(TypesOfPastries pastryType) {
		PastryType = pastryType;
	}

	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return super.toString()+ "PastryType: "+PastryType;
		
	}
	
	
	
}
