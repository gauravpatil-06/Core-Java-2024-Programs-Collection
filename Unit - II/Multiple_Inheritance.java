interface student
{
	int rollno=1;
	String name="Gaurav";
	void disp_stud_info();
}
interface Test
{
	int marks1=20;
	int marks2=19;
	void disp_stud_marks();
}
class Result implements student,Test
{
	int total_marks;
	public void disp_stud_info()
	{
		System.out.println("Student ROll No:"+rollno);
		System.out.println("Student Name:"+name);
	}
	public void disp_stud_marks()
	{
		System.out.println("Test-1 Marks:"+marks1);
		System.out.println("Test-2 Marks:"+marks2);
	}
	void disp_total_marks()
	{
		total_marks=marks1+marks2;
		System.out.println("Total Marks:"+total_marks);
	}
}
class Multiple_Inheritance
{
	public static void main(String args[])
	{
		Result r1=new Result();
		r1.disp_stud_info();
		r1.disp_stud_marks();
		r1.disp_total_marks();
	}	
}