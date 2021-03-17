public class StarFigures {
    public static void main(String[] args) {
        printLinesAndCrossOfStars();
        printBlankLine();
        printLinesAndCrossOfStars();
        printLineOfStars();
        printBlankLine();
        printThreeVerticalStars();
        printLinesAndCrossOfStars();
    }
    public static void printLineOfStars() {
        System.out.println("*****"); // as these are repeating print statements you can make one mehtod just to print a line and another method for calling it twice(method nesting),
        System.out.println("*****"); // but then the readablity reduces because of method nesting.
    }
    public static void printCrossOfStars() {
        System.out.println(" * *");
        System.out.println("  *");
        System.out.println(" * *");
    }
    public static void printLinesAndCrossOfStars() { //used method nesting and combined the above two methods as they appear together in some places so to reduce the length of main method
        printLineOfStars();
        printCrossOfStars();
    }
    public static void printBlankLine() {
        System.out.println("");
    }
    public static void printThreeVerticalStars() {
        System.out.println("  *");
        System.out.println("  *");
        System.out.println("  *");
    }
}
