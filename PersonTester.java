package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class PersonTester{
    public static void main(String[] args){
        DateAndPlaceOfBirth pdob = new DateAndPlaceOfBirth(2000, 2, 13, "Amawalk", "NY", "USA");
        StreetUSAddress addr = new StreetUSAddress("12 Watergate Drive", "35 Wayacross Road", "Amawalk", "NY", "10501");
        Person personOne = new Person(
            "Jane",
            "Doe",
            "111223333",
            pdob,
            addr
        );
        System.out.println(personOne.toString());

        try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Person.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
        DateAndPlaceOfBirth pdob2 = new DateAndPlaceOfBirth(2000, 2, 13, "Amawalk", "NY", "USA");
        StreetUSAddress addr2 = new StreetUSAddress("12 Watergate Drive", "35 Wayacross Road", "Amawalk", "NY", "10501");
        Person personOne2 = new Person(
            "Jane",
            "Doe",
            "111223333",
            pdob2,
            addr2
        );
        output.println(personOne2.toString());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
}
