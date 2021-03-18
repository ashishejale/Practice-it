int f0 = 1;
int f1 = 1;
System.out.print(f0 + " ");  //print 1
System.out.print(f1 + " ");  //print 1

for(int i = 2; i <= 144; i = f0 + f1) { // i = new  value
    System.out.print(i + " ");
    f0 = f1; // second last value 
    f1 = i;  // last value
}
