import java.util.*;
interface student
{
	void get_stud_info();
}
interface Test
{
	void get_stud_marks();
}
class Result implements student,Test
{
	int rollno;
	string name;
	int marks1,marks2;
	int total_marks;
	float percentage;
	public void get_stud_info(int rollno,String name)
	{
		
	}
	public void get_stud_marks(int marks,int marks)
	{
		
	}
	void calculation()
	{
		total_marks=marks1+marks2;
		percentage=total/2;
	}
	public void display()
	{
		System.out.println("Student ROll No:"+rollno);
		System.out.println("Student Name:"+name);
		System.out.println("Test-1 Marks:"+marks1);
		System.out.println("Test-2 Marks:"+marks2);
		System.out.println("Total Marks:"+total_marks);
		System.out.println("Percentage:"+percentage);
	}	
}
class Multiple_Inheritance1
{
	public static void main(String args[])
	{
		Result r1=new Result();
		r1.get_stud_info(1010,james);
		r1.get_stud_marks(19,20);
		r1.calculation();
		r1.display();
	}	
}