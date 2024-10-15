package teht4;

import static java.lang.String.valueOf;

public class Teht5 {
    public static void main(String[] args) {
        WorkDay m;
        m = WorkDay.MONDAY;
        System.out.println(m.name());

        // Loop through all days of the week and print the schedule
        for (WorkDay day : WorkDay.values()) {
            System.out.println(day.name() + ": " + day.getHoursOfWork() + ", Location: " + day.getLocationOfWork());
        }
    }
}


