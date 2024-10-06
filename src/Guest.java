import java.time.LocalDate;

public class Guest {
    private String name;
    private LocalDate birthday;
    private int room;
    private boolean vacationtype;
    private int booking;

    public Guest() {
        this.name = name;
        this.birthday = birthday;
        this.room = room;
        this.vacationtype = vacationtype;
        this.booking = booking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
