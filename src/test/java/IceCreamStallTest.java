import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    private IceCreamStall iceCreamStall;

    @Before
    public void before() {
        iceCreamStall = new IceCreamStall("Nardini's", "Mrs. Nardini", 6);
    }

    @Test
    public void canGetName() {
        assertEquals("Nardini's", iceCreamStall.getName());
    }

    @Test
    public void canGetOwnerName() {
        assertEquals("Mrs. Nardini", iceCreamStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot() {
        assertEquals(6, iceCreamStall.getParkingSpot());
    }
}
