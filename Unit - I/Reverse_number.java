import java.util.*;
class Reverse_number
{
	public static void main(String args[])
	{
		int num,rem,res=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		num=sc.nextInt();
		while(num!=0)
		{
			rem=num%10;
			res=res*10+rem;
			num=num/10;
		}
		System.out.println(res+" is Reverse number");
	}
}