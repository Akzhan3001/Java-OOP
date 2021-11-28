import java.util.ArrayList;
import java.util.List;

public class ChecoutableCollection {
    private List<Publication> checkoutableList;
    public ChecoutableCollection(){
        checkoutableList=new ArrayList<>();
    }
    public static void main(String []args){
        new ChecoutableCollection().runApp();
    }
    void runApp(){
        checkoutableList.add(new Book("Cindy and the Candy Factory","AA Press","Ben Den"));
        checkoutableList.add(new Book("Secret Code","MA House","Dim Green"));
        checkoutableList.add(new Magazine("Living","Person",5,3));
        checkoutableList.add(new Magazine("Cooking","Person",3,10));
        checkoutableList.add(new KidsMagazine("Tinkering","Teens World",3,10,6,12));
        checkoutableList.add(new KidsMagazine("My Dream","Teens World",8,5,3,6));
        
        for(Publication checkoutable: checkoutableList){
            checkoutable.print();
            checkoutable.checkout();
            System.out.println();
        }
    }
}
