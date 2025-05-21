public class Enumeration {
    public enum DayOfWeek {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

        public boolean WorkDay() {
            return (this != SATURDAY && this != SUNDAY);
        }
    }

    public static void main(String[] args) {
        System.out.println("Sunday is a workday: " + DayOfWeek.SUNDAY.WorkDay());
        System.out.println("Monday is a workday: " + DayOfWeek.MONDAY.WorkDay());
    }
}
