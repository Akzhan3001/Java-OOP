import org.omg.PortableInterceptor.LOCATION_FORWARD;

import java.time.LocalDate;


public class Book extends Publication implements Checkoutable{
    private String author;
    private LocalDate checkOutDate;
    public Book(String title, String publisher, String author){
        super(title, publisher);
        this.author=author;
    }

    @Override
    public void checkout() {
        LocalDate today = LocalDate.now();
        this.checkOutDate=today;
        System.out.println("Checkout date: "+checkOutDate);
        System.out.println("Return date: "+returndate());
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Author: "+author);
    }


    @Override
    public LocalDate returndate() {
        return  checkOutDate.plusDays(15);
    }
}
