public static void printDesign() {
    int number = 1;
    int dashNumber = 5;
    for(int i = 0; i < 5; i++) { // for printing 5 number of lines 
        for(int j = 0; j < dashNumber; j++) {
        System.out.print("-");   
        }
        for(int j = 0; j < number; j++) {
        System.out.print(number);
        }
        for(int j = 0; j < dashNumber; j++) {
        System.out.print("-");
        }
        System.out.println();
        number += 2;  //increment number by 2
        dashNumber--; //decrement number of dashes n each side by 1 then loop back
    }
}
