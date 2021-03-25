public class SlashFigure {
    public static void main(String args[]) {
        for(int j = 0; j < 22; j++) {
                System.out.print("!");
        }
        System.out.println();

        int slashNumber = 2;
        int exclamationNumber = 18;
        for(int i = 0; i < 5 ; i++) { //for number of lines
            for(int k = 0; k < slashNumber; k++) {
                System.out.print("\\");
            }
            for(int l = 0; l < exclamationNumber; l++) {
                System.out.print("!");
            }
            for(int m = 0; m < slashNumber; m++) {
                System.out.print("/");
            }
            System.out.println();
            slashNumber += 2;
            exclamationNumber -= 4;
        }
    }
}
