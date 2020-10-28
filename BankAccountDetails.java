package customer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BankAccountDetails {

	   final int max_limit=20;
       final  int min_limit=1;
       Scanner scanner =new Scanner(System.in);
       String date1= scanner.next();
       private  String name[]=new String[20];
       private int accNo[]=new int[20];
       private  String accType[]=new String[20];
       private double balAmt[]=new double[20];
       
       
       BankAccountDetails() //constructor
       {
    	   for(int i=0;i<max_limit;i++)
           {
              name[i]="";
              accNo[i]=0;
              accType[i]="";
              balAmt[i]=0.0;
          }
       }
       public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            int userChoice;

            boolean quit = false;

            do {

                  System.out.println("1. Saving account");

                  System.out.println("2. Recurring account");

                  System.out.println("3. Fixed deposit");

                  System.out.print("Your choice, 0 to quit: ");

                  userChoice = in.nextInt();

                  switch (userChoice) {

                  case 1:

                        // Saving account

                        break;

                  case 2:

                        // Recurring account

                        break;

                  case 3:

                        // Fixed deposit

                        break;

                  case 0:

                        quit = true;

                        break;

                  default:

                        System.out.println("Wrong choice.");

                        break;

                  }

                  System.out.println();

            } while (!quit);

            System.out.println("Bye!");

      }
}