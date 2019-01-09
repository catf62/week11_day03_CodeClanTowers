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

    public void isThereFreeRoom(Bedroom bedroom){
        for (int i = 0; i < this.bedRooms.size(); i++) {
            bedroomArray = this.bedRooms;

            if(!this.bedRoomsisBedroomFull()){
                return true;
            }

        }

    }



}
