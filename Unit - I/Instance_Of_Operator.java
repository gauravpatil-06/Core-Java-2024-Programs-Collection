import java.util.*;
class Instance_Of_Operator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		if(sc instanceof Scanner)
		{
			System.out.println("sc is an object of Scanner class");
		}
	}
}