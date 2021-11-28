import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScheduleBook {

    List<Event> aList;

    public ScheduleBook() {
        aList = new ArrayList<>();
    }

    public static void main(String[] args) throws Exception {
        new ScheduleBook().runApp();

    }

    public void runApp() throws Exception {
        boolean exit=false;
        while(!exit){
            Scanner in3 = new Scanner(System.in);
            System.out.println("1. Load events from file");
            System.out.println("2. Save events to file");
            System.out.println("3. Show events");
            System.out.println("4. Add event");
            System.out.println("5. Remove event");
            System.out.println("6. Quit");
            System.out.println();
            System.out.print("Option: ");

            String option = in3.next();
            if(option.equals("1")){
                System.out.print("Enter the filename: ");
                String filename = in3.next();
                loadEvents(filename);
            }
            else if(option.equals("2")){
                System.out.print("Enter output filename: ");
                String outfile = in3.next();
                saveEvents(outfile);
            }
            else if(option.equals("3")){
                System.out.print("Enter the date(YYYY MM DD): ");
                int year = in3.nextInt();
                int month= in3.nextInt();
                int day = in3.nextInt();
                printEventsOn(year,month,day);
            }
            else if(option.equals("4")){
                addEvent(in3);
            }
            else if(option.equals("5")){
                System.out.print("Enter event id: ");
                int id = in3.nextInt();
                removeEvent(id);
            }
            else if(option.equals("6")){
                System.out.println("Bye~");
                exit=true;
                System.exit(0);
            }
            else{
                System.out.print("Error404... Cannot identify command number... Try again...");
            }
        }

        /*System.out.print("Enter the date(YYYY MM DD): ");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int month = in.nextInt();
        int day = in.nextInt();
        printEventsOn(year, month, day);*/

    }


    public int loadEvents(String filename) throws Exception{
        File inFile = new File(filename);
        Scanner inputFile = new Scanner(inFile);
        while (inputFile.hasNextLine()){
            String str = inputFile.nextLine();
            String [] tokenArray = getTokens(str);

            if(tokenArray[0].toLowerCase().equals("onetime")){
                String descripion ="";
                for(int i=4;i< tokenArray.length;i++){
                    descripion+=tokenArray[i]+" ";
                }
                aList.add(new OnetimeEvent(descripion,st2int(tokenArray[1]),st2int(tokenArray[2]),st2int(tokenArray[3])));
            }
            else if(tokenArray[0].toLowerCase().equals("monthly")){
                String descripion ="";
                for(int i=2;i< tokenArray.length;i++){
                    descripion+=tokenArray[i]+" ";
                }
                aList.add(new MonthlyEvent(descripion,st2int(tokenArray[1])));
            }
            else if(tokenArray[0].toLowerCase().equals("daily")){
                String descripion ="";
                for(int i=1;i< tokenArray.length;i++){
                    descripion+=tokenArray[i]+" ";
                }
                aList.add(new DailyEvent(descripion));
            }
            else{
                System.out.println("ERROR404(Mistypo)... Try again ");
            }
        }
        /*aList.add(new OnetimeEvent("See dentist", 2030, 5, 2));
        aList.add(new OnetimeEvent("Mary's Birthday", 2030, 12, 23));
        aList.add(new OnetimeEvent("Christmas Party", 2030, 12, 25));
        aList.add(new OnetimeEvent("Visit Bob", 2030, 11, 12));
        aList.add(new OnetimeEvent("Visit Ada", 2030, 11, 5));
        aList.add(new MonthlyEvent("Pay Bills", 5));
        aList.add(new MonthlyEvent("Visit Dad", 2));
        aList.add(new MonthlyEvent("Visit Dad", 23));
        aList.add(new DailyEvent("Yoga class"));*/

        return 0; //to be modified
    }

    //you are not allowed to modify this method
    public void printEventsOn(int year, int month, int day) {
        for (Event a : aList) {
            if (a.occursOn(year, month, day)) {
                System.out.println(a);
            }
        }
    }

    public void saveEvents(String filename) throws Exception {
        FileWriter fwriter = new FileWriter(filename, true);//printing the output file
        PrintWriter out = new PrintWriter(fwriter);
        for(int i=0;i< aList.size();i++) {
            out.println(aList.get(i));
        }
        System.out.println("Successfully saved!");
        out.close();
    }

    public void removeEvent(int id) {
        aList.remove(id-1);
    }

    public void addEvent(Scanner in3) {
        System.out.print("Enter type (onetime,daily or monthly): ");
        String answer1 = in3.next();

        if(answer1.toLowerCase().equals("daily")){
            System.out.println("Enter description: ");
            String description = in3.nextLine();
            aList.add(new DailyEvent(description));
        }
        else if(answer1.toLowerCase().equals("monthly")){
            System.out.print("Enter a day: ");
            int day = in3.nextInt();
            System.out.print("Enter description: ");
            String desciption = in3.next();
            aList.add(new MonthlyEvent(desciption,day));
        }
        else if(answer1.toLowerCase().equals("onetime")){
            System.out.print("Enter the date(YYY MM DD): ");
            int year = in3.nextInt();
            int month = in3.nextInt();
            int day = in3.nextInt();
            System.out.print("Enter description: ");
            String desciption = in3.next();
            aList.add(new OnetimeEvent(desciption,year,month,day));
        }

    }

    public static int skipSpaces(String str, int start) {
        int pos = start;
        while (pos < str.length()) {
            char c = str.charAt(pos);
            if (c != ' ' ) {
                break;
            } else {
                pos++;
            }
        }
        return pos;
    }

    public static String nextToken(String str, int start) {
        int pos = start;
        String newToken="";
        while (pos < str.length()) {
            char c = str.charAt(pos);
            if (c != ' ') {
                newToken= newToken+ c;
                pos++;
            } else {
                break;
            }
        }
        return newToken;
    }

    public static String [] addToTokenArray(String [] tokenArray, String newToken) {
        // create a new array, newTokenArray, which is longer than tokenArray by ONE element
        if(newToken.length()==0){
            return tokenArray;
        }
        String [] newTokenArray = new String[tokenArray.length+1];
        // copy all elements from tokenArray to newTokenArray
        for(int i=0;i< tokenArray.length;i++){
            newTokenArray[i]=tokenArray[i];
        }
        newTokenArray[newTokenArray.length-1] = newToken;
        // add newToken as the last element of newTokenArray

        return newTokenArray;
    }

    public static String [] getTokens(String str){
        int pos =0;
        String[] tokenArray = new String[0];
        while(pos<str.length()){
            pos =skipSpaces(str, pos);
            String newToken =nextToken(str,pos);
            pos+=newToken.length();
            tokenArray = addToTokenArray(tokenArray,newToken);
        }
        return tokenArray;
    }

    int st2int(String str){
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c==','){
                continue;
            }
            int value = c - '0';
            result = result * 10+value ;
        }
        return result;
    }

}
