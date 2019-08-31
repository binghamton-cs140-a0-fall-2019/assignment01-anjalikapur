package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class SimpleDateTester{
    public static void main(String[] args) {
        SimpleDate simpleDateOne = SimpleDate.of(2019, 8, 26);
        System.out.println(simpleDateOne);
        try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR SimpleDate:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
        SimpleDate simpleDateOne2 = SimpleDate.of(2019, 8, 26);
        output.println(simpleDateOne2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
}
