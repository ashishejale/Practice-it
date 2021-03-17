//you can split method1 into smaller methods, but that wont affect the code length significanlty so I left it this way 
public class Shining {
    public static void main(String[] args) {
        method3(); 
    }
    public static void method3() { // call method2 10 times ie., print 100 * 10 = 1000 times
        method2();
        method2();
        method2();
        method2();
        method2();
        method2();
        method2();
        method2();
        method2();
        method2();
    }
    public static void method2() { // call method1 10 times ie., print 10 * 10 = 100 times
        method1();
        method1();
        method1();
        method1();
        method1();
        method1();
        method1();
        method1();
        method1();
        method1();
    }
    public static void method1() { //print 10 times
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
    }
}
