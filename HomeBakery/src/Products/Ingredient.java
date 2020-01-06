package Products;
import java.io.Serializable;

import Exceptions.*;


@SuppressWarnings("serial")
public class Ingredient implements Serializable 
{
	
	/** The Name. */
	protected String Name; // Name of the ingredient
	
	/** The Amout needed in grams. */
	protected double AmoutNeededInGrams;// The amount needed for the product
	
	/** The Cost for 100 gram. */
	protected double CostFor100Gram ; // The cost of the ingredient in the product
	
	/** The Totalcost. */
	protected double Totalcost ; // cost of the ingredient in this product
	
	
	/**
	 * Instantiates a new ingredient.
	 *
	 * @param name the name
	 * @param amoutNeededInGrams the amount needed in grams
	 * @param CostFor100Gram the cost for 100 gram
	 * @throws IllegalNumberInput the illegal number input
	 * @throws IllegalName the illegal name
	 */
	public Ingredient(String name, int amoutNeededInGrams, double CostFor100Gram) throws IllegalNumberInput, IllegalName {

		setName(name); // name of the Ingredient
		setAmoutNeededInGrams(amoutNeededInGrams); // the amout needed in the product
		setCost(CostFor100Gram);
		Totalcost = ((amoutNeededInGrams/100)*CostFor100Gram); // the cost of Ingredient in this product
	}
	
	/**
	 * Instantiates a new ingredient.
	 *
	 * @param name the name
	 * @throws IllegalNumberInput the illegal number input
	 * @throws IllegalName the illegal name
	 */
	public Ingredient(String name) throws IllegalNumberInput, IllegalName {

		setName(name); // name of the Ingredient // the amout needed in the product
		
	}
	
	
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	//getters
	public String getName() {
		return Name;
	}

	/**
	 * Gets the amout needed in grams.
	 *
	 * @return the amout needed in grams
	 */
	public double getAmoutNeededInGrams() {
		return AmoutNeededInGrams;
	}

	/**
	 * Gets the cost.
	 *
	 * @return the cost
	 */
	public double getCost() {
		return CostFor100Gram;
	}


	/**
	 * Gets the totalcost.
	 *
	 * @return the totalcost
	 */
	public double getTotalcost() {
		return Totalcost;
	}

	
	
	//setters
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 * @throws IllegalName the illegal name
	 */
	// name should be only letters
	public void setName(String name) throws IllegalName {
		if (name.matches("^[a-zA-Z\\s]+")  && isLongerThanTwoChars(name))
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
	
	
	

	/**
	 * Sets the amout needed in grams.
	 *
	 * @param amoutNeededInGrams the new amout needed in grams
	 * @throws IllegalNumberInput the illegal number input
	 */
	// amount should be only Digits
	public void setAmoutNeededInGrams(double amoutNeededInGrams) throws IllegalNumberInput
	{
		if (amoutNeededInGrams>0)
		AmoutNeededInGrams = amoutNeededInGrams;
		else
			throw new  IllegalNumberInput(amoutNeededInGrams);
	}

	/**
	 * Sets the cost.
	 *
	 * @param costFor100Gram the new cost
	 * @throws IllegalNumberInput the illegal number input
	 */
	// cost should be only Digits
	public void setCost(double costFor100Gram) throws IllegalNumberInput {
		if(costFor100Gram>0)
		CostFor100Gram = costFor100Gram;
		else
			throw new  IllegalNumberInput(costFor100Gram);
	}




	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		
		return "\n"+"Ingredient's Details:"
				+ "\n" + "Name: " + Name
				+ "\n" + "Amout Needed In Grams: " + AmoutNeededInGrams
				+ "\n" + "Cost For 100 Gram: " + CostFor100Gram
				+ "\n" + "Total cost: " + Totalcost  ;
	}
		
		
		
		
		
		
	


	
	
	
	
	
	

	
}
