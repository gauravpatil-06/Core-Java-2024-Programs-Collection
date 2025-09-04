import java.util.*;
class Factorial_Number_Series
{
	public static void main(String args[])
	{
		int i,fact=1,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		num=sc.nextInt();
		for(i=1; i<=num; i++)
		{
			fact=fact*i;
			System.out.println(i + " = " + fact);
		}
		System.out.println("Factorial of " + num + " is: " + fact);
	}
}