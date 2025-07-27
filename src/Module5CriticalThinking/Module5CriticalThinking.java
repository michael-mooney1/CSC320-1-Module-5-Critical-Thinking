package Module5CriticalThinking;

import java.util.Scanner;
import java.util.ArrayList;

public class Module5CriticalThinking {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		// Setup variables
		String[] dayNames = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		ArrayList<Double> temps = new ArrayList<Double>();
		
		// Get user input for daily temperatures
		for (String day : dayNames) {
			while (true) {
				System.out.println("What is temperature for " + day + " as a decimal?");
				
				try {
					double temp = scnr.nextDouble();
					temps.add(temp);
					scnr.nextLine();
					break;
				} catch (Exception e) {
					System.out.println("The value entered was not a decimal number");
					scnr.nextLine();
				}
			}
		}
		
		// Menu so user can decide what they want to see
		String response = "";
		while (true) {
			System.out.println("Which day would you like to see? (Monday-Sunday/Week/Quit)");
			
			response = scnr.nextLine();

			switch (response.toLowerCase()) {
			case "monday":
				System.out.println("Monday: " + temps.get(0));
				break;
			case "tuesday":
				System.out.println("Tuesday: " + temps.get(1));
				break;
			case "wednesday":
				System.out.println("Wednesday: " + temps.get(2));
				break;
			case "thursday":
				System.out.println("Thursday: " + temps.get(3));
				break;
			case "friday":
				System.out.println("Friday: " + temps.get(4));
				break;
			case "saturday":
				System.out.println("Saturday: " + temps.get(5));
				break;
			case "sunday":
				System.out.println("Sunday: " + temps.get(6));
				break;
			case "week":
				double tempSum = 0.0;
				for (int i = 0; i < 7; i++) {
					tempSum += temps.get(i);
					System.out.println(dayNames[i] + ": " + temps.get(i));
				}
				System.out.printf("Average temperature for the week: %.1f", (tempSum / 7));
				System.out.println();
				break;
			case "quit":
				System.exit(0);
				break;
			default:
				System.out.println("The value entered is not a valid option");
				break;
			}
		}
	}
}
