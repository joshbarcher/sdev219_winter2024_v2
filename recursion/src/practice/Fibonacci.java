package practice;

public class Fibonacci
{
    public static void main(String[] args)
    {
        System.out.println("fib(2) = " + fib(2));
        System.out.println("fib(6) = " + fib(6));
        System.out.println("fib(12) = " + fib(12));
        System.out.println("fib(24) = " + fib(24));
        System.out.println("fib(50) = " + fib(50));
        System.out.println("fib(100) = " + fib(100));
        System.out.println("fib(250) = " + fib(250));
    }

    public static int fib(int num)
    {
        if (num == 0)
        {
            return 0;
        }
        else if (num == 1)
        {
            return 1;
        }

        int fibNum = fib(num - 1) + fib(num - 2);
        return fibNum;
    }
}
