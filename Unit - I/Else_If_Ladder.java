import java.util.*;
class Else_If_Ladder
{
	public static void main(String args[])
	{
	int marks;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks:");
		marks=sc.nextInt();
		if(marks>=75)
		{
			System.out.println("You got Distinction!!!");
		}
		else if(marks>=60)
		{
			System.out.println("You got First Class!!!");
		}
		else if(marks>=40)
		{
			System.out.println("You are pass only!!!");
		}
		else
		{
			System.out.println("You are Fail!!!");
		}
	}
}