package customer;

import java.util.Scanner;
import java.io.*;
public class Account {

	public void savingAccount()
    {
 	   
    }
    public void Fixeddeposit()
    {
 	   
    }
    public void Recurringdeposit()
    {
 	   
    }
	public void choice()
	{
		// TODO Auto-generated method stub
     System.out.println("Enter your choice: 1)Savingaccount 2)Fixeddeposit 3)Recurringdeposit");
     Scanner sc= new Scanner(System.in);
     int choice= sc.nextInt();
    
     do
     {
    	switch(choice) 
    	{
    	case 1: Account A= new Account();
    	        A.savingAccount();
    	         break;
    	case 2: A.Fixeddeposit();
                break;
    	case 3: A.Recurringdeposit();
                break;
        
     }
    	 
     
	}while (choice!=4);

}
}
