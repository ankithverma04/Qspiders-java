class Counter {

    // Static variable
    static int count;

    // Static initializer
    static {
        count = 0;
        System.out.println("Static initializer executed");
    }

    // Constructor
    Counter() {
        count++;
    }

    // Static method
    static void displayCount() {
        System.out.println("Total objects created: " + count);
    }

}

public class StaticExample {

    public static void main(String[] args) {

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        Counter.displayCount();

    }

}
