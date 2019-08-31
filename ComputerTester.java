package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ComputerTester {
	public static void main(String[] args) {
		// TODO make 4 different Computer objects with different
		// combinations of disk size (two more than a terabyte and two less)
		// and for each make one an SSD drive and the other not.
		// Then call System.out.println(comp); for each "comp" object
		// and observe that there are small differences in how the computer
		// information prints out.
		Computer computerOne = new Computer("Mac", "cpuDesc1", 16, 2000, true, 1100.00);
		Computer computerTwo = new Computer("Windows", "cpuDesc2", 8, 3000, true, 500.65);
		Computer computerThree = new Computer("Dell", "cpuDesc3", 12, 800, false, 400.87);
		Computer computerFour = new Computer("Acer", "cpuDesc4", 20, 900, false, 300.34);
		System.out.println(computerOne.toString());
		System.out.println(computerTwo.toString());
		System.out.println(computerThree.toString());
		System.out.println(computerFour.toString());
		try(var output =new PrintWriter(new FileOutputStream(new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

			// Copy all your lines above, add an extra "2" to every variable name
			// and replace every System.out.print or System.out.println
			// by output.print or output.println
			Computer computerOne2 = new Computer("Mac", "cpuDesc1", 16, 2000, true, 1100.00);
			Computer computerTwo2 = new Computer("Windows", "cpuDesc2", 8, 3000, true, 500.65);
			Computer computerThree2 = new Computer("Dell", "cpuDesc3", 12, 800, false, 400.87);
			Computer computerFour2 = new Computer("Acer", "cpuDesc4", 20, 900, false, 300.34);
			output.println(computerOne2.toString());
			output.println(computerTwo2.toString());
			output.println(computerThree2.toString());
			output.println(computerFour2.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
