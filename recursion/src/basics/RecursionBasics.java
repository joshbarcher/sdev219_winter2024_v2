package basics;

public class RecursionBasics
{
    private static int count = 0;

    public static void main(String[] args)
    {
        foo();
    }

    public static void foo()
    {
        //stop!
        if (count == 1000)
        {
            return;
        }

        count++;

        System.out.println("Method call #" + count);
        foo();
    }
}
