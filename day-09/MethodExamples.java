public class MethodExamples {

    // No Argument Method
    public static void greet() {
        System.out.println("Hello! Welcome to Java Programming.");
    }

    // Parameterized Method
    public static void addNumbers(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of numbers: " + sum);
    }

    // Another No Argument Method
    public static void displayMessage() {
        System.out.println("This is an example of method creation and method call.");
    }

    public static void main(String[] args) {

        System.out.println("Demonstration of Methods in Java\n");

        // Method Call
        greet();

        // Method Call
        displayMessage();

        // Parameterized Method Call
        addNumbers(10, 20);

    }
}
