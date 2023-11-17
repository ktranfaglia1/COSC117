/**
 * Lab 2
 * Kyle Tranfaglia
 * Soeun You
 *COSC 117
 *02/08/2022
 *This program uses input-process-output programming to gather personal information from the user and display a story using the given information
 */
import java.util.Scanner; // Enables function of Scanner class
public class WordGame {
	
	public static void main(String[] args) {
		//Variables
		String name;
		String age;
		String city;
		String college;
		String profession;
		String animal;
		String petName;
		// Creates a Scanner object to read input
			Scanner input = new Scanner(System.in);
		// Gets personal input from the user
					System.out.println("Please enter your name");
					name=input.nextLine();
						
					System.out.println("Please eneter your current age");
					age=input.nextLine();
						
					System.out.println("Please enter the name of any city");
					city=input.nextLine();
					
					System.out.println("Please enter the name of any college");
					college=input.nextLine();
					
					System.out.println("Please enter your profession");
					profession=input.nextLine();
					
					System.out.println("Please enter the name of any animal");
					animal=input.nextLine();
					
					System.out.println("Please enter the name of your pet");
					petName=input.nextLine();
					
			// Displays a story using the information entered by the  user
					System.out.println("There once was a person named " + name + " who lived in " + city + ". At the age of " + age + 
							", " + name + " went to college at " + college + ". " + name + " graduated and went to work as a " + profession +
							". Then, " + name + " adapoted a(n) " + animal + " named " + petName + ". They both lived happily ever after!");

	}

}
