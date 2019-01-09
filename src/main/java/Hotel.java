import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedRooms;
    private ArrayList<OtherRoom> otherRooms;

    public Hotel (){
        this.bedRooms = new ArrayList<>();
        this.otherRooms = new ArrayList<>();
    }


    public int getBedroomCount() {
       return  this.bedRooms.size();
    }

    public int getOtherRoomCount() {
        return this.otherRooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedRooms.add(bedroom);
    }

    public void addOtherRoom(OtherRoom otherRoom) {
        this.otherRooms.add(otherRoom);
    }

    public void checkGuestIntoRoom(Bedroom bedroom, Guest guest) {
        if(!bedroom.isBedroomFull()){
            bedroom.addGuestToBedroom(guest);
        }
    }

    public Booking createBooking(Bedroom bedroom, double numberOfNights) {
        if(!bedroom.isBedroomFull()){
            Booking newBooking = new Booking(bedroom, numberOfNights);
            return newBooking;
        } else {
            return null;
        }
    }



}
