public class SwitchAndLoopDemo {

    public static void main(String[] args) {

        int day = 3;

        // Switch Case Example
        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            default:
                System.out.println("Weekend");
        }

        // Program using Decision Statement
        int number = 8;

        if(number % 2 == 0)
        {
            System.out.println(number + " is Even");
        }
        else
        {
            System.out.println(number + " is Odd");
        }

        // For Loop Example
        System.out.println("Printing numbers from 1 to 5");

        for(int i = 1; i <= 5; i++)
        {
            System.out.println(i);
        }
    }
}
