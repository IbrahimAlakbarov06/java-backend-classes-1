package az.edu.turing.module2.lesson18.ENUM;

public class Weeks {
    private WeekOfDay days;

    public Weeks(WeekOfDay days) {
        this.days = days;
    }

    public WeekOfDay getDays() {
        return days;
    }

    public void setDays(WeekOfDay days) {
        this.days = days;
    }
}
