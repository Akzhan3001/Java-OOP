import java.util.Scanner;

public class NumberFormat {

    public static void main(String[] args) {

        new NumberFormat().runApp();
    }

    void runApp() {
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("input> ");
            int num = Integer.parseInt(in.next());
            System.out.println("num: " + num);
        } catch (NumberFormatException e){
            System.out.println("NumberFormatException encountered!");
            System.out.println("The input value cannot be converted to integer.");
            e.printStackTrace();
        }

    }
}