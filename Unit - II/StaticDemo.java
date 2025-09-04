class StaticDemo
{
	int no;
	static int count; //static variable
	void getdata(int x)
	{
		no=x;
		count++;
	}
	void display_no()
	{
		System.out.println("Value of no="+no);
	}
	static void display_count() //static method
	{
		System.out.println("Value of count="+count);
	}
	public static void main(String args[])
	{
		StaticDemo s1=new StaticDemo();
		StaticDemo s2=new StaticDemo();
		StaticDemo s3=new StaticDemo();
		s1.getdata(100);
		s2.getdata(200);
		s3.getdata(300);
		System.out.println("Object s1 :");
		s1.display_no();
		StaticDemo.display_count();
		System.out.println("Object s2 :");
		s2.display_no();
		StaticDemo.display_count();
		System.out.println("Object s3 :");
		s3.display_no();
		StaticDemo.display_count();
	}
}