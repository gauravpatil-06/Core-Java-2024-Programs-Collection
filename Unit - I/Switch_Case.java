import java.util.*;
class Switch_Case
{
	public static void main(String args[])
	{
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number between 1 to 3:");
		no=sc.nextInt();
		switch(no)
		{
			case 1: System.out.println("You have entered ONE");
			break;
			case 2: System.out.println("You have entered TWO");
			break;
			case 3: System.out.println("You have entered THREE");
			break;
			default:System.out.println("Invalid Number");
		}
	}
}