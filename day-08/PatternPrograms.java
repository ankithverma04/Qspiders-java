public class PatternPrograms {

    public static void main(String[] args) {

        int n = 5;

        System.out.println("1. Star Pyramid Pattern");
        for(int i = 1; i <= n; i++) {

            for(int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for(int k = 1; k <= (2*i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }


        System.out.println("\n2. Inverted Star Pyramid");

        for(int i = n; i >= 1; i--) {

            for(int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for(int k = 1; k <= (2*i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }


        System.out.println("\n3. Floyd's Triangle");

        int number = 1;

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }

            System.out.println();
        }


        System.out.println("\n4. Number Pyramid");

        for(int i = 1; i <= n; i++) {

            for(int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for(int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }


        System.out.println("\n5. Half Diamond Pattern");

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for(int i = n-1; i >= 1; i--) {

            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
