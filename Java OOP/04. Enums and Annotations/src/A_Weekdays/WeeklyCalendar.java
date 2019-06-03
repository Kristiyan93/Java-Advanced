package A_Weekdays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeeklyCalendar {
    private List<WeeklyEntry> entries;

    public WeeklyCalendar() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(String weekday, String note) {
        WeeklyEntry weeklyEntry = new WeeklyEntry(weekday, note);
        this.entries.add(weeklyEntry);
    }

    public Iterable<WeeklyEntry> getWeeklySchedule() {
        Collections.sort(entries, WeeklyEntry.BY_WEEKDAY);
        return entries;
    }
}
