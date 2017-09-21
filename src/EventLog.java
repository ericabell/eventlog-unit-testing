import java.util.ArrayList;
import java.util.List;

public class EventLog {
    private ArrayList<Event> eventList = new ArrayList<Event>();

    public EventLog() {

    }

    public boolean addEvent(Event event) throws IllegalArgumentException {
        if( event == null || event.getName() == null || event.getAction() == null ) {
            throw new IllegalArgumentException();
        }
        System.out.println(event.getName() + " " + event.getAction());

        eventList.add(event);
        return true;
    }

    public int getNumEvents() {
        return eventList.size();
    }
}
