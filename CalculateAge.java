package model;

import java.util.Calendar;
import java.util.Date;

public class CalculateAge {

    public long calculateAge() {

        Calendar cal = Calendar.getInstance();
        Date today = cal.getTime();
        cal.set(1988, Calendar.DECEMBER, 22);
        Date birthday = cal.getTime();

        long dateSubtract = today.getTime() - birthday.getTime();
        long time = 1000 * 60 * 60 * 24;

        return dateSubtract / time;
    }

}
