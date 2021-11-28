import java.util.Scanner;

public class PwdValidator {
    public static boolean isValid(String psw){
        int num =0;
        int num1 =0;
        int num2=0;
        if(psw.length()<8 || psw.length() >14) {
            return false;
        }

        for(int i=0; i< psw.length();i++){
            char c = psw.charAt(i);
            if(c>='a' && c<='z') {
                num++;
            }
        }

       for(int i=0; i< psw.length();i++){
            char c = psw.charAt(i);
            if(c>='A' && c<='Z') {
                num1++;
            }
        }

        for(int i=0; i< psw.length();i++){
            char c = psw.charAt(i);
            if(c>='0' && c<='9') {
                num2++;
            }
        }
        if(num==0 || num1 ==0 || num2==0){
            return false;
        }

        if(!(psw.contains("!") || psw.contains("-") || psw.contains(".")|| psw.contains(",")|| psw.contains("~")|| psw.contains("_")|| psw.contains("@"))){
            return false;
        }
        return true;
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input your password: ");
        String psw = in.nextLine();
        if(isValid(psw)){
           System.out.println("Valid password!");
        }
        else{
            System.out.println("Invalid password!");
        }
    }
}
