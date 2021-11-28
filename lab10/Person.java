public class Person {
    private String name;
    public Person(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void saySomething(){
        System.out.println("I am "+name+". I am a person.");
    }
}
