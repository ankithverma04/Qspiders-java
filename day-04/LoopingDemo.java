import java.util.Scanner;

public class LoopingDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== WHILE LOOP EXAMPLE =====");

        int i = 1;

        while(i <= 5)
        {
            System.out.println("Number: " + i);
            i++;
        }


        System.out.println("\n===== DO-WHILE LOOP EXAMPLE =====");

        int j = 1;

        do
        {
            System.out.println("Value: " + j);
            j++;
        }
        while(j <= 5);



        System.out.println("\n===== NESTED LOOP EXAMPLE (Star Pattern) =====");

        for(int row = 1; row <= 5; row++)
        {
            for(int col = 1; col <= row; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }



        System.out.println("\n===== PROGRAM USING LOOP (Multiplication Table) =====");

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for(int k = 1; k <= 10; k++)
        {
            System.out.println(num + " x " + k + " = " + (num * k));
        }



        System.out.println("\n===== REAL WORLD USE CASE : LOGIN ATTEMPT SYSTEM =====");

        String password = "java123";
        String input;

        int attempts = 3;

        sc.nextLine(); // clear buffer

        while(attempts > 0)
        {
            System.out.print("Enter Password: ");
            input = sc.nextLine();

            if(input.equals(password))
            {
                System.out.println("Login Successful");
                break;
            }
            else
            {
                attempts--;
                System.out.println("Incorrect Password. Remaining Attempts: " + attempts);
            }
        }

        if(attempts == 0)
        {
            System.out.println("Account Locked due to multiple failed attempts.");
        }

        sc.close();
    }
}
