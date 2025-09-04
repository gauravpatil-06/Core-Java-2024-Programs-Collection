import java.util.*;
class Sum_of_digit
{
	public static void main(String args[])
	{
		int num,d,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		num=sc.nextInt();
		while(num!=0)
		{
			d=num%10;
			sum=sum+d;
			num=num/10;
		}
		System.out.println("Sum of digits:"+sum);
	}
}
