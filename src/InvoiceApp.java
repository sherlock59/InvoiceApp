import java.util.Scanner;

/*
 * Description: This project calculates invoice total with discount included based on user's input
 * Written by: Anaberdi Meredov
 * Date Written: 2022.01.31
 * GitHub: https://github.com/sherlock59/InvoiceApp.git
 */


public class InvoiceApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		String userInput = "y"; // asks if the user wants to commit another invoice result 
		Scanner scan = new Scanner(System.in); // creates a Scanner object named scan
		double discountPercent; // applies discount depending on eligibility 
		
		// welcomes the user to the program
		System.out.println("=====================================================");
		System.out.println("Welcome to the Invoice Total Calculator version 23");
		System.out.println("=====================================================");
		System.out.println();  // print a blank line


		// performs invoice calculations until choice isn't equal to "y" or "Y"
		while (userInput.equalsIgnoreCase("y")) {
			// get the invoice items from the user
			System.out.print("Enter the number of line items:   \n");
			String input = scan.nextLine();
			double items = Double.parseDouble(input);
			System.out.println("=====================================================");
			System.out.println();
			// calculate the discount amount and total
			if (items >= 200) {
				discountPercent = .2;
			} else if (items >= 100) {
				discountPercent = .1;
			} else {
				discountPercent = 0.0;
			}
			double discountAmount = items * discountPercent;
			double total = items - discountAmount;

			// display the discount amount and total
			String message = "Discount percent: " + discountPercent + "\n"
					+ "Discount amount:  " + discountAmount + "\n"
					+ "Invoice total:    " + total + "\n";            
			System.out.println(message);

			// see if the user wants to continue
			System.out.print("Continue? (y/n): ");
			userInput = scan.nextLine();
			System.out.println();
		}
	}    
}