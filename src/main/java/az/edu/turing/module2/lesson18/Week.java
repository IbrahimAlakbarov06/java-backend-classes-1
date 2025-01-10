package az.edu.turing.module2.lesson18;

import java.util.Objects;

public class Week {
    private final String days;

    public Week(String days) {
        this.days = days;
    }

    public String getDays() {
        return days;
    }

//    public void setDays(String days) {
//        this.days = days;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Week week = (Week) o;
        return Objects.equals(days, week.days);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(days);
    }

    @Override
    public String toString() {
        return "Week{" +
                "days='" + days + '\'' +
                '}';
    }
}
