package Exercises.F_StrategyPattern;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int comparatorByNameLength = o1.getName().length() - o2.getName().length();

        if (comparatorByNameLength != 0) {
            return comparatorByNameLength;
        }

        return o1.getName().toLowerCase().charAt(0) - o2.getName().toLowerCase().charAt(0);
    }
}
