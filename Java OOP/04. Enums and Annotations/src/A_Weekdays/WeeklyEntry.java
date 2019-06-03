package A_Weekdays;

import java.util.Comparator;

public class WeeklyEntry {
    public final static Comparator<WeeklyEntry> BY_WEEKDAY = getComperator();

    private Weekday weekday;
    private String note;

    public WeeklyEntry(String weekday, String note) {
        this.weekday = Weekday.valueOf(Weekday.class, weekday.toUpperCase());
        this.note = note;
    }

    @Override
    public String toString() {
        return String.format("%s-%s", this.weekday, this.note);
    }

    private static Comparator<WeeklyEntry> getComperator() {
        return (a, b) -> Integer.compare(a.weekday.ordinal(), b.weekday.ordinal());
    }
}
