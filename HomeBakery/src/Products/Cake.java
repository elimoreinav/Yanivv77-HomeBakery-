package Products;
import Exceptions.*;
import TypesOfProducts_Enum.TypeOfCakes;


@SuppressWarnings("serial")
public class Cake extends Product
{
	
	/** The Cake type. */
	//cakes extends products
	TypeOfCakes CakeType;

	/**
	 * Instantiates a new cake.
	 *
	 * @param name the name
	 * @param price the price
	 * @param WeightInGrams the weight in grams
	 * @param ingredientsList the ingredients list
	 * @param cakeType the cake type
	 * @param recipe the recipe
	 * @throws IllegalName the illegal name
	 * @throws IllegalNumberInput the illegal number input
	 * @throws IllegalRecipeInput the illegal recipe input
	 */
	public Cake(String name, int price,int WeightInGrams, ArrayListIngredients  ingredientsList, TypeOfCakes cakeType,String recipe) throws IllegalName, IllegalNumberInput, IllegalRecipeInput{
		super(name, price, price, ingredientsList, recipe);
		CakeType = cakeType;
	}

	/**
	 * Gets the cake type.
	 *
	 * @return the cake type
	 */
	public TypeOfCakes getCakeType() {
		return CakeType;
	}

	/**
	 * Sets the cake type.
	 *
	 * @param cakeType the new cake type
	 */
	public void setCakeType(TypeOfCakes cakeType) {
		CakeType = cakeType;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return super.toString()+"CakeType: "+CakeType;
		
	}

}
