class CommandLine_Args_Area_of_circle
{
	public static void main(String args[])
	{
		float radius,area;
		radius=Float.parseFloat(args[0]);
		area=(3.14f*radius*radius);
		System.out.println("Area of Circle="+area);
	}
}