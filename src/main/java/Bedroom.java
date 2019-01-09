import java.util.ArrayList;

public class Bedroom {

    private String type;
    private int roomNumber;
    private int capacity;
    private double nightlyRate;
    private ArrayList <Guest> guests;

    public Bedroom(String type, int roomNumber, int capacity, double nightlyRate) {
        this.type = type;
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.nightlyRate = nightlyRate;
        this.guests = new ArrayList<>();
    }

    public int bedroomGuestCount(){
        return guests.size();
    }

    public String getType() {
        return type;
    }


    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }

    public boolean isBedroomFull() {
        if(this.bedroomGuestCount() >= capacity){
            return true;
        } else {
            return false;
        }
    }

    public void addGuestToBedroom(Guest thisGuest){
        if(!this.isBedroomFull()) {
            guests.add(thisGuest);
        }
    }

    public void ejectGuest(Guest thisGuest) {
        guests.remove(thisGuest);
    }



}
