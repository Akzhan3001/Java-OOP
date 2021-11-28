import java.time.LocalDate;

public class KidsMagazine extends Magazine implements Checkoutable{
    private int minimumAge;
    private int maximumAge;
    private LocalDate checkOutDate;
    public KidsMagazine(String title, String publisher,int volumeNumber,int issueNumber,int minimumAge,int maximumAge){
        super(title,publisher,volumeNumber,issueNumber);
        this.minimumAge=minimumAge;
        this.maximumAge=maximumAge;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Age range: "+minimumAge+" - "+maximumAge);
    }
    public boolean checking(int age){
        if(age>=minimumAge){
            return true;
        }
        return false;
    }
    @Override
    public void checkout() {
        this.checkOutDate=LocalDate.now();
        System.out.println("Check out date: "+checkOutDate);
        System.out.println("Return date: "+returndate());
    }

    @Override
    public LocalDate returndate() {
        return  checkOutDate.plusDays(7);
    }
}
