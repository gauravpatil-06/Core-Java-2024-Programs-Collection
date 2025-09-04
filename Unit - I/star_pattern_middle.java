import java.util.*;
class star_pattern_middle
{
	public static void main(String args[])
	{
		int i,j,k,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Row:");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			for(j=i;j<=num;j++)
			{
				System.out.print(" ");
			}	
			for(k=1;k<=i;k++)
			{
				System.out.print("* ");
			}	
			System.out.println();
		}	

	}
}