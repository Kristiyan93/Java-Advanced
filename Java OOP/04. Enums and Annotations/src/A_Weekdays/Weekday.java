package A_Weekdays;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY, SUNDAY;


    @Override
    public String toString() {
        String lower = super.name().toLowerCase().substring(1);

        return super.name().charAt(0) + lower;
    }
}
