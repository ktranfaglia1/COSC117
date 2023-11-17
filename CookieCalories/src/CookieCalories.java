/**
 * Lab 2
 * Kyle Tranfaglia
 * Soeun You
 *COSC 117
 *02/08/2022
 *This program uses input-process-output programming to display calories consumed upon input of cookies eaten
 */
import java.util.Scanner; // Enables function of Scanner class
public class CookieCalories {

	public static void main(String[] args) {
		//Variables
		int cookies;
		double totalCalories;
		int bag=40;
		int serving=10;
		int calories=200;
		// Creates a Scanner object to read input
		Scanner input = new Scanner(System.in);
		// Gets the number of cookies the user consumed
		System.out.println("Please enter the number of cookies consumed");
		cookies=input.nextInt();
		// Calculates the total calories consumed
		totalCalories= (calories/(bag/serving))*cookies;
		// The following prompt is displayed
		System.out.println("your total calories consumed is " + totalCalories);
	}

}
