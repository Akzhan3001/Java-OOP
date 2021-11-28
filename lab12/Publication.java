public abstract class Publication implements Checkoutable{
    private String title;
    private String publisher;

    public Publication(String title,String publisher){
        this.title = title;
        this.publisher=publisher;
    }
    public void print(){
        System.out.println("Title: "+title);
        System.out.println("Publisher: "+publisher);
    }
    public boolean comparing(String s){
        if(s.equals(title)){
            return true;
        }
        return false;
    }
}
