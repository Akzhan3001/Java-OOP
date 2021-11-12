/**
 * The Bee class represents a bee object
 *
 * @author COMP2026
 * @version 1.0
 */

public class Bee {

    private int x;         //x coordinate of this Bee
    private int y;         //y coordinate of this Bee
    private int dx;        //horizontal velocity of this Bee
    private int dy;

    /**
     * Constructor to create a Bee object with the specified x, y coordinates and speed
     * @param x     the x coordinate of the Bee
     * @param y     the y coordinate of the Bee
     * @param dx    the horizontal velocity of the Bee
     */
    public Bee(int x, int y, int dx, int dy) {
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
    }

    /**
     * move this Bee object horizontally by dx units
     */
    public void moveHorizontally() {
        x = x + dx;
    }
    public void moveVertically() {
        y = y + dy;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ") with horizontal velocity " + dx +
                                      " and vertical velocity " + dy;
    }

    /**
     * @return the x coordinate of this Bee
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x coordinate to be set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y coordinate of this Bee
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y coordinate to be set
     */
    public void setY(int y) {
        this.y = y;
    }


    /**
     * @return the horizontal velocity of this Bee
     */
    public int getDx() {
        return dx;
    }


    /**
     * @param dx the horizontal velocity to be set
     */
    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDy() {
        return dy;
    }

    /**
     * @param dy the horizontal velocity to be set
     */
    public void setDy(int dy) {
        this.dy = dy;
    }


    public static void main(String[] args) {

        //Create two Bee objects
        Bee b1 = new Bee(11,22,1, 2 );
        Bee b2 = new Bee(33,44,3, 4);
        Bee b3 = new Bee(55,66,5, 6);
        //Print the Bee objects
        System.out.println("b1: " + b1);
        System.out.println("b2: " + b2);
        System.out.println("b3: " + b3);
        System.out.println();

        //Move the Bee objects to the right
        b1.moveHorizontally();
        b2.moveHorizontally();
        b3.moveHorizontally();

        //Print the Bee objects after moving
        System.out.println("After moving horizontally:");
        System.out.println("b1: " + b1);
        System.out.println("b2: " + b2);
        System.out.println("b3: " + b3);
        System.out.println();

        //update the x, y and speed of an object
        b1.setX(12);
        b1.setY(34);
        b2.setX(56);
        b2.setY(78);
        b3.setX(90);
        b3.setY(11);

        //get the x, y and speed from an object
        int b1X = b1.getX();
        int b1Y = b1.getY();
        int b1Dx = b1.getDx();

        int b2X = b2.getX();
        int b2Y = b2.getY();
        int b2Dx = b2.getDx();

        int b3X = b3.getX();
        int b3Y = b3.getY();
        int b3Dx = b3.getDx();

        System.out.println("After update:");
        System.out.println("b1: " + b1);
        System.out.println("b1: " + b2);
        System.out.println("b1: " + b3);
        System.out.println("Sum of X coordinates: "+(b1X+b2X+b3X));


    }
}
