import Stalls.TobacooStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    private TobacooStall tobaccoStall;

    @Before
    public void before() {
        tobaccoStall = new TobacooStall("Nardini's", "Mrs. Nardini", 6);
    }

    @Test
    public void canGetName() {
        assertEquals("Nardini's", tobaccoStall.getName());
    }

    @Test
    public void canGetOwnerName() {
        assertEquals("Mrs. Nardini", tobaccoStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot() {
        assertEquals(6, tobaccoStall.getParkingSpot());
    }

}
