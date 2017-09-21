import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class EventLogTest {
    public Event event1 = new Event();
    public Event event2 = new Event();
    public Event event3;

    @Before
    public void setUp() throws Exception {
        event1.setName("Name");
        event1.setAction("Action");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addEvent() throws Exception {
        EventLog eventLog = new EventLog();
        assertTrue( eventLog.addEvent(event1) );
    }

    @Rule //Another annotation directed to JUnit
    public ExpectedException expected = ExpectedException.none();

    @Test
    public void addEventNull() throws Exception {
        expected.expect(IllegalArgumentException.class);
        EventLog eventLog = new EventLog();
        eventLog.addEvent(event2);
    }

    @Test
    public void getNumEvents() throws Exception {
    }


}