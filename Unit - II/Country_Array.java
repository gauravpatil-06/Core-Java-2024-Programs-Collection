import java.util.*;
class sample
{
	int country_code;
	String country_name;
	void get_country_info()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Country Code:");
		country_code=sc.nextInt();
		System.out.println("Enter Country NAME:");
		country_name=sc.next();
	}
	void disp_country_info()
	{
		System.out.println(country_code+"\t"+country_name);
	}
}
class Country_Array
{
	public static void main(String args[])
	{
		//datatype arrayname[]=new datatype[SIZE];
		sample e[]=new sample[5];
		int i;
		for(i=0;i<5;i++)
		{
			e[i]=new sample();
			e[i].get_country_info();
		}
		System.out.println("CountryCode\tCountryName");
		System.out.println("==========================");
		for(i=0;i<5;i++)
		{
			e[i].disp_country_info();
		}
	}
}