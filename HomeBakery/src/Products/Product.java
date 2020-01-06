package Products;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import Exceptions.*;


@SuppressWarnings("serial")
public abstract class Product implements Serializable{

	
	/** The count. */
	public static int count=0; // count number of products
	
	/** The Name. */
	protected String Name; // the name of the product
	
	/** The Sn. */
	protected int Sn; // the serial number of the product 
	

	/** The now. */
	protected Date now = new Date(); // get date of addition
	
	/** The addition date. */
	protected String additionDate; // the addtion date of the product
	
	
	
	/** The Price. */
	protected int Price; // the price of the product
	
	/** The Ingredients list. */
	protected ArrayListIngredients  IngredientsList; // array of ingredients of the product
	
	/** The Recipe. */
	protected String Recipe; // how to make the product
	
	/** The Ingredients cost. */
	protected int IngredientsCost; //the total cost of the ingredients that makes the product 
	
	/** The Weight in grams. */
	protected int WeightInGrams; // the weight of the products in grams
	
	
	/**
	 * Instantiates a new product.
	 *
	 * @param name the name
	 * @param price the price
	 * @param WeightInGrams the weight in grams
	 * @param ingredientsList the ingredients list
	 * @param recipe the recipe
	 * @throws IllegalName the illegal name
	 * @throws IllegalNumberInput the illegal number input
	 * @throws IllegalRecipeInput the illegal recipe input
	 */
	//constractor
	public Product(String name, int price,int WeightInGrams, ArrayListIngredients  ingredientsList ,String recipe) throws IllegalName, IllegalNumberInput, IllegalRecipeInput 
			
	{
		count++; // 1+ to sn for every new product
		this.Sn=count; //uniqe sn for each product 
		additionDate = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH).format(now);// addtion date of the product
		setName(name); // name of the product
		setPrice(price); // price of the product
		IngredientsList = ingredientsList; // list of product ingredients
		IngredientsCost = IngredientsCost(); // total Ingredients cost to make the product
		setRecipe(recipe);
		setWeightInGrams(WeightInGrams);
	}
		
	/**
	 * Gets the count.
	 *
	 * @return the count
	 */
	//getters	
	public static int getCount() {
		return count;
	}
	
	/**
	 * Gets the now.
	 *
	 * @return the now
	 */
	public Date getNow() {
		return now;
	}
	
	/**
	 * Gets the addition date.
	 *
	 * @return the addition date
	 */
	public String getAdditionDate() {
		return additionDate;
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
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	
	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public int getPrice() {
		return Price;
	}
	
	/**
	 * Gets the ingredients list.
	 *
	 * @return the ingredients list
	 */
	public ArrayListIngredients getIngredientsList() {
		return IngredientsList;
	}
	
	/**
	 * Gets the recipe.
	 *
	 * @return the recipe
	 */
	public String getRecipe() {
		return Recipe;
	}
	
	/**
	 * Gets the weight in grams.
	 *
	 * @return the weight in grams
	 */
	public int getWeightInGrams() {
		return WeightInGrams;
	}
	
	/**
	 * Gets the ingredients cost.
	 *
	 * @return the ingredients cost
	 */
	public int getIngredientsCost() 
	{
		return IngredientsCost;
		
		
	}
	
	
	//setters
	
	
	//name sould be letters only
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 * @throws IllegalName the illegal name
	 */
	// name should be only letters
	public void setName(String name) throws IllegalName {
		if ( name.matches("^[a-zA-Z\\s]+") && isLongerThanTwoChars(name))
			Name = name;
		else
			throw new  IllegalName(name);
	
	}
	
	/**
	 * Checks if is longer than two chars.
	 *
	 * @param word the word
	 * @return true, if is longer than two chars
	 */
	private boolean isLongerThanTwoChars(String word) {
		
		return word.length() > 2;
		
	}
	
	//price sould be digits only
	/**
	 * Sets the price.
	 *
	 * @param price the new price
	 * @throws IllegalNumberInput the illegal number input
	 */
	//Postive numbers only
	public void setPrice(int price) throws IllegalNumberInput
	{
		if (price > 0)
		Price = price;
		else
			throw new IllegalNumberInput(price);
	}
	

	
	
	/**
	 * Sets the ingredients list.
	 *
	 * @param ingredientsList the new ingredients list
	 */
	public void setIngredientsList(ArrayListIngredients ingredientsList) 
	{
		IngredientsList = ingredientsList;
	}
	

	/**
	 * Sets the recipe.
	 *
	 * @param recipe the new recipe
	 * @throws IllegalRecipeInput the illegal recipe input
	 */
	//Recipe lenth should be atlest 40 words
	public void setRecipe(String recipe) throws IllegalRecipeInput
	{
		if (recipe.length()>40) 
		Recipe = recipe;
		else
			throw new IllegalRecipeInput();
	}

	
	/**
	 * Sets the weight in grams.
	 *
	 * @param weightInGrams the new weight in grams
	 * @throws IllegalNumberInput the illegal number input
	 */
	//Weight sould be digits only
	public void setWeightInGrams(int weightInGrams) throws IllegalNumberInput {
		if (weightInGrams > 0)
			WeightInGrams = weightInGrams;
			else
				throw new IllegalNumberInput(weightInGrams);
		
	}
	
	
	/**
	 * Ingredients cost.
	 *
	 * @return the int
	 */
	//total cost of Ingredients
	public int IngredientsCost() 
	{
		return IngredientsList.Totalcost();
	}


	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		
		return "\n"+"\n"+getClass().getSimpleName() + "'s Details:"
				+ "\n"+"Name: " + Name 
				+ "\n" + "Sn: " + Sn 
				+ "\n" + "additionDate: " + additionDate
				+ "\n" + "Price: " + Price
				+ "\n" + "IngredientsList { " + IngredientsList.toStringfull() +" }"
				+ "\n" + "recipe: " + Recipe
				+ "\n" + "IngredientsCost: " + IngredientsCost
				+ "\n" + "WeightInGrams: " + WeightInGrams + "\n"; 
				
	}
	

	
	


	
	
	
	
	
}