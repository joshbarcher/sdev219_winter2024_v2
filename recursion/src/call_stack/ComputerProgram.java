package call_stack;

public class ComputerProgram
{
    public static void main(String[] args)
    {
        Computer comp = new Computer("Windows 11");
        comp.turnOn();
        System.out.println("Do something!");
        comp.shutdown();

        for (int i = 0; i < 1000000; i++)
        {
            foo();
        }
    }

    public static void foo()
    {
        System.out.println("bar");
    }
}
