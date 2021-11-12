public class BeeTester {
    public static void main(String args[]){
        new BeeTester().runApp();
    }
    void runApp(){

        Bee b1 = new Bee(11,22,1, 2 );
        Bee b2 = new Bee(33,44,3, 4);
        Bee b3 = new Bee(55,66,5, 6);
        System.out.println("b1: "+ b1);
        System.out.println("b2: "+ b2);
        System.out.println("b3: "+ b3);
        System.out.println();

        b1.moveVertically();
        b2.moveVertically();
        b3.moveVertically();

        System.out.println("After moving vertically: ");
        System.out.println("b1: "+ b1);
        System.out.println("b2: "+ b2);
        System.out.println("b3: "+ b3);
        System.out.println();
/*
        b1.setX(12);
        b1.setY(34);
        b2.setX(56);
        b2.setY(78);
        b3.setX(90);
        b3.setY(11);

        int b1X = b1.getX();
        int b2X = b2.getX();
        int b3X = b3.getX();

        System.out.println("Sum of X coordinates: "+(b1X+b2X+b3X));
        System.out.println();
        System.out.println("After update:");
        System.out.println("b1: " + b1);
        System.out.println("b2: " + b2);
        System.out.println("b3: " + b3);

 */
    }
}
