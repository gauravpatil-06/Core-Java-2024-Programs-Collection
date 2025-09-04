import java.lang.*;
import java.util.*;
class Student_Constructor_Overloading
{
	int rollno;
	String name;
	float marks;
	Student_Constructor_Overloading()
	{	
		rollno=1;
		name="Gaurav";
		marks=100;
	}
	Student_Constructor_Overloading(int r,float m)
	{	
		rollno=r;
		name="Vinod";
		marks=m;
	}
	Student_Constructor_Overloading(int r,String nm)
	{	
		rollno=r;
		name=nm;
		marks=300;
	}
	Student_Constructor_Overloading(int r,String nm,float m)
	{	
		rollno=r;
		name=nm;
		marks=m;
	}
	void disp_stud_info()
	{
		System.out.println("Roll No:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("Marks:"+marks);
	}
	public static void main(String args[])
	{
		Student_Constructor_Overloading s1=new Student_Constructor_Overloading();
		Student_Constructor_Overloading s2=new Student_Constructor_Overloading(2,200);
		Student_Constructor_Overloading s3=new Student_Constructor_Overloading(3,"Gaurav");
		Student_Constructor_Overloading s4=new Student_Constructor_Overloading(4,"Gaurav",400);
		s1.disp_stud_info();
		s2.disp_stud_info();
		s3.disp_stud_info();
		s4.disp_stud_info();
	}
}