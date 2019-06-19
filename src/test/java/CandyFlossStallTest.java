import Stalls.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    private CandyFlossStall candyFlossStall;

    @Before
    public void before() {
        candyFlossStall = new CandyFlossStall("Nardini's", "Mrs. Nardini", 6);
    }

    @Test
    public void canGetName() {
        assertEquals("Nardini's", candyFlossStall.getName());
    }

    @Test
    public void canGetOwnerName() {
        assertEquals("Mrs. Nardini", candyFlossStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot() {
        assertEquals(6, candyFlossStall.getParkingSpot());
    }

}
