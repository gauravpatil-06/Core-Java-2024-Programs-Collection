import java.lang.*;
import java.util.*;
class Student_Default_Constructor
{
	int rollno;
	String name;
	float marks;
	Student_Default_Constructor()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Roll NO:");
		rollno=sc.nextInt();
		System.out.println("Enter Student Name:");
		name=sc.next();
		System.out.println("Enter Student Marks:");
		marks=sc.nextFloat();
	}
	void disp_stud_info()
	{
		System.out.println("Roll No:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("Marks:"+marks);
	}
	public static void main(String args[])
	{
		Student_Default_Constructor s1=new Student_Default_Constructor();
		s1.disp_stud_info();
	}
}