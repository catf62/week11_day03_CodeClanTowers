import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OtherRoomTest {

    OtherRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new OtherRoom("Conference Room", 2, 20.00);
    }

    @Test
    public void guestsStartAtZero(){
        assertEquals(0, conferenceRoom.otherRoomGuestCount());
    }

    @Test
    public void hasName(){
        assertEquals("Conference Room", conferenceRoom.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, conferenceRoom.getCapacity());
    }

    @Test
    public void hasPrice(){
        assertEquals(20.00, conferenceRoom.getPrice(), 0.001);
    }
}
