import java.util.Scanner;

/*
 * Description: This project calculates invoice total with discount included based on user's input
 * Written by: Anaberdi Meredov
 * Date Written: 2022.01.31
 * GitHub: https://github.com/sherlock59/InvoiceApp.git
 */


public class InvoiceApp {


	public static void main(String[] args) {
		String userYesNo = "y"; // asks if the user wants to commit another invoice result 
		int input = 0;  // initializing user input value 
		int i = 0; // for loop 
		double discountPercent; 
		double discountAmount;
		double invoiceTotal;
		int total;
		
		// creating the code to get user input 
		Scanner mySystemKeyboard = new Scanner(System.in); 
		
		// welcomes the user to the program
		System.out.println("=====================================================");
		System.out.println("Welcome to the Invoice Total Calculator version 23");
		System.out.println("=====================================================\n");
		
		// while loop that runs the process again if the user enters "y"
		while (userYesNo.equalsIgnoreCase("y")) {
			
            // asking the user to list the number of items 
			System.out.print("How many line items are there:   \n");
			input = mySystemKeyboard.nextInt();
			
			
			
			for( i = 1; i <= input; i++) {
				System.out.print("Enter the line item ");
				System.out.println(i + ":");
				mySystemKeyboard.nextInt();
			
				
				if (i >= 1000) {
					discountPercent = .2;
		   	 }    else if (i >= 500 ) {
		   		    discountPercent = .1;
		   	 } else {discountPercent = .0;
		   	 
		   	 }
				discountAmount = input * discountPercent; // calculates the discount the purchase receives
				invoiceTotal = input - discountAmount; // the total after applied discount 
				total = input + (i); // total before discount 
				
				//System.out.printf("%20s: %,10.2f\n", "total", total);
				//System.out.printf("%20s: %,10,2f\n", "Discount percent", discountPercent);
				//System.out.printf("%20s: %,10,2f\n", "Discount amount", discountAmount);
				//System.out.printf("%20s: %,10,2f\n", "Invoice total", invoiceTotal);
				
				
			}
		}
			System.out.println("something  went wrong");
			
			
			
			mySystemKeyboard.nextLine(); //cleaning the buffer
			System.out.println("Continue (y/n); ");
			userYesNo = mySystemKeyboard.nextLine();
			System.out.println();
		}
	}