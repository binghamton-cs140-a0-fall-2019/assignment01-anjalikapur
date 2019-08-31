package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

// Write a class USAddressTester.java with a main method to check out the StreetUSAddress class:
//
// In the main method make 2 objects, one with an empty String for address2 and print them to see
// that one object prints with 3 lines and the other with 2 lines.

public class USAddressTester{
    public static void main(String[] args){

        StreetUSAddress USAddressOne = new StreetUSAddress("12 Watergate Drive", "PO Box 3020", "Amawalk", "NY", "10501");
        StreetUSAddress USAddressTwo = new StreetUSAddress("65 Country Hollow Road", "", "Lincolndale", "NY", "10598");

        System.out.println(USAddressOne.toString());
        System.out.println(USAddressTwo.toString());

        try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
        StreetUSAddress USAddressOne2 = new StreetUSAddress("12 Watergate Drive", "35 Wayacross Road", "Amawalk", "NY", "10501");
        StreetUSAddress USAddressTwo2 = new StreetUSAddress("65 Country Hollow Road", "", "Lincolndale", "NY", "10598");

        output.println(USAddressOne2.toString());
        output.println(USAddressTwo2.toString());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
}
