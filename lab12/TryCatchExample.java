import java.io.*;
import java.util.*;

public class TryCatchExample {
    public static void main(String[] args) {
        new TryCatchExample().runApp();
    }

    void runApp() {
        Scanner in = new Scanner(System.in);
        String filename = "output.txt";
        PrintWriter out = null;
        try {

            out = new PrintWriter(filename);
            int num;
            do {
                System.out.print("Input>");
                String s = in.nextLine();
                num = Integer.parseInt(s);
                if (num != -1) {
                    out.println(num * num);
                }
            } while (num != -1);
            //out.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            out.close();
        }
    }
}



