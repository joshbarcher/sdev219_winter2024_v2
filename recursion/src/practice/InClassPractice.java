package practice;

public class InClassPractice
{
    public static void main(String[] args)
    {
        int ears = bunnyEarsV2(3);
        System.out.println("Number of bunny ears is " + ears);

        ears = crazyEars(4);
        System.out.println("Number of radioactive ears " + ears);

        printDigits(849203);
        printSumDigits(849203); //26?

        int sum = returnSumDigits(9481238); //sum = 35
        System.out.println("Sum of digits is " + sum);
    }

    public static int returnSumDigits(int number)
    {
        if (number == 0)
        {
            return 0;
        }

        int rightMost = number % 10;
        int remaining = number / 10;

        int result = rightMost + returnSumDigits(remaining);
        return result;
    }

    public static void printSumDigits(int number)
    {
        printSumDigits(number, 0);
    }

    private static void printSumDigits(int number, int sum)
    {
        //base case
        if (number == 0)
        {
            System.out.println("Sum of digits is " + sum);
            return; //exit (stop recursing)
        }

        //get the rightmost digit
        int digit = number % 10;
        sum += digit;

        //remove the rightmost digit
        number /= 10;

        printSumDigits(number, sum);
    }

    public static void printDigits(int number)
    {
        //base case
        if (number == 0)
        {
            return; //exit (stop recursing)
        }

        //get the rightmost digit
        int digit = number % 10;
        System.out.println("Digit: " + digit);

        //remove the rightmost digit
        number /= 10;

        printDigits(number);
    }

    public static int bunnyEars(int numBunnies)
    {
        return bunnyEars(numBunnies, 0);
    }

    private static int bunnyEars(int numBunnies, int sum)
    {
        //base case?
        if (numBunnies == 0)
        {
            return sum;
        }

        return bunnyEars(numBunnies - 1, sum + 2);
    }

    public static int bunnyEarsV2(int numBunnies)
    {
        //base case(if no bunnies left return 0)
        if (numBunnies == 0)
        {
            return 0;
        }

        //recursion here
        return 2 + bunnyEarsV2(numBunnies - 1);
    }

    public static int crazyEars(int bunnyNumber)
    {
        if (bunnyNumber == 0)
        {
            return 0;
        }

        //odd bunnies have 2 ears
        if (bunnyNumber % 2 == 1) //2 ears
        {
            int result = 2 + crazyEars(bunnyNumber - 1);
            return result;
        }
        //even bunnies have 3 ears
        else //3 ears
        {
            int result = 3 + crazyEars(bunnyNumber - 1);
            return result;
        }
    }
}
