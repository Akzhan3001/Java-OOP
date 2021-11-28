import org.omg.CORBA.CODESET_INCOMPATIBLE;

import java.util.Arrays;

public class PhoneBook {
    public Contact [] Contact;

    public PhoneBook(){
        this.Contact =  new Contact[0];
    }

    public void addContact(String name,String phoneNo){
       Contact [] contactList  = new Contact[Contact.length+1];
       for(int i=0;i<Contact.length;i++){
           contactList[i] = Contact[i];
       }
       contactList[Contact.length]= new Contact(name, phoneNo);

       for(int i = 0; i < contactList.length-1; ++i) {
            for (int j = i + 1; j < contactList.length; ++j) {
                if (contactList[i].getName().compareTo(contactList[j].getName()) >  0) {
                    Contact switchContact = contactList[i];
                    contactList[i] = contactList[j];
                    contactList[j] = switchContact;
                }
            }
        }
        Contact = contactList;
    }

    public Contact getContact(String name) {
       int need=-1;
       for(int i = 0; i < Contact.length; i++) {
                if (Contact[i].getName().equals(name)) {
                    need=i;
                }
                else if(i== Contact.length-1 && need==-1 ){
                    return null;
                }
        }
        return Contact[need];
    }

    public void addPhoneToExistingContact(String name, String phoneNo){
        Contact foundContact;
        foundContact = getContact(name);
        foundContact.addPhoneNo(phoneNo);
    }
    public void updateContact(String name, String oldPhoneNo,String newPhoneNO){
        Contact foundContact;
        foundContact = getContact(name);
        foundContact.deletePhoneNo(oldPhoneNo);
        foundContact.addPhoneNo(newPhoneNO);
    }

    public void removeContact(String name){
        Contact [] newListOfContact = new Contact[Contact.length-1];
        for(int i = 0,k=0; i < Contact.length; i++) {
            if (Contact[i].getName().equals(name)) {
                continue;
            }
            else{
                newListOfContact[k++]=Contact[i];
            }
        }
        Contact = newListOfContact;
    }

    @Override
    public String toString(){
        String str = "";
        int i=0;
        while(i< Contact.length){
            str = str+ Contact[i];
            i++;
        }
        return str;
    }

    public static void main(String [] args){
         PhoneBook b = new PhoneBook(); //add contacts
         b.addContact("Chan Tai Man", "96385274");
         System.out.println(b);
         b.addContact("Ma Kin", "65478921");
         System.out.println(b);
         b.addContact("Au Siu Ming", "94562584");
         System.out.println(b);
         b.addContact("Koo Ka Ka", "91122334");
         System.out.println(b);

         System.out.println(b.getContact("Chan Tai Man"));
         System.out.println(b.getContact("X X X"));
         System.out.println();

         b.addPhoneToExistingContact("Au Siu Ming", "61234578");
         System.out.println(b.getContact("Au Siu Ming"));

         b.updateContact("Ma Kin", "65478921", "61231231");
         System.out.println(b.getContact("Ma Kin"));

         b.removeContact("Ma Kin");
         System.out.println(b);
         b.removeContact("Chan Tai Man");
         System.out.println(b);
         b.removeContact("Au Siu Ming");
         System.out.println(b);
         b.removeContact("Koo Ka Ka");
         System.out.println(b);
    }
}
