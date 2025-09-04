import java.lang.*;
import java.util.*;
class Student_Copy_Constructor
{
	int rollno;
	String name;
	float marks;
	Student_Copy_Constructor()
	{
		rollno=1;
		name="Gaurav";
		marks=100;
	}
	Student_Copy_Constructor(Student_Copy_Constructor s1)
	{
		rollno=s1.rollno;
		name=s1.name;
		marks=s1.marks;
	}
	void disp_stud_info()
	{
		System.out.println("Roll No:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("Marks:"+marks);
	}
	public static void main(String args[])
	{
		Student_Copy_Constructor s1=new Student_Copy_Constructor();
		Student_Copy_Constructor s2=new Student_Copy_Constructor(s1);
		System.out.println("****Object s1****");
		s1.disp_stud_info();
		System.out.println("****Object s2****");
		s2.disp_stud_info();
	}
}