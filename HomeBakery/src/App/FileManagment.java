package App;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import Clients.Client;
import Products.Ingredient;
import Products.Product;
import Suppliers.Supplier;

// TODO: Auto-generated Javadoc
/**
 * The Class FileManagment.
 */
public class FileManagment 
{
	
	/** The c. */
	static ObjectOutputStream  c;
	
	/** The s. */
	static ObjectOutputStream  s;
	
	/** The p. */
	static ObjectOutputStream  p;
	
	/** The i. */
	static ObjectOutputStream  i;
	
	/** The c 2. */
	static ObjectInputStream  c2;
	
	/** The s 2. */
	static ObjectInputStream  s2;
	
	/** The p 2. */
	static ObjectInputStream  p2;
	
	/** The i 2. */
	static ObjectInputStream  i2;
	
	
	   /**
   	 * Creates the ser.
   	 */
   	public static void  CreateSer() 
	   {
		    @SuppressWarnings("unused")
			ObjectOutputStream output;
		   
	      try 
	      {
	         c = new ObjectOutputStream(Files.newOutputStream(Paths.get("SerFiles/Clients.ser")));
	         s = new ObjectOutputStream(Files.newOutputStream(Paths.get("SerFiles/Suppliers.ser")));
	         p = new ObjectOutputStream(Files.newOutputStream(Paths.get("SerFiles/Products.ser")));
	         i = new ObjectOutputStream(Files.newOutputStream(Paths.get("SerFiles/Ingredients.ser")));
	            
	      }
	      catch (IOException ioException)
	      {
	         System.err.println("Error opening file. Terminating.");
	         System.exit(1); // terminate the program
	      } 
	   } 
	 
	 
	 /**
 	 * Ser add.
 	 *
 	 * @param T the t
 	 */
 	public static void SerAdd(Object T)   {
		 	    
		  try {
			  

		  if ( T instanceof Client) // work
		  {
			  c.writeObject(T);
		  }
		  
		  else if (T instanceof Supplier)  
		  {

			  s.writeObject(T);

		  }
		  
		  else if ( T instanceof Product)
		  {

			  p.writeObject(T);

		  }
		  
		  else if ( T instanceof Ingredient)
		  {

			  i.writeObject(T);

		  }
		  else {
			  System.out.println(T.getClass().getName() );
			  throw new Error("Bad Object");
		  }
		  
		  
		  
		  } catch (FileNotFoundException e) {
			System.out.println("File not found");
		 } catch (IOException e) {
		 	System.out.println("Error initializing stream");
		 } catch (Exception e) {
			System.out.println(e);
		}
			
	 }
	 
	 
	 

	 
	   /**
   	 * Read clients.
   	 */
   	public static void readClients()
	   {
		   
	      try 
	      {
	    	 c2 =  new ObjectInputStream(Files.newInputStream(Paths.get("SerFiles/Clients.ser")));
	         while (true) // loop until there is an EOFException
	         {
	        	
	            Client client1 = (Client) c2.readObject();
	            System.out.println(client1.toString2());
	            
	         }
	        }
	            
	      catch (EOFException endOfFileException) {System.out.printf("");} 
	      catch (ClassNotFoundException classNotFoundException) {System.err.println("Invalid object type. Terminating.");} 
	      catch (IOException ioException) {	System.err.println("Error reading from file. Terminating.");} }
//	   
	   
	   /**
 * Read suppliers.
 */
public static void readSuppliers()
	   {
	      try 
	      {
	    	  s2 =  new ObjectInputStream(Files.newInputStream(Paths.get("SerFiles/Suppliers.ser")));
	    	 
	         while (true) // loop until there is an EOFException
	         {
	        	
	        	Supplier Supplier1 = (Supplier) s2.readObject();
	        	System.out.println(Supplier1.toString2());
	        	
	         ;}}
	            
	      catch (EOFException endOfFileException) {System.out.printf("");} 
	      catch (ClassNotFoundException classNotFoundException) {System.err.println("Invalid object type. Terminating.");} 
	      catch (IOException ioException) {	System.err.println("Error reading from file. Terminating.");} }
	   
	   
	   /**
   	 * Read products.
   	 */
   	public static void readProducts()
	   {
	      try 
	      {
	    	 p2 =  new ObjectInputStream(Files.newInputStream(Paths.get("SerFiles/Products.ser")));
	         while (true) // loop until there is an EOFException
	         {
	     
	        	Product Product1 = (Product) p2.readObject();
	            System.out.println(Product1.toString());
	         ;}}
	            
	      catch (EOFException endOfFileException) {System.out.printf(" ");} 
	      catch (ClassNotFoundException classNotFoundException) {System.err.println("Invalid object type. Terminating.");} 
	      catch (IOException ioException) {	System.err.println("Error reading from file. Terminating.");} }
	   
	   /**
   	 * Read ingredients.
   	 */
   	public static void readIngredients()
	   {
	      try 
	      {
	    	 i2 =  new ObjectInputStream(Files.newInputStream(Paths.get("SerFiles/Ingredients.ser")));
	         while (true) // loop until there is an EOFException
	         {
	        	 Ingredient Ingredient1 = (Ingredient) i2.readObject();
	        	 System.out.println(Ingredient1.toString());
	         ;}}
	            
	      catch (EOFException endOfFileException) {System.out.printf(" ");} 
	      catch (ClassNotFoundException classNotFoundException) {System.err.println("Invalid object type. Terminating.");} 
	      catch (IOException ioException) {	System.err.println("Error reading from file. Terminating.");} }
	   
	   
	   
	      
 
	   /**
   	 * Read data.
   	 */
   	public static void readData()
	   {
		   readClients();
		   readSuppliers();
		   readProducts();
		   readIngredients();
	   }
	   
	   
	   
	   
	   
	   
}




	 

