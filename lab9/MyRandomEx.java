import java.util.Random;

public class MyRandomEx {
    public static void main(String [] args){
        Random ran = new Random(10);
        for(int i=0;i<5;i++){
            System.out.println("Random integer: "+ran.nextInt(20));
        }
    }
}
