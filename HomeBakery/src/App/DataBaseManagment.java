package App;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

import Clients.Client;
import Exceptions.IllegalAddress;
import Exceptions.IllegalAge;
import Exceptions.IllegalEmail;
import Exceptions.IllegalGender;
import Exceptions.IllegalID;
import Exceptions.IllegalName;
import Exceptions.IllegalPhone;

public class DataBaseManagment 
{
	

	 public static void ManualAddClient()  {
	 
	  Scanner sc=new Scanner(System.in);
	  
	  
	  System.out.println("Enter client's ID :");
	  String cid=sc.nextLine();
	  System.out.println("Enter client's  first name :");
	  String cfn=sc.nextLine();
	  System.out.println("Enter client's last name :");
	  String cln=sc.nextLine();
	  System.out.println("Enter client's phone number :");
	  String cpn=sc.nextLine();
	  System.out.println("Enter client's Email :");
	  String ce=sc.nextLine();
	  System.out.println("Enter client's age :");
	  String ca=sc.nextLine();
	  System.out.println("Enter client's gender :");
	  String cg=sc.nextLine();
	  System.out.println("Enterclient's  address:");
	  String cad=sc.nextLine();
	  sc.close();
	  try {
		
		 @SuppressWarnings("unused")
		Client c = new Client(cid, cfn, cln, cpn, ce, ca, cg, cad);
		  
	  	} catch (IllegalID  | IllegalPhone | IllegalEmail | IllegalName | IllegalAge | IllegalAddress | IllegalGender e1) {
		System.out.println(e1);}
	
	  try {
	  
	   File f=new File("Clients.txt");
	   PrintWriter pw=new PrintWriter(new FileOutputStream(f,true));
	   pw.append("\n"+"Client"+","+cid+","+cfn+","+cln+","+cpn+","+ce+","+ca+","+cg+","+cad);
	   pw.close();
	  }
	  
	  catch(Exception e)
	  {
		  System.out.println(e);}}
	  

	 public static void displayClients() {
	  try
	  {
	  BufferedReader br=new BufferedReader(new FileReader("Clients.txt"));
	  String s="";
	   while( (s=br.readLine()) !=null )
	   {
	    String data[]= new String[200];
	    data=s.split(" ");
	    for (String str : data) {
			
	     System.out.print(str +" ");
	    }
	    System.out.println();
	    
	   }
	   br.close();
	  }
	  catch(Exception e){} }
	

	 

	
}
