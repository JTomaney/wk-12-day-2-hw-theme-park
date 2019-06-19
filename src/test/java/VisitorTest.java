import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before() {
        visitor = new Visitor(27, 6, 100);
    }

    @Test
    public void canGetAge() {
        assertEquals(27, visitor.getAge());
    }

    @Test
    public void canGetHeight() {
        assertEquals(6, visitor.getHeight());
    }

    @Test
    public void canGetMoney() {
        assertEquals(100, visitor.getMoney());
    }

}
