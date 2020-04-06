public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean result = false;
        if (hourOfDay < 0 || hourOfDay > 23) {
            System.out.println("1st Condition");
            return false;
        } else if (hourOfDay >= 8 && hourOfDay <= 22) {
            System.out.println("2nd Condition");
        } else {
            if (barking) {
                System.out.println("3rd Condition");
                result = true;
            } else {
                System.out.println("4th Condition");
                result = false;
            }
        }
        return result;
    }
}
