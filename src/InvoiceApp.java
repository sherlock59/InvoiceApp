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
		double subtotal = 0.0; //initializing total before 
		double discountPercent; // initializing discount percentage
		double discountAmount; // sum of the discount 
		double invoiceTotal; // total after discount applied 

		mySystemKeyboard = new Scanner(System.in);// creates the input collector system
		// welcomes the user to the program
		System.out.println("=====================================================");
		System.out.println("Welcome to the Invoice Total Calculator version 23");
		System.out.println("=====================================================\n");

		// while loop that runs the process again if the user enters "y"
		while (userYesNo.equalsIgnoreCase("y")) {

			// asking the user to list the number of items 
			System.out.print("How many line items are there:   ");
			input = mySystemKeyboard.nextInt();
			System.out.println("=====================================================\n");

			subtotal = 0;

			for(int i =  1 ; i <= input; ++i) {
				System.out.print("Enter the " + i + " line items  : " );
				subtotal += mySystemKeyboard.nextInt();
			}

			// calculates discount according the amount input by user
			if ( subtotal >= 200) {
				discountPercent = 0.2;
			}  else if (input >= 100) {
				discountPercent = 0.1;
			}  else {
				discountPercent = 0.0;
			} 

			discountAmount = subtotal * discountPercent; // calculates the discount 
			invoiceTotal = subtotal - discountAmount; // sets invoiceTotal with applied discount	

			// lines up the result table results in a raw 
			System.out.println("=====================================================\n");
			System.out.printf("%20s: %,10.2f\n", "subtotal", subtotal); 
			System.out.printf("%20s: %,10.2f\n", "Discount percent", 
					discountPercent);
			System.out.printf("%20s: %,10.2f\n", "Discount amount", 
					discountAmount);
			System.out.printf("%20s: %,10.2f\n", "Invoice total",
					invoiceTotal);
			System.out.println("=====================================================\n");

			mySystemKeyboard.nextLine(); //cleaning the buffer
			System.out.print("Continue (y/n); ");
			userYesNo = mySystemKeyboard.nextLine();
			System.out.println();
		}
		System.out.print("=====================================================\n");
		System.out.print("Good Bye");
	}
}
