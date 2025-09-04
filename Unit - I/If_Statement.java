import java.util.*;
class If_Statement
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Integer numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a==b)
		{
			System.out.println("Both numbers are equal!!!");
		}
	}
}