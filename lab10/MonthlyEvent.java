public class MonthlyEvent extends Event{
    private String description;
    private int day;

    public MonthlyEvent(String description, int day){
        super(description,2030,01,day);
        if(day>0 && day<32) {
            this.description = description;
            this.day = getDay();
        }
        else{
            this.description=null;
        }
    }

    @Override
    public String toString() {
        return description +" (Monthly)  "+" (id: "+getId()+")";
    }


    @Override
    public boolean occursOn(int year, int month, int day) {
        return  day == getDay();
    }

    public String toStringFile(){
        String str="";
        return "Monthly "+day+" "+ description+"\n";
    }
}
