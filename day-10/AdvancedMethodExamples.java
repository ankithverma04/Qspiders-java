import java.util.Scanner;

public class AdvancedMethodExamples {

    // Method with Return Value
    public static int add(int a, int b) {
        return a + b;
    }

    // Method Overloading
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method as class member
    public static void displayMessage() {
        System.out.println("This method belongs to the class.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int result = add(x, y);
        System.out.println("Sum using method return: " + result);

        System.out.println("Enter third number:");
        int z = sc.nextInt();

        int result2 = add(x, y, z);
        System.out.println("Sum using method overloading: " + result2);

        // Using built-in method
        double squareRoot = Math.sqrt(result2);
        System.out.println("Square root using built-in method: " + squareRoot);

        displayMessage();

        sc.close();
    }
}
