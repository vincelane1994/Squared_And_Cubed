import java.util.Scanner;

public class LabFour {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userNum;
		char cont = 'y';

		int i = 1;
		while (cont == 'y') {//So long as the user chooses to run this again it will loop.
			System.out.println("Enter your Number: ");
			userNum = scnr.nextInt();
			System.out.printf("%-12s | %-10s | %-10s\n", "User Number", "Squared", "Cubed");// Top of the chart

			while (i <= userNum) {
				System.out.printf("%-12s | %-10s | %-10s\n", i, (i * i), (i * i * i));//Produces the lines of the chart
				i++;//adds one to the variable to increase the base number each line.
			}
			i = 1;//Resets i so that the user can enter a new number
			System.out.println(" ");// Space for Visual esthetics
			System.out.println("Would you like to try another number? (Y/N)");// Option to do another

			cont = scnr.next().charAt(0); // Gets first character so that the user can type in yes or no
			cont = Character.toLowerCase(cont); // Changes character to lower case so capitalization doesn't matter

		}
		System.out.println("Goodbye!");
		scnr.close();

	}
}

/*public boolean nearHundred(int n) {
	 int value1 = 100-n;
	 int value2 = 200-n;
	 return (Math.abs(value1) <= 10 || Math.abs(value2) <= 10);
}*/