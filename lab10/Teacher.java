public class Teacher extends Person{
    private double monthlySalary;
    public Teacher(String name,double monthlySalary){
        super(name);
        this.monthlySalary=monthlySalary;
    }
    public void saySomething(){
        super.saySomething();
        System.out.println("I am a teacher, too!");
    }
}
