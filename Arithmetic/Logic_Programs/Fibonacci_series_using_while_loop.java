import java.util.*;

class Fibonacci_series_using_while_loop
{
    public static void main(String args[])
    {
        int i = 1, f1 = 0, f2 = 1, f3, num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number:");
        num = sc.nextInt();

        System.out.println("Fibonacci series:");
        System.out.print(f1 + "\t");
        System.out.print(f2 + "\t");

        while (i <= num - 2)
        {
            f3 = f1 + f2;
            System.out.print(f3 + "\t");
            f1 = f2;
            f2 = f3;
            i++;
        }
    }
}
