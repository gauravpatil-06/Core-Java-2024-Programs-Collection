import java.util.*;
class Armstrong_number
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
			res=res+(rem*rem*rem);
			num=num/10;
		}
		if(N==res)
		{
			System.out.println(N+" is Armstrong number");
		}
		else
		{
			System.out.println(N+" is Not Armstrong number");
		}
	}
}
