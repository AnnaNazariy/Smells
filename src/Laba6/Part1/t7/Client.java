package Laba6.Part1.t7;

import java.util.Calendar;

public class Client {
    public boolean isWeekend(Calendar date) {
        int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);
        return dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY;
    }
    public void doSomething() {
        Calendar currentDate = Calendar.getInstance();
        if (isWeekend(currentDate)) {
            System.out.println("Це вихідні!");
        } else {
            System.out.println("Це не вихідні!");
        }
    }

}