public class Student extends Person{
    private String major;
    public Student(String name, String major){
        super(name);
        this.major=major;
    }
    public void saySomething(){
        System.out.println("I am "+getName()+". I am a student. "+ "My major is "+major+".");
    }

}
