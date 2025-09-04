import java.util.*;
class Palindrome_number
{
	public static void main(String args[])
	{
		int num,rem,res=0,N;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		num=sc.nextInt();
		N=num;
		while(num!=0)
		{
			rem=num%10;
			res=res*10+rem;
			num=num/10;
		}
		if(N==res)
		{
			System.out.println(N+" is Palindrome number");
		}
		else
		{
			System.out.println(N+" is Not Palindrome number");
		}
	}
}
