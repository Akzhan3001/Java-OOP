public class Square {

    private int length;  //side length of the square


    //Constructor
    public Square(int length) {
        this.length = length;
    }

    public static void main(String[] args){

        Square x = new Square(5);
        Square y = new Square(5);

        if(x.equals(y)){
            System.out.println("Same!");
        }
        else{
            System.out.println("Different!");
        }
    }
    public boolean equals(Square obj){
        if(this.length== obj.length){
            return true;
        }
        return false;
    }
}