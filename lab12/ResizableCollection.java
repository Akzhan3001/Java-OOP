import java.util.ArrayList;
import java.util.List;

public class ResizableCollection {
    private List<Resizable> resizableList;
    public ResizableCollection() {
        resizableList = new ArrayList<Resizable>();
    }
    public static void main(String args[]) {
        new ResizableCollection().runApp();
    }
    void runApp(){
        resizableList.add(new Rectangle('D',7,8,10,20));
        resizableList.add(new Rectangle('E',9,10,5,10));
        resizableList.add(new Circle('E',5));
        resizableList.add(new Circle('E',15));
        for(Resizable resizable: resizableList){
            System.out.println(resizable);
        }
        System.out.println();
        System.out.println("After resize...\n");
        for(Resizable resizable: resizableList){
            resizable.resize();
            System.out.println(resizable);
        }
    }
}
