import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    private Guest guest;
    private Room room;
    private LocalDate checkIn;
    private LocalDate checkout;
    private List<Guest> otherGuests = new ArrayList<>();
    private boolean isWorkingStay;


    public Booking(Guest guest, Room room, LocalDate checkIn, LocalDate checkout, boolean isWorkingStay) {
        this.guest = guest;
        this.room = room;
        this.checkIn = checkIn;
        this.checkout = checkout;
        this.isWorkingStay = isWorkingStay;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    public List<Guest> getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(List<Guest> otherGuests) {
        this.otherGuests = otherGuests;
    }

    public boolean isWorkingStay() {
        return isWorkingStay;
    }

    public void setWorkingStay(boolean workingStay) {
        isWorkingStay = workingStay;
    }

    public void addOtherGuest(Guest guest) {
        otherGuests.add(guest);
    }

    public void removeOtherGuest(Guest guest) {
        otherGuests.remove(guest);
    }

    public String getBookingDescription() {
        StringBuilder result = new StringBuilder("Rezervace pro: " + guest.getDescription() + " na: " + room.getRoomNumber()
                + " termín: " + checkIn + " - " + checkout
                + " pracovní pobyt: " + (isWorkingStay ? "ano" : "ne"));
        if (! otherGuests.isEmpty()) {
            result.append(", další hosté: \n");
            for (Guest guest : otherGuests) {
                result.append(guest.getDescription()).append("\n");
            }
        }
        return result.toString();
    }
}

