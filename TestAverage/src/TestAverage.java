/**
 * Lab 2
 * Kyle Tranfaglia
 * Soeun You
 *COSC 117
 *02/08/2022
 *This program uses input-process-output programming to display each test score and the average of the scores
 */
import java.util.Scanner; // Enables function of Scanner class
public class TestAverage {

	public static void main(String[] args) {
		//Variables
		double firstTestScore;
		double secondTestScore;
		double thirdTestScore;
		double averageTestScore;
		// Creates a Scanner object to read input
		Scanner input = new Scanner(System.in);
		// Gets each test score from the user
				System.out.println("Please enter the score you recieved on the first test");
				firstTestScore=input.nextInt();
				
				System.out.println("Please enter the score you recieved on the second test");
				secondTestScore=input.nextInt();
				
				System.out.println("Please enter the score you recieved on the third test");
				thirdTestScore=input.nextInt();
		// Calculates the average test score of the three scores provided
				averageTestScore=(firstTestScore+secondTestScore+thirdTestScore)/3;
		// The following prompt is displayed
				System.out.println("your first test score is " + firstTestScore);
				System.out.println("your second test score is " + secondTestScore);
				System.out.println("your third test score is " + thirdTestScore);
				System.out.println("your average score is " + averageTestScore);

	}

}
