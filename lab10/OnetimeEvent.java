public class OnetimeEvent extends Event {
    private String description;
    private int year;
    private int month;
    private int day;

    public OnetimeEvent(String description, int year, int month, int day){
        super(description,year,month,day);
        this.description=description;
        this.year=year;
        this.month=month;
        this.day=day;
    }

    @Override
    public String toString() {
        return description +" (One time)  "+" (id: "+getId()+")";
    }

    public String toFileString(){
        return "Onetime "+ year+" "+month+" "+day+" "+description+"\n";
    }
}
