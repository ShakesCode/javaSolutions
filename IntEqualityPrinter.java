public class IntEqualityPrinter {

    public static void printEqual(int firstN, int secondN, int thirdN) {
        if (firstN < 0 || secondN < 0 || thirdN < 0) {
            System.out.println("Invalid Value");
        } else if (firstN == thirdN && secondN == thirdN) {
            System.out.println("All numbers are equal");
        } else if ((firstN != secondN && firstN != thirdN && secondN != thirdN)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
