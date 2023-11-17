/**
 * Project 3
 * Kyle Tranfaglia
 * Dr. You
 * COSC 117
 * 05/18/22
 * This program 
 */
import java.util.Scanner;
public class PayRoll {

	public static void main(String[] args) {
		// Variables
		int employeeID [] = { 5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489 };
		int hours [] = new int [7];
		double payrate [] = new double [7];
		double wage;
		Scanner input = new Scanner(System.in);
		
		for (int index=0; index<hours.length; index++) {
			System.out.println("Enter the hours worked for employee " + (index+1) + ":");
			hours[index]=input.nextInt();
			while (hours[index]<0) {
				System.out.println("The input for employee " + (index+1) + " is invalid." +
						" Hours must be entered as a positive integer value.");
				System.out.println("Enter the hours worked for employee " + (index+1) + ":");
				hours[index]=input.nextInt();
			}
		}
		for (int index=0; index<payrate.length; index++) {
			System.out.println("Enter the payrate for employee " + (index+1) + ":");
			payrate[index]=input.nextDouble();
			while (payrate[index]<6.00) {
				System.out.println("The input for employee " + (index+1) + " is invalid." +
						" Payrate must be above the minimum payrate of 6.00.");
				System.out.println("Enter the hours worked for employee " + (index+1) + ":");
				payrate[index]=input.nextDouble();
			}
		}
		for (int index=0; index<employeeID.length; index++) {
			wage=wages(employeeID[index], hours[index], payrate[index]);
			System.out.printf("Employee ID: %d Hours: %d Payrate: %.2f Wage: $%,.2f \n",
					employeeID[index], hours[index], payrate[index], wage);
			}
	}
	public static double wages(int employeeID, int hour, double payrate) {
		double wage = hour*payrate;
		return wage;
	}


}
