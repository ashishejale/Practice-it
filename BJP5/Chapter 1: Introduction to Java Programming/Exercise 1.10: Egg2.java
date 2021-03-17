public class Egg2 {
    public static void main(String[] args) {
        printTopOfEgg();
        printBottomOfEgg();
        printWeirdLine();
        
        printTopOfEgg();
        printBottomOfEgg();
        printWeirdLine();
        printBottomOfEgg();
        
        printTopOfEgg();
        printWeirdLine();
        printBottomOfEgg();
    }
    
    public static void printTopOfEgg() {
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }
    public static void printWeirdLine() {
        System.out.println("-\"-'-\"-'-\"-");
    }   
    public static void printBottomOfEgg() {
         System.out.println("\\         /");
        System.out.println(" \\_______/");
    }
}
