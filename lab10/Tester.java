public class Tester {
    public static void main(String [] args){

        Person p = new Person("Alan");
        Person s = new Student("Bob","CS");
        Person t = new Teacher("Chris",1000);

        p.saySomething();
        s.saySomething();
        t.saySomething();
    }
}
