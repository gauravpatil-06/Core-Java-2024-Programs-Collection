class CommandLine_Args_Bio_Data
{
	public static void main(String args[])
	{
		int s1,s2,s3,s4,s5,total;
		float avg;
		s1=Integer.parseInt(args[0]);
		s2=Integer.parseInt(args[1]);
		s3=Integer.parseInt(args[2]);
		s4=Integer.parseInt(args[3]);
		s5=Integer.parseInt(args[4]);
		total=(s1+s2+s3+s4+s5);
		avg=(float)total/5;
		System.out.println("*************************");
		System.out.println("*********BIO DATA********");
		System.out.println("*************************");
		System.out.println("Roll NO: 42");
		System.out.println("Name: Gaurav Patil");
		System.out.println("CNE Marks:"+s1);
		System.out.println("SEN Marks:"+s2);
		System.out.println("VB.NET Marks:"+s3);
		System.out.println("DBMS Marks:"+s4);
		System.out.println("Java Marks:"+s5);
		System.out.println("========================");
		System.out.println("Total Marks:"+total);
		System.out.println("Average Marks:"+avg);
	}
}