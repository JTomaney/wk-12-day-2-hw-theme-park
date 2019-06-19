import Attractions.Playground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Playgroundtest {

    Playground playground;

    @Before
    public void before() {
        playground = new Playground("Adventure");
    }

    @Test
    public void canGetName() {
        assertEquals("Adventure", playground.getName());
    }

}
