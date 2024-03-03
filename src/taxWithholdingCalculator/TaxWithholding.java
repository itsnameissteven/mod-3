package taxWithholdingCalculator;
import java.util.Scanner;

public class TaxWithholding {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double salary = 0;
		int taxRate;
		double withholding;
		
		System.out.print("Enter the salary of your employee: ");
		
		// Validate user input and prompt to fix if string entered.
		while(salary == 0) {
			try {	
				salary = scnr.nextDouble();
			} catch (Exception e) {
				System.out.print("That is not a valid input try again: ");
				scnr.next();
			}
			
		}
	
		if(salary < 500) {
			taxRate = 10;
		} else if (salary < 1500) {
			taxRate = 15;
		} else if (salary < 2500) {
			taxRate = 20;
		} else {
			taxRate = 30;
		}
		
		// The amount to be withheld weekly
		withholding = salary * (taxRate / 100.0);
		
		System.out.printf("The weekly salary entered was $%.2f, the tax rate is %,d%%, and you should withhold $%.2f weekly", salary, taxRate, withholding);
		
		scnr.close();

	}

}
