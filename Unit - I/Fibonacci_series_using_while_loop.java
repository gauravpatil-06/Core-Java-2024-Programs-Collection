import java.util.*;
class Factorial_number_using_while_loop
{
	public static void main(String args[])
	{
		int i=1,f1=0,f2=1,f3,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		num=sc.nextInt();
		System.out.println("Fibonacci series");
		System.out.print(f1);
		System.out.print(f2);
		while(i<=num-2)
		{
			f3=f1+f2;
			System.out.print(f3);
			f1=f2;
			f2=f3;
			i++;
		}
	}	
}
