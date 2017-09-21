import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class EventLog {
    private ArrayList<Event> eventList = new ArrayList<Event>();
    private HashSet<String> allowedEventNames = new HashSet<String>();

    public EventLog() {
        allowedEventNames.add("Face2Face");
        allowedEventNames.add("PhoneCall");
        allowedEventNames.add("TextMessaging");
        allowedEventNames.add("Unknown");
    }

    public boolean addEvent(Event event) throws IllegalArgumentException {
        if( event == null || event.getName() == null || event.getAction() == null ) {
            throw new IllegalArgumentException();
        } else {
            // verify that the event name is ok
            if( allowedEventNames.contains(event.getName() )) {
                eventList.add(event);
            } else {
                throw new IllegalArgumentException();
            }
        }

        return true;
    }

    public int getNumEvents() {
        return eventList.size();
    }
}
