import java.util.*;
class star_patternn
{
	public static void main(String args[])
	{
		int i,j,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Row:");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}	
			System.out.println();
		}	

	}
}


	