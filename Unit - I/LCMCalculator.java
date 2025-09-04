import java.util.*;
public class LCMCalculator 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First numbers: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second numbers: ");		
        int num2 = sc.nextInt();
        
        int lcm = (num1 > num2) ? num1 : num2;
        
        while (true) 
		{
            if (lcm % num1 == 0 && lcm % num2 == 0) 
			{
                System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
                break;
            }
            lcm++;
        }
        sc.close();
    }
}
