public class TwoRockets {
    public static void main(String[] args) {
        printCones();
        printBoxes();
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
        printBoxes();
        printCones();
    }
    public static void printCones() {
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
    }
    public static void printBoxes() {
        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
    }
}
