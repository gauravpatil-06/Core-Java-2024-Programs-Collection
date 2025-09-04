
//Hybrid Inheritance
import java.util.*;
class Student
{
	int rollno;

	String name;
	void get_stud_info()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Roll No:");
		rollno=sc.nextInt();
		System.out.println("Enter Student Name:");
		name=sc.next();
	
}
	void disp_stud_info()
	{
		System.out.println("Student ROll No:"+rollno);
		System.out.println("Student Name:"+name);
	}
}
class Test extends Student
{
	int marks1,marks2;
	void get_stud_marks()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Test-1 Marks:");
		marks1=sc.nextInt();
		System.out.println("Enter Student Test-2 Marks:");
		marks2=sc.nextInt();
	}
	void disp_stud_marks()
	{
		System.out.println("Test-1 Marks:"+marks1);
		System.out.println("Test-2 Marks:"+marks2);
	}
}
class Result extends Test
{
	int total_marks;

	void get_total_marks()
	{
		total_marks=marks1+marks2;
	}
	void disp_total_marks()
	{
		System.out.println("Total Marks:"+total_marks);
	}
}
class Sport extends Student
{
	float sport_wt;
	void get_sport_info()
	{
		sport_wt=8.9f;
	}
	void disp_sport_info()
	{
		System.out.println("Sport Weightage:"+sport_wt);
	}
}
class HybridInheritanceDemo
{
	public static void main(String args[])
	{
		System.out.println("RESULT CLASS IMPLEMENTATION");
		Result r1=new Result();
		r1.get_stud_info();
		r1.get_stud_marks();
		r1.get_total_marks();
		r1.disp_stud_info();
		r1.disp_stud_marks();
		r1.disp_total_marks();
		System.out.println("SPORT CLASS IMPLEMENTATION");

		Sport s1=new Sport();
		s1.get_stud_info();
		s1.get_sport_info();
		s1.disp_stud_info();
		s1.disp_sport_info();
	}
}
