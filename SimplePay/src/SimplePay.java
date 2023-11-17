/**
 * Lab 3
 * Kyle Tranfaglia
 * Soeun You
 *COSC 117
 *02/15/2022
 *This program uses input-process-output programming to display payment information using System.out.printf and display restrictions
 */
import java.util.Scanner; // Enables function of Scanner class
public class SimplePay {

	public static void main(String[] args) {
		//variables
		int hours;
		double payRate;
		final double tax=0.2;
		double weeklyEarn;
		double grossPay;
		double weeklyTax;

		// Creates a Scanner object to read input
				Scanner input = new Scanner(System.in);
				// Gets each test score from the user
				System.out.println("How many total hours did you work last week?");
				hours=input.nextInt();
				System.out.println("What is your current hourly pay rate?");
				payRate=input.nextDouble();
				//Calculates the weekly earn 
				weeklyEarn=hours*payRate;
				//Calculates the weekly tax taken out of weekly pay
				weeklyTax=weeklyEarn*tax;
				//Calculates the gross pay of the user's work week
				grossPay=weeklyEarn-weeklyTax;
		// This is displayed using System.out.printf to implement display restrictions of 2 decimal places with a potential comma and a dollar sign
		System.out.println("You worked exactly " + hours +" hours");
		System.out.printf("Your hourly pay rate is $%,.2f\n", payRate);
		System.out.printf("Your weekly pay without tax is $%,.2f\n", weeklyEarn);
		System.out.printf("The tax taken from your weekly pay is $%,.2f\n", weeklyTax);
		System.out.printf("Your gross pay for this week is $%,.2f\n", grossPay);
		
	}

}
