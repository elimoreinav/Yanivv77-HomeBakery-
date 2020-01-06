package Suppliers;
import java.io.Serializable;

import Exceptions.*;


@SuppressWarnings("serial")
public class Supplier implements Serializable
{
	// Variables
	

	/** The company name. */
	public  String companyName;
	
	/** The phone. */
	protected  String phone;
	
	/** The email. */
	protected  String email;
	
	/** The address. */
	protected String address;
	
	/** The Inventory list. */
	protected SupplierInventory InventoryList ;
	
	// Constructor
	
	/**
	 * Instantiates a new supplier.
	 *
	 * @param companyName the company name
	 * @param phone the phone
	 * @param email the email
	 * @param address the address
	 * @param inventoryList the inventory list
	 * @throws IllegalID the illegal ID
	 * @throws IllegalPhone the illegal phone
	 * @throws IllegalEmail the illegal email
	 * @throws IllegalName the illegal name
	 * @throws IllegalAge the illegal age
	 * @throws IllegalAddress the illegal address
	 */
	public Supplier(String companyName, String phone, String email,String address,SupplierInventory inventoryList) throws IllegalID, IllegalPhone, IllegalEmail, IllegalName, IllegalAge , IllegalAddress {
		

		setCompanyName(companyName);
		setPhone(phone);
		setEmail(email);
		setAddress(address);
		InventoryList = inventoryList;
	}
	// Private Methods
	
	/**
	 * Checks if is longer than two chars.
	 *
	 * @param word the word
	 * @return true, if is longer than two chars
	 */
	private boolean isLongerThanTwoChars(String word) {
				
		return word.length() > 2;
				
	}

	

		
	// Getters & Setters
		


		
	/**
	 * Gets the company name.
	 *
	 * @return the company name
	 */
	public String getCompanyName() {
			
		return companyName;
			
	}
	
	/**
	 * Sets the company name.
	 *
	 * @param companyName the new company name
	 * @throws IllegalName the illegal name
	 */
	public void setCompanyName(String companyName) throws IllegalName {
			
		if(isLongerThanTwoChars(companyName))
			this.companyName = companyName;
		else
			throw new IllegalName(companyName);
		
	}

	/**
	 * Gets the phone.
	 *
	 * @return the phone
	 */
	public String getphone() {
			
		return phone;
			
	}
		
	/**
	 * Sets the phone.
	 *
	 * @param phone the new phone
	 * @throws IllegalPhone the illegal phone
	 */
	public void setPhone(String phone) throws IllegalPhone {
		
		if (phone.matches("[0-9]+") && phone.length() > 2)
			this.phone = phone;
		else
			throw new IllegalPhone(phone);
			
		
	}
			
	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail(){
			
		return email;
			
	}
	
	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 * @throws IllegalEmail the illegal email
	 */
	public void setEmail(String email ) throws IllegalEmail {
		
		if(email != null && email.length() != 0 )
			this.email = email;
		else 
			throw new IllegalEmail(email);
	
	}
	
	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress(){
		
		return address;
			
	}
	
	/**
	 * Sets the address.
	 *
	 * @param address the new address
	 * @throws IllegalAddress the illegal address
	 */
	public void setAddress(String address ) throws IllegalAddress {
		
		if(address != null && address.length() != 0 )
		
			this.address = address;
		else 
			throw new IllegalAddress(address);

	}
	
	/**
	 * Gets the list object.
	 *
	 * @return the list object
	 */
	public SupplierInventory getListObject() {
		
		return InventoryList;
	}


	/**
	 * Gets the supplier inventory.
	 *
	 * @return the string
	 */
	public String GetSupplierInventory()
	{
		return InventoryList.toString();
		
	}
	
	
	// toString

	
		
	/**
	 * To string 2.
	 *
	 * @return the string
	 */
	public String toString2() {
		
		return "Suppliers's Details:"
				+ "\n" + "company Name: " + companyName 
				+ "\n" + "phone: " + phone
				+ "\n" + "email: " + email
				+ "\n" + "address: " + address
				+ "\n" + "Inventory: " + InventoryList.toString()+ "\n";}
		
		
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "companyName " + companyName + ", phone " + phone + ", email " + email + ", address " + address+ ", InventoryList " + InventoryList ;}

	
	
			
	
	
	
	
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

		

	

