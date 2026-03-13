public class NumberPrograms {

    public static void main(String[] args) {

        int number = 153;

        // EASY PROGRAMS

        // 1. Even or Odd
        if(number % 2 == 0)
            System.out.println(number + " is Even");
        else
            System.out.println(number + " is Odd");


        // 2. Sum of Digits
        int temp = number;
        int sum = 0;

        while(temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Sum of digits: " + sum);


        // MODERATE PROGRAMS

        // 3. Palindrome Number
        temp = number;
        int reversed = 0;

        while(temp != 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }

        if(number == reversed)
            System.out.println(number + " is Palindrome");
        else
            System.out.println(number + " is Not Palindrome");


        // 4. Armstrong Number
        temp = number;
        int armstrongSum = 0;

        while(temp != 0) {
            int digit = temp % 10;
            armstrongSum += digit * digit * digit;
            temp /= 10;
        }

        if(armstrongSum == number)
            System.out.println(number + " is an Armstrong Number");
        else
            System.out.println(number + " is Not an Armstrong Number");


        // 5. Factorial
        int fact = 1;

        for(int i = 1; i <= 5; i++) {
            fact *= i;
        }

        System.out.println("Factorial of 5: " + fact);
    }
}
