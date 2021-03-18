for(int i = 1; i <= 10; i++) {
    System.out.print(i * i + " ");
}

//without using *

int a = 1;
for(int i = 1; i <= 100; i+=a) {
a += 2;
System.out.print(i + " ");
}
