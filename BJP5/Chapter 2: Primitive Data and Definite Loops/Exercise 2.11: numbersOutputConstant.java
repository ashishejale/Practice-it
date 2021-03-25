public class NumbersOutput {
    public static final int numberOfRepetitions = 6;
    public static final int rangeOfNumbers = 10;
    public static void main(String[] args) {
        
        for(int j = 0; j < numberOfRepetitions; j++) {
            for(int i = 1; i < rangeOfNumbers; i++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();

        for(int j = 0; j < numberOfRepetitions; j++) {
            for(int i = 1; i < rangeOfNumbers; i++) {
                System.out.print(i);
        }
        System.out.print("0");
        }
    }
}
