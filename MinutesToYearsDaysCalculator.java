public class MinutesToYearsDaysCalculator {

    private static final String PRINT_INVALID = "Invalid Value";

    public static void printYearsAndDays(long minutes) {
        if (minutes >= 0) {
            long hour = minutes / 60;
            long day = hour / 24;
            long year = day / 365;
            day = day % 365;
            System.out.println(minutes + " min = " + year + " y and " + day + " d");
        } else {
            System.out.println(PRINT_INVALID);
        }
    }

}
