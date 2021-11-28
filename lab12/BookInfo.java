import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.*;

public class BookInfo {

    private List<Publication> pList;

    public BookInfo() {
        this.pList = new ArrayList<Publication>();
    }

    public static void main(String[] args) {
        new BookInfo().runApp();
    }

    public void runApp() {
        addPublications();
        showAllPublications();
        showAllBooks();
        showAllMagazines();
        showAllKidsMagazines();
        showKidsMagazineByAge(6);
        showKidsMagazineByAge(5);
        showPublicationByTitle("Secret Code");
        showPublicationByTitle("Tinkering");

        //test the methods here...

    }

    public void addPublications() {
        Publication b1 = new Book("Cindy and the Candy Factor","AA Press","Ben Don");
        Publication b2 = new Book("Secret Code","MA House","Dim Green");
        Publication m1 = new Magazine("Living","Person",5,3);
        Publication m2 = new Magazine("Cooking","Person",3,10);
        Publication km1 = new KidsMagazine("Tinkering","Teens World",3,10,6,12);
        Publication km2 = new KidsMagazine("Tinkering","Teens World",3,11,6,12);
        Publication km3 = new KidsMagazine("Tinkering","Teens World",3,12,6,12);
        Publication km4 = new KidsMagazine("My Dream","Teens World",8,5,3,6);
        pList.add(b1);
        pList.add(b2);
        pList.add(m1);
        pList.add(m2);
        pList.add(km1);
        pList.add(km2);
        pList.add(km3);
        pList.add(km4);
    }

    public void showAllPublications() {
        for (int i=0;i<pList.size();i++){
            pList.get(i).print();
            System.out.println();
        }
    }

    public void showAllBooks() {
        for (Publication b: pList){
         if(b instanceof Book){
             b.print();
                 System.out.println();
         }
        }
    }

    public void showAllMagazines() {
        for (Publication m: pList){
            if(m instanceof Magazine){
                m.print();
                System.out.println();
            }
        }
    }

    public void showAllKidsMagazines(){
        for (Publication km: pList){
            if(km instanceof KidsMagazine){
                km.print();
                System.out.println();
            }
        }
    }

    public void showKidsMagazineByAge(int age){
        for (Publication km: pList){
            if(km instanceof KidsMagazine && ((KidsMagazine) km).checking(age)){
                km.print();
                System.out.println();
            }
        }
    }

    public void showPublicationByTitle(String s) {
        for (Publication p: pList){
            if(p.comparing(s)){
                p.print();
                System.out.println();
            }
        }
    }
}
