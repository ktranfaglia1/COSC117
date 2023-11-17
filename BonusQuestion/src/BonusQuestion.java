/**
 * Lab 2
 * Kyle Tranfaglia
 * Soeun You
 *COSC 117
 *02/08/2022
 *This program uses input-process-output programming to calculate and display amount paid for the stock, amount of commission, and total amount paid
 */

public class BonusQuestion {

	public static void main(String[] args) {
		// variables
		int shares=500;
		double stockPrice=19.77;
		double commission=0.02;
		double totalCommissionPaid;
		double totalPaid;
		double stockAlone;
		
		//Calculates the total amount paid 
		stockAlone=shares*stockPrice;
		totalCommissionPaid=shares*stockPrice*commission;
		totalPaid=shares*stockPrice+totalCommissionPaid;
		
		// The following prompt is displayed
			System.out.println("Hello, Kathryn");
			System.out.println("For the Stock alone, you paid $" + stockAlone );
			System.out.println("Overall, you paid $" + totalCommissionPaid + " in commission " );
			System.out.println("The total amount you paid after commission is $" + totalPaid );
	}

}
