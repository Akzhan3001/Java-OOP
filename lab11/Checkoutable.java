import java.time.LocalDate;
public interface Checkoutable {
    void checkout();
    LocalDate returndate();
}
