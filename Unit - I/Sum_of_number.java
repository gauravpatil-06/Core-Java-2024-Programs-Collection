import java.util.*;
class Sum_of_number
{
	public static void main(String args[])
	{
		int N,i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		N=sc.nextInt();
		for(i=1;i<=N;i++)
		{
			sum=sum+i;
		}
		System.out.printnln("Sum of number:"+sum);
	}
}
