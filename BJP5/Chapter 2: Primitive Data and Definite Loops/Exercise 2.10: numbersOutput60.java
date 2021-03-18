for(int j = 0; j < 6; j++) {
    for(int i = 1; i <= 9; i++) {
        System.out.print(" "); //print 9 spaces
    }
    System.out.print("|"); //print | at the 10th place and loop back
}
System.out.println(); //print blank line

for(int j = 0; j < 6; j++) {
    for(int i = 1; i <= 9; i++) {
        System.out.print(i); //print number 1 to 9
    }
    System.out.print("0"); //print 0 and loop back
}
