for(int i = 1; i <= 5; i++) { //i counts number of lines and the number to be printed 
    for(int j = 0; j < 5-i; j++) { //for each i print total blank spaces which is equal to 5-i
        System.out.print(" ");
    }
    for(int k = 0; k < i; k++) { // after the blank spaces print the number that is i, i times
        System.out.print(i);
    }
    
    System.out.println(""); //go to next line to print the next iteration
}
