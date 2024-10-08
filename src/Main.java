import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");//

        Guest guestFirst = new Guest("Adéla","Malíková",LocalDate.of(1993,3,13));

        Guest guestSecond = new Guest("Jan","Dvořáček",LocalDate.of(1995,5,5));

        System.out.println("Křestní jméno:" + guestFirst.getFirstName()+ ", Příjmení: " + guestFirst.getLastName()+", Datum narození: " + guestFirst.getBirthday());
        System.out.println("Křestní jméno:" + guestSecond.getFirstName()+ ", Příjmení: " + guestSecond.getLastName()+", Datum narození: " + guestSecond.getBirthday());

        guestSecond.setBirthday(LocalDate.of(1995,4,5));
        System.out.println(guestSecond.getBirthday());

        BookingManager bookingManagerFirstRoom = new BookingManager(1);
        System.out.println("room:" + bookingManagerFirstRoom.getRoom());
        BookingManager bookingManagerSecondRoom = new BookingManager(2);
        System.out.println("room:" + bookingManagerSecondRoom.getRoom());
        BookingManager bookingManagerThirdRoom = new BookingManager(3);
        System.out.println("room:" + bookingManagerThirdRoom.getRoom());

    }

}