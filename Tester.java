import java.io.*;
import java.util.Scanner;

public class Tester {

    public static void main (String [] args){

        if (args.length < 2){

            System.out.println("Usage: inputFile outputFile");
            System.exit(0);
        }

        Scanner in = new Scanner(System.in);

        System.out.print("Name of input file: ");

        String fileName = args[0];

        System.out.println(args[0]);

        System.out.print("Name of output file: ");

        String outputName = args[1];

        System.out.println(args[1]);

        try {

            Scanner scan = new Scanner(new File(fileName + ".txt"));
            PrintWriter writer = new PrintWriter(outputName + ".txt");

            do {

                String line = scan.nextLine();
                writer.print(line + "\n");

            }

            while (scan.hasNext());

            scan.close();
            writer.close();
        }

        catch (FileNotFoundException fnf){

            System.out.println("File not found");
        }
    }
}
