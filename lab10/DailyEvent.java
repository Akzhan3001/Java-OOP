public class DailyEvent  extends Event{
    private String description;

    public DailyEvent(String description){
        super(description,2030,02,01);
        this.description=description;
    }

    public String toString(){
        return description +" (Daily)  "+" (id: "+getId()+")";
    }

    @Override
    public boolean occursOn(int year, int month, int day) {
        return true;
    }

    public String toFileString(){
        return "Daily "+ description+"\n";
    }
}
