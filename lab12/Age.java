import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        new Age().runApp();
    }

    void runApp() {
        while (true) {
            try {
                age();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    void age() throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age>");
        int age = in.nextInt();
        if (age < 0) {
            throw new Exception("Invalid Age!");
        }
        System.out.println("You are " + age + " years old.");
    }
}



