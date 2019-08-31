package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


// Write a class ComputerOwnerTester.java with a main method to check out the ComputerOwner class:
//
// In the main method make a Person and use it to make a ComputerOwner object and 4 computers.
// Add the 4 computers to the owner and print the object. Then remove 2 computers and print it again.
//
// Copy and modify the code to that what you see in the console gets repeated in the output file.

public class ComputerOwnerTester{
    public static void main(String[] args){
        DateAndPlaceOfBirth pdob = new DateAndPlaceOfBirth(2000, 2, 13, "Amawalk", "NY", "USA");
        StreetUSAddress addr = new StreetUSAddress("12 Watergate Drive", "", "Amawalk", "NY", "10501");
        Person person_one = new Person("Anjali", "Kapur", "111-22-2345", pdob, addr);

        ComputerOwner computerOwnerOne = new ComputerOwner(person_one);
        Computer computer_one = new Computer("Mac", "cpuDesc1", 16, 2000, true, 1100.00);
        Computer computer_two = new Computer("Windows", "cpuDesc2", 8, 3000, true, 500.65);
        Computer computer_three = new Computer("Dell", "cpuDesc3", 12, 800, false, 400.87);
        Computer computer_four = new Computer("Acer", "cpuDesc4", 20, 900, false, 300.34);
        computerOwnerOne.addComputer(computer_one);
        computerOwnerOne.addComputer(computer_two);
        computerOwnerOne.addComputer(computer_three);
        computerOwnerOne.addComputer(computer_four);

        System.out.println(computerOwnerOne);

        computerOwnerOne.removeComputer(0);
        computerOwnerOne.removeComputer(1);

        System.out.println(computerOwnerOne);

        try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwner:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println

        DateAndPlaceOfBirth pdob2 = new DateAndPlaceOfBirth(2000, 2, 13, "Amawalk", "NY", "USA");
        StreetUSAddress addr2 = new StreetUSAddress("12 Watergate Drive", "", "Amawalk", "NY", "10501");
        Person person_one2 = new Person("Anjali", "Kapur", "111-22-2345", pdob, addr);

        ComputerOwner computerOwnerOne2 = new ComputerOwner(person_one2);
        Computer computer_one2 = new Computer("Mac", "cpuDesc1", 16, 2000, true, 1100.00);
        Computer computer_two2 = new Computer("Windows", "cpuDesc2", 8, 3000, true, 500.65);
        Computer computer_three2 = new Computer("Dell", "cpuDesc3", 12, 800, false, 400.87);
        Computer computer_four2 = new Computer("Acer", "cpuDesc4", 20, 900, false, 300.34);
        computerOwnerOne2.addComputer(computer_one2);
        computerOwnerOne2.addComputer(computer_two2);
        computerOwnerOne2.addComputer(computer_three2);
        computerOwnerOne2.addComputer(computer_four2);

        output.println(computerOwnerOne2);

        computerOwnerOne2.removeComputer(0);
        computerOwnerOne2.removeComputer(1);

        output.println(computerOwnerOne2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

    }
}
