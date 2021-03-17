public class EggStop {
    public static void main(String[] args) {
        printCompleteEgg();
        printBlankLine();
        printCompleteEgg();
        printDashedLine();
        printBlankLine();
        printTopOfEgg();
        printStop();
        printBottomOfEgg();
        printDashedLine();
    }
    public static void printTopOfEgg() {
        System.out.println("  ______");
        System.out.println(" /      \\");
        System.out.println("/        \\");
    }
    public static void printBottomOfEgg() {
        System.out.println("\\        /");
        System.out.println(" \\______/"); 
    }
    public static void printCompleteEgg() { //using nested methods
        printTopOfEgg();
        printBottomOfEgg();
    }
    public static void printDashedLine() {
        System.out.println("+--------+");
    }
    public static void printBlankLine() {
        System.out.println("");
    }
    public static void printStop() {
        System.out.println("|  STOP  |");
    }
}
