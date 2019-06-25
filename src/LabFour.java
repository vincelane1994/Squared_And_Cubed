import java.util.Scanner;

public class LabFour {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userNum;
		char cont = 'y';
		char viewTable = 'y';
		char codeBat = 'y';
		
		int i = 1;
		while (cont == 'y') {// So long as the user chooses to run this again it will loop.
			System.out.print("Enter your Number: ");
			userNum = scnr.nextInt();
			System.out.printf("%-12s | %-10s | %-10s\n", "User Number", "Squared", "Cubed");// Top of the chart

			while (i <= userNum) {
				System.out.printf("%-12s | %-10s | %-10s\n", i, (i * i), (i * i * i));// Produces the lines of the chart
				i++;// adds one to the variable to increase the base number each line.
			}
			i = 1;// Resets i so that the user can enter a new number
			System.out.println(" ");// Space for Visual esthetics
			System.out.print("Would you like to try another number? (Y/N)");// Option to do another

			cont = scnr.next().charAt(0); // Gets first character so that the user can type in yes or no
			cont = Character.toLowerCase(cont); // Changes character to lower case so capitalization doesn't matter
			System.out.println("");
		}
		System.out.print("Would you like to see a multiplication table? (y/n)");
		
		viewTable = scnr.next().charAt(0); // Gets first character so that the user can type in yes or no
		viewTable = Character.toLowerCase(viewTable); // Changes character to lower case so capitalization doesn't matter

		System.out.println("");
		System.out.println("");
		
		if (viewTable == 'y') {

			System.out.printf("%-5s | %-5s | %-5s | %-5s | %-5s | %-5s | %-5s | %-5s | %-5s | %-5s | %-5s\n", " ", "1",
					"2", "3", "4", "5", "6", "7", "8", "9", "10");
			System.out.printf("%-5s | %-5s | %-5s | %-5s | %-5s | %-5s | %-5s | %-5s | %-5s | %-5s | %-5s\n", "-----",
					"-----", "-----", "-----", "-----", "-----", "-----", "-----", "-----", "-----", "-----");

			int sideNum = 1;
			while (sideNum <= 10) {
				System.out.printf("%-5s | %-5s | %-5s | %-5s | %-5s | %-5s | %-5s | %-5s | %-5s | %-5s | %-5s\n",
						(sideNum), (sideNum * 1), (sideNum * 2), (sideNum * 3), (sideNum * 4), (sideNum * 5),
						(sideNum * 6), (sideNum * 7), (sideNum * 8), (sideNum * 9), (sideNum * 10));
				sideNum = sideNum + 1;
			}
			System.out.println("");
			System.out.println("");
			System.out.println("");
			
			System.out.print("Would you like to see my answer to the CodingBat? (y/n)");

			codeBat = scnr.next().charAt(0); // Gets first character so that the user can type in yes or no
			codeBat = Character.toLowerCase(codeBat); // Changes character to lower case so capitalization doesn't matter
			System.out.println("");
			
			if (codeBat == 'y') {
				System.out.println("");
				System.out.println("");
				System.out.println("public boolean nearHundred(int n) {");
				System.out.println("	 int value1 = 100-n;");
				System.out.println("	 int value2 = 200-n;");
				System.out.println("	 return (Math.abs(value1) <= 10 || Math.abs(value2) <= 10);");
				System.out.println("}");

				}
			scnr.close();
		}
	}
}

/*public boolean nearHundred(int n) {
	 int value1 = 100-n;
	 int value2 = 200-n;
	 return (Math.abs(value1) <= 10 || Math.abs(value2) <= 10);
}*/