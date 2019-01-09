import java.util.ArrayList;

public class OtherRoom {
    private String name;
    private int capacity;
    private ArrayList<Guest> guests;
    private double price;

    public OtherRoom(String name, int capacity, double price){
        this.name = name;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.price = price;
    }

    public int otherRoomGuestCount() {
        return guests.size();
    }


    public String getName() {
        return name;
    }


    public int getCapacity() {
        return capacity;
    }

    public double getPrice() {
        return price;
    }

}
