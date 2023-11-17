/**
 * Lab 3
 * Kyle Tranfaglia
 * Soeun You
 *COSC 117
 *02/15/2022
 *This program uses input-process-output programming to display a miles to kilometer conversion using System.out.printf and display restrictions
 */
import java.util.Scanner; // Enables function of Scanner class
public class DistanceConverter {

	public static void main(String[] args) {
		//Variables
		double miles, kilometers;
		final double conversion=1.60934;
		
		// Creates a Scanner object to read input
		Scanner input = new Scanner(System.in);
		System.out.println("How many miles would you like to convert?");
		miles=input.nextDouble();
		//This calculation converts miles to kilometers
		kilometers=miles*conversion;
		//This displays the miles provided by the user to 4 decimal places and the converted kilometers to 4 decimal places
		System.out.printf("%.4f miles = %.4f kilometers", miles, kilometers);
		
	}

}
