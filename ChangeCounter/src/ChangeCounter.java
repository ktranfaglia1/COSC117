/**
 * Lab 3
 * Kyle Tranfaglia
 * Soeun You
 *COSC 117
 *02/15/2022
 *This program uses input-process-output programming to display the coins entered and
 * the total value of the coins using System.out.printf and display restrictions
 */
import java.util.Scanner; // Enables function of Scanner class
public class ChangeCounter {

	public static void main(String[] args) {
		// Variables
		int pennies, nickels, dimes, quarters, totalCoins;
		double totalValue;
		final double pennyValue=0.01, nickelValue=0.05, dimeValue=0.10, quarterValue=0.50;
		
		// Creates a Scanner object to read input
				Scanner input = new Scanner(System.in);
				System.out.println("How many pennies do you have?");
				pennies=input.nextInt();
				System.out.println("How many nickels do you have?");
				nickels=input.nextInt();
				System.out.println("How many dimes do you have?");
				dimes=input.nextInt();
				System.out.println("How many quarters do you have?");
				quarters=input.nextInt();
				//This calculation determines the total amount of coins entered
				totalCoins=pennies+nickels+dimes+quarters;
				//This calculation determines the value of the coins entered
				totalValue=(pennies*pennyValue)+(nickels*nickelValue)+(dimes*dimeValue)+(quarters*quarterValue);
				// The prompt is displayed using System.out.printf to implement restrictions for a value of money and standard println for other text
				System.out.println("You entered " + pennies + " pennies");
				System.out.println("You entered " + nickels + " nickels");
				System.out.println("You entered " + dimes + " dimes");
				System.out.println("You entered " + quarters + " quarters");
				System.out.println("You entered a total of " + totalCoins + " coins");
				System.out.printf("You have $%,.2f in change", totalValue);


	}

}
