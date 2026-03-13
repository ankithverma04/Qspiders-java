class Demo {

    static int count = 0;

    String name;

    // Non-static initializer
    {
        System.out.println("Non-static initializer block executed");
    }

    // Constructor
    Demo(String n) {
        name = n;
        count++;
        System.out.println("Constructor executed for: " + name);
    }

    // Static method
    static void displayCount() {
        System.out.println("Total objects created: " + count);
    }

}

public class InitializerStaticExample {

    public static void main(String[] args) {

        Demo d1 = new Demo("Ankit");
        Demo d2 = new Demo("Rahul");

        Demo.displayCount();

    }

}
