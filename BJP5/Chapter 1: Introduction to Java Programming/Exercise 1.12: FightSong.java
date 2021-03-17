/* the printParagraph() method is written to satisfy the following conditon of the problem;
"any System.out.println statement(s) repeated are captured in a method that is called just once"
*/

public class FightSong {
    public static void main(String[] args) {
        printStatement1();
        printBlankLine();
        printParagraph();
        printParagraph();
        printStatement1();
    }
    public static void printStatement1() {
        System.out.println("Go, team, go!\nYou can do it.");
    }
    public static void printStatement2() {
        System.out.println("You're the best,\nIn the West.");
    }
    public static void printBlankLine() {
        System.out.println("");
    }
    public static void printParagraph() {
        printStatement1();
        printStatement2();
        printStatement1();
        printBlankLine();
    }
    
}
