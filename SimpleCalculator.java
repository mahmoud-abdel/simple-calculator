/*
 * Author: Mahmoud Abdelaziz - mahmoud.b.abdelaziz@gmail.com
 */

/*
 *   This class contains method main which is used to run the application
 */

public class SimpleCalculator {

	/*
	 *   Entry point for the application. Uses utility class User to accept two double inputs from the user. After this, uses 
	 *   switch case menu for user to select which operation they want performed. All math methods are being called from utility
	 *   class Calculate. Secondary switch case loop provides user with options to perform another calculation, display the help 
	 *   menu, or exit the program. 
	 */
	
	public static void main(String[] args) {
		double value1;
		double value2;
		
		//declaring menu option constants
		final int ADD = 1;
		final int SUBTRACT = 2;
		final int MULTIPLY = 3;
		final int DIVIDE = 4;
		final int EXPONENT = 5;
		final int HELP = 6;
		final int CONTINUE = 7;
		final int EXIT = 8;
		int option = 8;
		
		System.out.println("##Welcome to a simple Java calculator!");
		System.out.println("##The program will prompt you to enter a value, and then a second.");
		System.out.println("##You will then be prompted to select which operation you would like.");
		
		while (true) {
			
			value1 = User.inputDouble("Please enter your first value: ");
			
			value2 = User.inputDouble("Please enter your second value: ");
			
			
			System.out.println ("To add, please type '1'");
			System.out.println ("To subtract, please type '2'");
			System.out.println ("To multiply, please type '3'");
			System.out.println ("To divide, please type '4'");
			System.out.println ("To do an exponent calculation, please type '5'");
			option = User.inputInteger("Please input your option selection: ");
			
			//menu system for which operation to be done
			switch (option) {
			case ADD:
				double sum = Calculate.add(value1, value2);
				System.out.println ("The sum is: " + sum);
				break;
			case SUBTRACT:
				double difference = Calculate.subtract(value1, value2);
				System.out.println ("The difference is: " + difference);
				break;
			case MULTIPLY:
				double product = Calculate.multiply(value1, value2);
				System.out.println ("The product is: " + product);
				break;
			case DIVIDE:
				double[] div = Calculate.divide(value1, value2);  //divide returns 2-element array with flag as well as quotient
				if (div[0] != 0) {                                //if flag isn't 0, then user tried to divide by 0 - program catches this
					System.out.println("Cannot divide by 0!!!");
					break;
				}
				else {
					double quotient = div[1];
					System.out.println ("The quotient is: " + quotient);
					break;
				}
			case EXPONENT:
				double power = Calculate.exponent(value1, value2);
				System.out.println ("The power is: " + power);
				break;
			default:
				System.out.println ("You selected in an invalid option.");
				break;
			}
			
			//menu system for doing more calculations, displaying help text, or exiting the program
			while (true) {
				System.out.println ("To access the help menu, please type '6'");
				System.out.println ("To perform another calculation, please type '7'");
				System.out.println ("To exit the program, please type '8'");
				option = User.inputInteger("Please input your option selection: ");
				switch (option) {
				case HELP:
					//to-do: type up help menu
					System.out.println ("Addition simply adds the first value to the second.");
					System.out.println ("Subtraction will subtract the second value from the first");
					System.out.println ("Division will divide the first value by the second");
					System.out.println ("Multiplication simply multiplies the first value by the second");
					System.out.println ("Exponent puts the first value to the power of the second value");
					continue;
				case CONTINUE:
					break;
				case EXIT:
					System.exit(0);
				}
				break;
			}
		}	

	}

}
