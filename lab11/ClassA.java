public abstract class ClassA {
    private int x;
    public ClassA(int x){
        this.x=x;
    }
    public void m1(){
        System.out.println("Hello!");
    }
    public abstract int m2(int n);
}
