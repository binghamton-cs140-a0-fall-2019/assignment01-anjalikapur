package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


// Write a class PlaceDOBTester.java with a main method to check out the DateAndPlaceOfBirth class:
//
// In the main method make 5 DateAndPlaceOfBirth objects 3 with birth places in the USA (with a State) and 2 from
// other countries using the 2nd constructor that does not have a state parameter. Give two objects the same birth
// date and have another object with the same birthday (day and month) but a different birth year.
//
// Use System.out.println to print each of the 5 objects and then to print the values of the four other methods that
// are not getter methods, e.g., System.out.println(object1.hasSameBirthDayAs(object2)).
//
// You will need many lines to test the 4 methods, we want to see that get the right true and false values for the
// different combinations of the objects you made.
//
// As before add this code to the main method:

public class PlaceDOBTester {
	public static void main(String[] args) {
		DateAndPlaceOfBirth birthPlaceOne = new DateAndPlaceOfBirth(2000, 2, 13, "Amawalk", "NY", "USA");
		DateAndPlaceOfBirth birthPlaceTwo = new DateAndPlaceOfBirth(1995, 7, 21, "Bronxville", "NY", "USA");
		DateAndPlaceOfBirth birthPlaceThree = new DateAndPlaceOfBirth(1980, 12, 17, "Miami", "FL", "USA");
		DateAndPlaceOfBirth birthPlaceFour = new DateAndPlaceOfBirth(2000, 2, 13, "Barcelona", "Spain");
		DateAndPlaceOfBirth birthPlaceFive = new DateAndPlaceOfBirth(2012, 2, 13, "Rome", "Italy");

		System.out.println(birthPlaceOne.toString());
		System.out.println(birthPlaceTwo.toString());
		System.out.println(birthPlaceThree.toString());
		System.out.println(birthPlaceFour.toString());
		System.out.println(birthPlaceFive.toString());

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		DateAndPlaceOfBirth birthPlaceOne2 = new DateAndPlaceOfBirth(2000, 2, 13, "Amawalk", "NY", "USA");
		DateAndPlaceOfBirth birthPlaceTwo2 = new DateAndPlaceOfBirth(1995, 7, 21, "Bronxville", "NY", "USA");
		DateAndPlaceOfBirth birthPlaceThree2 = new DateAndPlaceOfBirth(1980, 12, 17, "Miami", "FL", "USA");
		DateAndPlaceOfBirth birthPlaceFour2 = new DateAndPlaceOfBirth(2000, 2, 13, "Barcelona", "Spain");
		DateAndPlaceOfBirth birthPlaceFive2 = new DateAndPlaceOfBirth(2000, 2, 13, "Rome", "Italy");

		output.println(birthPlaceOne2.toString());
		output.println(birthPlaceTwo2.toString());
		output.println(birthPlaceThree2.toString());
		output.println(birthPlaceFour2.toString());
		output.println(birthPlaceFive2.toString());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
}
}
