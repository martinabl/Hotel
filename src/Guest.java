import java.time.LocalDate;

public class Guest {
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private int room;
    private boolean vacationtype;
    private int booking;

    public Guest(String firstName, String lastName, LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }


}
