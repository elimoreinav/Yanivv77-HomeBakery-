package Clients;
import java.io.Serializable;
import Exceptions.* ;

@SuppressWarnings("serial")
public class Client implements Serializable
{
	// Variables
	
	/** The id. */
	private String id; 
	
	/** The first name. */
	private String firstName;
	
	/** The last name. */
	private String lastName;
	
	/** The phone. */
	private String phone;
	
	/** The email. */
	private String email;
	
	/** The age. */
	private String age;
	
	/** The address. */
	private String address;
	
	
	/** The gender. */
	private String gender; 
	
	
	// Constructor
	
	/**
	 * Instantiates a new client.
	 *
	 * @param id the id
	 * @param firstName the first name
	 * @param lastName the last name
	 * @param phone the phone
	 * @param email the email
	 * @param age the age
	 * @param gender the gender
	 * @param address the address
	 * @throws IllegalID the illegal ID
	 * @throws IllegalPhone the illegal phone
	 * @throws IllegalEmail the illegal email
	 * @throws IllegalName the illegal name
	 * @throws IllegalAge the illegal age
	 * @throws IllegalAddress the illegal address
	 * @throws IllegalGender the illegal gender
	 */
	public Client(String id, String firstName, String lastName, String phone, String email,String age,String gender,String address) throws IllegalID, IllegalPhone, IllegalEmail, IllegalName,IllegalAge , IllegalAddress, IllegalGender {
			
		setId(id);
		setFirstName(firstName);
		setLastName(lastName);
		setPhone(phone);
		setEmail(email);
		setAge(age);
		setGender(gender);
		setAddress(address);
			
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

	/**
	 * Only alphabet.
	 *
	 * @param str the str
	 * @return true, if successful
	 */
	private boolean OnlyAlphabet(String str) {
			
		return str.matches("[A-Z][a-z\\s]+");
			
	}
		
	// Getters & Setters
		
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
			
		return id;
			
	}
		
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 * @throws IllegalID the illegal ID
	 */
	public void setId(String id) throws IllegalID {
			
		if((id.matches("[0-9]+") && id.length() == 9))  
			this.id = id;
		else
			throw new IllegalID(id);
		
		
	}
		
	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
			
		return firstName; 
			
	}
	
	/**
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 * @throws IllegalName the illegal name
	 */
	public void setFirstName(String firstName) throws IllegalName {
			
		if(OnlyAlphabet(firstName) && isLongerThanTwoChars(firstName))
			this.firstName = firstName;
		else
			throw new IllegalName(firstName);
		
	}
	
	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
			
		return lastName;
			
	}
		
	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 * @throws IllegalName the illegal name
	 */
	public void setLastName(String lastName) throws IllegalName {
			
		if(OnlyAlphabet(lastName) && isLongerThanTwoChars(lastName))
			
			this.lastName = lastName;
		
		else
			throw new IllegalName(lastName);
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
			
		if ((id.matches("[0-9]+") && id.length() == 9))
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
	 * Gets the age.
	 *
	 * @return the age
	 */
	public String getAge(){
		
		return age;
			
	}
	
	/**
	 * Sets the age.
	 *
	 * @param age the new age
	 * @throws IllegalAge the illegal age
	 */
	public void setAge(String age) throws IllegalAge {
		
		if((age.matches("[0-9]+") && age.length() == 2))
			this.age = age;
		else 
			throw new IllegalAge(age);
	
	}
	
	/**
	 * Gets the gender.
	 *
	 * @return the gender
	 */
	public String getGender(){
		
		return gender;
			
	}
	
	/**
	 * Sets the gender.
	 *
	 * @param gender the new gender
	 * @return 
	 * @throws IllegalGender the illegal gender
	 */
	public String setGender(String gender) throws IllegalGender{
		if (gender.equals("male") || gender.equals("Male"))
			return "Male";
		if(gender.equals("female") || gender.equals("Female"))
			return "Female";
		else 
			throw new IllegalGender(gender);
	
        
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
		
		if(address.length() != 0 )
		
			this.address = address;
		else 
			throw new IllegalAddress(address);

}
	
	
	
	/**
	 * Equals.
	 *
	 * @param client the client
	 * @return true, if successful
	 */
	public boolean equals(Client client) {
		
		return client.id == this.id;
			
	}	
	// toString
		
	/**
	 * To string 2.
	 *
	 * @return the string
	 */
	public String toString2() {
		
		return "Client's Details:"
				+ "\n"+"Id: " + id  
				+ "\n" + "First Name: " + firstName 
				+ "\n" + "Last Name: " + lastName 
				+ "\n" + "phone: " + phone
				+ "\n" + "email: " + email
				+ "\n" + "age: " + age
				+ "\n" + "gender: " + gender
				+ "\n" + "address: " + address+ "\n";
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	
	public String toString() {
		return "Client id " + id + ", firstName " + firstName + ", lastName " + lastName + ", phone " + phone
				+ ", email " + email + ", age " + age + ", address " + address + ", gender " + gender ;
	}

		
	
}


	

