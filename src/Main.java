import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Guest adela = new Guest("Adéla","Malíková",LocalDate.of(1993,3,13));

        Guest jan = new Guest("Jan","Dvořáček",LocalDate.of(1995,5,5));

        System.out.println("Křestní jméno:" + adela.getFirstName()+ ", Příjmení: " + adela.getLastName()+", Datum narození: " + adela.getBirthday());
        System.out.println("Křestní jméno:" + jan.getFirstName()+ ", Příjmení: " + jan.getLastName()+", Datum narození: " + jan.getBirthday());

        jan.setBirthday(LocalDate.of(1995,4,5));
        System.out.println(jan.getBirthday());

        Room firstRoom = new Room(1,1,true, true, new BigDecimal("1000"));
        Room secondRoom = new Room(2,1, true, true, new BigDecimal("1000"));
        Room thirdRoom = new Room(3,3, false, true, new BigDecimal("2400"));

        System.out.println("Pokoj číslo: " + 1);
        System.out.println("Kapacita: " + 1);
        System.out.println("Cena za noc: " + 1100 + " Kč");
        System.out.println("Má balkón: " + ("Ano"));
        System.out.println("Výhled na moře: " + ("Ano"));

        System.out.println("Pokoj číslo: " + 2);
        System.out.println("Kapacita: " + 1);
        System.out.println("Cena za noc: " + 1100 + " Kč");
        System.out.println("Má balkón: " + ("Ano"));
        System.out.println("Výhled na moře: " + ("Ano"));

        System.out.println("Pokoj číslo: " + 3);
        System.out.println("Kapacita: " + 3);
        System.out.println("Cena za noc: " + 2400 + " Kč");
        System.out.println("Má balkón: " + ("Ne"));
        System.out.println("Výhled na moře: " + ("Ano"));


        Booking booking1 = new Booking(adela, firstRoom, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), false);
        Booking booking2 = new Booking(adela, thirdRoom, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), false);
        booking2.addOtherGuest(jan);

        List<Booking> bookingList = new ArrayList<>();
        bookingList.add(booking1);
        bookingList.add(booking2);

        System.out.println("Výpis všech rezervací v systému:");
        for (Booking booking : bookingList) {
            System.out.println(booking.getBookingDescription());
        }


    }


}