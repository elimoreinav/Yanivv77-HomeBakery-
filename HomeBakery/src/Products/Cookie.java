package Products;
import Exceptions.*;
import TypesOfProducts_Enum.TypeOfCookies;


@SuppressWarnings("serial")
public class Cookie extends Product
{
	
	/** The Cookie type. */
	TypeOfCookies CookieType;
	
	/**
	 * Instantiates a new cookie.
	 *
	 * @param name the name
	 * @param price the price
	 * @param WeightInGrams the weight in grams
	 * @param ingredientsList the ingredients list
	 * @param cookieType the cookie type
	 * @param recipe the recipe
	 * @throws IllegalName the illegal name
	 * @throws IllegalNumberInput the illegal number input
	 * @throws IllegalRecipeInput the illegal recipe input
	 */
	public Cookie(String name, int price,int WeightInGrams, ArrayListIngredients  ingredientsList, TypeOfCookies cookieType ,String recipe) throws IllegalName, IllegalNumberInput, IllegalRecipeInput
			 {
		super(name, price, WeightInGrams, ingredientsList, recipe);
		CookieType = cookieType;
	}

	/**
	 * Gets the cookie type.
	 *
	 * @return the cookie type
	 */
	public TypeOfCookies getCookieType() {
		return CookieType;
	}

	/**
	 * Sets the cookie type.
	 *
	 * @param cookieType the new cookie type
	 */
	public void setCookieType(TypeOfCookies cookieType) {
		CookieType = cookieType;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return super.toString()+ "\n"+"\n"+ "CookieType: "+CookieType;
		 
	}
	

	
	
	
}
