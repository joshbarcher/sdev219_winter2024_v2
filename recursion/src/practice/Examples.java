package practice;

public class Examples
{
    public static void main(String[] args)
    {
        int result = multiply(4, 6); //24
        System.out.println("Result: " + result);
    }

    public static String findLongestWord(String[] words){
        int index = 0;
        String longestWord = " ";

        if (index == words.length){
            return longestWord;
        }

        if (words.length == 0){
            return null;
        }

        if (index < words.length){
            if (longestWord.length() < words[index].length()){
                longestWord = words[index];
                return findLongestWord(words);
            }

        }

        return longestWord;
    }

    private static void practice()
    {
        //solve with loops
        for (int i = 1; i <= 20; i++)
        {
            System.out.print(i + ", ");
        }
        System.out.println();

        //solve with recursion
        print1To20();
        System.out.println();

        rocket();

        String[] tvShows = {"Firefly", "The Office", "Community",
                "Initial D", "Family Guy", "Peaky Blinders",
                "How I Met Your Mother", "Better Call Saul"};

        printArray(tvShows);
        System.out.println();

        for (int i = 0; i < tvShows.length; i++)
        {
            System.out.println("Show: " + tvShows[i]);
        }

        factorial(4);

        int sum = sum(5);
        System.out.println("sum(5) = " + sum);

        System.out.println("fact(2) = " + fact(2));
        System.out.println("fact(3) = " + fact(3));
        System.out.println("fact(4) = " + fact(4));
        System.out.println("fact(10) = " + fact(10));
        System.out.println("fact(15) = " + fact(15));
        System.out.println("fact(20) = " + fact(20));
        System.out.println("fact(50) = " + fact(50));
    }

    //return one * two - using recursion
    public static int multiply(int one, int two)
    {
        //start counting at zero
        return multiply(one, two, 0);
    }

    private static int multiply(int one, int two, int sum)
    {
        if (two == 0)
        {
            return sum;
        }

        return multiply(one, two - 1, sum + one);
    }

    //sum(1) = 1
    //sum(2) = 1 + 2 = 3
    //sum(3) = 1 + 2 + 3 = 6
    //sum(4) = sum(3) + 4 = 10
    //sum(5) = <15> = 15
    //...
    public static int sum(int num)
    {
        if (num == 1)
        {
            return 1;
        }

        return sum(num - 1) + num;
    }

    public static long fact(int num)
    {
        if (num == 0)
        {
            return 1;
        }

        return fact(num - 1) * num;
    }

    public static void factorial(int num)
    {
        factorial(num, 1);
    }

    //Negative factorials are not defined
    //0! = 1
    //1! = 1
    //2! = 1 * 2 = 2
    //3! = 1 * 2 * 3 = 6
    //4! = 4 * 3 * 2 * 1 = 24
    //5! = 5 * 4 * 3 * 2 * 1 = 120
    //8! = 8 * 7 * 6 * 5 * ... * 2 * 1 = ...
    //n! = (n-1)! + n
    private static void factorial(int num, int product)
    {
        //base case
        if (num == 1)
        {
            System.out.println(product);
            return;
        }

        //update our product
        product *= num;

        factorial(num - 1, product);
    }

    public static void printArray(String[] tvShows)
    {
        //start by printing the element at index zero
        printArray(tvShows, 0);
    }

    //recursive method
    private static void printArray(String[] tvShows, int currentIndex)
    {
        //base case (is the index too large
        if (currentIndex >= tvShows.length)
        {
            return; //exit
        }

        System.out.println("Show: " + tvShows[currentIndex]);
        printArray(tvShows, currentIndex + 1);
    }

    public static void rocket()
    {
        //start counting down at 10
        rocket(10);
    }

    //recursive method
    private static void rocket(int count)
    {
        //base case!
        if (count < 1)
        {
            System.out.println("Blast off!");
            return;
        }

        System.out.print(count + ", ");
        count--;
        rocket(count);
    }

    public static void print1To20()
    {
        printTo20(1);
    }

    //print out the numbers from 1 to 20
    private static void printTo20(int num)
    {
        //base case
        if (num >= 21)
        {
            return; //exit (don't recurse below)
        }

        //printTo20(num + 1);
        System.out.print(num + ", ");
        printTo20(num + 1);
    }
}
