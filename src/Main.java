import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");//

        Guest guestFirst = new Guest("Adéla","Malíková",LocalDate.of(1993,3,13));

        Guest guestSecond = new Guest("Jan","Dvořáček",LocalDate.of(1995,5,5));

        System.out.println("First name:" + guestFirst.getFirstName()+"Last name:" + guestFirst.getLastName()+", Birthday:" + guestFirst.getBirthday());

        System.out.println("First name:" + guestSecond.getFirstName()+"Last name:" + guestSecond.getLastName()+", Birthday:" + guestSecond.getBirthday());


    }

}