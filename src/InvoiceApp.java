import java.util.Scanner;

/*
 * Description: This project calculates invoice total with discount included based on user's input
 * Written by: Anaberdi Meredov
 * Date Written: 2022.01.31
 * GitHub: https://github.com/sherlock59/InvoiceApp.git
 */
public class InvoiceApp {

	private static Scanner mySystemKeyboard;

	public static void main(String[] args) {
		
		String userYesNo = "y"; // asks if the user wants to commit another invoice result 
		int input = 0; // initializing user input value 
		int subtotal; //initializing total before 
		double discountPercent; // initializing discount percentage
		double discountAmount; // sum of the discount 
		double invoiceTotal; // total after discount applied 
		
		mySystemKeyboard = new Scanner(System.in);
			// welcomes the user to the program
			System.out.println("=====================================================");
			System.out.println("Welcome to the Invoice Total Calculator version 23");
			System.out.println("=====================================================\n");

			// while loop that runs the process again if the user enters "y"
			while (userYesNo.equalsIgnoreCase("y")) {

				// asking the user to list the number of items 
				System.out.print("How many line items are there:   ");
				input = mySystemKeyboard.nextInt();

			for(int i =  1 ; i <= input; ++i) {
					System.out.print("Enter the " + i + " line items  : " );
					mySystemKeyboard.nextInt();
				}
			   if ( input >= 200) {
				   discountPercent = 0.2;
			   }  else if (input >= 100) {
				   discountPercent = 0.1;
			   }  else {discountPercent = 0.0;
			   
			   } 
			   
			   subtotal = input + input;
			   discountAmount = input * discountPercent; // calculates the discount 
			   invoiceTotal = input - discountAmount;
			   
			   
			   
    
			 System.out.printf("%20s: %,10,2f\n", "subtotal", subtotal);
			 System.out.printf("%20s: %,10,2f\n", "Discount percent", 
			 discountPercent);
			 System.out.printf("%20s: %,10,2f\n", "Discount amount", 
			 discountAmount);
			 System.out.printf("%20s: %,10,2f\n", "Invoice total",
			 invoiceTotal);
				
			//System.out.println("something  went wrong");


			mySystemKeyboard.nextLine(); //cleaning the buffer
			//if (userYesNo.equalsIgnoreCase("n")){
				System.out.println("Good Bye");
			//}
			System.out.print("Continue (y/n); ");
			userYesNo = mySystemKeyboard.nextLine();
			System.out.println();
			}
		}
	}
	

	




