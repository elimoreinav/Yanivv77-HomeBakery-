package App;


import java.io.IOException;
import java.util.Scanner;
import Clients.*;
import Exceptions.*;
import Manager.*;
import Orders.*;
import Orders.QueueOrdersClient;
import Products.*;
import Suppliers.*;
import TypesOfProducts_Enum.*;


public class Main {
	

	//Manager
	static Manager Admin; 

	//Prouducts sold in the confectionery
	static Cake ChocolateCake;
	static Cookie ChocolateChipCookies;
	static Pastry ChocolateCroissants;

	
	//Ingredients used in the confectionery to make prouducts 
	static Ingredient Sugar; 
	static Ingredient wheat; 
	static Ingredient Chocolate; 
	static Ingredient Egg;
	static Ingredient BakingSoda;
	
	
	//list of Inventorys
	static SupplierInventory lehemInventory;
	static SupplierInventory hugiyotInventory;
	
	
	//Suppliers of Ingredient 
	static Supplier  lehem;
	static Supplier  hugiyot;
	static Supplier  Supplier3;
	static Supplier  Supplier4;
	static Supplier  Supplier5;
	
	// List of Ingredients in order from the supplier
	static ArrayListIngredients OrderS1List;
	
	//Orders of Ingredients from suppliers to the confectionery
	static OrdersFromSupplier OrderS1;
	static OrdersFromSupplier OrderS2;
	
	//lists of orders form suppliers
	static QueueOrdersSupplier AllSupplierOrders;

	
	//lists of Ingredients to make products
	static ArrayListIngredients ChocolateCakeList;
	static ArrayListIngredients PretzelsList;
	
	
	//Clients of the confectionery
	static Client avi;
	static Client beni;
	static Client meni;
	static Client leni;
	static Client levi;
	
	
	//Prdouct list 
	static ArrayListProducts ProductList1;
	static ArrayListProducts ProductList2;
	
	//Orders made by Clients 
	static ClientOrders OrderC1;
	static ClientOrders OrderC2;
	
	//lists of orders form suppliers
	static QueueOrdersClient AllClientOrders;
	
	static Scanner in = new Scanner(System.in);
	
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws IllegalNumberInput the illegal number input
	 * @throws IllegalID the illegal ID
	 * @throws IllegalPhone the illegal phone
	 * @throws IllegalEmail the illegal email
	 * @throws IllegalName the illegal name
	 * @throws IllegalAge the illegal age
	 * @throws IllegalAddress the illegal address
	 * @throws IllegalRecipeInput the illegal recipe input
	 * @throws IllegalGender the illegal gender
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws ClassNotFoundException the class not found exception
	 */

	public static void main(String[] args) throws IllegalNumberInput, IllegalID, IllegalPhone, IllegalEmail, IllegalName, IllegalAge, IllegalAddress, IllegalRecipeInput, IllegalGender, IOException, ClassNotFoundException 
	{
		
		try {

	/// example of SupplierInventory
	 
	try {
		
	Admin = new Manager(312338213,"Admin", "Admin");
		
	 lehemInventory = new SupplierInventory();
	 lehemInventory.AddIngredient(new Ingredient("Whole wheat flour"));
	 
	//----------------------	 
	//--------- example wrong input
	//	 lehemInventory.AddIngredient(new Ingredient("2545"));
	//----------------------		 

	 lehemInventory.AddIngredient(new Ingredient("Bread flour"));
	 lehemInventory.AddIngredient(new Ingredient("Cake flour"));
	 lehemInventory.AddIngredient(new Ingredient("Pastry flour"));
	 
	 hugiyotInventory = new SupplierInventory();
	 hugiyotInventory.AddIngredient(new Ingredient("Chocolate chips"));
	 hugiyotInventory.AddIngredient(new Ingredient("Peanut"));
	 hugiyotInventory.AddIngredient(new Ingredient("Almond butter"));
	 hugiyotInventory.AddIngredient(new Ingredient("Sprinkles"));
	 hugiyotInventory.AddIngredient(new Ingredient("Crystalized ginger"));
	 
	}  catch (IllegalName e ){
		System.out.println("Enter currect name of the ingredent. name must be more then 2 latters");
		String ingredientName = in.nextLine();
		lehemInventory.AddIngredient(new Ingredient(ingredientName));
		
    }
	

	 //------------------------------------------------------------------
	 //	1 example - SupplierInventory check
	 //lehemInventory.Showlist();
	 //or
	 //	System.out.println(lehemInventory);
	 //------------------------------------------------------------------	
	 
	 
	 
	 lehem = new Supplier ("lehem", "058555111", "lehem@gmail.com", "haifa lehem 5", lehemInventory);
	 hugiyot = new Supplier ("hugiyot","058541133", "hugiyot@gmail.com", "wonderland sweettooth 5", hugiyotInventory); 
	 Supplier3 = new Supplier ("Supplier3","058541111", "Supplier3@gmail.com", "wonderland sweettooth 5", hugiyotInventory); 
	 Supplier4 = new Supplier ("Supplier4","058541222", "Supplier4@gmail.com", "wonderland sweettooth 5", hugiyotInventory); 
	 Supplier5 = new Supplier ("Supplier5","058541333", "Suppliers@gmail.com", "wonderland sweettooth 5", hugiyotInventory); 

	 //------------------------------------------------------------------	
	 //	2 example - Suppliers check
	 //	System.out.println(lehem);	
	 //------------------------------------------------------------------	
	 
	 
	 
	 Sugar = new Ingredient("Granulated sugar", 2000, 0.5);
	 wheat = new Ingredient("Whole grain flour", 3000, 1);
	 Chocolate = new Ingredient("Chocolate bar", 800, 4);
	 Egg = new Ingredient("Egg", 800, 4);
	 BakingSoda = new Ingredient("Baking Soda", 800, 4);
	 
	 
	 //------------------------------------------------------------------	
	 //	3 example - Ingredient check
	 //	System.out.println(Sugar);	
	 //------------------------------------------------------------------	
	
	 
	 //Ingredients ordered from supplier
	 OrderS1List = new ArrayListIngredients();
	 OrderS1List.AddIngredient(Sugar);
	 OrderS1List.AddIngredient(wheat);
	 OrderS1List.AddIngredient(Chocolate);
	 
	 //------------------------------------------------------------------	
	 //	4 example - Ingredients list check
	 // OrderS1List.Showlist();
	 //------------------------------------------------------------------	
	 
	 OrderS1 = new OrdersFromSupplier(7, lehem , OrderS1List);
	 OrderS2 = new OrdersFromSupplier(8, hugiyot, OrderS1List);
	 
	 //------------------------------------------------------------------	
	 //	5 example - Order From Suppliers check
	 // System.out.println(OrderS1);
	 //------------------------------------------------------------------	
	 
	 AllSupplierOrders = new QueueOrdersSupplier();
	 AllSupplierOrders.AddOrder(OrderS1);
	 AllSupplierOrders.AddOrder(OrderS2);
			 
	 //------------------------------------------------------------------	
	 //	6 example - All the orders form suppliers
	 //System.out.println(AllSupplierOrders.toString());
	 //------------------------------------------------------------------
	 

	//Ingredients to make a cake
	
	 Sugar = new Ingredient("Granulated sugar", 150, 0.5);
	 wheat = new Ingredient("Whole grain flour", 800, 1);
	 Chocolate = new Ingredient("Chocolate bar", 600, 4);
	 
	 ChocolateCakeList = new ArrayListIngredients();
	 ChocolateCakeList.AddIngredient(Sugar);
	 ChocolateCakeList.AddIngredient(wheat);
	 ChocolateCakeList.AddIngredient(Chocolate);
	 
	 //------------------------------------------------------------------	
	 //	7 example -  Ingredients list of product
	 //	System.out.println(ChocolateCakeList.toString());
	 //------------------------------------------------------------------	
	 

	Cake ChocolateCake = new Cake("ChocolateCake", 240, 70, ChocolateCakeList, TypeOfCakes.Chocolate_Cake, "Put sugar wheat and melted chocolate toghere in a bowl mix everything with a mixer after heavy mixing put the dough on a tray and heat it in the oven for 20 mins on 180C " );
	Pastry Pretzels = new Pastry("Pretzels", 50, 90, ChocolateCakeList, TypesOfPastries.Pretzels, "put sugar with more sugar and alot of sweet sugar and milk and put it in the oven " );
	
	
	 //------------------------------------------------------------------	
	 //	8 example -  Product check
	 //System.out.println(ChocolateCake.toString());
	 //------------------------------------------------------------------	

	avi = new Client("312338213", "Avi", "Zhomir", "123456789", "avi77@gmail.com", "25", "Male", "Hemek Hamominim 74"); 
	beni = new Client("312338213", "Beni", "Beni", "123456789", "avi77@gmail.com", "25", "Male", "Hemek Hamominim 74"); 
	meni = new Client("312338213", "Neni", "Meni", "123456789", "avi77@gmail.com", "25", "Male", "Hemek Hamominim 74"); 
	leni = new Client("312338213", "Leni", "Zhomir", "123456789", "avi77@gmail.com", "25", "Male", "Hemek Hamominim 74"); 
	levi = new Client("312338213", "Levi", "Zhomir", "123456789", "avi77@gmail.com", "25", "Male", "Hemek Hamominim 74");
	
	 //------------------------------------------------------------------	
	 //9 example -  Client check
//	 System.out.println(avi.toString());
	 //------------------------------------------------------------------	
	 
	 
	 ProductList1 = new ArrayListProducts();
	 ProductList1.AddProduct(ChocolateCake,2);
	 ProductList1.AddProduct(Pretzels,6);
	 
	 ProductList2 = new ArrayListProducts();
	 ProductList2.AddProduct(Pretzels,3);
	 
	 
	 //------------------------------------------------------------------	
	 //10 example -  Product List check
	//System.out.println(ProductList1.toString());
	 //------------------------------------------------------------------
	 
	 OrderC1 = new ClientOrders(3, avi, ProductList1);
	 OrderC2 = new ClientOrders(5,avi,ProductList2);
	 
	 //------------------------------------------------------------------	
	 //11 example -  Order from Client check
	 //System.out.println(OrderC1.toString());
	 //------------------------------------------------------------------	
	 
	 
	 AllClientOrders = new  QueueOrdersClient();
	 AllClientOrders.AddOrder(OrderC1);
	 AllClientOrders.AddOrder(OrderC2);
	 
	 //------------------------------------------------------------------	
	 //12 example -  Order from Client check
	 //System.out.println(AllClientOrders.toString());
	 //------------------------------------------------------------------	
	 
	 FileManagment.CreateSer();
	 FileManagment.SerAdd(avi);
	 FileManagment.SerAdd(avi);
	 FileManagment.SerAdd(avi);
	 FileManagment.SerAdd(lehem);
	 FileManagment.SerAdd(lehem);
	 FileManagment.SerAdd(lehem);
	 FileManagment.SerAdd(lehem);
	 FileManagment.SerAdd(Sugar);
	 FileManagment.SerAdd(ChocolateCake);
	 FileManagment.SerAdd(Sugar);
	 FileManagment.SerAdd(ChocolateCake);
	 FileManagment.SerAdd(Sugar);
	 FileManagment.SerAdd(ChocolateCake);
	 
	 
	 
	 

	 FileManagment.readClients();
	 FileManagment.readSuppliers();


	 


    


	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
		
	 
	//IllegalNumberInput, IllegalID, IllegalPhone, IllegalEmail, IllegalName, IllegalAge, IllegalAddress, IllegalRecipeInput, IllegalGender 
	 
	} catch (IllegalPhone e) {
		System.err.println(e);
	} catch (IllegalID e) {
		System.err.println(e);
	} catch (IllegalNumberInput e) {
		System.err.println(e);
	} catch (IllegalName e) {
		System.err.println(e);
	} catch (IllegalGender e){
		System.out.println(e);
	} catch (IllegalAge e) {
		System.out.println(e);	
	} catch (IllegalEmail e) {
		System.out.println(e);	
	} catch (IllegalAddress e) {
		System.out.println(e);	
	} catch (IllegalRecipeInput e) {
		System.out.println(e);	
		
		
		
		

		}
	}
}
		
		

		
	


				

	
	
	
	
	
	
	
	
	
	



