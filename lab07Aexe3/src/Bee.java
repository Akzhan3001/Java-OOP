/**
 * The Bee class represents a bee object
 *
 * @author COMP2026
 * @version 1.0
 */

public class Bee {

    private int x;         //x coordinate of this Bee
    private int y;         //y coordinate of this Bee
    private int speed;     //speed of this Bee

    /**
     * Constructor to create a Bee object with the specified x, y coordinates and speed
     * @param x     the x coordinate of the Bee
     * @param y     the y coordinate of the Bee
     * @param speed the speed of the Bee
     */
    public Bee(int x, int y, int speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    /**
     * move this Bee object to the right by speed units
     */
    public void moveRight() {
        x = x + speed;
    }


    @Override
    public String toString() {
        return "(" + x + "," + y + ") with speed " + speed;
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
     * @return the speed of this Bee
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to be set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int compareSpeed(Bee obj){
        if(this.speed > obj.speed){
            return 1;
        }
        else if(this.speed< obj.speed){
            return  -1;
        }
        return 0;
    }
    public static void main(String [] args){
        Bee alice = new Bee(55,25,5);
        Bee bob = new Bee(78,97,3);

        if(alice.compareSpeed(bob)<0){
            System.out.println("Alice flies slower than Bob.");
        }
        else if(alice.compareSpeed(bob)>0){
            System.out.println("Alice flies faster than Bob.");
        }
        else{
            System.out.println("Alice and Bob fly in the same speed.");
        }
    }

}