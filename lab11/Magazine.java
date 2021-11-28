import java.time.LocalDate;

public class Magazine extends Publication implements Checkoutable{
    private int volumeNumber;
    private int issueNumber;
    private LocalDate checkOutDate;

    public Magazine(String title, String publisher, int volumeNumber,int issueNumber){
        super(title,publisher);
        this.volumeNumber=volumeNumber;
        this.issueNumber=issueNumber;
    }
    @Override
    public void checkout() {
        this.checkOutDate=LocalDate.now();
        System.out.println("Check out date: "+checkOutDate);
        System.out.println("Return date: "+returndate());
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Volume: "+volumeNumber);
        System.out.println("Issue: "+issueNumber);
    }



    @Override
    public LocalDate returndate() {
        return  checkOutDate.plusDays(7);
    }
}
