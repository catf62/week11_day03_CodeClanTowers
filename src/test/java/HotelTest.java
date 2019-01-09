import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Guest guest1;
    Guest guest2;
    Bedroom bedroom1;
    Bedroom bedroom2;
    OtherRoom otherRoom1;
    Hotel hotel;
    Booking booking1;

    @Before
    public void before(){
        guest1 = new Guest();
        guest2 = new Guest();
        bedroom1 = new Bedroom("Single", 1, 1, 10.00 );
        bedroom2 = new Bedroom("Double", 2, 2, 20.00);
        otherRoom1 = new OtherRoom("Conference Roomn", 2, 20.00);
        hotel = new Hotel();
        booking1 = new Booking(bedroom1, 5);
    }

    @Test
    public void bedRoomsStartsAtZero(){
        assertEquals(0, hotel.getBedroomCount());
    }

    @Test
    public void otherRoomsStartsAtZero(){
        assertEquals(0, hotel.getOtherRoomCount());
    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(bedroom1);
        assertEquals(1, hotel.getBedroomCount());
    }

    @Test
    public void canAddOtherRoom(){
        hotel.addOtherRoom(otherRoom1);
        assertEquals(1, hotel.getOtherRoomCount());
    }

    @Test
    public void checkGuestIntoRoom(){
        hotel.addBedroom(bedroom1);
        assertEquals(false, bedroom1.isBedroomFull());
        hotel.checkGuestIntoRoom(bedroom1, guest1);
        assertEquals(true, bedroom1.isBedroomFull());
    }

    @Test
    public void canCreateBooking(){
        hotel.createBooking(bedroom1, 5);
        assertEquals(5.00, hotel.createBooking(bedroom1, 5.00).getNumberOfNights(), 0.01);
    }

}
