import java.util.*;
class Fibonacci_series_using_for_loop
{
	public static void main(String args[])
	{
		int f1=0,f2=1,f3,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		num=sc.nextInt();
		System.out.println("Fibonacci series");
		System.out.print(f1+"\t");
		System.out.print(f2+"\t");
		for(int i=1; i<=num-2; i++)
		{
			f3=f1+f2;
			System.out.print(f3+"\t");
			f1=f2;
			f2=f3;
		}
	}
}
