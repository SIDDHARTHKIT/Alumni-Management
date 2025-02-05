import java.io.IOException;
import java.util.*;

public class EventManager {
    private static final String CSV_FILE = "Events.csv";

    public void addEvent(Event event) throws IOException {
        List<String[]> eventData = CSVUtil.readCSV(CSV_FILE);
        eventData.add(new String[] { event.getEventName(), event.getEventDate(), event.getDescription() });
        CSVUtil.writeCSV(CSV_FILE, eventData);
    }

    public List<Event> getAllEvents() throws IOException {
        List<Event> eventList = new ArrayList<>();
        List<String[]> data = CSVUtil.readCSV(CSV_FILE);
        for (String[] row : data) {
            eventList.add(new Event(row[0], row[1], row[2]));
        }
        return eventList;
    }
}




public class Achievement {
    private String alumniName;
    private String achievement;
    private String date;

    public Achievement(String alumniName, String achievement, String date) {
        this.alumniName = alumniName;
        this.achievement = achievement;
        this.date = date;
    }

    public String getAlumniName() {
        return alumniName;
    }

    public String getAchievement() {
        return achievement;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return alumniName + ", " + achievement + ", " + date;
    }
}

