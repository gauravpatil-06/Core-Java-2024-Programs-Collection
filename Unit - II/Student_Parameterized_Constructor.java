import java.lang.*;
import java.util.*;
class Student_Parameterized_Constructor
{
	int rollno;
	String name;
	float marks;
	Student_Parameterized_Constructor(int r,String nm,float m)
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
		Student_Parameterized_Constructor s1=new Student_Parameterized_Constructor(1,"Gaurav",100);
		s1.disp_stud_info();
	}
}