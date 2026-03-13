public class NumberProgramsDay6 {

    public static void main(String[] args) {

        int number = 153;

        // 1. Armstrong Number
        int temp = number;
        int sum = 0;

        while(temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }

        if(sum == number)
            System.out.println(number + " is an Armstrong Number");
        else
            System.out.println(number + " is not an Armstrong Number");


        // 2. Perfect Number
        int n = 28;
        int divisorSum = 0;

        for(int i = 1; i <= n / 2; i++) {
            if(n % i == 0)
                divisorSum += i;
        }

        if(divisorSum == n)
            System.out.println(n + " is a Perfect Number");
        else
            System.out.println(n + " is not a Perfect Number");


        // 3. Strong Number
        int strongNum = 145;
        int temp2 = strongNum;
        int factSum = 0;

        while(temp2 != 0) {

            int digit = temp2 % 10;
            int fact = 1;

            for(int i = 1; i <= digit; i++) {
                fact *= i;
            }

            factSum += fact;
            temp2 /= 10;
        }

        if(factSum == strongNum)
            System.out.println(strongNum + " is a Strong Number");
        else
            System.out.println(strongNum + " is not a Strong Number");


        // 4. Automorphic Number
        int autoNum = 25;
        int square = autoNum * autoNum;

        if(square % 100 == autoNum)
            System.out.println(autoNum + " is an Automorphic Number");
        else
            System.out.println(autoNum + " is not an Automorphic Number");


        // 5. Harshad Number
        int harshad = 18;
        int temp3 = harshad;
        int digitSum = 0;

        while(temp3 != 0) {
            digitSum += temp3 % 10;
            temp3 /= 10;
        }

        if(harshad % digitSum == 0)
            System.out.println(harshad + " is a Harshad Number");
        else
            System.out.println(harshad + " is not a Harshad Number");
    }
}
