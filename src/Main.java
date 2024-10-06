import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");//

        Guest guest = new Guest();
        guest.setName("Adéla Malíková");
        System.out.println(guest.getName());

        guest.setBirthday("1993, 3, 13");
        System.out.println(guest.getBirthday());

        guest.setName("Jan Dvořáček");
        System.out.println(guest.getName());

        guest.setBirthday("1995, 5, 5");
        System.out.println(guest.getBirthday());
    }

}