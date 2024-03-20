import java.util.*;

class Factorial_number_using_while_loop
{
    public static void main(String args[])
    {
        int i = 1, fact = 1, num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number:");
        num = sc.nextInt();

        while (i <= num)
        {
            fact = fact * i;
            i++;
        }

        System.out.println("Factorial number: " + fact);
    }
}