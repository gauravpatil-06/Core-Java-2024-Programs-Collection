import java.util.*;
class Prime_number
{
	public static void main(String args[])
	{
		int num,i=2,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		num=sc.nextInt();
		while(i<num)
		{
			if(num%i==0)
			{
				  flag=1;
				  break;
			}
			 i++;
		}
		if(flag==0) 
		{
			System.out.println(num+" is Prime number");
		}
		else
		{
			System.out.println(num+" is Not Prime number");
		}
	}
}
