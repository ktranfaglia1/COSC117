import java.util.Scanner;
public class initials {

	public static void main(String[] args) {
		// Variables
		String fullName;
		String firstName;
		String lastName;
		int space;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first and last name, seperated by a space");
		fullName= input.nextLine();
		space=fullName.indexOf(' ');
		firstName=fullName.substring(0,space);
		lastName=fullName.substring(space +1);
		
		System.out.println("Your first name is " + firstName + " which has " + firstName.length()  + " characters.");
		System.out.println("Your last name is " + lastName + " which has " + lastName.length()  + " characters.");
		
		System.out.println("Your initials are " + firstName.charAt(0) + lastName.charAt(0));
	}

}
