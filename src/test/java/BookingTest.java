import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Bedroom bedroom1;
    Booking booking1;


    @Before
    public void before(){
        bedroom1 = new Bedroom("Single", 1, 1, 10.00);
        booking1 = new Booking(bedroom1, 1.00);
    }

    @Test
    public void hasBedroom(){
        assertEquals(bedroom1, booking1.getBedroom());
    }

    @Test
    public void hasNumberOfNights(){
        assertEquals(1, booking1.getNumberOfNights(), 0.01);
    }

    @Test
    public void canCalculatePrice(){
        assertEquals(10.00, booking1.calculateBookingPrice(), 0.001);
    }
}
