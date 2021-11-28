public class Rectangle extends Shape implements Movable,Resizable{
    private double width;
    private double length;
    private int x;
    private int y;


    public Rectangle() {
        this(' ', 1, 1,1,1);
    }

    public Rectangle(char name, int x,int y,double width, double length) {
        super(name);
        this.x=x;
        this.y=y;
        this.width = width;
        this.length = length;

    }

    public double area() {
        return width * length;
    }

    public double perimeter() {
        return (width + length) * 2;
    }

    public String toString() {
        return "Rectangle " + super.getName() +" ("+x+", "+y+")"+ "\nWidth: " + width + "\nLength: " + length + "\n";
    }


    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }

    @Override
    public void setX(int x) {
        this.x=x;
    }

    @Override
    public void setY(int y) {
        this.y=y;
    }

    @Override
    public void moveLeft() {
        this.x=x-DX;
    }

    @Override
    public void moveRight() {
        this.x=x+DX;
    }

    @Override
    public void resize() {
        this.width=width*DEFAULT_FACTOR;
        this.length=length*DEFAULT_FACTOR;
    }
}



