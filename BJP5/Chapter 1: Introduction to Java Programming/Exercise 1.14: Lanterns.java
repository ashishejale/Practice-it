/* Made use of nested methods*/

public class Lanterns {
    public static void main(String[] args) {
        printThreeLinesOfStars();
        printBlankLine();
        printThreeLinesOfStars();
        printFiveBars();
        printThirteenStars();
        printThreeLinesOfStars();
        printBlankLine();
        printThreeLinesOfStars();
        printFiveStars();
        printFiveBars();
        printFiveBars();
        printFiveStars();
        printFiveStars();
    }
    public static void printFiveStars() {
        System.out.println("    *****");
    }
    public static void printNineStars() {
        System.out.println("  *********");
    }
    public static void printThirteenStars() {
        System.out.println("*************");
    }
    public static void printThreeLinesOfStars() { //create a nested method to print a repeating pattern
        printFiveStars();
        printNineStars();
        printThirteenStars();
    }
    public static void printFiveBars() {
        System.out.println("* | | | | | *");
    }
    public static void printBlankLine() {
        System.out.println("");
    }   
}
