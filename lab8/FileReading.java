import java.io.*;
import java.util.Scanner;


public class FileReading {

    public static void main(String[] args)  {

        new FileReading().runApp();
    }

    void runApp()  {
        try {
            File inFile = new File("input.txt");
            Scanner inputFile = new Scanner(inFile);
            while (inputFile.hasNextLine()) {
                String s = inputFile.nextLine();
                System.out.println(s);
            }
            inputFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Input file does not exists!");
            e.printStackTrace();
        }
    }
}