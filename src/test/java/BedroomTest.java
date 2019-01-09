import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom1;
    Guest guest1;

    @Before
    public void before(){
        bedroom1 = new Bedroom("Single", 1, 1, 10.00);
        guest1 = new Guest();
    }

    @Test
    public void guestsStartAtZero(){
        assertEquals(0, bedroom1.bedroomGuestCount());
    }

    @Test
    public void bedroomHasType(){
        assertEquals("Single", bedroom1.getType());
    }

    @Test
    public void bedroomRoomNumber(){
        assertEquals(1, bedroom1.getRoomNumber());
    }

    @Test
    public void bedroomCapacity(){
        assertEquals(1, bedroom1.getCapacity());
    }

    @Test
    public void bedroomNightlyRate(){
        assertEquals(10.00, bedroom1.getNightlyRate(), 0.001);
    }

    @Test
    public void canAddGuestToBedroom(){
        bedroom1.addGuestToBedroom(guest1);
        assertEquals(1, bedroom1.bedroomGuestCount());
    }

    @Test
    public void canRemoveGuestFromBedroom(){
        bedroom1.addGuestToBedroom(guest1);
        assertEquals(1, bedroom1.bedroomGuestCount());
        bedroom1.ejectGuest(guest1);
        assertEquals(0, bedroom1.bedroomGuestCount());
    }
}
