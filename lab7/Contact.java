import java.util.Arrays;

public class Contact {
    private String name;
    private String [] phoneNumbers;

    public  Contact(String name){
        this.name = name;
        this.phoneNumbers =  new String[0];
    }

    public Contact(String name, String  phoneNumber){
        this.name = name;
        this.phoneNumbers = new String[1];
        this.phoneNumbers[0] = phoneNumber;
    }

    public String getName(String name){
        return name;
    }
    public String getName(){
        return name;
    }

    public String[] getPhoneNos() {
        return phoneNumbers;
    }

    public void addPhoneNo(String phoneNum){
        String [] newListOfPhNo = new String[phoneNumbers.length+1];
        for(int i=0;i< phoneNumbers.length;i++){
            newListOfPhNo[i] =phoneNumbers[i];
        }
        newListOfPhNo[phoneNumbers.length] = phoneNum;
        phoneNumbers = newListOfPhNo;
    }

    public void deletePhoneNo(String phoneNum){
        String [] newListOfNo = new String[phoneNumbers.length-1];
        for(int i=0,k=0;i<phoneNumbers.length;i++){
            if(phoneNumbers[i].equals(phoneNum)){
                continue;
            }
            else {
                newListOfNo[k++] = phoneNumbers[i];
            }
        }
        phoneNumbers = newListOfNo;
    }

    @Override
    public String toString(){
        String str = "";
        int i=0;
        while(i< phoneNumbers.length){
            str = str +"[" + i + "] " + phoneNumbers[i] + "\n";
            i++;
        }
        return "Name: "+getName(name) +"\nPhone number(s):\n"+ str;
    }

    public static void main(String [] args){
        Contact c1 = new Contact("Chan Tai Man", "91234567");
        System.out.println(c1);
        c1.addPhoneNo("97654321");
        System.out.println(c1);
        String [] p = c1.getPhoneNos();
        for(int i = 0; i < p.length; i++){
            System.out.println(p[i]);
        }
        c1.deletePhoneNo("91234567");
        System.out.println(c1);
        Contact c2 = new Contact("Luk Mei Mei");
        System.out.println(c2);
    }
}
